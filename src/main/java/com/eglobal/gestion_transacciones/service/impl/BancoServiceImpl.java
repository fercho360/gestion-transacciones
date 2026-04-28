package com.eglobal.gestion_transacciones.service.impl;

import com.eglobal.gestion_transacciones.dto.BancoResponse;
import com.eglobal.gestion_transacciones.service.BancoService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class BancoServiceImpl implements BancoService {

    @Override
    public List<BancoResponse> getAll() {
        return List.of();
    }

    @Override
    public BancoResponse getById(Integer id) {
        return null;
    }
}
