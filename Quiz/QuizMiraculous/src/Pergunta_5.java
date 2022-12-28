import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta_5 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta_5 frame = new Pergunta_5();
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
	public Pergunta_5() {
		setResizable(false);
		setTitle("Pergunta 5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 419, 394);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Qual a identidade secreta do Shadow Moth?");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(62, 207, 292, 32);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbOp1 = new JRadioButton("Adrien");
		buttonGroup.add(rdbOp1);
		rdbOp1.setBackground(Color.PINK);
		rdbOp1.setFont(new Font("Arial", Font.BOLD, 11));
		rdbOp1.setBounds(29, 246, 109, 23);
		panel.add(rdbOp1);
		
		JRadioButton gabrielAgreste = new JRadioButton("Gabriel Agreste");
		buttonGroup.add(gabrielAgreste);
		gabrielAgreste.setBackground(Color.PINK);
		gabrielAgreste.setFont(new Font("Arial", Font.BOLD, 11));
		gabrielAgreste.setBounds(29, 299, 121, 23);
		panel.add(gabrielAgreste);
		
		JRadioButton rdbOp3 = new JRadioButton("Felix");
		rdbOp3.setBackground(Color.PINK);
		rdbOp3.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp3);
		rdbOp3.setBounds(263, 246, 109, 23);
		panel.add(rdbOp3);
		
		JRadioButton rdbOp4 = new JRadioButton("Chl\u00F3e");
		rdbOp4.setBackground(Color.PINK);
		rdbOp4.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp4);
		rdbOp4.setBounds(263, 299, 109, 23);
		panel.add(rdbOp4);
		
		JButton btnNewButton = new JButton("IN\u00CDCIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInicial janelinha = new TelaInicial();
				janelinha.setVisible(true);
				Pergunta_5.this.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(29, 347, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PR\u00D3XIMO ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pontos d = new Pontos();
				
				if(rdbOp1.isSelected()==false && gabrielAgreste.isSelected()==false && rdbOp3.isSelected()==false && rdbOp4.isSelected()==false){
					JOptionPane.showMessageDialog(null, "Escolha uma opção");
				}else {
					if(gabrielAgreste.isSelected()) {
						d.Acerto++;
					
					}else {
						d.Erro++;
					}
					TelaFinal janelinha = new TelaFinal();
					janelinha.setVisible(true);
					Pergunta_5.this.dispose();
					
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(283, 347, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Pergunta_5.class.getResource("/img/shadowmoth.png")));
		lblNewLabel.setBounds(96, 11, 203, 179);
		panel.add(lblNewLabel);
	}
}