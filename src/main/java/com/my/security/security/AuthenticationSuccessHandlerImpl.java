package com.my.security.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.my.security.model.UserAuth;


@Component
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
    
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
	    throws IOException, ServletException {
	UserAuth userAuth = (UserAuth) auth.getPrincipal();
	HttpSession session = request.getSession();
	switch(userAuth.getRole()) {
	case "ADMIN":
	    session.setAttribute("id", userAuth.getId());
	    //session.setAttribute("role", "administrator");
	    response.sendRedirect("admin");
	    break;
	}	
    }
    
}
