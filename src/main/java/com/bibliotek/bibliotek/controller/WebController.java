package com.bibliotek.bibliotek.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

public class WebController {


    @GetMapping("/")
    public String login() {
        return "welcome";
    }

    @GetMapping("/createProfile")
    public String createProfile() {
        return "createProfile";
    }

    @GetMapping("/logIn")
    public String logIn() {
        return "login";
    }

    @GetMapping("/overview")
    public String overview() {
        return "overview";
    }

    @GetMapping("/loan")
    public String loan() {
        return "loan";
    }

    @GetMapping("/admin")
    public String admin(WebRequest request, Model model) {
        // Gets admin id and shows all other users except admin
        int id = (int) request.getAttribute("id", WebRequest.SCOPE_SESSION);
        //model.addAttribute("userlist", loginController.getUsers("", id, "admin"));
        return "/admin";
    }



}
