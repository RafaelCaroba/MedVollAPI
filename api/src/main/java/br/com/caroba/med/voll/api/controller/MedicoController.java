package br.com.caroba.med.voll.api.controller;

import br.com.caroba.med.voll.api.model.Medico;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void helloWorld(@RequestBody @Valid Medico medico) {
        System.out.println(medico.toString());
    }
}
