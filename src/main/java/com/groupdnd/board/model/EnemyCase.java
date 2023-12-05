package com.groupdnd.board.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

public class EnemyCase extends EmptyCase {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public EnemyCase(int id, String name) {
        super(id);
        this.name = name;
    }

}
