package com.factory.factory.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Pagamentos")
public class pagamentoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPagamento;

    @Column(length = 50, nullable = false)
    private String status;

    @Column(length = 50, nullable = false)
    private BigDecimal valorAPagar;

    @Column(length = 10, nullable = false)
    private BigDecimal diferencaDeValor;

    @Column(name = "valor_pago",length = 10, nullable = false)
    private BigDecimal valorPago;
}
