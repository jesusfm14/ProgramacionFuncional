package pruebaColecciones.Pojo;

import java.math.BigDecimal;

import pruebaColecciones.Enum.Tax;

public class Product {
	
	String nombre;
	BigDecimal precio;
	Tax tax;
	
	
	public Product(String nombre, BigDecimal precio, Tax tax) {
		this.nombre = nombre;
		this.precio = precio;
		this.tax = tax;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public BigDecimal getPrecio() {
		return precio;
	}


	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}


	public Tax getTax() {
		return tax;
	}


	public void setTax(Tax tax) {
		this.tax = tax;
	}
	

}
