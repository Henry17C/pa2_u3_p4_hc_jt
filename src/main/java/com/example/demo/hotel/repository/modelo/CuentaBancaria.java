package com.example.demo.hotel.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class CuentaBancaria {
	
	@Column(name = "cuen_id")
	@Id
	@SequenceGenerator(name = "seq_cuenta",sequenceName = "seq_cuenta",allocationSize = 1)
	@GeneratedValue(generator ="seq_cuenta",strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "cuen_numero")
	private String numero;
	
	@Column(name = "cuen_asaldo")
	private BigDecimal saldo;
	
	@Column(name = "cuen_tipo")
	private String tipo;

}
