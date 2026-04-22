package com.nonogram.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

public class HomeController {
    //tempourairement 
    @GetMapping("/home")
public String home(HttpSession session, Model model) {

    String username = (String) session.getAttribute("username");

    if (username == null) {
        username = "Guest";
    }

    int scoreTotal = session.getAttribute("scoreTotal") != null
            ? (int) session.getAttribute("scoreTotal") : 0;

    int puzzlesResolus = session.getAttribute("puzzlesResolus") != null
            ? (int) session.getAttribute("puzzlesResolus") : 0;

    model.addAttribute("username", username);
    model.addAttribute("scoreTotal", scoreTotal);
    model.addAttribute("puzzlesResolus", puzzlesResolus);

    return "home";





    // le vrai 
    //     public String home(HttpSession session, Model model) {
        // Récupère le joueur depuis la session
        //String username = (String) session.getAttribute("username");
 
        // Si pas connecté → redirige vers login
        //if (username == null) {
          //  return "redirect:/login";
        //}
 
        // Stats fictives pour l'instant (on les branchera plus tard sur la BDD)
        //int scoreTotal = session.getAttribute("scoreTotal") != null
         //       ? (int) session.getAttribute("scoreTotal") : 0;
       // int puzzlesResolus = session.getAttribute("puzzlesResolus") != null
            //    ? (int) session.getAttribute("puzzlesResolus") : 0;
 
      //  // Envoie les données à la vue Thymeleaf
       // model.addAttribute("username", username);
        //model.addAttribute("scoreTotal", scoreTotal);
        //model.addAttribute("puzzlesResolus", puzzlesResolus);
 
       // return "home"; // → templates/home.htm
}
}
