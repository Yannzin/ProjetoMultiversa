package com.sistemamultiversa.ProjetoMultiversa.controller;


import com.sistemamultiversa.ProjetoMultiversa.model.ImovelModel;
import com.sistemamultiversa.ProjetoMultiversa.service.ImovelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/imoveis")
public class ImovelController {

    private final ImovelService imovelService;

    public ImovelController(ImovelService imovelService) {
        this.imovelService = imovelService;
    }

    @GetMapping
    public List<ImovelModel> listarTodos() {
        return imovelService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ImovelModel> buscarPorId(@PathVariable Long id) {
        return imovelService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ImovelModel salvar(@RequestBody ImovelModel imovel) {
        return imovelService.salvar(imovel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        imovelService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
