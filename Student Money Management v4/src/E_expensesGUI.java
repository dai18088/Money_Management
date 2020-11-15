import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.SwingConstants;
public class E_expensesGUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void E_expenses() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_expensesGUI frame = new E_expensesGUI();
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
	public  E_expensesGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		JLabel label = new JLabel("\u0397\u03BB\u03B5\u03BA\u03C4\u03C1\u03BF\u03BD\u03B9\u03BA\u03AC \u0388\u03BE\u03BF\u03B4\u03B1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(61, 50, 292, 61);
		label.setFont(new Font("Times New Roman", Font.BOLD, 28));
		contentPane.add(label);		
		JLabel label_1 = new JLabel("\u03A3\u03C5\u03BC\u03C0\u03BB\u03B7\u03C1\u03CE\u03C3\u03C4\u03B5 \u03C4\u03BF \u03C0\u03BF\u03C3\u03CC \u03C0\u03BF\u03C5 \u03BE\u03BF\u03B4\u03AD\u03C8\u03B1\u03C4\u03B5 \u03BC\u03AD\u03C3\u03C9 \u03BA\u03AC\u03C1\u03C4\u03B1\u03C2:");
		label_1.setBounds(17, 157, 303, 14);
		contentPane.add(label_1);		
		textField = new JTextField();
		textField.setBounds(322, 155, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);		
		JButton btnNewButton = new JButton("\u03A0\u03AF\u03C3\u03C9");
		btnNewButton.setBounds(0, 0, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		contentPane.add(btnNewButton);		
		JButton button = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
		button.setBounds(125, 188, 192, 55);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String s = textField.getText();
					double ds=Double.parseDouble(s);//poso p kataxorithike sto plaisio					
					int flag=0;
					BufferedReader br=new BufferedReader(new FileReader("date.txt"));//voitheia arxeiou date g to arxeio wage k eexp
					String st;
					while((st=br.readLine())!=null) {
						BufferedReader br6=new BufferedReader(new FileReader(st.substring(2,8)+"_wage.txt"));
						String st6;
						while((st6=br6.readLine())!=null) {
							Double std6=Double.parseDouble(st6);
							File f = new File(st.substring(2, 8) + "_eexp.txt");
							if (!(f.exists())){
								if (ds>std6)
									flag=1;
							}else {
									BufferedReader br7 = new BufferedReader(new FileReader(st.substring(2, 8) + "_eexp.txt"));
									String st7;
									while((st7=br7.readLine())!=null) {
										double dst7=Double.parseDouble(st7);
										if(ds+dst7>std6) {
											flag=1;
										}
									}									
								}
							}
						}					
					if (ds<0 || flag==1)//periorismos eisodou
						JOptionPane.showMessageDialog(null, "Πρέπει να καταχωρήσετε θετική τιμή");
					else{						
						try {
							BufferedReader br1=new BufferedReader(new FileReader("date.txt"));
							String date;
							while((date=br1.readLine())!=null){
								
								File f = new File(date.substring(2, 8) + "_eexp.txt");
								if (!(f.exists())){
									PrintWriter output = new PrintWriter(f);
									output.print(s);
									output.close();
								}else{
									BufferedReader br2 = new BufferedReader(new FileReader(date.substring(2, 8) + "_eexp.txt"));
									String st2;
									while((st2=br2.readLine())!=null){
										Double eexp = Double.valueOf(st2);
										eexp+=Double.valueOf(s);//prosthesi hlektronikwn eksodwn										
										PrintWriter output2 = new PrintWriter(f);
										output2.print(eexp);//kataxorisi sto arxeio eexp
										output2.close();	
									}
								}								
							}							
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}						
						E_expenses2GUI ex = new  E_expenses2GUI();//deutero parathuro hlektronikwn eksodwn
						ex.E_expenses2();
						close();
					}					
				} catch (NumberFormatException | HeadlessException | IOException e1) {
					JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
				}				
			}
		});
		contentPane.add(button);		
		JTextPane txtpnEfdfd = new JTextPane();
		txtpnEfdfd.setBackground(new Color(0, 255, 0));
		txtpnEfdfd.setEditable(false);
		txtpnEfdfd.setText("\u0397 \u03BB\u03B5\u03B9\u03C4\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1 \u03B1\u03C5\u03C4\u03AE \u03B1\u03C0\u03B5\u03C5\u03B8\u03CD\u03BD\u03B5\u03C4\u03B1\u03B9 \u03C3\u03B5 \u03BC\u03B9\u03C3\u03B8\u03C9\u03C4\u03BF\u03CD\u03C2 \u03BF\u03B9 \u03BF\u03C0\u03BF\u03AF\u03BF\u03B9 \u03BF\u03C6\u03B5\u03AF\u03BB\u03BF\u03C5\u03BD \u03BD\u03B1 \u03BA\u03B1\u03C4\u03B1\u03BD\u03B1\u03BB\u03CE\u03BD\u03BF\u03C5\u03BD \u03C4\u03BF 10% \u03C4\u03BF\u03C5 \u03BC\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF\u03C5 \u03BC\u03B9\u03C3\u03B8\u03BF\u03CD \u03C4\u03BF\u03C5\u03C2 \u03B7\u03BB\u03B5\u03BA\u03C4\u03C1\u03BF\u03BD\u03B9\u03BA\u03AC \u03B1\u03BB\u03BB\u03B9\u03CE\u03C2 \u03C5\u03C0\u03AC\u03C1\u03C7\u03B5\u03B9 \u03BF\u03B9\u03BA\u03BF\u03BD\u03BF\u03BC\u03B9\u03BA\u03AE \u03B5\u03C0\u03B9\u03B2\u03AC\u03C1\u03C5\u03BD\u03C3\u03B7 \u03C3\u03C4\u03BF \u03C4\u03AD\u03BB\u03BF\u03C2 \u03C4\u03BF\u03C5 \u03AD\u03C4\u03BF\u03C5\u03C2.");
		txtpnEfdfd.setBounds(61, 268, 316, 67);
		contentPane.add(txtpnEfdfd);
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();		
	}
}