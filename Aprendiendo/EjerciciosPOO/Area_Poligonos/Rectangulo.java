package Area_Poligonos;

public class Rectangulo extends Poligono {

	private double lado1;
	private double lado2;
	private double area;

	public Rectangulo(double lado12, double lado22) {
		super(2);
		this.lado1 = lado12;
		this.lado2 = lado22;
	}

	

	public double getLado1() {
		return lado1;
	}

	public double getLado2() {
		return lado2;
	}

	@Override
	public double area() {
		area = lado1 * lado2;
		return area;
	}

	@Override
	public String toString() {
		return "Rectangulo\n"+super.toString()+"lado1=" + lado1 + ", lado2=" + "lado2 ";
	}

}
