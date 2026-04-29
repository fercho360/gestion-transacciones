package com.eglobal.gestion_transacciones.repository;

import com.eglobal.gestion_transacciones.entity.BancoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoRepository extends JpaRepository<BancoEntity, Integer> {
}
