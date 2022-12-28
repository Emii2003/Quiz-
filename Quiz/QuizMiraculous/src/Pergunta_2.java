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

public class Pergunta_2 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta_2 frame = new Pergunta_2();
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
	public Pergunta_2() {
		setResizable(false);
		setTitle("Pergunta 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 501);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 419, 462);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Pergunta_2.class.getResource("/img/tikki.png")));
		lblNewLabel.setBounds(93, 22, 191, 200);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qual o nome do kwami da Ladybug?");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(77, 249, 241, 32);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbOp1 = new JRadioButton("Tik");
		rdbOp1.setBackground(Color.PINK);
		rdbOp1.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp1);
		rdbOp1.setBounds(29, 318, 109, 23);
		panel.add(rdbOp1);
		
		JRadioButton rdbOp2 = new JRadioButton("Joaninha ");
		rdbOp2.setBackground(Color.PINK);
		rdbOp2.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp2);
		rdbOp2.setBounds(29, 375, 109, 23);
		panel.add(rdbOp2);
		
		JRadioButton rdbOp3 = new JRadioButton("TikTok");
		rdbOp3.setBackground(Color.PINK);
		rdbOp3.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp3);
		rdbOp3.setBounds(263, 318, 109, 23);
		panel.add(rdbOp3);
		
		JRadioButton tikki = new JRadioButton("Tikki");
		tikki.setBackground(Color.PINK);
		tikki.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(tikki);
		tikki.setBounds(263, 375, 109, 23);
		panel.add(tikki);
		
		JButton btnNewButton = new JButton("IN\u00CDCIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				TelaInicial janelinha = new TelaInicial();
				janelinha.setVisible(true);
				Pergunta_2.this.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(29, 428, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PR\u00D3XIMO ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pontos d = new Pontos();
				
				if(rdbOp1.isSelected()==false && rdbOp2.isSelected()==false && rdbOp3.isSelected()==false && tikki.isSelected()==false){
					JOptionPane.showMessageDialog(null, "Escolha uma opção");
				}else {
					if(tikki.isSelected()) {
						d.Acerto++;
					
					}else {
						d.Erro++;
					}
					Pergunta_3 janelinha = new Pergunta_3();
					janelinha.setVisible(true);
					Pergunta_2.this.dispose();
					
				}
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(283, 428, 89, 23);
		panel.add(btnNewButton_1);
	}
}
