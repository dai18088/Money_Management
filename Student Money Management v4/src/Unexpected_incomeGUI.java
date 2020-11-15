import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class Unexpected_incomeGUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	/**
	* Launch the application.
	*/
	public static void unexpected_inc() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Unexpected_incomeGUI frame = new Unexpected_incomeGUI();
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
	public Unexpected_incomeGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0391\u03C0\u03C1\u03CC\u03BF\u03C0\u03C4\u03B1 \u0388\u03C3\u03BF\u03B4\u03B1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 24));
		label.setBounds(78, 39, 279, 125);
		contentPane.add(label);
		
		JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto parathuro twn esodwn
				IncomeGUI ig = new IncomeGUI();
				ig.income();
				close();
			}
		});
		button.setBounds(0, 0, 89, 23);
		contentPane.add(button);
		
		JLabel label_1 = new JLabel("\u03A3\u03C5\u03BC\u03BB\u03AE\u03C1\u03C9\u03C3\u03B5 \u03C4\u03BF \u03C0\u03BF\u03C3\u03CC:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(78, 175, 123, 17);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(211, 174, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("Καταχώρηση και επιστροφή στο μενού");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//Kataxorei kai prostheta ta aproopta esoda sto upoloipo tou mina kai epistrefei to menu
				try{
				String aproopta=textField.getText();
				double aprooptad=Double.parseDouble(aproopta);
				if (aprooptad<0){//periorismos eisodou
					JOptionPane.showMessageDialog(null, "Πρέπει να καταχωρήσετε θετικές τιμές");
				}
				else {
					try {//evresh arxeiou upoloipou mesw tou date.txt gia prosthesi aprooptwn esodwn
						FileReader fr=new FileReader("date.txt");	
						try {
							BufferedReader br=new BufferedReader(fr);
					        String st;
					        while((st=br.readLine())!=null){
					        	BufferedReader br1=new BufferedReader(new FileReader(st.substring(2,8) + "_ti.txt"));
					        	String st1;
					        	while((st1=br1.readLine())!=null){
					        		double value=Double.parseDouble(st1);
					        		double syn=value+aprooptad;
					        		PrintWriter output = new PrintWriter(st.substring(2,8) + "_ti.txt");
						        	output.print(syn);
									output.close();}
					        		File f = new File(st.substring(2,8) + "_yp.txt");
					        		if (f.exists()){
					        			BufferedReader br2=new BufferedReader(new FileReader(f));
						        		String st2;
						        		while((st2=br2.readLine())!=null){
						        			double dst2 = Double.parseDouble(st2);
						        			double syn2=dst2+aprooptad;	  
						        			PrintWriter output2 = new PrintWriter(st.substring(2,8) + "_yp.txt");
						        			output2.print(syn2);
						        			output2.close();
						        		}
					        		}
					        		JOptionPane.showMessageDialog(null, "Απρόοπτα έσοδα: "+aprooptad +" προστέθηκαν επιτυχώς.");
					        	}
						} catch (IOException e1) {//periorismos arxeiwn
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {//periorismos arxeiwn
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Menu back = new Menu();//epistrofi sto menu
					back.MenuScreen();
					close();
				}				
				}catch(NumberFormatException e1){//periorismos eisodou
					JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
				}				
			}
		});
		button_1.setBounds(78, 256, 325, 33);
		contentPane.add(button_1);
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		this.dispose();
	}
}