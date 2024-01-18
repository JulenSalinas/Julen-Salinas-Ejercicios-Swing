import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ContrasenaSwing extends JFrame implements ActionListener {
	
	JTextField txtUsuario;
	JLabel lblIntroducir;
	JPasswordField pswContrasena;
	JButton btnBoton;
	JLabel lblResultado;
	
	ContrasenaSwing(){
		
		txtUsuario = new JTextField("Intorduce tu usuario");
		lblIntroducir = new JLabel("Intorduce la contraseña: ");
		pswContrasena = new JPasswordField("aaaaaaaaaaa");
		btnBoton = new JButton("Validar contraseña");
		btnBoton.addActionListener(this);
		lblResultado = new JLabel();
		
		add(txtUsuario);
		add(lblIntroducir);
		add(pswContrasena);
		add(btnBoton);
		add(lblResultado);

		setTitle("Contraseña admin");
		setLayout(new FlowLayout());
		setSize(800,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btnBoton) {

			String valorUsuario = new String(txtUsuario.getText());
			String valorContrasena = new String(pswContrasena.getPassword());
			
	
			if(valorUsuario.equals("admin") && valorContrasena.equals("admin1234"))
				lblResultado.setText("La contraseña es correcta ");
			else
				lblResultado.setText("La contraseña no es correcta ");
					
		}

	}

	public static void main(String[] args) {
		new ContrasenaSwing();

	}

}
