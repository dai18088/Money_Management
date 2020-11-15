import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
public class EvaluationGUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * Launch the application.
	 */
	public static void evaluation() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EvaluationGUI frame = new EvaluationGUI();
					frame.setLocationRelativeTo(null);
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
	public EvaluationGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnBack = new JButton("\u03A0\u03AF\u03C3\u03C9");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi pisw sto menu
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		btnBack.setBounds(0, 0, 89, 23);
		contentPane.add(btnBack);
		JButton btnNewButton = new JButton("\u0395\u03BA\u03C4\u03AF\u03BC\u03B7\u03C3\u03B7 \u0395\u03BE\u03CC\u03B4\u03C9\u03BD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{//kataxorisi eksodwn pou epithimei o xristis na ginoun
					String farmaka=textField.getText();
					double farmakad=Double.parseDouble(farmaka);
					String trofima=textField_1.getText();
					double trofimad=Double.parseDouble(trofima);
					String diaskedasi=textField_2.getText();
					double diaskedasid=Double.parseDouble(diaskedasi);
					String hobby=textField_3.getText();
					double hobbyd=Double.parseDouble(hobby);
					String mmm=textField_4.getText();
					double mmmd=Double.parseDouble(mmm);
					String rouxa=textField_5.getText();
					double rouxad=Double.parseDouble(rouxa);
					String eidh=textField_6.getText();
					double eidhd=Double.parseDouble(eidh);					
					if(farmakad<0||trofimad<0||diaskedasid<0||hobbyd<0||mmmd<0||rouxad<0||eidhd<0){//periorismos eisodwn
						JOptionPane.showMessageDialog(null, "Λάθος Είσοδο!Πιθανόν έχετε εισάγει λανθασμένη τιμή!");
					}
					else{
						double syn= farmakad+trofimad+diaskedasid+hobbyd+mmmd+rouxad+eidhd;
						String ssyn=Double.toString(syn);//athroisma eksodwn						
						File f = new File("evaluation.txt");
						PrintWriter output = new PrintWriter(f);
						output.print(ssyn);//kataxorisi sto arxeio evaluation
						output.close();	
						Evaluation2GUI ev = new Evaluation2GUI();
						ev.Evaluation2();
						close();
					}
					}catch(NumberFormatException | FileNotFoundException e1){//periorismoi arxeiwn
						JOptionPane.showMessageDialog(null, "Λάθος Είσοδο!");
					}
			}
		});
		btnNewButton.setBounds(157, 317, 154, 34);
		contentPane.add(btnNewButton);		
		JLabel lblEstimateDailyExpenses = new JLabel("\u0395\u03BA\u03C4\u03AF\u03BC\u03B9\u03C3\u03B7 \u039A\u03B1\u03B8\u03B7\u03BC\u03B5\u03C1\u03B9\u03BD\u03CE\u03BD \u0395\u03BE\u03CC\u03B4\u03C9\u03BD");
		lblEstimateDailyExpenses.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEstimateDailyExpenses.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstimateDailyExpenses.setBounds(64, 26, 306, 40);
		contentPane.add(lblEstimateDailyExpenses);
		
		JLabel lblNewLabel = new JLabel("\u03A6\u03AC\u03C1\u03BC\u03B1\u03BA\u03B1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(145, 77, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u03A4\u03C1\u03CC\u03C6\u03B9\u03BC\u03B1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(144, 106, 91, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0394\u03B9\u03B1\u03C3\u03BA\u03AD\u03B4\u03B1\u03C3\u03B7");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(134, 141, 78, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hobby");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(165, 166, 78, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u039C\u039C\u039C");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(165, 196, 78, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u03A1\u03BF\u03CD\u03C7\u03B1");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(165, 226, 78, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u0395\u03AF\u03B4\u03B7 \u03C5\u03B3\u03B9\u03B5\u03B9\u03BD\u03AE\u03C2");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(134, 259, 78, 14);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(211, 75, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(211, 105, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(211, 135, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(211, 165, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(211, 195, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(211, 225, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(211, 255, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();		
	}
}