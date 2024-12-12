package com.sistemamultiversa.ProjetoMultiversa.controller;


import com.sistemamultiversa.ProjetoMultiversa.model.ProprietarioModel;
import com.sistemamultiversa.ProjetoMultiversa.service.ProprietarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proprietario")
public class ProprietarioController {

    private final ProprietarioService proprietarioService;

    public ProprietarioController(ProprietarioService proprietarioService) {
        this.proprietarioService = proprietarioService;
    }

    @PostMapping("/create")
    public ResponseEntity<ProprietarioModel> salvar(@RequestBody ProprietarioModel proprietario) {
        if (proprietario.getEmail() == null) {
            // Handle null email: throw exception, set default value, etc.
            throw new IllegalArgumentException("Email cannot be null");
        }
        ProprietarioModel proprietarioModel1 = proprietarioService.salvar(proprietario);
        return new ResponseEntity<>(proprietarioModel1, HttpStatus.CREATED);
    }
    

    @GetMapping
    public List<ProprietarioModel> listarTodos() {
        return proprietarioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProprietarioModel> buscarPorId(@PathVariable Long id) {
        return proprietarioService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        proprietarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}