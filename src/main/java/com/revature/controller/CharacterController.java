package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.revature.exceptions.CharacterException;
import com.revature.models.CharModel;
import com.revature.service.CharacterService;

@RestController
@RequestMapping("/character")
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
    	@PostMapping("/newCharacter/{name}/{strength}/{dexterity}/{intelligence}/{wisdom}/{numOfToes}/{luck}/{eyeColor}/{gender}/{race}")
    	public ResponseEntity<Object> newCharacter(@PathVariable(value="name") String name,@PathVariable(value="strength") int strength,
    			@PathVariable(value="dexterity") int dexterity,@PathVariable(value="intelligence") int intelligence,@PathVariable(value="wisdom") int wisdom,
    			@PathVariable(value="numOfToes") int numOfToes,@PathVariable(value="luck") int luck,@PathVariable(value="eyeColor") String eyeColor,
    			@PathVariable(value="gender") String gender,@PathVariable(value="race") String race) {
        	  CharModel newChar = new CharModel(id, name, strength, dexterity, intelligence,wisdom, numOfToes, luck, eyeColor, gender, race);
        	  CharModel charSaved = characterService.save(newChar);
              return ResponseEntity.ok().body(newChar);
          
    	
    }
}
