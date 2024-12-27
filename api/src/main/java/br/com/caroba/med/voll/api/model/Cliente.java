package br.com.caroba.med.voll.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Cliente {

    @Id private Long id;
    @NotBlank private String nome;
    @NotBlank private String email;
    @NotBlank private String telefone;
    @NotBlank private String cpf;
    @OneToOne @Valid @NotNull
    private Endereco endereco;
}
