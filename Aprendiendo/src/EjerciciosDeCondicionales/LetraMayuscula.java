package EjerciciosDeCondicionales;
/* Determinar si una letra es mayúscula o no*/
import javax.swing.JOptionPane;

public class LetraMayuscula {

	public static void main(String[] args) {
		
		char letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
		
		
		if (Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "Es mayuscula");
		}

		else {
			JOptionPane.showMessageDialog(null, "Introduce una letra mayuscula");
		}
	}

}
