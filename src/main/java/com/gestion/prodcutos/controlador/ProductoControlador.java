package com.gestion.prodcutos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.prodcutos.modelo.Producto;
import com.gestion.prodcutos.servicio.ProductoServicio;

@RestController
public class ProductoControlador {
	
	@Autowired
	private ProductoServicio servicio;
	
    @GetMapping("/productos")
    public List<Producto> listarProductos(){
		return servicio.listarProductos();	
    }
    
    @GetMapping("/productos/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Integer id){			
			try {
				Producto p = servicio.obtenerProductoPorId(id);
				return new ResponseEntity<Producto>(p,HttpStatus.OK);				
			} catch (Exception e) {
				return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);				
			}
    }
    
    
    @PostMapping("/productos")
    public void guardarProductos(@RequestBody Producto p){
		servicio.guardarProducto(p);	
    }
    
    @PutMapping("/productos")
    public void actualizarProducto(@RequestBody Producto p){
    	servicio.guardarProducto(p);	
    }
    
    
	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable Integer id) {
		servicio.eliminarProducto(id);
	}

}
