package com.groupdnd.board.model.web.controller;

import com.groupdnd.board.model.EnemyCase;

public class Gobbo extends EnemyCase {


    public Gobbo(int id) {
        super(id);
        this.setName("Gobbo");
    }

    @Override
    public String toString() {
        return "Gobbo{}";
    }
}

