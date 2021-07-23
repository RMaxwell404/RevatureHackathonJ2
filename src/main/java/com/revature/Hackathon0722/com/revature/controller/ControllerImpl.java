package com.revature.Hackathon0722.com.revature.controller;

import com.revature.Hackathon0722.com.revature.models.CharacterModel;
import com.revature.Hackathon0722.com.revature.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/character")
public class ControllerImpl {

    private CharacterService service;

    @Autowired
    public ControllerImpl(CharacterService service) {
        this.service = service;
    }

    @GetMapping
    public List<CharacterModel> getAllCharacter() {
        System.out.println("got all characters");
        return service.getCharacter();
    }

    @GetMapping("/{id}")
    public CharacterModel getSingleCharacter(@PathVariable("id") int id) {
        System.out.println("this hit " + id);
        return service.getSingleCharacter(id);
    }

    @PostMapping
    public void createCharacter(@RequestBody CharacterModel characterModel) {
        System.out.println("creating character");
        service.createCharacter(characterModel);
    }

    @PutMapping
    public void updateCharacter(@RequestBody CharacterModel characterModel) {
        System.out.println("updating character");
        service.updateCharacter(characterModel);
    }

    @PutMapping("/description")
    public void updateCharacterDescription(@RequestBody CharacterModel characterModel) {
        System.out.println("updating character description");
        service.updateCharacterDescription(characterModel);
    }

}
