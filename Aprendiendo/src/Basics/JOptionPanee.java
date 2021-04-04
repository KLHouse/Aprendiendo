package Basics;
import javax.swing.JOptionPane;
public class JOptionPanee {

	public static void main(String[] args) {
		
		String cadena;
		int numero;
		double decimal;
		char letra;
		
		cadena = JOptionPane.showInputDialog("Digite una cadena: ");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
		/*Todo el JOptionPane.showInputDialog devuelve un String por eso hay que transformarlo en un entero
		 * eso lo hacemos con el Integer.parseInt()*/
		
		letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0); /*el charAt es para tranformalo en un char*/
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));
		

		JOptionPane.showMessageDialog(null, "La cadena es:"+cadena);
		JOptionPane.showMessageDialog(null, "La numero entero es:"+numero);
		JOptionPane.showMessageDialog(null, "La letra es:"+letra);
		JOptionPane.showMessageDialog(null, "El decimal es:"+decimal);
		
	}

}
