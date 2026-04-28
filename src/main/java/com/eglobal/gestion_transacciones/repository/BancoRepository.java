package com.eglobal.gestion_transacciones.repository;

import com.eglobal.gestion_transacciones.entity.BancoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BancoRepository extends JpaRepository<BancoEntity, Integer> {
    List<BancoEntity> findAll();
    Optional<BancoEntity> findById(Integer id);
    BancoEntity save(BancoEntity banco);
    void deleteById(Integer id);
}