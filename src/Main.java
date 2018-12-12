import javax.swing.JFrame;

public class Main extends JFrame {
	
	public Main() { //consructor de la clase
		setTitle("Metodos de Ordenación"); //titulo de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //que cuando se cierre la ventana JFrame se finalice el programa
		getContentPane().add(new Lienzo());
		pack();
	}
	
	public static void main(String[] args) {
		new Main().setVisible(true); //crea un objeto de la clase main, aqunque no se asigne a nadie no queda desreferenciado (y te lo crees y punto porque lo dice Julio)
	}

}
