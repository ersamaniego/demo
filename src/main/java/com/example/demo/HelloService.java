package com.example.demo;

import com.example.demo.model.dto.HelloDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class HelloService {
    @Autowired
    private HelloDAO helloDAO;

    public Collection<HelloDto> getAllHellos(){
        return helloDAO.getAll();
    }

    public void addHello(HelloDto helloDTO){
        //logic to validate for save
        helloDAO.save(helloDTO);
    }

    public void deleteHello(String id) {
        helloDAO.delete(id);
    }

    public void updateHello(String id, HelloDto helloDTO) {
        helloDAO.update(helloDTO,id);
    }
}
