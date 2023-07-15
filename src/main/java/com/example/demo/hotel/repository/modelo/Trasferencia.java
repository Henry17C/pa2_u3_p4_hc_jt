package com.example.demo.hotel.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table
@Entity
public class Trasferencia {
	
	@Column(name = "trans_id")
	@Id
	@SequenceGenerator(name = "seq_trans",sequenceName = "seq_trans",allocationSize = 1)
	@GeneratedValue(generator ="seq_trans",strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name = "trans_fecha")
	private LocalDateTime fecha ;
	
	@Column(name = "trans_monto")
	private BigDecimal monto
	;



}
