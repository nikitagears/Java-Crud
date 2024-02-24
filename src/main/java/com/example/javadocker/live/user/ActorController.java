package com.example.javadocker.live.user;

import java.util.List;

import com.example.javadocker.live.model.Actor;
import com.example.javadocker.live.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    @Autowired
    private ActorRepository actorRepository;

    @GetMapping
    public List<Actor> getAllActors() {
        return actorRepository.findAll();
    }


    /////////////////////////чей тут айди ??
    @GetMapping("/{idActor}")

    /////////////////////////чей тут айди ??
    public Actor getActorById(@PathVariable Integer idActor) {
        return actorRepository.findById(idActor).get();
    }


    //////////////////////////откуда взялся createUser
    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorRepository.save(actor);
    }


    /////////////////////////чей тут айди ?? откуда updateUser
    @PutMapping("/{idActor}")
    public Actor updateActor(@PathVariable Integer idActor, @RequestBody Actor actor) {
        Actor existingActor = actorRepository.findById(idActor).get();
        existingActor.setActorName(actor.getActorName());
        return actorRepository.save(existingActor);
    }


    /////////////////////////чей тут айди ??
    @DeleteMapping("/{idActor}")
    public String deleteActor(@PathVariable Integer idActor) {
        try {
            actorRepository.findById(idActor).get();
            actorRepository.deleteById(idActor);
            return "Actor deleted successfully";
        } catch (Exception e) {
            return "Actor not found";
        }
    }
}