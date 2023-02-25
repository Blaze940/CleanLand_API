package com.cleanLandAPI.data;

abstract public class Player {

    private String pseudo;

    private int token;


    public Player(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setToken(int token) {
        this.token = token;
    }

}
