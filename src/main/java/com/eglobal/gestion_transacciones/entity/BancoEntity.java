package com.eglobal.gestion_transacciones.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Table(name = "Banco")
@Getter @Setter
public class BancoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 100)
    private String nombre;

    @Column(nullable = false, unique = true, length = 20)
    private String codigo;

    private Boolean activo = true;

    // Relación: Un banco tiene muchas transacciones
    @OneToMany(mappedBy = "banco", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransaccionEntity> transacciones;
}