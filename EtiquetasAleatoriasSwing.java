import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EtiquetasAleatoriasSwing extends JFrame implements ActionListener {
	
		JButton btnBoton;
		JLabel lblEtiqueta1,lblEtiqueta2,lblEtiqueta3;
		JLabel lblResultado;
	
	EtiquetasAleatoriasSwing(){
		
		setLayout(new GridLayout(1,1));
		btnBoton = new JButton("Visualizar");
		btnBoton.addActionListener(this);
		lblEtiqueta1 = new JLabel();
		lblEtiqueta2 = new JLabel();
		lblEtiqueta3 = new JLabel();
		lblResultado = new JLabel();
		
		add(btnBoton);
		add(lblEtiqueta1);
		add(lblEtiqueta2);
		add(lblEtiqueta3);
		add(lblResultado);
		
		setTitle("Etiquetas Aleatorio");
		setSize(1100,900);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int aleatorio1 = (int) Math.floor(Math.random()* 10 + 1);
		int aleatorio2 = (int) Math.floor(Math.random()* 10 + 1);
		int aleatorio3 = (int) Math.floor(Math.random()* 10 + 1);
		
		lblEtiqueta1.setText(String.valueOf(aleatorio1));
		lblEtiqueta2.setText(String.valueOf(aleatorio2));
		lblEtiqueta3.setText(String.valueOf(aleatorio3));
		
		if(aleatorio1 == aleatorio2 && aleatorio1 == aleatorio3 )
			lblResultado.setText("Los tres valores son iguales");
		if(aleatorio1 == aleatorio2 && aleatorio1 != aleatorio3 )
			lblResultado.setText("Hay dos valores iguales");
		if(aleatorio1 != aleatorio2 && aleatorio1 == aleatorio3 )
			lblResultado.setText("Hay dos valores iguales");
		if(aleatorio1 != aleatorio2 && aleatorio1 != aleatorio3 )
			lblResultado.setText("Los tres valores son diferentes");
	}
	public static void main(String[] args) {
		new EtiquetasAleatoriasSwing();

	}

}
