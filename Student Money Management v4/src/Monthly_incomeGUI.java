import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
public class Monthly_incomeGUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	/**
	 * Launch the application.
	 */
	public static void monthly_inc() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monthly_incomeGUI frame = new Monthly_incomeGUI();
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
	public Monthly_incomeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBounds(170, 150, 115, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("\u039C\u03B9\u03C3\u03B8\u03CC\u03C2 :");
		label.setBounds(110, 105, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u039C\u03B7\u03BD\u03B9\u03B1\u03AF\u03B1 \u0388\u03C3\u03BF\u03B4\u03B1");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(123, 11, 204, 62);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0395\u03C0\u03B9\u03B4\u03CC\u03BC\u03B1\u03C4\u03B1 :");
		label_2.setBounds(83, 153, 89, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0386\u03BB\u03BB\u03BF :");
		label_3.setBounds(115, 205, 80, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setBounds(39, 198, 46, 14);
		contentPane.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(170, 100, 115, 20);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(170, 200, 115, 20);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF \u0395\u03C3\u03CC\u03B4\u03C9\u03BD :");
		label_5.setBounds(67, 284, 105, 14);
		contentPane.add(label_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(170, 284, 46, 14);
		contentPane.add(lblNewLabel);
		
		JButton button = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
				//kataxorisi minaiwn esodwn+athroisma
				String misthos=textField_1.getText();
				double misthosd=Double.parseDouble(misthos);
				String epidoma=textField_2.getText();
				double epidomad=Double.parseDouble(epidoma);
				String allo=textField_3.getText();
				double allod=Double.parseDouble(allo);
				if(misthosd<0||epidomad<0||allod<0){
					JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!Πιθανόν έχετε εισάγει λανθασμένη τιμή!");
				}
				else {
					double syn=misthosd+epidomad+allod;//athroisma
					String ssyn=Double.toString(syn);
					lblNewLabel.setText(ssyn);
					JOptionPane.showMessageDialog(null, "Καταχωρήθηκαν επιτυχώς τα μηνιαία έσοδα!");
					try {//Evresh arxeiou mesw tou arxeiou date wste na kataxorithei sto swsto arxeio
						FileReader fr=new FileReader("date.txt");
						try {
							BufferedReader br=new BufferedReader(fr);
					        String st;
					        while((st=br.readLine())!=null){
					        	PrintWriter output = new PrintWriter(st.substring(2,8) +"_ti.txt");
					        	PrintWriter output1 = new PrintWriter(st.substring(2, 8) + "_wage.txt");
					        	output1.print(misthos);//Kratame ton mistho se ksexoristo arxeio giati mas xreiazetai se mia parakatw leitourgeia(hlektronika eksoda)
					        	output1.close();
					        	output.print(syn);//kratame ton mistho sto miniaio arxeio wage
								output.close();}
						} catch (IOException e1) {//periorismoi arxeiwn
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}//periorismoi arxeiwn
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				}catch(NumberFormatException e1){
					JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
				}
			}
		});
		button.setBounds(275, 240, 118, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03BF \u039C\u03B5\u03BD\u03BF\u03CD");
		button_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
				// TODO Auto-generated method stub
				Menu back = new Menu();
				back.MenuScreen();
				close();
			}
		});
		button_1.setBounds(275, 320, 170, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi pisw sto parathuro ton esodwn
				IncomeGUI ig = new IncomeGUI();
				ig.income();
				close();
			}
		});
		button_2.setBounds(0, 0, 89, 23);
		contentPane.add(button_2);
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();
	}
}