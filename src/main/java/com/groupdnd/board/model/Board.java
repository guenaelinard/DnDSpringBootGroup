package com.groupdnd.board.model;

import io.swagger.v3.oas.annotations.media.Schema;


import java.util.ArrayList;
import java.util.List;


@Schema(description = "ID of the given board",
        name = "id",
        type = "String",
        example = "1, 2, 3, etc.")
public class Board implements Interaction {

    private int id;
    private final List<EmptyCase> board;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public Board(){
        board = new ArrayList<EmptyCase>();

    }
    //-------------------------------- METHODS --------------------------------
    public void addElementToBoard(EmptyCase box){
        this.board.add(box);
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
