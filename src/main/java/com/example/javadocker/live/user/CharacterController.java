package com.example.javadocker.live.user;

import com.example.javadocker.live.model.Character;
import com.example.javadocker.live.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
public class CharacterController {

    @Autowired
    private CharacterRepository characterRepository;

    @GetMapping
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }


    @GetMapping("/{idCharacter}")
    public Character getCharacterById(@PathVariable Integer idCharacter) {
        return characterRepository.findById(idCharacter).get();
    }

    @PostMapping
    public Character createCharacter(@RequestBody Character character) {
        return characterRepository.save(character);
    }

    @PutMapping("/{idCharacter}")
    public Character updateCharacter(@PathVariable Integer idCharacter, @RequestBody Character character) {
        Character existingCharacter = characterRepository.findById(idCharacter).get();
        existingCharacter.setCharacterName(character.getCharacterName());
        return characterRepository.save(existingCharacter);
    }


    @DeleteMapping("/{idCharacter}")
    public String deleteCharacter(@PathVariable Integer idCharacter) {
        try {
            characterRepository.findById(idCharacter).get();
            characterRepository.deleteById(idCharacter);
            return "Character deleted successfully";
        } catch (Exception e) {
            return "Character not found";
        }
    }
}