package com.example.avaliacao2024.service;

import com.example.avaliacao2024.entity.Carro;
import com.example.avaliacao2024.entity.Proprietario;
import com.example.avaliacao2024.repository.CarroRepository;
import com.example.avaliacao2024.repository.ProprietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProprietarioService {

    @Autowired
    ProprietarioRepository proprietarioRepository;

    public Proprietario salvarProprietario(Proprietario proprietario) {

        return proprietarioRepository.save(proprietario);
    }

    public Proprietario buscarProprietario(Long id) {
        return proprietarioRepository.findById(id).orElse(null);
    }

    public Proprietario update(Proprietario proprietario) {
        return proprietarioRepository.save(proprietario);
    }

    public Proprietario delete(Long id) {
        Proprietario proprietario = proprietarioRepository.findById(id).orElse(null);
        if (proprietario != null) {
            proprietarioRepository.delete(proprietario);
        }
        return proprietario;
    }

}
