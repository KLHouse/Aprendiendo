package Cine;

public class Asiento {

	private char letraDeAsiento;
	private int fila;
	private Espectador espectador;

	/*
	 * Espectador = null -> el asiento esta disponible, asi no se crea una variable
	 * booleana
	 */
	public Asiento(char letraDeAsiento, int fila) {
		
		this.letraDeAsiento = letraDeAsiento;
		this.fila = fila;
		this.espectador = null;
	}

	public char getLetraDeAsiento() {
		return letraDeAsiento;
	}

	public void setLetraDeAsiento(char letraDeAsiento) {
		this.letraDeAsiento = letraDeAsiento;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
    public boolean ocupado() {
        return espectador != null;
    }
    @Override
    public String toString() {
        if (ocupado()) {
            return "Asiento: " + fila + letraDeAsiento + " y " + espectador;
        }
 
        return "Asiento: " + fila + letraDeAsiento + " y este asiento está vacio ";
 
    }

}
