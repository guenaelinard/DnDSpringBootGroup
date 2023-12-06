package com.groupdnd.board.model;


public class EnemyCase extends EmptyCase {


    private String name;

    //---------------------------------------- CONSTRUCTORS -----------------------------------

    public EnemyCase(int id) {
        super(id);
        this.name = "enemy";
    }

    //-------------------------------- GET/SET --------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
