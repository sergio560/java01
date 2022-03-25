package novo02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Novo02 {

	private JFrame frmTabela;
	private JTextField txtlogin;
	private JPasswordField txtsenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Novo02 window = new Novo02();
					window.frmTabela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Novo02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTabela = new JFrame();
		frmTabela.setForeground(Color.BLUE);
		frmTabela.setBackground(new Color(240, 240, 240));
		frmTabela.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Pictures\\Camera\\IMG_20190704_090910763.jpg"));
		frmTabela.setTitle("tabela");
		frmTabela.setBounds(100, 100, 450, 300);
		frmTabela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTabela.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(24, 63, 81, 27);
		frmTabela.getContentPane().add(lblNewLabel);
		
		txtlogin = new JTextField();
		txtlogin.setBounds(115, 67, 178, 20);
		frmTabela.getContentPane().add(txtlogin);
		txtlogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("  senha");
		lblNewLabel_1.setBounds(24, 101, 81, 20);
		frmTabela.getContentPane().add(lblNewLabel_1);
		
		txtsenha = new JPasswordField();
		txtsenha.setBounds(115, 101, 178, 20);
		frmTabela.getContentPane().add(txtsenha);
		
		JButton btnNewButton = new JButton("entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checklogin(txtlogin.getText(),new String (txtsenha.getPassword()))){
					JOptionPane.showMessageDialog(null,"bem vindo");
				}
				else {
					JOptionPane.showMessageDialog(null,"login ou senha incorreto");
				}
				 
				
			}
		});
		btnNewButton.setBounds(161, 162, 89, 23);
		frmTabela.getContentPane().add(btnNewButton);
	}
	public boolean checklogin(String login,String senha) {
		return  login.equals("eu") && senha.equals("123");
	}
}
