package com.groupdnd.board.model.web.controller;

import com.groupdnd.board.model.EnemyCase;

public class Dragon extends EnemyCase {


    public Dragon(int id) {
        super(id);
        this.setName("Dragon");
    }

    @Override
    public String toString() {
        return "Dragon{}";
    }
}

