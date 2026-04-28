package com.eglobal.gestion_transacciones.service;

import com.eglobal.gestion_transacciones.dto.BancoResponse;

import java.util.List;

public interface BancoService {
    List<BancoResponse> getAll();
    BancoResponse getById(Integer id);
}
