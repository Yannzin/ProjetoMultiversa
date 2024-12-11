package com.sistemamultiversa.ProjetoMultiversa.controller;

import com.sistemamultiversa.ProjetoMultiversa.model.AluguelModel;
import com.sistemamultiversa.ProjetoMultiversa.service.AluguelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aluguel")
public class AluguelController {

    private final AluguelService aluguelService;

    public AluguelController(AluguelService aluguelService) {
        this.aluguelService = aluguelService;
    }

    @GetMapping
    public List<AluguelModel> listarTodos() {
        return aluguelService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AluguelModel> buscarPorId(@PathVariable Long id) {
        return aluguelService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public AluguelModel salvar(@RequestBody AluguelModel aluguel) {
        return aluguelService.salvar(aluguel);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        aluguelService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
