package com.example.demo;

import com.example.demo.model.HelloDE;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HelloRepository extends JpaRepository<HelloDE, Long> {
    Optional<HelloDE> getHelloDEById(Long id);
}


