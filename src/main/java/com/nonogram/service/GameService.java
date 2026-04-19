package com.nonogram.service;

import com.nonogram.model.Puzzle;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class GameService {
    
    private Map<Integer, Puzzle> puzzles = new HashMap<>();
    
    public GameService() {
        // Level 1 - Easy (5x5)
        String solutionJson1 = "[[0,0,1,0,0],[0,0,1,0,0],[1,1,1,1,1],[0,0,1,0,0],[0,0,1,0,0]]";
        String rowCluesJson1 = "[[1],[1],[5],[1],[1]]";
        String colCluesJson1 = "[[1],[1],[5],[1],[1]]";
        
        puzzles.put(1, new Puzzle(1, "Level 1 - Cross Pattern", 5, "FACILE", 
                                  solutionJson1, rowCluesJson1, colCluesJson1));
        
        // Level 2 - Medium (10x10)
        String solutionJson2 = "[[0,0,0,0,1,0,0,0,0,0]," +
                               "[0,0,0,1,1,1,0,0,0,0]," +
                               "[0,0,1,1,1,1,1,0,0,0]," +
                               "[0,1,1,1,1,1,1,1,0,0]," +
                               "[1,1,1,1,1,1,1,1,1,0]," +
                               "[0,1,1,1,1,1,1,1,0,0]," +
                               "[0,0,1,1,1,1,1,0,0,0]," +
                               "[0,0,0,1,1,1,0,0,0,0]," +
                               "[0,0,0,0,1,0,0,0,0,0]," +
                               "[0,0,0,0,0,0,0,0,0,0]]";
        
        String rowCluesJson2 = "[[1],[3],[5],[7],[9],[7],[5],[3],[1],[]]";
        String colCluesJson2 = "[[1,1],[1,1,1],[1,1,1,1],[1,1,1,1,1],[1,1,1,1,1,1],[1,1,1,1,1],[1,1,1,1],[1,1,1],[1,1],[]]";
        
        puzzles.put(2, new Puzzle(2, "Level 2 - Diamond Pattern", 10, "MOYEN", 
                                  solutionJson2, rowCluesJson2, colCluesJson2));
        
        // Level 3 - Hard (15x15)
        String solutionJson3 = "[[0,0,0,0,0,0,1,0,0,0,0,0,0,0,0]," +
                               "[0,0,0,0,0,1,1,1,0,0,0,0,0,0,0]," +
                               "[0,0,0,0,1,1,1,1,1,0,0,0,0,0,0]," +
                               "[0,0,0,1,1,1,1,1,1,1,0,0,0,0,0]," +
                               "[0,0,1,1,1,1,1,1,1,1,1,0,0,0,0]," +
                               "[0,1,1,1,1,1,1,1,1,1,1,1,0,0,0]," +
                               "[1,1,1,1,1,1,1,1,1,1,1,1,1,0,0]," +
                               "[0,1,1,1,1,1,1,1,1,1,1,1,0,0,0]," +
                               "[0,0,1,1,1,1,1,1,1,1,1,0,0,0,0]," +
                               "[0,0,0,1,1,1,1,1,1,1,0,0,0,0,0]," +
                               "[0,0,0,0,1,1,1,1,1,0,0,0,0,0,0]," +
                               "[0,0,0,0,0,1,1,1,0,0,0,0,0,0,0]," +
                               "[0,0,0,0,0,0,1,0,0,0,0,0,0,0,0]," +
                               "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]," +
                               "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]]";
        
        String rowCluesJson3 = "[[1],[3],[5],[7],[9],[11],[13],[11],[9],[7],[5],[3],[1],[],[]]";
        String colCluesJson3 = "[[1,1],[1,1,1],[1,1,1,1],[1,1,1,1,1],[1,1,1,1,1,1],[1,1,1,1,1,1,1],[1,1,1,1,1,1,1,1],[1,1,1,1,1,1,1],[1,1,1,1,1,1],[1,1,1,1,1],[1,1,1,1],[1,1,1],[1,1],[1],[]]";
        
        puzzles.put(3, new Puzzle(3, "Level 3 - Large Diamond", 15, "DIFFICILE", 
                                  solutionJson3, rowCluesJson3, colCluesJson3));
    }
    
    public Puzzle getPuzzleById(int id) {
        return puzzles.get(id);
    }
    
    public List<Puzzle> getAllPuzzles() {
        return new ArrayList<>(puzzles.values());
    }
    
    public boolean hasNextLevel(int currentId) {
        return puzzles.containsKey(currentId + 1);
    }
    
    public Integer getNextLevelId(int currentId) {
        return hasNextLevel(currentId) ? currentId + 1 : null;
    }
}