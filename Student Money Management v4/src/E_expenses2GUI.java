import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
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
import javax.swing.ImageIcon;
public class E_expenses2GUI extends JFrame {
	private JPanel contentPane;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	/**
	 * Launch the application.
	 */
	public static void E_expenses2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					E_expenses2GUI frame = new E_expenses2GUI();
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
	public E_expenses2GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		JLabel lblNewLabel = new JLabel("\u0397\u03BB\u03B5\u03BA\u03C4\u03C1\u03BF\u03BD\u03B9\u03BA\u03AC \u0388\u03BE\u03BF\u03B4\u03B1");
		lblNewLabel.setBounds(52, 11, 305, 39);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel);		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03BF \u03BC\u03B5\u03BD\u03BF\u03CD");
		btnNewButton.setBounds(143, 302, 191, 49);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		contentPane.add(btnNewButton);		
		JLabel lblNewLabel_1 = new JLabel("\u03A4\u03BF \u03C0\u03BF\u03C3\u03CC \u03C0\u03BF\u03C5 \u03AD\u03C7\u03B5\u03B9 \u03BA\u03B1\u03C4\u03B1\u03BD\u03B1\u03BB\u03C9\u03B8\u03B5\u03AF \u03BC\u03B5 \u03B7\u03BB\u03B5\u03BA\u03C4\u03C1\u03BF\u03BD\u03B9\u03BA\u03AC \u03BC\u03AD\u03C3\u03B1:");
		lblNewLabel_1.setBounds(10, 199, 297, 34);
		contentPane.add(lblNewLabel_1);		
		JLabel label = new JLabel("\u03A3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03CC\u03C2 \u03BC\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF\u03C2 \u03BC\u03B9\u03C3\u03B8\u03CC\u03C2:");
		label.setBounds(153, 256, 218, 20);
		contentPane.add(label);		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(317, 202, 85, 29);
		contentPane.add(label_1);		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(317, 256, 92, 20);
		contentPane.add(label_2);		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Philip\\Desktop\\SMM FILE\\Student Money Management v6\\imgs\\e_exp.jpg"));
		lblNewLabel_2.setBounds(10, 47, 444, 154);
		contentPane.add(lblNewLabel_2);		
		try {
			BufferedReader br = new BufferedReader(new FileReader("date.txt"));//voitheia arxeiou date g evresi wage k eexp
			String st;
			while ((st=br.readLine())!=null){
				BufferedReader br2 = new BufferedReader(new FileReader(st.substring(2, 8) + "_eexp.txt"));
				String st2;
				while ((st2=br2.readLine())!=null){
				BufferedReader br3 = new BufferedReader(new FileReader(st.substring(2,8) + "_wage.txt"));
				String st3;
				while ((st3=br3.readLine())!=null){
				label_2.setText(st3);
				double dst2=Double.parseDouble(st2);
				double dst3=Double.parseDouble(st3);
				double pososto=(dst2/dst3)*100;//pososto hlektronikwn eksodwn epi tou miniaiou misthou
				label_1.setText(df2.format(pososto)+"%");//proboli posostou
				}
				}
			}
		} catch (FileNotFoundException e1) {//periorismos arxeiou
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {//periorismos arxeiou
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();
	}
}