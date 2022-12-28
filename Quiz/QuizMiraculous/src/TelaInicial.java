import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 370, 345);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setBackground(new Color(255, 240, 245));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaCarregamento janelinha = new TelaCarregamento();
				janelinha.setVisible(true);
				TelaInicial.this.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(104, 236, 161, 25);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Informa\u00E7\u00F5es");
		btnNewButton_1.setBackground(new Color(255, 240, 245));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Info janelinha = new Info();
				janelinha.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(104, 273, 161, 25);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sobre");
		btnNewButton_2.setBackground(new Color(255, 240, 245));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sobre janelinha = new Sobre();
				janelinha.setVisible(true);
				
				
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBounds(104, 309, 161, 25);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(TelaInicial.class.getResource("/img/gloob.png")));
		lblNewLabel.setBounds(77, 70, 202, 70);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Miraculous Tales ");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setBounds(116, 151, 132, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("of Ladybug & Cat Noir");
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_2.setForeground(new Color(220, 20, 60));
		lblNewLabel_2.setBounds(104, 179, 161, 25);
		panel.add(lblNewLabel_2);
		
		
	}
}
