package com.example.avaliacao2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Proprietario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 3, message = "Deve conter no minimo 3 caracteres.")
    private String nome;
    private String cpf;

    @Email(message = "O email deve ser valido.")
    private String email;
    private String telefone;
    private String endereco;

    @Past(message = "Digite uma data de nascimento valida.")
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;

    @OneToMany(mappedBy = "proprietario")
    private List<Carro> carros;


}
