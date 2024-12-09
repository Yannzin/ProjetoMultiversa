package com.sistemamultiversa.ProjetoMultiversa.controller;


import com.sistemamultiversa.ProjetoMultiversa.model.InquilinoModel;
import com.sistemamultiversa.ProjetoMultiversa.service.InquilinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/inquilinos")
public class InquilinoController {

    @Autowired
    private InquilinoService inquilinoService;

    @GetMapping
    public List<InquilinoModel> listarTodos() {
        return inquilinoService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InquilinoModel> buscarPorId(@PathVariable Long id) {
        return inquilinoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public InquilinoModel salvar(@RequestBody InquilinoModel inquilino) {
        return inquilinoService.salvar(inquilino);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        inquilinoService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
