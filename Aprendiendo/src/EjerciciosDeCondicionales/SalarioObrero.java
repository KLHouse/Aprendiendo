package EjerciciosDeCondicionales;

import javax.swing.JOptionPane;

/* Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
 * Si trabaja 40 horas o menos se le paga $16 por hora. 
 * Si trabaja mas de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. 
*/

public class SalarioObrero {

	public static void main(String[] args) {
		
		
		int salario;
		int horasTrabjadas = Integer.parseInt(JOptionPane.showInputDialog(("Digite las horas trabajadas")));
		
		if (horasTrabjadas<=40) {
			salario = horasTrabjadas*16;
		}
		else  {
			salario = (40*16)+((horasTrabjadas-40)*20);
		}
		
		JOptionPane.showConfirmDialog(null, "El salario total es: "+salario);

	}

}
