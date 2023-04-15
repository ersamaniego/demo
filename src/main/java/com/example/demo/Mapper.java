package com.example.demo;

import com.example.demo.model.HelloDE;
import com.example.demo.model.dto.HelloDto;
import org.springframework.stereotype.Component;

@Component
class Mapper {
    public HelloDto helloDeToDTO(HelloDE helloDE) {
        Long id = helloDE.getId();
        String firstName = helloDE.getFirstName();
        String lastName = helloDE.getLastName();
        return new HelloDto(id, firstName,lastName);
    }

    public HelloDE helloDtoToDE(HelloDto helloDTO) {
        return HelloDE.builder()
                .firstName(helloDTO.getNombre())
                .lastName(helloDTO.getApellido())
                .build();
    }


}
