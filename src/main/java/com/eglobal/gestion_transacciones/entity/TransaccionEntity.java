package com.eglobal.gestion_transacciones.entity;

import com.eglobal.gestion_transacciones.utils.enums.TipoTransaccion;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Transaccion")
@Getter @Setter
public class TransaccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, precision = 15, scale = 2)
    private BigDecimal monto;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoTransaccion tipo;

    @Column(nullable = false, updatable = false)
    private LocalDateTime fecha;

    // Relación: Muchas transacciones pertenecen a un banco
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banco_id", nullable = false)
    private BancoEntity banco;

    @PrePersist
    protected void onCreate() {
        this.fecha = LocalDateTime.now();
    }
}