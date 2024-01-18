import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ProvinciaLocalidadSwing extends JFrame implements ActionListener {

	JComboBox cboProvincias;
	JComboBox cboLocalidades;
	String provincias[] = {"Palencia","Albacete","Alicante","Huelva"};
	String localidades [] [] = {
			{"Abia de las Torres","Autilla del Pino","Castrillo de Villavega","Mantinos"},	
			{"Cenizate","Mahora","Socovos","Villarrobledo"},
			{"Ares del Bosque","Bigastro","Famorca","La Carroja"},
			{" La Granada de Riotinto‎ ","Minas de Riotinto‎ "," Puerto Moral‎","Rosal de la Frontera‎ "}
	};
	
	ProvinciaLocalidadSwing(){
		setLayout(new GridLayout(1,2));
		cboProvincias = new JComboBox(provincias);
		cboLocalidades = new JComboBox(localidades);
		
		add(cboProvincias);
		add(cboLocalidades);
		cboLocalidades.setVisible(false);
		
		setTitle("Combo Provincias y Localidades");
		setSize(600,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cboProvincias) {
			if(cboProvincias.getSelectedItem() == "Palencia")
				cboLocalidades.setVisible(true);
			if(cboProvincias.getSelectedItem() == "Albacete")
				cboLocalidades.setVisible(true);
			if(cboProvincias.getSelectedItem() == "Alicante")
				cboLocalidades.setVisible(true);
			if(cboProvincias.getSelectedItem() == "Huelva")
				cboLocalidades.setVisible(true);
			
		}
	}	
	

	public static void main(String[] args) {
		new ProvinciaLocalidadSwing();


	}

}
