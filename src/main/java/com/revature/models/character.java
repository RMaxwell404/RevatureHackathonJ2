package com.revature.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.awt.*;
import java.util.Objects;

@Entity
@Table(name = "Characters")
public class character {


    @Id
    private int id;

    //Who owns me?
    private String owner;

    //WHOOOOOO ARE YOU? OOO OOO! OOO OOO!
    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int numOfToes;
    private int luck;

    //Spectrum
    private Color eyeColor;

    //Spectrums
    private String gender;
    private String race;

    //Big and long!
    private String description;


}
