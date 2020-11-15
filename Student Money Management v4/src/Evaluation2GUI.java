import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
public class Evaluation2GUI extends JFrame {
	private JPanel contentPane;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	/**
	 * Launch the application.
	 */
	public static void Evaluation2() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Evaluation2GUI frame = new Evaluation2GUI();
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
	public Evaluation2GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0395\u03BA\u03C4\u03AF\u03BC\u03B9\u03C3\u03B7 \u039A\u03B1\u03B8\u03B7\u03BC\u03B5\u03C1\u03B9\u03BD\u03CE\u03BD \u0395\u03BE\u03CC\u03B4\u03C9\u03BD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(50, 15, 324, 57);
		contentPane.add(label);
		
		JLabel label_3 = new JLabel("");
		label_3.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		label_3.setBounds(312, 167, 46, 14);
		contentPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(325, 90, 46, 14);
		contentPane.add(lblNewLabel);
		
		
		JLabel label_1 = new JLabel("Τα έξοδα που επιθυμείτε να πραγματοποιήσετε είναι :");
		label_1.setBounds(26, 90, 301, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(26, 130, 348, 14);
		contentPane.add(label_2);		
		JLabel label_4 = new JLabel("Αρα ο νέος μέσος όρος μετα από τα έξοδα θα είναι:");
		label_4.setBounds(26, 167, 285, 14);
		contentPane.add(label_4);		
		try {
			BufferedReader br = new BufferedReader(new FileReader("evaluation.txt"));
			String s;
			while((s=br.readLine())!=null){
				lblNewLabel.setText(df2.format(Double.parseDouble(s)));
				BufferedReader br2 = new BufferedReader(new FileReader("date.txt"));
				String st;		
				while((st=br2.readLine())!=null){
					BufferedReader br3 = new BufferedReader(new FileReader(st.substring(2,8) + "_yp.txt"));
					String st2;
					while ((st2=br3.readLine())!=null){							
						double ypoloipo=Double.parseDouble(st2);
						String mera=st.substring(0,2);
						String minas=st.substring(3,4);
						double dmera=Double.parseDouble(mera);
						double dminas=Double.parseDouble(minas);
						int days;
						if(dminas==01||dminas==03||dminas==05||dminas==07||dminas==8||dminas==10||dminas==12){
						days=31;}
						else if(dminas==2){
						days=28;}
						else{
						days=30;}	
						ypoloipo-=Double.parseDouble(s);//upologismos neou upoloipou se periptwsh pragmatopoihshs autwn twn eksodwn
						double mo=ypoloipo/(days-dmera);//upologismos neou mesou orou se periptwsh pragmatopoihshs autwn twn eksodwn
						label_3.setText(String.valueOf(mo));	
						if (Double.parseDouble(s)>mo){//protropi agoras an einai katw apo to meso oro
							label_2.setText("Οι καθημερινές αγορές σας ξεπερνάνε τον μέσο όρο.");
							if (mo<0) {//apotropi agoras an einai panw apo ton meso oro
								label_3.setVisible(false);
								label_4.setText("Καλύτερα να μην προχωρήσετε σε αυτή την αγορά");								
							}
					}else{
						label_2.setText("Οι καθημερινές αγορές σας δεν ξεπερνάνε τον μέσο όρο.");
					}
					}
					}
			}
			}catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03BF \u03BC\u03B5\u03BD\u03BF\u03CD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
				Menu m = new Menu();
				m.MenuScreen();
				close();
			}
		});
		btnNewButton.setBounds(96, 206, 215, 32);
		contentPane.add(btnNewButton);
	}
	public void close(){//kleisimo parathurou
		this.setVisible(false);
		 this.dispose();
	}
}