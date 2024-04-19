package com.gestion.prodcutos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.prodcutos.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer>{

}
