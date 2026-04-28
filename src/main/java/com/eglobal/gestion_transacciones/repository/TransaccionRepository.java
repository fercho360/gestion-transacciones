package com.eglobal.gestion_transacciones.repository;

import com.eglobal.gestion_transacciones.entity.TransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TransaccionRepository extends JpaRepository<TransaccionEntity, Integer> {
    List<TransaccionEntity> findByBancoId(Integer bancoId);
    List<TransaccionEntity> findAll();
    TransaccionEntity save(TransaccionEntity transaccion);
}
