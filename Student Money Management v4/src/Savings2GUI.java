import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
public class Savings2GUI extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void Savings2(){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Savings2GUI frame = new Savings2GUI();
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
	public Savings2GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0391\u03C0\u03BF\u03C4\u03B1\u03BC\u03AF\u03B5\u03C5\u03C3\u03B7");
		label.setBounds(44, 11, 340, 154);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u03A4\u03BF \u03BD\u03AD\u03BF \u03C3\u03C5\u03BD\u03BF\u03BB\u03B9\u03BA\u03CC \u03C0\u03BF\u03C3\u03CC \u03B3\u03B9\u03B1 \u03C4\u03B7\u03BD \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03AF\u03B5\u03C5\u03C3\u03B7 \u03B5\u03AF\u03BD\u03B1\u03B9:");
		label_1.setBounds(23, 162, 271, 24);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(173, 255, 47));
		lblNewLabel.setBounds(293, 167, 63, 14);
		contentPane.add(lblNewLabel);
		try {
			FileReader fr = new FileReader("savings.txt");
			BufferedReader br = new BufferedReader(fr);
			String st;
			 try {
				while((st=br.readLine())!=null)
					lblNewLabel.setText(st); //proboli posou apotamiefshs
			} catch (IOException e1) {//periorismos arxeiou
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (FileNotFoundException e1) {//periorismos arxeiou
			e1.printStackTrace();
		}
		JButton button = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03BF \u03B1\u03C1\u03C7\u03B9\u03BA\u03CC \u03BC\u03B5\u03BD\u03BF\u03CD");
		button.setBounds(119, 259, 220, 61);
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