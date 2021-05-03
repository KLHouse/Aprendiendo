import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	JPanel panel;

	public Ventana() {
		/* Hay que establecer el tamaöo para eso */
		this.setSize(/* ancho */500, /* largo */500);

		this.setTitle("Buscaminas");// Para ponerle un nombre la ventana
		// this.setLocation(100, 200);//Establecemos la posicion inicial de la ventana

		/*
		 * this.setBounds(600, 300, 500, 500);//este metodo utiliza el setsize y el
		 * setlocation al mismo tiempo //los 2 primeros argumentos -> setlocation //los
		 * 2 ultimos> setSize
		 */

		setLocationRelativeTo(null);// para poner la ventana en el centro de la pantalla, para ello se usa null

		iniciarComponentes();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// Para que el programa finalice cuando lo cerramos
	}

	private void iniciarComponentes() {
		crearPanel();
//		colocarEtiquetas();
		colocarBotones();
	}

	private void colocarBotones() {

		JButton boton1 = new JButton();
		boton1.setText("Minecraft");// establecer texto al boton
		boton1.setBounds(100, 100, 100, 40);
		boton1.setEnabled(true);// establecemos la interaccion
		boton1.setMnemonic('a');
		panel.add(boton1);

	}

	public void crearPanel() {
		/* Para crear un paner hay que poner la clase JPanel */
		panel = new JPanel();

		panel.setLayout(null);// estamos desactivando el diseöo del panel para poner la etiqueta en cualquier
								// lugar ya que el panel tiene un disenöo por defecto
//		panel.setBackground(Color.GREEN);//Establecemos el color del panel

		this.getContentPane().add(panel);// Agregamos el panel a la ventana
	}

	private void colocarEtiquetas() {

//		//Creamos etiquetas con JLabel
//		JLabel etiqueta = new JLabel("Hola", SwingConstants.CENTER );//Creamos una etiqueta, establecemos la alineaion horizontal del texto
//		//alternativa etiqueta.setText("hola");
//		//alternativa etiqueta.setHorizontalAlignment(SwingConstants.Right);//
//		
//		etiqueta.setBounds(20, 20, 100, 60);
//		etiqueta.setForeground(Color.blue);//establecemos el color a la letra
//		etiqueta.setOpaque(true);//establecemos pintar el fondo de la etiqueta
//		etiqueta.setBackground(Color.black);//cambiamos el color del fondo de la etiqueta
//		etiqueta.setFont(new Font("Arial", Font.BOLD, 30));//establecemos la fuente del text
//		panel.add(etiqueta);//Agregamos la etiqueta sobre el panel
//		
		// etiqueta 2. etiqueta tipo imagen
		ImageIcon imagen = new ImageIcon("mm.jpg");
		JLabel etiqueta2 = new JLabel(); // poner una imagen

//		etiqueta2.setIcon(image);
		etiqueta2.setBounds(80, 80, 300, 300);
		etiqueta2.setIcon(new ImageIcon(
				imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

		panel.add(etiqueta2);
	}

	public static void main(String[] args) {
		// JFrame es una clase
		// para crear ventanas y poner objectos en las ventanas
		Ventana ventana = new Ventana();

		ventana.setVisible(true);// hacemos visible la ventana

	}

}
