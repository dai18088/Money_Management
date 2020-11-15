import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
public class WelcomeGUI extends JFrame {
	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public WelcomeGUI() {
		setBackground(new Color(0, 0, 0));
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 50, 480, 400);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblWelcomeToThe = new JLabel("Καλώς ήρθατε στο Σύστημα Διαχείρισης Χρημάτων!");
		lblWelcomeToThe.setForeground(Color.BLACK);
		lblWelcomeToThe.setBounds(10, 4, 444, 58);
		lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToThe.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblWelcomeToThe);
		JButton btnProceed = new JButton("Συνέχεια");
		btnProceed.setBounds(352, 308, 102, 43);
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//epistrofi sto menu
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		contentPane.add(btnProceed);
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBackground(Color.YELLOW);
		//Odigies xrisis
		textPane.setText("1)Για να μπορέσετε να χρησιμοποιήσετε το πρόγραμμα ορθά θα πρέπει να κάνετε πρώτα δήλωση της ημερομηνίας.\r\n2)Θεωρήστε ότι για τα κενά πεδία πρέπει να καταχωρήσετε το μηδέν.\r\n3)Καταχωρήστε για κάθε μήνα μια φορά τα μηνιαία έσοδα,τα βασικά έξοδα.\r\n4)Απρόοπτα έσοδα και καθημερινά έξοδα καταχωρούνται καθημερινά.\r\n5)Ο χειρισμός του υπολοίπου μπορεί να σας χρησιμεύσει ταυτόχρονα και σαν αποταμίευση αυξομειώνοντας το υπόλοιπο.\r\n6)Σε αρνητικά ποσά αποταμίευσης και υπολοίπου μπορείτε να προσθέσετε τα \r\nαποταμιευμένα σας ποσά στο υπόλοιπο σας ώστε να υπάρχουν διαθέσιμα χρήματα.\r\n");
		textPane.setEditable(false);
		textPane.setBounds(10, 94, 279, 238);
		contentPane.add(textPane);
		JLabel label = new JLabel("ΟΔΗΓΙΕΣ ΧΡΗΣΗΣ");
		label.setFont(new Font("Times New Roman", Font.BOLD, 12));
		label.setBounds(20, 52, 169, 32);
		contentPane.add(label);
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();
	}
}