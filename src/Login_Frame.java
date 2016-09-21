import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Window.Type;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Login_Frame extends JFrame {

	private JPanel Contenedor;
	private JTextField NombreT;
	private JPasswordField Contrase�aT;
	private static ArrayList <String> user=new ArrayList <String>();
	private static ArrayList <String> pass=new ArrayList <String>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Frame frame = new Login_Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login_Frame() {

		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Usuario\\Documents\\GitHub\\HemmingtonSquire\\Imagenes\\Ferreteria.png"));

		user.add("Root");
		pass.add("Rootlindo");
		user.add("Usuario");
		pass.add("Usuariolindo");

		setTitle("Login Ferreteria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 232);
		Contenedor = new JPanel();
		Contenedor.setBackground(SystemColor.inactiveCaption);
		Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Contenedor);
		Contenedor.setLayout(null);
		
		JLabel lblLogin = new JLabel("Nombre:");
		lblLogin.setFont(new Font("Mangal", Font.BOLD, 16));
		lblLogin.setBounds(171, 68, 72, 31);
		Contenedor.add(lblLogin);
		
		JLabel lblContrase�a = new JLabel("Contrase\u00F1a:");
		lblContrase�a.setFont(new Font("Mangal", Font.BOLD, 16));
		lblContrase�a.setBounds(171, 94, 100, 31);
		Contenedor.add(lblContrase�a);
		
		NombreT = new JTextField();
		NombreT.setBounds(281, 76, 107, 20);
		Contenedor.add(NombreT);
		NombreT.setColumns(10);
		
		Contrase�aT = new JPasswordField();
		Contrase�aT.setBounds(281, 102, 107, 20);
		Contenedor.add(Contrase�aT);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(171, 45, 0, 127);
		Contenedor.add(separator);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 45, 131, 127);
		Contenedor.add(lblNewLabel);
		
		JLabel lblInicioDelSistema = new JLabel("Inicio del sistema");
		lblInicioDelSistema.setFont(new Font("Sylfaen", Font.BOLD, 13));
		lblInicioDelSistema.setBounds(281, 45, 120, 20);
		Contenedor.add(lblInicioDelSistema);
		
		JButton LoginBoton = new JButton("Login");
		LoginBoton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				/*Login*/
				String Usuario = NombreT.getText();
				String Contrase�a = Contrase�aT.getText();

				if(user.indexOf(Usuario)!=-1){

						if ((pass.get(user.indexOf(Usuario)).equals(Contrase�a))) {
							if(Usuario.equals("Root")){
								Root_Frame kys = new Root_Frame();
								Login_Frame frame = new Login_Frame();
								kys.setVisible(true);
								frame.setEnabled(false);
								frame.setAlwaysOnTop(false);
								kys.setAlwaysOnTop(true);

							}else{
								User_Frame kys = new User_Frame();
								Login_Frame frame = new Login_Frame();
								kys.setVisible(true);
								frame.setEnabled(false);
								frame.setAlwaysOnTop(false);
								kys.setAlwaysOnTop(true);

							}
						
						} else {
								JOptionPane.showMessageDialog(null, "Contrase�a incorrecta", "ERROR",JOptionPane.ERROR_MESSAGE);

						}

				
				}else{
					JOptionPane.showMessageDialog(null, "Nombre de usuario incorrecto", "ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		LoginBoton.setBounds(287, 149, 89, 23);
		Contenedor.add(LoginBoton);
	}

}
