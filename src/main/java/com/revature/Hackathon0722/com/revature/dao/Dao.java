package com.revature.Hackathon0722.com.revature.dao;

import com.revature.Hackathon0722.com.revature.models.CharacterModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Dao extends JpaRepository<CharacterModel, Integer> {
    CharacterModel findById(int id);
}
