package Basics;

import javax.swing.JOptionPane;

/*La sentencia switch:
 * 
 * switch(dato){
 * 
 *	case 1: Intruccionees 1;
 *			break;
 *
 *	case 2: Intrucciones2;
 *			break;
 *
 *
 *
 *	case n: IntruccionesN;
 *			break;
 *
 *	default: CaseContrario;
 *			breal
 * 
 * 	} */



public class Switch {

	public static void main(String[] args) {
		int dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre el 1-5"));
		
		switch(dato) {
		
		case 1: JOptionPane.showMessageDialog(null, "Es el numero 1");
		break;
		
		case 2: JOptionPane.showMessageDialog(null, "Es el numero 2");
		break;
		
		case 3: JOptionPane.showMessageDialog(null, "Es el numero 3");
		break;
		
		case 4: JOptionPane.showMessageDialog(null, "Es el numero 4");
		break;
		
		case 5: JOptionPane.showMessageDialog(null, "Es el numero 5");
		break;
		
		default: JOptionPane.showMessageDialog(null, "Es un numero mayor a 5, invalido");
		
		}
		
		

	}

}
