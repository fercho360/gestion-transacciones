package com.eglobal.gestion_transacciones.controller;

import com.eglobal.gestion_transacciones.dto.BancoResponse;
import com.eglobal.gestion_transacciones.service.BancoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/bancos")
public class BancoController {

    private final BancoService bancoService;

    // GET /api/bancos
    @GetMapping
    public ResponseEntity<List<BancoResponse>> getAll() {
        return new ResponseEntity<>(bancoService.getAll(), HttpStatus.OK);
    }

    // GET /api/bancos/{id}
    @GetMapping("/{id}")
    public ResponseEntity<BancoResponse> obtenerPorId(@PathVariable Integer id) {
        return new ResponseEntity<>(bancoService.getById(id), HttpStatus.OK);
    }
}
