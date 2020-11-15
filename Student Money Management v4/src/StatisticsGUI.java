import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class StatisticsGUI extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void Statistics() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatisticsGUI frame = new StatisticsGUI();
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
	public StatisticsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		JButton btnNewButton = new JButton("\u03A0\u03AF\u03C3\u03C9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
				Menu back = new Menu();
				back.MenuScreen();
				close();
			}
		});
		btnNewButton.setBounds(0, 0, 89, 23);
		contentPane.add(btnNewButton);		
		JButton btnNewButton_1 = new JButton("\u0397\u03BC\u03B5\u03C1\u03AE\u03C3\u03B9\u03B1 \u03A3\u03C4\u03B1\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try {
					BufferedReader br = new BufferedReader(new FileReader("date.txt"));//evresi arxeiwn daily expenses
					String st;
					while ((st=br.readLine())!=null) {
					File f = new File(st + "_de.txt");
					if (f.exists()) {//an einai kataxorimena ta kathimerina proxoraei sto parathuro twn kathimerinwn
						Daily_StatsGUI d = new Daily_StatsGUI();
						d.d_stats();
						close();
					}else {//alliws protropi gia eisagwgi kathimerinwn eksodwn
						JOptionPane.showMessageDialog(null, "Πρέπει να εισάγετε τα καθημερινά σας έξοδα για να δείτε τα ημερήσια στατιστικά σας" );
					}
					}
				} catch (IOException e1) {//periorismos arxeiou
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		btnNewButton_1.setBounds(145, 138, 166, 55);
		contentPane.add(btnNewButton_1);		
		JButton btnNewButton_2 = new JButton("\u039C\u03B7\u03BD\u03B9\u03B1\u03AF\u03B1 \u03A3\u03C4\u03B1\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
				Monthly_StatsGUI m = new Monthly_StatsGUI();
				m.m_stats();
				close();
			}
		});
		btnNewButton_2.setBounds(145, 220, 166, 55);
		contentPane.add(btnNewButton_2);		
		JLabel label = new JLabel("\u03A3\u03C4\u03B1\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC");
		label.setFont(new Font("Times New Roman", Font.BOLD, 24));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(93, 47, 271, 80);
		contentPane.add(label);	}
	public void close(){//kleisimo arxeiou
		this.setVisible(false);
		 this.dispose();
	}
}