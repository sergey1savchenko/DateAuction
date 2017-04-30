package com.my.auctions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminController{
    
    @GetMapping("addAuction")
    public String addAuction(){
	return "addAuction";
    }
    
    @GetMapping("allAuctions")
    public String allAuctions(){
	return "allAuctions";
    }

}
