package com.example.avaliacao2024.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min = 3, message = "Deve conter no minimo 3 caracteres")
    private String modelo;

    @Size(min = 2, message = "Deve conter no minimo 2 caracteres.")
    private String marca;

    @Min(value = 1885,message = "Deve ser maior que o ano de 1885")
    private Integer ano;
    private String cor;

    @Min(value = 0,message = "Deve ser maior que 0")
    private Double preco;

    @Min(value = 0,message = "Deve ser maior que 0 ou igual a 0.")
    private Double quilometragem;

    private Tipo tipo;

    private LocalDate dataCadastro;

    @ManyToOne
    private Proprietario proprietario;

}
