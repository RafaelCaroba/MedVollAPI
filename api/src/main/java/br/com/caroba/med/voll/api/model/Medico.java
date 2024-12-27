package br.com.caroba.med.voll.api.model;

import br.com.caroba.med.voll.api.model.enumerator.Especialidade;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Medico {

    @Id private Long id;

    @NotBlank private String nome;

    @NotBlank private String email;

    @NotBlank private String crm;

    @NotBlank private Especialidade especialidade;

    @OneToOne @Valid private Endereco endereco;
}
