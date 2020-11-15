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
public class Daily_StatsGUI extends JFrame {
	private JPanel contentPane;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	/**
	 * Launch the application.
	 */
	public static void d_stats() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Daily_StatsGUI frame = new Daily_StatsGUI();
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
	public Daily_StatsGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 539, 397);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 255, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);		
		JLabel lblNewLabel = new JLabel("\u03A3\u03C4\u03B1\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC \u0397\u03BC\u03B5\u03C1\u03AE\u03C3\u03B9\u03C9\u03BD \u0395\u03BE\u03CC\u03B4\u03C9\u03BD");
		lblNewLabel.setBounds(125, 50, 273, 37);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(lblNewLabel);		
		JLabel lblNewLabel_1 = new JLabel("\u03A4\u03BF \u03C3\u03CD\u03BD\u03BF\u03BB\u03BF \u03C4\u03C9\u03BD \u03BA\u03B1\u03B8\u03B7\u03BC\u03B5\u03C1\u03B9\u03BD\u03CE\u03BD \u03B5\u03BE\u03CC\u03B4\u03C9\u03BD \u03B5\u03AF\u03BD\u03B1\u03B9:");
		lblNewLabel_1.setBounds(82, 250, 284, 43);
		contentPane.add(lblNewLabel_1);		
		JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
		button.setBounds(0, 0, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//pisw sto parathuro twn statistikwn
				StatisticsGUI s = new StatisticsGUI();
				s.Statistics();
				close();
			}
		});
		contentPane.add(button);		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(347, 264, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u03A6\u03AC\u03C1\u03BC\u03B1\u03BA\u03B1");
		lblNewLabel_3.setBounds(37, 117, 69, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hobby");
		lblNewLabel_4.setBounds(193, 117, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\u03A1\u03BF\u03CD\u03C7\u03B1");
		lblNewLabel_5.setBounds(193, 200, 38, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u0394\u03B9\u03B1\u03C3\u03BA\u03AD\u03B4\u03B1\u03C3\u03B7");
		lblNewLabel_6.setBounds(37, 200, 69, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel label = new JLabel("\u039C\u039C\u039C");
		label.setBounds(193, 156, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u03A4\u03C1\u03CC\u03C6\u03B9\u03BC\u03B1");
		label_1.setBounds(37, 156, 50, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u03A5\u03B3\u03B9\u03B5\u03B9\u03BD\u03AE");
		label_2.setBounds(347, 117, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0386\u03BB\u03BB\u03BF");
		label_3.setBounds(358, 156, 46, 14);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(96, 117, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(97, 156, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(113, 200, 46, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setBounds(248, 117, 46, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setBounds(234, 156, 46, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setBounds(241, 200, 46, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setBounds(406, 117, 46, 14);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("");
		lblNewLabel_14.setBounds(414, 156, 46, 14);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setBounds(406, 11, 95, 14);
		contentPane.add(lblNewLabel_15);
		try {
			FileReader fr=new FileReader("date.txt");//evresi arxeiwn de kai tde mesw tou arxeiou date			
			BufferedReader br=new BufferedReader(fr);
			String st;
			try {
				while((st=br.readLine())!=null) {
					lblNewLabel_15.setText(st.substring(0,2)+"/"+st.substring(2,4)+"/"+st.substring(4,8));
					BufferedReader br1=new BufferedReader(new FileReader(st+"_tde.txt"));					
					String st2;
					while((st2=br1.readLine())!=null) {
						Double dst2=Double.parseDouble(st2);
						lblNewLabel_2.setText(st2);//provoli sunolikwn kathimerinwn eksodwn						
						BufferedReader br2=new BufferedReader(new FileReader(st+"_de.txt"));
						String st3;
						int i=0;
						while((st3=br2.readLine())!=null) {//dimiourgia tou kathe enos kathimerinou eksodou ws pososto pros to sunolo twn kathimerinwn
							if(i==0) {
								Double d0=Double.parseDouble(st3);
								d0=(d0/dst2)*100;
								lblNewLabel_7.setText(df2.format(d0)+"%");	
							}
							else if(i==1){
								Double d1=Double.parseDouble(st3);
								d1=(d1/dst2)*100;
								lblNewLabel_8.setText(df2.format(d1)+"%");
							}
							else if(i==2) {
								Double d2=Double.parseDouble(st3);
								d2=(d2/dst2)*100;
								lblNewLabel_9.setText(df2.format(d2)+"%");
							}
							else if(i==3) {
								Double d3=Double.parseDouble(st3);
								d3=(d3/dst2)*100;
								lblNewLabel_10.setText(df2.format(d3)+"%");
							}
							else if(i==4) {
								Double d4=Double.parseDouble(st3);
								d4=(d4/dst2)*100;
								lblNewLabel_11.setText(df2.format(d4)+"%");
							}
							else if(i==5) {
								Double d5=Double.parseDouble(st3);
								d5=(d5/dst2)*100;
								lblNewLabel_12.setText(df2.format(d5)+"%");
							}
							else if(i==6) {
								Double d6=Double.parseDouble(st3);
								d6=(d6/dst2)*100;
								lblNewLabel_13.setText(df2.format(d6)+"%");
							}
							else {
								Double d7=Double.parseDouble(st3);
								d7=(d7/dst2)*100;
								lblNewLabel_14.setText(df2.format(d7)+"%");
							}
							i++;
						}						
					}					
				}
			} catch (IOException e1) {//periorismos arxeiou
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}				
		} catch (FileNotFoundException e1) {//periorismos arxeiou
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	}
	public void close(){
		this.setVisible(false);
		 this.dispose();		
	}
}