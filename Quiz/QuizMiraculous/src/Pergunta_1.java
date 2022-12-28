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

public class Pergunta_1 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pergunta_1 frame = new Pergunta_1();
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
	public Pergunta_1() {
		setResizable(false);
		setTitle("Pergunta 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 497);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 419, 458);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Pergunta_1.class.getResource("/img/ladybug.png")));
		lblNewLabel.setBounds(125, 0, 146, 230);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quem \u00E9 Ladybug por tr\u00E1s da m\u00E1scara?");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(81, 254, 260, 32);
		panel.add(lblNewLabel_1);
		
		JRadioButton marinette = new JRadioButton("Marinette\r\n");
		marinette.setBackground(Color.PINK);
		marinette.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(marinette);
		marinette.setBounds(29, 312, 109, 23);
		panel.add(marinette);
		
		JRadioButton rdbOp2 = new JRadioButton("Maria");
		rdbOp2.setBackground(Color.PINK);
		rdbOp2.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp2);
		rdbOp2.setBounds(29, 364, 109, 23);
		panel.add(rdbOp2);
		
		JRadioButton rdbOp3 = new JRadioButton("Marino");
		rdbOp3.setBackground(Color.PINK);
		rdbOp3.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp3);
		rdbOp3.setBounds(263, 312, 109, 23);
		panel.add(rdbOp3);
		
		JRadioButton rdbOp4 = new JRadioButton("Lila");
		rdbOp4.setBackground(Color.PINK);
		rdbOp4.setFont(new Font("Arial", Font.BOLD, 11));
		buttonGroup.add(rdbOp4);
		rdbOp4.setBounds(263, 364, 109, 23);
		panel.add(rdbOp4);
		
		JButton btnNewButton = new JButton("IN\u00CDCIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				TelaInicial janelinha = new TelaInicial();
				janelinha.setVisible(true);
				Pergunta_1.this.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(29, 424, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PR\u00D3XIMO ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pontos d = new Pontos();
				
				
				if(marinette.isSelected()==false && rdbOp2.isSelected()==false && rdbOp3.isSelected()==false && rdbOp4.isSelected()==false){
					JOptionPane.showMessageDialog(null, "Escolha uma opção");
				}else {
					if(marinette.isSelected()) {
						d.Acerto++;
					
					}else {
						d.Erro++;
					}
					Pergunta_2 janelinha = new Pergunta_2();
					janelinha.setVisible(true);
					Pergunta_1.this.dispose();
					
				}
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 10));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(283, 424, 89, 23);
		panel.add(btnNewButton_1);
	}
}