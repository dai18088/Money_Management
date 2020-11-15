import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
public class Menu extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	public String date;
	/**
	 * Launch the application.
	 */
	public static void MenuScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton button = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7 \u0395\u03C3\u03CC\u03B4\u03C9\u03BD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//epilogh esodwn
				IncomeGUI ig = new IncomeGUI();
				ig.income();
				close();
			}
		});
		button.setBounds(139, 124, 170, 23);
		contentPane.add(button);
		JButton button_1 = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7 \u0395\u03BE\u03CC\u03B4\u03C9\u03BD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epilogh eksodwn
				ExpensesGUI exp = new ExpensesGUI();
				exp.expenses();
				close();
			}
		});
		button_1.setBounds(139, 158, 170, 23);
		contentPane.add(button_1);
		JButton button_2 = new JButton("\u0391\u03C0\u03BF\u03C4\u03B1\u03BC\u03AF\u03B5\u03C5\u03C3\u03B7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epilogh apotamiefshs
				SavingsGUI s = new SavingsGUI();
				s.Savings();
				close();
			}
		});
		button_2.setBounds(139, 226, 170, 23);
		contentPane.add(button_2);
		JButton button_3 = new JButton("\u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epilogh upoloipou
				RemainingGUI r = new RemainingGUI();
				r.Remaining();
				close();
			}
		});
		button_3.setBounds(139, 192, 170, 23);
		contentPane.add(button_3);
		JButton btnNewButton = new JButton("\u0395\u03BA\u03C4\u03AF\u03BC\u03B7\u03C3\u03B7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epilogh ektimisis
				EvaluationGUI ev = new EvaluationGUI();
				ev.evaluation();
				close();
			}
		});
		btnNewButton.setBounds(139, 260, 170, 23);
		contentPane.add(btnNewButton);
		JButton btnNewButton_1 = new JButton("\u03A3\u03C4\u03B1\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epilogh statistikwn
				StatisticsGUI s = new StatisticsGUI();
				s.Statistics();
				close();
			}
		});
		btnNewButton_1.setBounds(139, 294, 170, 23);
		contentPane.add(btnNewButton_1);
		JButton button_4 = new JButton("\u0397\u03BB\u03B5\u03BA\u03C4\u03C1\u03BF\u03BD\u03B9\u03BA\u03AC \u0388\u03BE\u03BF\u03B4\u03B1");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedReader br = new BufferedReader(new FileReader("date.txt"));
					String st;
					while ((st=br.readLine())!=null) {
					File f = new File(st.substring(2,8) + "_wage.txt");
					if (f.exists()) {//an exei kataxorithei  misthos,anoigei to parathuro twn hlektronikwn eksodwn
						E_expensesGUI exp = new E_expensesGUI();
						exp.E_expenses();
						close();
					}else {//an den exei kataxorithei o misthos den epitrepetai to anoigma twn hlektronikwn eksodwn
						JOptionPane.showMessageDialog(null, "Πρέπει να εισάγεται το μηνιαίο μισθό σας για να χρησιμοποιήσετε τα ηλεκτρονικά έξοδα" );
					}
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}			
			}
		});
		button_4.setBounds(139, 328, 170, 23);
		contentPane.add(button_4);
		JLabel lblNewLabel = new JLabel("ΣΥΣΤΗΜΑ ΔΙΑΧΕΙΡΙΣΗΣ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(90, 50, 262, 14);
		contentPane.add(lblNewLabel);
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		textField = new JTextField(dateFormat.format(date));
		textField.setBounds(133, 92, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		JButton btnNewButton_2 = new JButton("\u0394\u03AE\u03BB\u03C9\u03C3\u03B7");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\Student Money Management v3\\imgs\\calendar-512 .png"));
		btnNewButton_2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {//Kataxorisi hmerominias gia tin ekkinisi tis efarmoghs
				// TODO Auto-generated method stub
				try {
					File f = new File("savings.txt");//dhmiourgia arxeiou savings gia apotamiefsh
					try {
						if (!(f.exists())){//an einai h prwth fora p xrhsimopoieitai h efarmogh kataxorei 0 sthn apotamiefsh
						PrintWriter output = new PrintWriter(f);
						output.print("0");
						output.close();
						}
					} catch (FileNotFoundException e) {//periorismos arxeiou
						// TODO Auto-generated catch block
						e.printStackTrace();
					}//kataxorisi hmerominias		
					String day=textField.getText();
					day=day.substring(0,2);
					int dayint=Integer.parseInt(day);
					String month=textField.getText();
					month=month.substring(3,5);
					int monthint=Integer.parseInt(month);
					if(monthint>7&&monthint<9)
						monthint=8;
					String year=textField.getText();
					year=year.substring(6,10);
					int yearint=Integer.parseInt(year);
					int days;
					if(monthint==01||monthint==03||monthint==05||monthint==07||monthint==8||monthint==10||monthint==12){//evresi hmerwn pou exei o kathe minas
					days=31;}
					else if(monthint==2){
					days=28;}
					else{
					days=30;}
					if(dayint==0||dayint>days||monthint>12||monthint==0||yearint<1990) {//periorismos eisodou
						JOptionPane.showMessageDialog(null, "Λάθος Είσοδο! Προσπαθήστε Ξανά");
					}
					else {
						File dateC=new File("date.txt");//kataxorisi trexousas imerominias sto date gia tin diefkolinsi mas gia tin evresh tou katallilou arxeiou gia kathe leitourgia
						try {
							PrintWriter output1=new PrintWriter(dateC);
							output1.print(day+month+year);
							output1.close();
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Ημέρα: " +dayint + " Μήνας: " +monthint + " Έτος: " +yearint);
					}
					}catch(NumberFormatException e) {//periorismos eisodou
						JOptionPane.showMessageDialog(null, "Λάθος Είσοδο! Προσπαθήστε Ξανά");
					}
				}
		});
		btnNewButton_2.setBounds(233, 90, 88, 24);
		contentPane.add(btnNewButton_2);
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();
	}
}