import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class Remaining2GUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField_2;
	/**
	 * Launch the application.
	 */
	public static void Remaining2(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remaining2GUI frame = new Remaining2GUI();
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
	public Remaining2GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(170, 20, 86, 24);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u03A4\u03BF \u03C3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03CC \u03C0\u03BF\u03C3\u03CC \u03C0\u03C1\u03BF\u03C2 \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03AF\u03B5\u03C5\u03C3\u03B7\u03C2 \u03B5\u03AF\u03BD\u03B1\u03B9:");
		label_1.setBounds(7, 105, 251, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u03A4\u03BF \u03BC\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF \u03B4\u03B9\u03B1\u03B8\u03AD\u03C3\u03B9\u03BC\u03BF \u03C0\u03BF\u03C3\u03CC \u03B5\u03AF\u03BD\u03B1\u03B9:");
		label_2.setBounds(7, 145, 180, 14);
		contentPane.add(label_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(268, 105, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(197, 145, 46, 14);
		contentPane.add(label_3);
		try {
			BufferedReader br=new BufferedReader(new FileReader("date.txt"));//voitheia apo to arxeio date g evresi arxeiou upoloipou
			String st;
			BufferedReader br1=new BufferedReader(new FileReader("savings.txt"));
			String st2;
			try {
				while((st=br.readLine())!=null) {
					while((st2=br1.readLine())!=null) {
						lblNewLabel.setText(st2);
						BufferedReader br2=new BufferedReader(new FileReader(st.substring(2,8) + "_yp.txt"));
						String st3;
						while((st3=br2.readLine())!=null) {
							label_3.setText(st3);//probolh upolipou
						}
					}					
				}
			} catch (IOException e1) {//periorismos arxeiou
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {//periorismos arxeiou
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {//koumpi prosthesis sugkekrimenou posou apo apotamiefsh sto upoloipo
			public void actionPerformed(ActionEvent e) {
				try {				
				String poso=textField_2.getText();
				Double dposo=Double.parseDouble(poso);				
				if(dposo<=0 || dposo>Double.valueOf(lblNewLabel.getText())) {//periorismos eisodou
					JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
				}else {				
				try {
					BufferedReader br=new BufferedReader(new FileReader("date.txt"));//voitheia tou arxeiou date g to upoloipo
					String st;
					try {
						while((st=br.readLine())!=null) {
							BufferedReader br1=new BufferedReader(new FileReader(st.substring(2,8) + "_yp.txt"));
							String st2;
							while((st2=br1.readLine())!=null) {
								PrintWriter output=new PrintWriter(st.substring(2,8) + "_yp.txt");
								double prin=Double.parseDouble(st2);
								double neo=dposo+prin;//prothesh tou sugkekrimenou posou apo tin apotamiefsh sto upoloipo								
								output.print(String.valueOf(neo));
								output.close();
								BufferedReader br2=new BufferedReader(new FileReader("savings.txt"));
								String st3;
								while((st3=br2.readLine())!=null) {
									double apot=Double.parseDouble(st3);
									double syn=apot-dposo;//afairesh sugkekrimenou posou apo apotamiefsh
									PrintWriter output2=new PrintWriter("savings.txt");
									output2.print(String.valueOf(syn));//enimerwsh apotamiefshs									
									output2.close();
								}
							}
						}
					} catch (IOException e1) {//periorismos arxeiwn
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}					
				} catch (FileNotFoundException e1) {//periorismos arxeiwn
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Remaining3GUI r = new Remaining3GUI();//sunexeia sto trito parathuro tis apotamiefshs
				r.Remaining3();
				close();
				}				
				}catch(NumberFormatException e1){
					JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
				}
			}
		});
		button_1.setBounds(140, 280, 41, 23);
		contentPane.add(button_1);
		JButton button_2 = new JButton("-");
		//H idia leitourgeia mono pou prosthetontai xrimata apo to upoloipo pros tin apotamiefsh
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try {
				String poso=textField_2.getText();
				Double dposo=Double.parseDouble(poso);				
				if(dposo<=0 || dposo>Double.valueOf(label_3.getText())) {//periorismos eisodou
					JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
				}else {				
				try {
					BufferedReader br=new BufferedReader(new FileReader("date.txt"));
					String st;
					try {
						while((st=br.readLine())!=null) {
							BufferedReader br1=new BufferedReader(new FileReader(st.substring(2,8) + "_yp.txt"));
							String st2;
							while((st2=br1.readLine())!=null) {
								PrintWriter output=new PrintWriter(st.substring(2,8) + "_yp.txt");
								double prin=Double.parseDouble(st2);
								double neo=prin-dposo;								
								output.print(String.valueOf(neo));	
								output.close();
								BufferedReader br2=new BufferedReader(new FileReader("savings.txt"));
								String st3;
								while((st3=br2.readLine())!=null) {
									double apot=Double.parseDouble(st3);
									double syn=apot+dposo;
									PrintWriter output2=new PrintWriter("savings.txt");
									output2.print(String.valueOf(syn));									
									output2.close();
								}
							}
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Remaining3GUI r = new Remaining3GUI();
				r.Remaining3();
				close();
				}				
				}catch(NumberFormatException e1) {					
					JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");					
				}
			}
		});
		button_2.setBounds(180, 280, 41, 23);
		contentPane.add(button_2);		
		textField_2 = new JTextField();
		textField_2.setBounds(225, 281, 41, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setText("\u0391\u03BD \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BD\u03B1 \u03B1\u03C5\u03BE\u03AE\u03C3\u03B5\u03C4\u03B5 \u03C4\u03BF \u03BC\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF \u03C5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF \u03BC\u03B5\u03B9\u03CE\u03BD\u03BF\u03BD\u03C4\u03B1\u03C2 \u03C4\u03BF \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03B9\u03B5\u03C5\u03BC\u03AD\u03BD\u03BF \u03C0\u03BF\u03C3\u03CC, \u03B5\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03C4\u03BF \u03C0\u03BB\u03AE\u03BA\u03C4\u03C1\u03BF \"+\" , \u03B1\u03BB\u03BB\u03B9\u03CE\u03C2 \u03C4\u03BF \u03C0\u03BB\u03AE\u03BA\u03C4\u03C1\u03BF \"-\" \u03BA\u03B1\u03B9 \u03C3\u03C4\u03B7\u03BD \u03C3\u03C5\u03BD\u03AD\u03C7\u03B5\u03B9\u03B1 \u03C3\u03C5\u03BC\u03C0\u03BB\u03B7\u03C1\u03CE\u03C3\u03C4\u03B5 \u03C4\u03BF \u03C0\u03BF\u03C3\u03CC");
		textPane.setBounds(7, 210, 420, 50);
		contentPane.add(textPane);		
		JButton button_3 = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03BF \u03BC\u03B5\u03BD\u03BF\u03CD");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
				Menu m = new Menu();
				m.MenuScreen();
				close();				
			}
		});
		button_3.setBounds(140, 315, 170, 23);
		contentPane.add(button_3);	
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();		
	}
}