package com.example.demo;

import com.example.demo.model.HelloDE;
import com.example.demo.model.dto.HelloDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

@Component
public class HelloDAO implements Dao<HelloDto> {
    @Autowired
    private HelloRepository helloRepository;
    @Autowired
    private Mapper mapper;

    @Override
    public Optional<HelloDto> get(long id) {
        return helloRepository.getHelloDEById(id)
                .stream()
                .map(mapper::helloDeToDTO)
                .findFirst();
    }

    @Override
    public List<HelloDto> getAll() {
        return helloRepository.findAll()
                .stream()
                .map(mapper::helloDeToDTO)
                .collect(toList());
    }

    @Override
    public void save(HelloDto helloDTO) {
        helloRepository.save(mapper.helloDtoToDE(helloDTO));
    }

    @Override
    public void update(HelloDto helloDTO, String id) {
        HelloDE helloDEEdit = helloRepository.getHelloDEById(Long.valueOf(id)).get();
        helloDEEdit.setFirstName(helloDTO.getNombre());
        helloDEEdit.setLastName(helloDTO.getApellido());

        helloRepository.save(helloDEEdit);
    }

    @Override
    public void delete(String id) {
        helloRepository.delete(helloRepository.getHelloDEById(Long.valueOf(id)).get());
    }
}
