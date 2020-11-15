import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class Monthly_StatsGUI extends JFrame {
    private JPanel contentPane;
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    /**
     * Launch the application.
     */
    public static void m_stats() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Monthly_StatsGUI frame = new Monthly_StatsGUI();
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
    public Monthly_StatsGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 480, 400);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(173, 255, 47));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("\u039C\u03B7\u03BD\u03B9\u03B1\u03AF\u03B1 \u03A3\u03C4\u03B1\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC");
        lblNewLabel.setBounds(86, 28, 249, 31);
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("\u0398\u03AD\u03C1\u03BC\u03B1\u03BD\u03C3\u03B7");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_2.setBounds(23, 236, 98, 23);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_5 = new JLabel("\u0395\u03BD\u03BF\u03AF\u03BA\u03B9\u03BF");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_5.setBounds(23, 183, 82, 26);
        contentPane.add(lblNewLabel_5);
        
        JLabel lblNewLabel_6 = new JLabel("\u039D\u03B5\u03C1\u03CC");
        lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_6.setBounds(23, 137, 82, 23);
        contentPane.add(lblNewLabel_6);
        
        JLabel lblNewLabel_1 = new JLabel("\u03A1\u03B5\u03CD\u03BC\u03B1");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblNewLabel_1.setBounds(23, 95, 89, 31);
        contentPane.add(lblNewLabel_1);
        
        JLabel label = new JLabel("\u0386\u03BB\u03BB\u03BF");
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label.setBounds(23, 270, 67, 43);
        contentPane.add(label);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setBounds(106, 88, 72, 50);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setBounds(106, 126, 96, 50);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_7 = new JLabel("");
        lblNewLabel_7.setBounds(131, 225, 82, 50);
        contentPane.add(lblNewLabel_7);
        
        JLabel lblNewLabel_8 = new JLabel("");
        lblNewLabel_8.setBounds(106, 171, 66, 50);
        contentPane.add(lblNewLabel_8);
        
        JLabel lblNewLabel_9 = new JLabel("");
        lblNewLabel_9.setBounds(100, 270, 89, 50);
        contentPane.add(lblNewLabel_9);
        
        JLabel lblNewLabel_10 = new JLabel("");
        lblNewLabel_10.setBounds(355, 0, 89, 50);
        contentPane.add(lblNewLabel_10);
        
        JLabel lblNewLabel_11 = new JLabel("\u0395\u03A3\u039F\u0394\u0391");
        lblNewLabel_11.setBounds(252, 101, 72, 37);
        contentPane.add(lblNewLabel_11);
        
        JLabel lblNewLabel_12 = new JLabel("\u0395\u039E\u039F\u0394\u0391");
        lblNewLabel_12.setBounds(253, 137, 82, 50);
        contentPane.add(lblNewLabel_12);
        
        JLabel lblNewLabel_13 = new JLabel("");
        lblNewLabel_13.setBounds(323, 95, 89, 50);
        contentPane.add(lblNewLabel_13);
        
        JLabel lblNewLabel_14 = new JLabel("");
        lblNewLabel_14.setBounds(333, 137, 98, 50);
        contentPane.add(lblNewLabel_14);
        try {
			FileReader fr=new FileReader("date.txt");			
			BufferedReader br=new BufferedReader(fr);
			String st;
			try {
			while((st=br.readLine())!=null) {
			BufferedReader br5=new BufferedReader(new FileReader(st.substring(2,8)+"_te.txt"));
			String st5;
			while((st5=br5.readLine())!=null){			
				BufferedReader br6=new BufferedReader(new FileReader(st.substring(2,8)+"_ti.txt"));
				String st6;
					while((st6=br6.readLine())!=null){
					double syn=Double.parseDouble(st5)+Double.parseDouble(st6);
					double dst5,dst6;
					dst5=Double.parseDouble(st5);
					dst6=Double.parseDouble(st6);
					lblNewLabel_13.setText(df2.format((dst6/syn)*100)+"%");
					lblNewLabel_14.setText((df2.format((dst5/syn)*100))+"%");
					}				
				}
	lblNewLabel_10.setText(st.substring(2,4)+"/"+st.substring(4,8));
	BufferedReader br1=new BufferedReader(new FileReader(st.substring(2,8)+"_tbe.txt"));
	String st2;
	while((st2=br1.readLine())!=null) {
		Double dst2=Double.parseDouble(st2);
		BufferedReader br2=new BufferedReader(new FileReader(st.substring(2,8)+"_be.txt"));
		String st3;
		int i=0;
		while((st3=br2.readLine())!=null) {//proboli kathe enos vasikou miniaiou eksodou ws pososto pros to sunolo twn basikwn eksodwn
			if(i==0) {
			Double d0=Double.parseDouble(st3);
			d0=(d0/dst2)*100;
			lblNewLabel_3.setText(df2.format(d0)+"%");		
			}
			else if(i==1){
			Double d1=Double.parseDouble(st3);
			d1=(d1/dst2)*100;
			lblNewLabel_4.setText(df2.format(d1)+"%");
			}
			else if(i==2) {
			Double d2=Double.parseDouble(st3);
			d2=(d2/dst2)*100;
			lblNewLabel_8.setText(df2.format(d2)+"%");
			}
			else if(i==3) {
			Double d3=Double.parseDouble(st3);
			d3=(d3/dst2)*100;
			lblNewLabel_7.setText(df2.format(d3)+"%");
			}
			else  {
			Double d4=Double.parseDouble(st3);
			d4=(d4/dst2)*100;
			lblNewLabel_9.setText(df2.format(d4)+"%");
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
	}
	        JButton btnNewButton = new JButton("\u03A0\u03AF\u03C3\u03C9");
	        btnNewButton.setBounds(0, 0, 89, 23);
	        btnNewButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {//epistrofi pisw sto parathuro twn statistikwn
	                StatisticsGUI s = new StatisticsGUI();
	                s.Statistics();
	                close();
	            }
	        });
	        contentPane.add(btnNewButton);
	    }
	    public void close(){//kleisimo parathurou
	        this.setVisible(false);
	         this.dispose();	        
	    }
	}