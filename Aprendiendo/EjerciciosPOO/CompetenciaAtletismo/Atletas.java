package CompetenciaAtletismo;

/*Ejercicio 4: Construir un programa para una competencia de atletismo,
 *  el programa debe gestionar una serie de atletas caracterizados por
 *   su número de atleta, nombre y tiempo de carrera, al final el
 *    programa debe mostrar los datos del atleta ganador de la carrera.
*/

public class Atletas {

	private int ID;
	private String nombreAtleta;
	private double tiempoCarrera;

	public Atletas(int ID, String nombreAtleta, double tiempoCarrera) {

		this.ID = ID;
		this.nombreAtleta = nombreAtleta;
		this.tiempoCarrera = tiempoCarrera;

	}

	public int getID() {
		return ID;
	}

	public String getNombreAtleta() {
		return nombreAtleta;
	}

	@Override
	public String toString() {
		return "Atletas\nID=" + ID + "\nNombre del Atleta=" + nombreAtleta + "\nEl tiempo de Carrera (Minutos) =" + tiempoCarrera;
	}

	public double getTiempoCarrera() {
		return tiempoCarrera;
	}

}
