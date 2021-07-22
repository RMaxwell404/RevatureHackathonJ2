package com.revature.controller;

import com.revature.models.CharModel;
import com.revature.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/api")
@CrossOrigin(origins="*", allowedHeaders = "*", allowCredentials = "true")
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
    @GetMapping("/character")
    public ResponseEntity<?> getSingleCharacter() {
        System.out.println("this hit ");
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
