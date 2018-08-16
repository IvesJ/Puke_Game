package com.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public String playerID;
    public String playerName;
    public List<String> ShouPai;

    public Player(String playerID,String playerName){
        this.playerID = playerID;
        this.playerName = playerName;
        ShouPai = new ArrayList<>();
    }
}
