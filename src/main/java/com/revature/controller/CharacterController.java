package com.revature.controller;

import com.revature.exceptions.CharacterException;
import com.revature.models.CharModel;
import com.revature.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @PutMapping("character")
        public ResponseEntity<Object> updateCharacter(@RequestBody CharModel character) {
        return ResponseEntity.ok(characterService.updateCharacter(character));
    }

}
