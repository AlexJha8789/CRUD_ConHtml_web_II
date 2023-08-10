package com.cibertec.campania.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="tb_campania")
@Getter
@Setter
public class Campania {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idCampania")
private long id;

@Column(name = "nomCampania",length = 50,nullable = false)
private String nomCampania;

@Column(name = "empresa",length = 50,nullable = false)
private String empresa;

@Column(name = "fechaInicio",nullable = false)
@Temporal(value = TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date fechaInicio;

@Column(name = "fechaFin",nullable = false)
@Temporal(value = TemporalType.DATE)
@DateTimeFormat(pattern = "yyyy-MM-dd")
private Date fechaFin;

@Column(name = "costo",scale = 2,nullable = false)
private BigDecimal costo;

@Column(name = "estado",length = 50,nullable = false)
private String estado;

}
