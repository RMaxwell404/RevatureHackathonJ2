package com.revature.service;

import com.revature.models.CharModel;

public interface CharacterService{
    CharModel updateCharacter(CharModel charModel);
    CharModel newCharacter(String name, int strength, int dexterity, int intelligence, int wisdom, int numOfToes, int luck, String eyeColor, String gender, String race);
}
