import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
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
public class Basic_expensesGUI extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4; 
/**
* Launch the application.
*/
	public static void basic_expenses() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Basic_expensesGUI frame = new Basic_expensesGUI();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					}
				catch (Exception e) {e.printStackTrace();}
				}			
				});
				}
/**
* Create the frame.
*/
public Basic_expensesGUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 480, 400);
	contentPane = new JPanel();
	contentPane.setBackground(new Color(173, 255, 47));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JLabel label = new JLabel("\u0392\u03B1\u03C3\u03B9\u03BA\u03AC \u0388\u03BE\u03BF\u03B4\u03B1");
	label.setFont(new Font("Times New Roman", Font.BOLD, 20));
	label.setHorizontalAlignment(SwingConstants.CENTER);
	label.setBounds(98, 0, 217, 61);
	contentPane.add(label);
	
	textField = new JTextField();
	textField.setBounds(210, 50, 105, 20);
	contentPane.add(textField);
	textField.setColumns(10);
	
	textField_1 = new JTextField();
	textField_1.setBounds(210, 85, 105, 20);
	contentPane.add(textField_1);
	textField_1.setColumns(10);
	
	textField_2 = new JTextField();
	textField_2.setBounds(210, 116, 105, 20);
	contentPane.add(textField_2);
	textField_2.setColumns(10);
	
	textField_3 = new JTextField();
	textField_3.setBounds(210, 147, 105, 20);
	contentPane.add(textField_3);
	textField_3.setColumns(10);
	
	textField_4 = new JTextField();
	textField_4.setBounds(210, 183, 105, 20);
	contentPane.add(textField_4);
	textField_4.setColumns(10);
	
	JLabel lblNewLabel = new JLabel("\u03A1\u03B5\u03CD\u03BC\u03B1:");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setBounds(126, 53, 86, 14);
	contentPane.add(lblNewLabel);
	
	JLabel lblNewLabel_1 = new JLabel("\u039D\u03B5\u03C1\u03CC:");
	lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_1.setBounds(120, 88, 92, 14);
	contentPane.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel("\u0395\u03BD\u03BF\u03AF\u03BA\u03B9\u03BF:");
	lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_2.setBounds(124, 119, 86, 14);
	contentPane.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel("\u0398\u03AD\u03C1\u03BC\u03B1\u03BD\u03C3\u03B7:");
	lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_3.setBounds(120, 150, 86, 14);
	contentPane.add(lblNewLabel_3);
	
	JLabel lblinternet = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF/Internet:");
	lblinternet.setHorizontalAlignment(SwingConstants.CENTER);
	lblinternet.setBounds(79, 186, 139, 14);
	contentPane.add(lblinternet);
	
	JLabel lblNewLabel_4 = new JLabel("\u03A3\u03CD\u03BD\u03BF\u03BB\u03BF \u0392\u03B1\u03C3\u03B9\u03BA\u03CE\u03BD \u0395\u03BE\u03CC\u03B4\u03C9\u03BD:");
	lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_4.setBounds(45, 277, 177, 14);
	contentPane.add(lblNewLabel_4);
	
	JLabel lblNewLabel_5 = new JLabel("");
	lblNewLabel_5.setBounds(210, 277, 86, 14);
	contentPane.add(lblNewLabel_5);

	JButton btnNewButton = new JButton("Καταχώρηση");
	btnNewButton.addActionListener(new ActionListener(){
	@Override
	/**
	 Kataxorisi basikwn exodwn kai eggrafh se arxeia miniaia gia katagrafi statistikwn kai upoloipou
	 */
	public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	try{
		String reuma=textField.getText();
		double reumad=Double.parseDouble(reuma);
		String nero=textField_1.getText();
		double nerod=Double.parseDouble(nero);
		String enoikio=textField_2.getText();
		double enoikiod=Double.parseDouble(enoikio);
		String thermansi=textField_3.getText();
		double thermansid=Double.parseDouble(thermansi);
		String tilef=textField_4.getText();
		double tilefd=Double.parseDouble(tilef);
		//Periorismoi eisodou
	if(reumad<0||nerod<0||enoikiod<0||thermansid<0||tilefd<0){
		JOptionPane.showMessageDialog(null, "Λάθος Είσοδο! Προσπαθήστε Ξανά");}
	else{
	double syn=reumad+nerod+enoikiod+thermansid+tilefd;
	String ssyn=Double.toString(syn);
	lblNewLabel_5.setText(ssyn);
	try {
	//Diaxeirisi hmeromhnias gia tin katallili eggrafh se arxeio tou sugkekrimenou mina
	FileReader fr=new FileReader("date.txt");
	try {
	BufferedReader br=new BufferedReader(fr);
	       String st;
	       while((st=br.readLine())!=null){
		       	PrintWriter output = new PrintWriter(st.substring(2,8) + "_be.txt");
		       	//katagrafh kathe enos eksodou gia ekdosh statistikwn
		       	output.println(reuma);
		       	output.println(nero);
		       	output.println(enoikio);
		       	output.println(thermansi);
		       	output.println(tilef);
		       	//katagrafh sunolikwn basikwn eksodwn
		       	PrintWriter output2 = new PrintWriter(st.substring(2,8) + "_tbe.txt");
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
	       	output2.close();
	       	output.close();}
	       //Periorismoi arxeiwn kai eisodwn
	} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}
	} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}
	JOptionPane.showMessageDialog(null,"Το σύνολο των βασικών εξόδων σου είναι: " + ssyn);
	}
	}catch(NumberFormatException e1){
	JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
	}
	}
	});
		btnNewButton.setBounds(293, 214, 161, 35);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03BF \u039C\u03B5\u03BD\u03BF\u03CD");
		btnNewButton_1.addActionListener(new ActionListener(){
		@Override
		//Epistrofi sto menu mesw tou button
		public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Menu back = new Menu();
		back.MenuScreen();
		close();
		}
		});
		btnNewButton_1.setBounds(282, 316, 172, 35);
		contentPane.add(btnNewButton_1);
		JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		//Epistrofi pisw sto parathuro eksodwn
			ExpensesGUI eg = new ExpensesGUI();
			eg.expenses();
			close();
		}
		});
		button.setBounds(-1, 0, 89, 23);
		contentPane.add(button);
		}//kleisimo parathurou
		public void close(){
			this.setVisible(false);
			this.dispose();
		}
}