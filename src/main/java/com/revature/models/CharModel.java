package com.revature.models;

import java.awt.Color;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Characters")

public class CharModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public CharModel(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getNumOfToes() {
        return numOfToes;
    }

    public int getLuck() {
        return luck;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public String getGender() {
        return gender;
    }

    public String getRace() {
        return race;
    }

    public String getDescription() {
        return description;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setNumOfToes(int numOfToes) {
        this.numOfToes = numOfToes;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setDescription(String description) {
        this.description = description;
    }

	public CharModel(int id, String owner, String name, int strength, int dexterity, int intelligence, int wisdom,
			int numOfToes, int luck, Color eyeColor, String gender, String race, String description) {
		super();
		this.id = id;
		this.owner = owner;
		this.name = name;
		this.strength = strength;
		this.dexterity = dexterity;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.numOfToes = numOfToes;
		this.luck = luck;
		this.eyeColor = eyeColor;
		this.gender = gender;
		this.race = race;
		this.description = description;
	}

	public CharModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
