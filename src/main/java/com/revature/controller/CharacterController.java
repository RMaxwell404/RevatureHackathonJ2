package com.revature.controller;

import com.revature.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CharacterController {

    private final CharacterService characterService;

    @Autowired
    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

//    @PutMapping("character"){
//        public ResponseEntity<Object> updateCharacter(@RequestBody CharModel character) {
//            try {
//                return ResponseEntity.ok(characterService.updateCharacter(character));
//            } catch (CharacterException e) {
//                return ResponseEntity.badRequest().body(e.getMessage());
//            }
//        }
//    }
}
