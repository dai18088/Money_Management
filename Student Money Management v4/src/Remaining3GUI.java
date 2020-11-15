import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class Remaining3GUI extends JFrame {
	private JPanel contentPane;
	private static DecimalFormat df2 = new DecimalFormat("#.##");	
	/**
	 * Launch the application.
	 */
	public static void Remaining3() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remaining3GUI frame = new Remaining3GUI();
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
	public Remaining3GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u03A4\u03BF \u03BD\u03AD\u03BF \u03BC\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF \u03B4\u03B9\u03B1\u03B8\u03AD\u03C3\u03B9\u03BC\u03BF \u03C0\u03BF\u03C3\u03CC \u03B5\u03AF\u03BD\u03B1\u03B9:");
		lblNewLabel.setBounds(85, 95, 222, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u03A5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF");
		label.setBounds(161, 11, 124, 24);
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u03A4\u03BF \u03BD\u03AD\u03BF \u03C3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03CC \u03C0\u03CC\u03C3\u03BF \u03C0\u03C1\u03BF\u03C2 \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03AF\u03B5\u03C5\u03C3\u03B7 \u03B5\u03AF\u03BD\u03B1\u03B9:");
		label_1.setBounds(42, 153, 251, 14);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u039F \u03BD\u03B5\u03CC\u03C2 \u03BC\u03AD\u03C3\u03BF\u03C2 \u03CC\u03C1\u03BF\u03C2 \u03C4\u03C9\u03BD \u03C7\u03C1\u03B7\u03BC\u03AC\u03C4\u03C9\u03BD \u03C0\u03BF\u03C5 \u03BC\u03C0\u03BF\u03C1\u03B5\u03AF\u03C4\u03B5 \u03BD\u03B1 \u03BA\u03B1\u03C4\u03B1\u03BD\u03B1\u03BB\u03CE\u03C3\u03B5\u03C4\u03B5 \u03B7\u03BC\u03B5\u03C1\u03B7\u03C3\u03AF\u03C9\u03C2:");
		label_2.setBounds(10, 219, 414, 14);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(label_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(307, 95, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(303, 153, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(397, 219, 46, 14);
		contentPane.add(lblNewLabel_3);		
		try {
			BufferedReader br=new BufferedReader(new FileReader("date.txt"));//evresi arxeiou me ti voitheia t date
			String st;			
			try {
				while((st=br.readLine())!=null) {
					String minas = null;
					int dminas =Integer.parseInt(st.substring(3,4));
					String mera=null;
					int dmera=Integer.parseInt(st.substring(0,2));
					int days;
					if(dminas==01||dminas==03||dminas==05||dminas==07||dminas==8||dminas==10||dminas==12){//evresi imerwn tou kathe mina
					days=31;}
					else if(dminas==2){
					days=28;}
					else{
					days=30;}					
					double mo=0;					
					BufferedReader br1=new BufferedReader(new FileReader(st.substring(2,8) + "_yp.txt"));
					String st1;
					while((st1=br1.readLine())!=null) {
						lblNewLabel_1.setText(st1);
						double ypoloipo=Double.parseDouble(st1);
						mo=ypoloipo/(days-dmera);//upologismos mesou orou
						lblNewLabel_3.setText(df2.format(mo));//provoli mo
						BufferedReader br3=new BufferedReader(new FileReader("savings.txt"));
						String st3;
						while((st3=br3.readLine())!=null) {
							lblNewLabel_2.setText(st3);//provoli apotamiefshs
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
		JButton button = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03BF \u03B1\u03C1\u03C7\u03B9\u03BA\u03CC \u03BC\u03B5\u03BD\u03BF\u03CD");
		button.setBounds(140, 307, 213, 31);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		contentPane.add(button);
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();
	}
}