package EjerciciosDeCondicionales;

import javax.swing.JOptionPane;

/*Construir un programa que simule el funcionamiento de una calculadora 
 *que puede realizar las  cuatro operaciones aritméticas básicas (suma,
 *resta, producto y división) con valores numéricos enteros.
 *  
 *  El usuario debe especificar la operación con el primer carácter
 *  del primer parámetro de la línea de comandos: S o s para la suma,
 *  R o r para la resta, P, p, M o m para el producto y D o d para la división.
 * */
public class CalculadoraAritmética {

	public static void main(String[] args) {

		int num1, num2;
		char operacion;
		operacion = JOptionPane.showInputDialog("digite la operacion que desea realizar").charAt(0);
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
		
		
		switch(operacion) {
		
			case 's': //como no le ponemos un break a este, va a seguir y evaluar el de abajo, no es necesario escribirlo 2 veces
			case 'S':	
				int suma = num1+num2;
				JOptionPane.showMessageDialog(null, "La suma es: "+suma);
				break;
				
			case 'R': //como no le ponemos un break a este, va a seguir y evaluar el de abajo, no es necesario escribirlo 2 veces
			case 'r':	
				int resta = num1-num2;
				JOptionPane.showMessageDialog(null, "La resta es: "+resta);
				break;
				
			case 'P': //como no le ponemos un break a este, va a seguir y evaluar el de abajo, no es necesario escribirlo 2 veces
			case 'p':
			case 'm':
			case 'M':	
				int multiplicacion = num1*num2;
				JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multiplicacion);
				break;
			
			case 'D': //como no le ponemos un break a este, va a seguir y evaluar el de abajo, no es necesario escribirlo 2 veces
			case 'd':	
				int division = num1/num2;
				JOptionPane.showMessageDialog(null, "La division es: "+division);
				break;	
				
			default: 
				JOptionPane.showMessageDialog(null, "error");
		}
	}

}
