package Encontrar_El_Vehiculo_Mas_Barato;

/*Ejercicio 3: Construir un programa que dada una
serie de vehículos caracterizados por su marca,
modelo y precio, imprima las propiedades del vehículo más barato.
Para ello, se deberán leer por teclado las características de cada 
vehículo y crear una clase que represente a cada uno de ellos.*/

public class Vehiculo {

	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Vehiculo\nMarca=" + marca + ", Modelo=" + modelo + ", Precio=" + precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

}
