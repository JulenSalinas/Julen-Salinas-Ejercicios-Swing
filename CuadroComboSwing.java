import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CuadroComboSwing extends JFrame implements ActionListener {

	JComboBox cboAnimales;
	String animales[] = {"gato","perro","caballo"};
	
	ImageIcon imggato;
	ImageIcon imgperro;
	ImageIcon imgcaballo;

	JLabel lblImagen;
	
	
	CuadroComboSwing(){
		
		setLayout(new BorderLayout());
		cboAnimales = new JComboBox(animales);
		cboAnimales.addActionListener(this);
		
		lblImagen = new JLabel();
		
		imggato = new ImageIcon("e:\\imagenes\\gato.jpg");
		imgperro = new ImageIcon("e:\\imagenes\\perro.jpg");
		imgcaballo = new ImageIcon("e:\\imagenes\\caballo.jpg");
		
		
		
		add(cboAnimales,BorderLayout.NORTH);
		add(lblImagen);
		
		setTitle("Combo Animales");
		setSize(600,700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cboAnimales) {
			
			JOptionPane.showMessageDialog(this, "Seleccionado :" + cboAnimales.getSelectedItem());
			
			if(cboAnimales.getSelectedItem() == "gato")
				lblImagen.setIcon(imggato);
			
			if(cboAnimales.getSelectedItem() == "perro")
				lblImagen.setIcon(imgperro);
			
			if(cboAnimales.getSelectedItem() == "caballo")
				lblImagen.setIcon(imgcaballo);
			
		}
	}

	public static void main(String[] args) {
		
		new CuadroComboSwing();

	}

}
