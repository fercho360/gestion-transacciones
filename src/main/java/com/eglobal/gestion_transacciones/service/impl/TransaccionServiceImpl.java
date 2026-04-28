package com.eglobal.gestion_transacciones.service.impl;

import com.eglobal.gestion_transacciones.repository.BancoRepository;
import com.eglobal.gestion_transacciones.repository.TransaccionRepository;
import com.eglobal.gestion_transacciones.service.TransaccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TransaccionServiceImpl implements TransaccionService {

    private final BancoRepository bancoRepository;
    private final TransaccionRepository transaccionRepository;


}
