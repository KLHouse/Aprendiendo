package Polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Vehiculo[] misVehiculos = new Vehiculo[4];
		
		misVehiculos[0]=new Vehiculo("GH67","Ferrari","A89");
		misVehiculos[1]=new VehiculoTurismo(4,"78HJ","Audi","P14");
		misVehiculos[2]=new VehiculoDeportivo(500,"45GH","Toyota","KJ8");
		misVehiculos[3]=new VehiculoFurgoneta(300, "JKLL", "Benz", "jkasa");
		
		for (Vehiculo vehiculos : misVehiculos) {
			System.out.println(vehiculos.toString());
		}

	}

}
/*Que es el polimorfismo?
 * En una relacion de tipo herencia, un objeto de la superclase 
 * puede almacenar un objeto de cualquiera de sus subclases.
 *  
 * Para que haya Polimorfismo debe de haber herencia.
 * 
 *Esto significa que la clase padre o superclase es compatible con los 
 *tipos que derivan de ella, pero no al reves 
 * 
 * Poli = muchos
 * Morfismo = forma
 * --->Las muchas formas que puede tomar un objeto
 * */
 