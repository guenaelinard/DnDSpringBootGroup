package com.groupdnd.board.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class EmptyCase {
    private int id;
    private String name = "Empty Case";

    //---------------------------------------- CONSTRUCTORS -----------------------------------
    public EmptyCase(int id) {
        this.id = id;
    }

    //-------------------------------- GET/SET --------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
