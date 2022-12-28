import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFinal extends JFrame {

	Pontos d = new Pontos();
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFinal frame = new TelaFinal();
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
	public TelaFinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 240, 245));
		panel.setBounds(0, 0, 434, 328);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Total de acertos:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 67, 117, 36);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Total de erros:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 103, 117, 26);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("% de acertos:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 150, 105, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("% de erros:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 194, 89, 26);
		panel.add(lblNewLabel_3);
		
		JLabel acerto = new JLabel(".");
		acerto.setBounds(169, 79, 46, 14);
		panel.add(acerto);
		
		JLabel erro = new JLabel(".");
		erro.setBounds(169, 110, 46, 14);
		panel.add(erro);
		
		JLabel porAcerto = new JLabel(".");
		porAcerto.setBounds(169, 157, 46, 14);
		panel.add(porAcerto);
		
		JLabel porErro = new JLabel(".");
		porErro.setBounds(169, 201, 46, 14);
		panel.add(porErro);
		
		JButton btnNewButton = new JButton("In\u00EDcio");
		btnNewButton.setBackground(new Color(255, 182, 193));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial janelinha = new TelaInicial();
				janelinha.setVisible(true);
				TelaFinal.this.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton.setBounds(169, 262, 117, 36);
		panel.add(btnNewButton);
		
		double porcentagemAcertos,porcentagemErros; 
		
		porcentagemAcertos = 100 * d.getAcertos() / 5; 
		
		porcentagemErros = 100 * d.getErros() / 5; 
		
		//Exibir a porcentagem de erro e acerto// 
		
		porAcerto.setText(String.valueOf(porcentagemAcertos)); 
		porErro.setText(String.valueOf(porcentagemErros)); 
		
		//Exibir a quantidade de acerto e erro// 
		acerto.setText(String.valueOf(d.getAcertos())); 
		erro.setText(String.valueOf(d.getErros()));
	}
}
