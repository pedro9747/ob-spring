package com.openbootcamp.modulo4.Controller;

import com.openbootcamp.modulo4.Model.Laptop;
import com.openbootcamp.modulo4.Repository.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository) {
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();

    }

    @PostMapping("/laptops")
    public Laptop addLaptop(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }
}
