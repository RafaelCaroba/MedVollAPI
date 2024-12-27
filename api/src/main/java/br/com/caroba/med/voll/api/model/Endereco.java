package br.com.caroba.med.voll.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Endereco {
    @Id private Long id;
    @NotBlank private String logradouro;
    @NotBlank private String bairro;
    @NotBlank private String cep;
    @NotBlank private String cidade;
    @NotBlank private String uf;
    private String numero;
    private String complemento;
}
