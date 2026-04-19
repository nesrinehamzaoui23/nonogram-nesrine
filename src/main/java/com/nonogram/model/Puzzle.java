package com.nonogram.model;

public class Puzzle {

    private int id;
    private String title;
    private int gridSize;
    private String niveau;        // FACILE / MOYEN / DIFFICILE
    private String solutionJson;  // "[[0,0,1,0,0],[0,0,1,0,0],...]"
    private String rowCluesJson;  // "[[1],[1],[5],[1],[1]]"
    private String colCluesJson;  // "[[1],[1],[5],[1],[1]]"

    public Puzzle() {}

    public Puzzle(int id, String title, int gridSize, String niveau,
                  String solutionJson, String rowCluesJson, String colCluesJson) {
        this.id = id;
        this.title = title;
        this.gridSize = gridSize;
        this.niveau = niveau;
        this.solutionJson = solutionJson;
        this.rowCluesJson = rowCluesJson;
        this.colCluesJson = colCluesJson;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getGridSize() { return gridSize; }
    public void setGridSize(int gridSize) { this.gridSize = gridSize; }

    public String getNiveau() { return niveau; }
    public void setNiveau(String niveau) { this.niveau = niveau; }

    public String getSolutionJson() { return solutionJson; }
    public void setSolutionJson(String solutionJson) { this.solutionJson = solutionJson; }

    public String getRowCluesJson() { return rowCluesJson; }
    public void setRowCluesJson(String rowCluesJson) { this.rowCluesJson = rowCluesJson; }

    public String getColCluesJson() { return colCluesJson; }
    public void setColCluesJson(String colCluesJson) { this.colCluesJson = colCluesJson; }
}