package com.myWebApp.accountdataservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.reactive.function.client.WebClient;

import com.myWebApp.accountdataservice.models.Account;
import com.myWebApp.accountdataservice.models.AccountDetail;
import com.myWebApp.accountdataservice.models.Item;
import com.myWebApp.accountdataservice.models.Transaction;



@RestController
@CrossOrigin (origins = "*")
@RequestMapping ("/cbs")
public class AccountController {
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping ("/getdata/{acnumber}")
	public AccountDetail getdata(@PathVariable ("acnumber") String acnumber) {
		
		AccountDetail accountdetail = new AccountDetail();
		Account account = webClientBuilder.build()
				.get()
				.uri("http://localhost:8080/cbs/getaccount/" + acnumber)
				.retrieve()
				.bodyToMono(Account.class)
				.block();
		
		accountdetail.setTransaction(webClientBuilder.build()
				.get()
				.uri("http://localhost:8084/cbs/trans/" + acnumber)
				.retrieve()
				.bodyToFlux(Transaction.class)
				.collectList()
				.block());
				
		accountdetail.setAccountDetail(account);
		
		return accountdetail;
	}
		
	@PostMapping("/createaccoount")
	public Account create (@RequestBody Account account) {
		return webClientBuilder.build()
				.post()
				.uri("http://localhost:8080/cbs/saveaccount")
				.bodyValue(account)
				.retrieve()
				.bodyToMono(Account.class)
				.block();
	}
	
	@GetMapping ("/test")
	public String Test() {
		return "Working....";
	}
	
	@GetMapping ("/items")
	public Iterable<Item> getItems() {
		return (webClientBuilder.build()
				.get()
				.uri("http://localhost:5000/items")
				.retrieve()
				.bodyToFlux(Item.class)
				.collectList()
				.block());
	}

}
