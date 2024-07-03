package com.example.avaliacao2024.controller;


import com.example.avaliacao2024.entity.Carro;
import com.example.avaliacao2024.entity.Proprietario;
import com.example.avaliacao2024.service.CarroService;
import com.example.avaliacao2024.service.ProprietarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/proprietario")
public class ProprietarioController {

    @Autowired
    ProprietarioService proprietarioService;

    @PostMapping("/proprietarios")
    public Proprietario cadastrarProprietario(@Valid @RequestBody Proprietario proprietario) {
        return proprietarioService.salvarProprietario(proprietario);
    }

    @GetMapping("proprietarios/{id}")
    public Proprietario buscarProprietario(Proprietario proprietario) {

        return proprietarioService.buscarProprietario(proprietario.getId());
    }

    @PutMapping("proprietarios/{id}")
    public Proprietario updateProprietario(@RequestBody Proprietario proprietario) {

        return proprietarioService.update(proprietario);
    }

    @DeleteMapping("proprietarios/{id}")
    public Proprietario deletarProprietario(@PathVariable Long id) {

        return proprietarioService.delete(id);
    }

}
