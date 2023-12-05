package com.groupdnd.board.model;

public class HeroCase extends EmptyCase {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public HeroCase(int id, String name) {
        super(id);
        this.name = name;
    }

}
