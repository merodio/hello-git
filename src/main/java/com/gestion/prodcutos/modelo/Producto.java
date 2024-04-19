package com.gestion.prodcutos.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name="productos")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Producto {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY )
	private Integer id;
	
	private String nombre;
	
	private float precio;
	

}
