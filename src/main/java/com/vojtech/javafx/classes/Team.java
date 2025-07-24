package com.vojtech.javafx.classes;

import lombok.Getter;
import lombok.Setter;

public class Team {

    @Getter
    private String name;

    @Getter
    private String abbreviation;

    @Getter
    @Setter
    private short playedGames;

    @Getter
    @Setter
    private short wonGames;

    @Getter
    @Setter
    private short wonOTGames;


    @Getter
    @Setter
    private short lostGames;
    
    @Getter
    @Setter
    
    private short tiedGames;


    public Team(String name, String abbreviation) {
        setName(name);
        setAbbreviation(abbreviation);
    }

    public void setName(String name) {
        if (name.length() >= 2){
            this.name = name.toUpperCase();
        }
    }

    public void setAbbreviation(String abbreviation) {

        if (abbreviation.length() >= 2){
            this.abbreviation = abbreviation.toUpperCase();
        }

    }


}
