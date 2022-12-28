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

public class Pergunta_3 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta_3 frame = new Pergunta_3();
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
	public Pergunta_3() {
		setResizable(false);
		setTitle("Pergunta 3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 460);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 419, 421);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Pergunta_3.class.getResource("/img/ephemeral.png")));
		lblNewLabel.setBounds(107, 46, 201, 118);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Qual o t\u00EDtulo do epis\u00F3dio 100?");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(107, 188, 201, 32);
		panel.add(lblNewLabel_1);
		
		JRadioButton rdbOp1 = new JRadioButton("Gabriel ot\u00E1rio");
		rdbOp1.setBackground(Color.PINK);
		rdbOp1.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp1);
		rdbOp1.setBounds(29, 274, 109, 23);
		panel.add(rdbOp1);
		
		JRadioButton rdbOp2 = new JRadioButton("Gabriel falido\r\n");
		rdbOp2.setBackground(Color.PINK);
		rdbOp2.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttonGroup.add(rdbOp2);
		rdbOp2.setBounds(29, 328, 109, 23);
		panel.add(rdbOp2);
		
		JRadioButton rdbOp3 = new JRadioButton("Luka perfeito");
		rdbOp3.setBackground(Color.PINK);
		rdbOp3.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp3);
		rdbOp3.setBounds(263, 274, 109, 23);
		panel.add(rdbOp3);
		
		JRadioButton ephemeral = new JRadioButton("Ephemeral");
		ephemeral.setBackground(Color.PINK);
		ephemeral.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(ephemeral);
		ephemeral.setBounds(263, 328, 109, 23);
		panel.add(ephemeral);
		
		JButton btnNewButton = new JButton("IN\u00CDCIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TelaInicial janelinha = new TelaInicial();
				janelinha.setVisible(true);
				Pergunta_3.this.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(29, 387, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PR\u00D3XIMO ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pontos d = new Pontos();
				if(rdbOp1.isSelected()==false && rdbOp2.isSelected()==false && rdbOp3.isSelected()==false && ephemeral.isSelected()==false){
					JOptionPane.showMessageDialog(null, "Escolha uma opção");
				}else {
					if(ephemeral.isSelected()) {
						d.Acerto++;
					
					}else {
						d.Erro++;
					}
					Pergunta_4 janelinha = new Pergunta_4();
					janelinha.setVisible(true);
					Pergunta_3.this.dispose();
					
				}
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(286, 387, 89, 23);
		panel.add(btnNewButton_1);
	}
}
