package DNI;

public class Persona {

	private final static char SEXO_DER = 'H';
	public static final int INFRAPESO = -1;
	public static final int PESO_IDEAL = 0;
	public static final int SOBREPESO = 1;
	
	
	private String nombre;
	private int edad;
	private int cedula;
	private char sexo;
	private double peso;
	private int altura;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, int edad,int cedula ,char sexo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.cedula=cedula;
		this.sexo = sexo;
		
		
	}
	
	public Persona(String nombre, int edad, int cedula, char sexo, double peso, int altura) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.cedula = cedula;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		
	}
	
	public static char getSexoDer() {
		return SEXO_DER;
	}

	public static int getInfrapeso() {
		return INFRAPESO;
	}

	public static int getPesoIdeal() {
		return PESO_IDEAL;
	}

	public static int getSobrepeso() {
		return SOBREPESO;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getCedula() {
		return cedula;
	}

	public char getSexo() {
		return sexo;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltura() {
		return altura;
	}

	public void calcularIMC() {
		double pesoIdeal;
		pesoIdeal=(peso*(altura*altura));
		
		int IMC = 0;
		if (pesoIdeal<20) {
			IMC = INFRAPESO;
			System.out.println("Esta debajo del peso ideal");
			
		} else if(pesoIdeal<=25||pesoIdeal>=20) {
			IMC = PESO_IDEAL;
			System.out.println("Esta en el peso ideal");
			
		}else if(pesoIdeal>25) {
			IMC = SOBREPESO;
			System.out.println("Tiene sobrepeso");
			
		}
		
		
	}
	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso="
				+ peso + ", altura=" + altura;
	}

	public boolean esMayorDeEdad() {
		boolean verificar = false;
		if (edad>18) {
			verificar=true;
		}
		
		return verificar;
	}


	
}
