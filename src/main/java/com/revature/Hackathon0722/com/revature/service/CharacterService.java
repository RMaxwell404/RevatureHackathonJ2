package com.revature.Hackathon0722.com.revature.service;

import com.revature.Hackathon0722.com.revature.models.CharacterModel;

import java.util.List;

public interface CharacterService {
    public List<CharacterModel> getCharacter();
    public CharacterModel getSingleCharacter(int id);
    public void createCharacter(CharacterModel characterModel);
    public void updateCharacter(CharacterModel characterModel);
    public void updateCharacterDescription(CharacterModel characterModel);

}
