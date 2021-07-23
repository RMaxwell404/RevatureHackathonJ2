package com.revature.Hackathon0722.com.revature.service;

import com.revature.Hackathon0722.com.revature.dao.Dao;
import com.revature.Hackathon0722.com.revature.models.CharacterModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Service")
public class ServiceImpl implements CharacterService{
    Dao dao;

    @Autowired
    public ServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public List<CharacterModel> getCharacter() {
        return dao.findAll();
    }

    @Override
    public CharacterModel getSingleCharacter(int id) {
        return dao.findById(id);
    }

    @Override
    public void createCharacter(CharacterModel characterModel) {
        dao.save(characterModel);
    }

    @Override
    public void updateCharacter(CharacterModel characterModel) {
        dao.save(characterModel);
    }

    @Override
    public void updateCharacterDescription(CharacterModel characterModel) {
        dao.save(characterModel);
    }
}
