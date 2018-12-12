import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JPanel;

public class Lienzo extends JPanel {
	
	private static Random r = new Random(); //private para que fuera de la clase no veas el método
	private int [] vector = new int[900];
	
	public Lienzo() {
		setPreferredSize(new Dimension(900, 600)); //dimensiones del panel dentro de la ventana JFrame
		setFocusable(true);
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_I) { //se ejecuta automáticamente cuando el usuario pulse una tecla(en este caso la i por el VK:I) y la suelte
					llenarVector();
					repaint(); //provoca que en algún momento (no se sabe cuando) el sistema va a invocar el método paint component
				}
				else if (e.getKeyCode() == KeyEvent.VK_O) { //cuando pulsas la o
					ordenarVector();
					repaint();
				}
			}
		});
		
		llenarVector();
	}
	
	private void llenarVector() {
		for (int i=0; i<vector.length; i++) {
			vector[i] = r.nextInt(600);
		}
	}
	
	private void ordenarVector() {
		for (int i=1; i<vector.length; i++) {
			int j = 0;
			while (j<i && vector[j] < vector[i])
				j++;
			if (j < i) {
				int aux = vector[i];
				for (int k = i-1; k >= j; k--) 
					vector[k+1] =vector[k];
				vector[j] = aux;
			}
		}
//		Arrays.sort(vector);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g); //método redefinido
		g.setColor(Color.RED);
		for (int i=0; i<vector.length; i++) {
			g.drawLine(i, 599, i, 599 - vector[i]);
		}
//		g.setColor(Color.RED);
//		g.drawOval(300, 300, 100, 100); //coordenadas del dibujo
//		g.drawRect(300, 300, 100, 100); //coordenadas del dibujo
	}
	
}
