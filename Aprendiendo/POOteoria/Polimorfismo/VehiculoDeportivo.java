package Polimorfismo;

public class VehiculoDeportivo extends Vehiculo{


	private int cilindrada;

	public VehiculoDeportivo(int cilindrada,String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return "VehiculoDeportivo [cilindrada=" + cilindrada + ", matricula=" + matricula + ", marca=" + marca
				+ ", modelo=" + modelo + "]";
	}

	
	
}
