import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
	
	public Main() { //constructor de la clase
		setTitle("Metodos de Ordenaci�n"); //titulo de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //que cuando se cierre la ventana JFrame se finalice el programa
		getContentPane().add(new Lienzo());
		pack();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
				new Runnable() {
					@Override
					public void run() {
						new Main().setVisible(true); //crea un objeto de la clase main, aunque no se asigne a nadie no queda desreferenciado (y te lo crees y punto porque lo dice Julio)
					}
				}			
		);	
		
	}

}