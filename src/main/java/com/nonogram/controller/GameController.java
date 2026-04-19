package com.nonogram.controller;

import com.nonogram.model.Puzzle;
import com.nonogram.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public String home(Model model) {
        model.addAttribute("puzzles", gameService.getAllPuzzles());
        return "index";
    }

    @GetMapping("/play/{id}")
    public String play(@PathVariable("id") int id, Model model) {
        Puzzle puzzle = gameService.getPuzzleById(id);
        if (puzzle == null) return "redirect:/";
        model.addAttribute("puzzle", puzzle);
        return "game";
    }
}