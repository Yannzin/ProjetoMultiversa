package com.sistemamultiversa.ProjetoMultiversa.controller;


import com.sistemamultiversa.ProjetoMultiversa.model.ProprietarioModel;
import com.sistemamultiversa.ProjetoMultiversa.service.ProprietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proprietarios")
public class ProprietarioController {

    @Autowired
    private ProprietarioService proprietarioService;

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

    @PostMapping
    public ProprietarioModel salvar(@RequestBody ProprietarioModel proprietario) {
        return proprietarioService.salvar(proprietario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        proprietarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}