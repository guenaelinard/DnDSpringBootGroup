package com.groupdnd.board.model.web.controller;

import com.groupdnd.board.model.EnemyCase;

public class Sorcerer extends EnemyCase {

    public Sorcerer(int id) {
        super(id);
        this.setName("Sorcerer");
    }
    @Override
    public String toString() {
        return "Sorcerer{}";
    }
}

