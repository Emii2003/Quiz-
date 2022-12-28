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

public class Pergunta_4 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta_4 frame = new Pergunta_4();
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
	public Pergunta_4() {
		setResizable(false);
		setTitle("Pergunta 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 437);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 419, 398);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Qual a melhor din\u00E2mica do quadrado amoroso?");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(60, 168, 306, 32);
		panel.add(lblNewLabel_1);
		
		JRadioButton marichat = new JRadioButton("Marichat");
		buttonGroup.add(marichat);
		marichat.setBackground(Color.PINK);
		marichat.setFont(new Font("Arial", Font.BOLD, 11));
		marichat.setBounds(29, 239, 109, 23);
		panel.add(marichat);
		
		JRadioButton rdbOp2 = new JRadioButton("Ladynoir");
		buttonGroup.add(rdbOp2);
		rdbOp2.setBackground(Color.PINK);
		rdbOp2.setFont(new Font("Arial", Font.BOLD, 11));
		rdbOp2.setBounds(29, 298, 109, 23);
		panel.add(rdbOp2);
		
		JRadioButton rdbOp3 = new JRadioButton("Ladrien");
		rdbOp3.setBackground(Color.PINK);
		rdbOp3.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp3);
		rdbOp3.setBounds(263, 239, 109, 23);
		panel.add(rdbOp3);
		
		JRadioButton rdbOp4 = new JRadioButton("Adrinete");
		rdbOp4.setBackground(Color.PINK);
		rdbOp4.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp4);
		rdbOp4.setBounds(263, 298, 109, 23);
		panel.add(rdbOp4);
		
		JButton btnNewButton = new JButton("IN\u00CDCIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInicial janelinha = new TelaInicial();
				janelinha.setVisible(true);
				Pergunta_4.this.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(29, 356, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PR\u00D3XIMO ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pontos d = new Pontos();
				
				if(marichat.isSelected()==false && rdbOp2.isSelected()==false && rdbOp3.isSelected()==false && rdbOp4.isSelected()==false){
					JOptionPane.showMessageDialog(null, "Escolha uma opção");
				}else {
					if(marichat.isSelected()) {
						d.Acerto++;
					
					}else {
						d.Erro++;
					}
					Pergunta_5 janelinha = new Pergunta_5();
					janelinha.setVisible(true);
					Pergunta_4.this.dispose();
					
				}
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(283, 356, 89, 23);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Pergunta_4.class.getResource("/img/marichat.png")));
		lblNewLabel.setBounds(83, 11, 253, 146);
		panel.add(lblNewLabel);
	}
}