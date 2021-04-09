package Area_Poligonos;

public abstract class Poligono {

	protected int numeroDeLados;

	public Poligono(int numeroDeLados) {
		super();
		this.numeroDeLados = numeroDeLados;
	}

	public int getNumeroDeLados() {
		return numeroDeLados;
	}

	public String toString() {
		return "Numero de lados=" + numeroDeLados;
	}
	
	public abstract double area();

}
