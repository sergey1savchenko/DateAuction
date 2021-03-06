package com.my.auctions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
    @GetMapping({ "", "home", "/" })
    public String mainPage() {
    	return "home";
    }
    
    @GetMapping( "login" )
    public String login() {
    	return "login";
    }
    
    @GetMapping( "logout" )
    public String logout() {
    	return "logout";
    }
    
    @GetMapping( "admin" )
    public String admin() {
    	return "admin";
    }
    
    @GetMapping( "user" )
    public String user() {
    	return "user";
    }
    
    @RequestMapping("404")
    public String error404(){
	return "404";
    }
	
}
