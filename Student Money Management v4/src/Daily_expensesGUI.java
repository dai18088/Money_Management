import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class Daily_expensesGUI extends JFrame {

private JPanel contentPane;
private JTextField textField;
private JTextField textField_1;
private JTextField textField_2;
private JTextField textField_3;
private JTextField textField_4;
private JTextField textField_5;
private JTextField textField_6;
private JTextField textField_7;
/**
* Launch the application.
*/
	public static void daily_expenses() {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
		try {
		Daily_expensesGUI frame = new Daily_expensesGUI();
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
	public Daily_expensesGUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 480, 400);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(173, 255, 47));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel lblNewLabel = new JLabel("\u039A\u03B1\u03B8\u03B7\u03BC\u03B5\u03C1\u03B9\u03BD\u03AC \u0388\u03BE\u03BF\u03B4\u03B1");
	lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setBounds(85, 0, 264, 42);
	contentPane.add(lblNewLabel);
	
	JLabel label = new JLabel("\u03A6\u03AC\u03C1\u03BC\u03B1\u03BA\u03B1 :");
	label.setBounds(69, 59, 62, 14);
	contentPane.add(label);
	
	textField = new JTextField();
	textField.setBounds(141, 56, 86, 20);
	contentPane.add(textField);
	textField.setColumns(10);
	
	JLabel label_1 = new JLabel("\u03A4\u03C1\u03CC\u03C6\u03B9\u03BC\u03B1 :");
	label_1.setBounds(79, 90, 73, 14);
	contentPane.add(label_1);
	
	textField_1 = new JTextField();
	textField_1.setColumns(10);
	textField_1.setBounds(141, 87, 86, 20);
	contentPane.add(textField_1);
	
	JLabel label_2 = new JLabel("\u0394\u03B9\u03B1\u03C3\u03BA\u03AD\u03B4\u03B1\u03C3\u03B7 :");
	label_2.setBounds(58, 119, 78, 14);
	contentPane.add(label_2);
	
	textField_2 = new JTextField();
	textField_2.setColumns(10);
	textField_2.setBounds(141, 115, 86, 20);
	contentPane.add(textField_2);
	
	JLabel lblHobby = new JLabel("Hobby :");
	lblHobby.setBounds(85, 150, 89, 14);
	contentPane.add(lblHobby);
	
	textField_3 = new JTextField();
	textField_3.setColumns(10);
	textField_3.setBounds(141, 148, 86, 20);
	contentPane.add(textField_3);
	
	JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
	button.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {//Epistrofi pisw sto parathuro twn eksodwn
		ExpensesGUI eg = new ExpensesGUI();
		eg.expenses();
		close();
	}
	});
	button.setBounds(0, 0, 89, 23);
	contentPane.add(button);
	
	JLabel label_3 = new JLabel("\u039C\u03B5\u03C4\u03B1\u03BA\u03B9\u03BD\u03AE\u03C3\u03B5\u03B9\u03C2 :");
	label_3.setBounds(51, 182, 103, 14);
	contentPane.add(label_3);
	
	textField_4 = new JTextField();
	textField_4.setBounds(141, 179, 86, 20);
	contentPane.add(textField_4);
	textField_4.setColumns(10);
	
	JLabel label_4 = new JLabel("\u03A1\u03BF\u03CD\u03C7\u03B1 :");
	label_4.setBounds(83, 212, 58, 14);
	contentPane.add(label_4);
	
	textField_5 = new JTextField();
	textField_5.setColumns(10);
	textField_5.setBounds(141, 210, 86, 20);
	contentPane.add(textField_5);
	
	textField_6 = new JTextField();
	textField_6.setBounds(141, 241, 86, 20);
	contentPane.add(textField_6);
	textField_6.setColumns(10);
	
	textField_7 = new JTextField();
	textField_7.setBounds(141, 272, 86, 20);
	contentPane.add(textField_7);
	textField_7.setColumns(10);
	
	JLabel label_5 = new JLabel("\u0395\u03AF\u03B4\u03B7 \u03A5\u03B3\u03B9\u03B5\u03B9\u03BD\u03AE\u03C2 :");
	label_5.setBounds(56, 244, 92, 14);
	contentPane.add(label_5);
	
	JLabel label_6 = new JLabel("\u0386\u03BB\u03BB\u03BF :");
	label_6.setBounds(88, 275, 50, 14);
	contentPane.add(label_6);
	
	JLabel lblNewLabel_1 = new JLabel("");
	lblNewLabel_1.setBounds(328, 119, 46, 14);
	contentPane.add(lblNewLabel_1);
	
	JButton button_1 = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03BF \u039C\u03B5\u03BD\u03BF\u03CD");
	button_1.addActionListener(new ActionListener(){
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Epistrofi sto menu
		Menu back = new Menu();
		back.MenuScreen();
		close();
	}
	});
	button_1.setBounds(252, 164, 182, 23);
	contentPane.add(button_1);
	
	JLabel label_7 = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF :");
	label_7.setBounds(268, 118, 50, 14);
	contentPane.add(label_7);
	
	JButton button_2 = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
	button_2.addActionListener(new ActionListener (){
	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		//Kataxorisi kathimerinwn eksodwn+ athroisma kathimerinwn
	try{
			String farmaka=textField.getText();
			double farmakad=Double.parseDouble(farmaka);
			String trofima=textField_1.getText();
			double trofimad=Double.parseDouble(trofima);
			String diaskedasi=textField_2.getText();
			double diaskedasid=Double.parseDouble(diaskedasi);
			String hobby=textField_3.getText();
			double hobbyd=Double.parseDouble(hobby);
			String metakinisi=textField_4.getText();
			double metakinisid=Double.parseDouble(metakinisi);
			String rouxa=textField_5.getText();
			double rouxad=Double.parseDouble(rouxa);
			String eidhygieinis=textField_6.getText();
			double eidhygieinisd=Double.parseDouble(eidhygieinis);
			String allo=textField_7.getText();
			double allod=Double.parseDouble(allo);
			//Periorismoi eisodou
			if(farmakad<0 || trofimad<0 || diaskedasid<0 || hobbyd<0 || metakinisid<0 || rouxad<0 || eidhygieinisd<0 ||allod<0){
			JOptionPane.showMessageDialog(null, "Λάθος Είσοδο! Προσπαθήστε Ξανά");
			}
			else{
				//athrisma
			double syn=farmakad+trofimad+diaskedasid+hobbyd+metakinisid+rouxad+eidhygieinisd+allod;
			String ssyn=Double.toString(syn);
			try {
				//Mesw tis hmeromhnias kataxwrw sto katallilo arxeio ta dedomena 
			FileReader fr=new FileReader("date.txt");
			try {
					BufferedReader br=new BufferedReader(fr);
			       String st;
			       while((st=br.readLine())!=null){
				       	PrintWriter output = new PrintWriter(st+"_de.txt");
				       	output.println(farmaka);
				       	output.println(trofima);
				       	output.println(diaskedasi);
				       	output.println(hobby);
				       	output.println(metakinisi);
				       	output.println(rouxa);
				       	output.println(eidhygieinis);
				       	output.println(allo);
				       	PrintWriter output2 = new PrintWriter(st+"_tde.txt");
				       	output2.print(syn);
				       	File f = new File(st.substring(2,8) + "_te.txt");
				       	if (f.exists()){
					       	BufferedReader br2 = new BufferedReader(new FileReader(f));
					       	String st2;
					       	while ((st2=br2.readLine())!=null){
						       	double n = syn + Double.valueOf(st2);
						       	PrintWriter output3 = new PrintWriter(st.substring(2,8) + "_te.txt");
						       	output3.print(n);
						       	output3.close();
				       	}
				       	}else{
				       	PrintWriter output3 = new PrintWriter(st.substring(2,8) + "_te.txt");
				       	output3.print(syn);
				       	output3.close();
				       	}
				       	BufferedReader br3 = new BufferedReader(new FileReader(st.substring(2, 8) + "_ti.txt"));
				       	String st3;
				       	while((st3=br3.readLine())!=null){
					       	BufferedReader br4 = new BufferedReader(new FileReader(st.substring(2, 8) + "_te.txt"));
					       	String st4;
					       	while((st4=br4.readLine())!=null){
						       	double yp = Double.valueOf(st3) - Double.valueOf(st4);
						       	PrintWriter output4 = new PrintWriter(st.substring(2,8) + "_yp.txt");
						    	output4.print(yp);
						    	output4.close();
				       	}
				       	}
					output.close();
					output2.close();
			}
			       //periorismoi arxeiwn
			} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}
			} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			}	
	lblNewLabel_1.setText(ssyn);
	JOptionPane.showMessageDialog(null,"Το σύνολο των καθημερινών σου εξόδων είναι: " +ssyn);
	}//periorismos eisodou	
	}catch(NumberFormatException e1){
	JOptionPane.showMessageDialog(null, "Λάθος Είσοδο! Προσπαθήστε Ξανά");
	}	
	}});
	button_2.setBounds(125, 309, 137, 42);
	contentPane.add(button_2);
	}//kleisimo parathurou 
	public void close(){
	this.setVisible(false);
	this.dispose();
	
	}
	}
