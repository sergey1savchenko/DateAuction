package com.my.security.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
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
	
}
