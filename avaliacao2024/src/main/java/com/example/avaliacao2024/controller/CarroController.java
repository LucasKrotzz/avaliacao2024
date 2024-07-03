package com.example.avaliacao2024.controller;

import com.example.avaliacao2024.entity.Carro;
import com.example.avaliacao2024.service.CarroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/carro")
public class CarroController {

    @Autowired
    CarroService carroService;

    @PostMapping("/carros")
    public Carro cadastrarCarros(@Valid @RequestBody Carro carro) {
        return carroService.salvarCarro(carro);
    }

    @GetMapping("carros/{id}")
    public Carro buscarCarros(Carro carro) {

        return carroService.buscarCarro(carro.getId());
    }

    @PutMapping("carros/{id}")
    public Carro updateCarros(@RequestBody Carro carro) {

        return carroService.update(carro);
    }

    @DeleteMapping("carros/{id}")
    public Carro deletarCarros(@PathVariable Long id) {

        return carroService.delete(id);
    }

}
