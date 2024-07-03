package com.example.avaliacao2024.service;

import com.example.avaliacao2024.entity.Carro;
import com.example.avaliacao2024.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    CarroRepository carroRepository;

    public Carro salvarCarro(Carro carro) {

        return carroRepository.save(carro);
    }

    public Carro buscarCarro(Long id) {
        return carroRepository.findById(id).orElse(null);
    }

    public Carro update(Carro carro) {
        return carroRepository.save(carro);
    }

    public Carro delete(Long id) {
        Carro carro = carroRepository.findById(id).orElse(null);
        if (carro != null) {
            carroRepository.delete(carro);
        }
        return carro;
    }

}
