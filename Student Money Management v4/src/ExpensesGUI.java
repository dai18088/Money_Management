import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class ExpensesGUI extends JFrame {
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void expenses() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpensesGUI frame = new ExpensesGUI();
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
	public ExpensesGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7 \u0395\u03BE\u03CC\u03B4\u03C9\u03BD");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(70, 32, 316, 81);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u0392\u03B1\u03C3\u03B9\u03BA\u03AC \u0388\u03BE\u03BF\u03B4\u03B1");
		btnNewButton.addActionListener(new ActionListener() {//Epilogh gia diadromi pros to parathuro basic expenses
			public void actionPerformed(ActionEvent e) {
				Basic_expensesGUI be = new Basic_expensesGUI();
				be.basic_expenses();
				close();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(141, 144, 184, 46);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u039A\u03B1\u03B8\u03B7\u03BC\u03B5\u03C1\u03B9\u03BD\u03AC \u0388\u03BE\u03BF\u03B4\u03B1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//Epilogh gia diadromi pros to parathuro daily expenses
				Daily_expensesGUI de = new Daily_expensesGUI();
				de.daily_expenses();
				close();
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.setBounds(141, 237, 184, 46);
		contentPane.add(button);
		
		JButton button_1 = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//Epistrofi pisw sto menu
				Menu back = new Menu();
				back.MenuScreen();
				close();
			}
		});
		button_1.setBounds(0, 0, 89, 23);
		contentPane.add(button_1);
	}//kleisimo parathurou
	public void close(){
		this.setVisible(false);
		 this.dispose();
	}
}