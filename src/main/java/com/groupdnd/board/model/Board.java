package com.groupdnd.board.model;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.ArrayList;
import java.util.List;


public class Board {

    @Schema(description = "ID of the given board",
            name = "id",
            type = "String",
            example = "1, 2, 3, etc.")
    private int id;
    private final List<EmptyCase> board;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Board() {
        board = new ArrayList<EmptyCase>();

    }

    //-------------------------------- METHODS --------------------------------
    public void addElementToBoard(EmptyCase box) {
        this.board.add(box);
    }

    public void addEnemies(EnemyCase enemyCase,int numTiles) {
        for (int i = 0; i < numTiles; i++) {
            this.addElementToBoard(new EnemyCase(numTiles));
        }
    }

    public void addEmptyCase(int numTiles) {
        for (int i = 0; i < numTiles; i++) {
            this.addElementToBoard(new EmptyCase(i));
        }
    }

    //-------------------------------- GET/SET --------------------------------

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<EmptyCase> getBoard() {
        return board;
    }

}
