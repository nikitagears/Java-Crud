package com.example.javadocker.live.repository;

import com.example.javadocker.live.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<User, Long> {

}