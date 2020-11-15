import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
	public class SavingsGUI  extends JFrame {
			private JPanel contentPane;
			private JTextField textField_2;
			/**
			* Launch the application.
			*/
		public static void Savings() {
			EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				SavingsGUI frame = new SavingsGUI();
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
			public SavingsGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 480, 400);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(173, 255, 47));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("\u03A4\u03BF \u03BC\u03B7\u03BD\u03B9\u03B1\u03AF\u03BF \u03B4\u03B9\u03B1\u03B8\u03AD\u03C3\u03B9\u03BC\u03BF \u03C5\u03C0\u03CC\u03BB\u03BF\u03B9\u03C0\u03BF \u03B5\u03AF\u03BD\u03B1\u03B9: ");
			lblNewLabel.setBounds(115, 112, 252, 27);
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
			contentPane.add(lblNewLabel);
			
			JLabel label = new JLabel("\u0391\u03C0\u03BF\u03C4\u03B1\u03BC\u03AF\u03B5\u03C5\u03C3\u03B7");
			label.setBounds(97, 11, 258, 112);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setFont(new Font("Times New Roman", Font.BOLD, 24));
			contentPane.add(label);
			
			JLabel label_1 = new JLabel("\u03A4\u03BF \u03C3\u03CD\u03BD\u03BF\u03BB\u03BF \u03C4\u03C9\u03BD \u03C0\u03C1\u03BF\u03B7\u03B3\u03BF\u03CD\u03BC\u03B5\u03BD\u03C9\u03BD \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03B9\u03B5\u03CD\u03C3\u03B5\u03C9\u03BD \u03B5\u03B9\u03BD\u03B1\u03B9:");
			label_1.setBounds(36, 176, 313, 14);
			label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			contentPane.add(label_1);
			
			JLabel label_2 = new JLabel("\u0395\u03B9\u03C3\u03AC\u03B3\u03B5\u03C4\u03B5 \u03C4\u03BF \u03B5\u03C0\u03B9\u03C0\u03BB\u03AD\u03BF\u03BD \u03C0\u03BF\u03C3\u03BF \u03C0\u03BF\u03C5 \u03B8\u03AD\u03BB\u03B5\u03C4\u03B5 \u03BD\u03B1 \u03B1\u03C0\u03BF\u03C4\u03B1\u03BC\u03B9\u03B5\u03CD\u03C3\u03B5\u03C4\u03B5:");
			label_2.setBounds(15, 238, 308, 14);
			label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
			contentPane.add(label_2);
			
			textField_2 = new JTextField();
			textField_2.setBounds(308, 235, 86, 20);
			contentPane.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(327, 118, 46, 14);
			contentPane.add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBounds(327, 176, 46, 14);
			contentPane.add(lblNewLabel_2);
				try {
				BufferedReader brd = new BufferedReader(new FileReader("date.txt"));
				String std;
				while((std=brd.readLine())!=null){
				File f = new File(std.substring(2, 8) + "_yp.txt");//dimiourgia miniaiou upoloipou mesw tis date
				try {
				BufferedReader br=new BufferedReader(new FileReader("date.txt"));
				String st;
				while((st=br.readLine())!=null){
					BufferedReader br2 = new BufferedReader(new FileReader(st.substring(2, 8) + "_ti.txt"));
					String st2;
					while((st2=br2.readLine())!=null){
						BufferedReader br3 = new BufferedReader(new FileReader(st.substring(2, 8) + "_te.txt"));
						String st3;
						while((st3=br3.readLine())!=null){
							double yp = Double.valueOf(st2) - Double.valueOf(st3);//upologismos upoloipou
							lblNewLabel_1.setText(String.valueOf(yp));
							if (!(f.exists())){
							PrintWriter output = new PrintWriter(st.substring(2,8)+ "_yp.txt");
							output.print(yp);//kataxorisi upoloipou
							output.close();
				}else{
					BufferedReader br8=new BufferedReader(new FileReader(f));
					String st8;
					while((st8=br8.readLine())!=null){
						lblNewLabel_1.setText(String.valueOf(st8));//proboli upoloipou
					}
				}
				}
				}
				}
				BufferedReader br7=new BufferedReader(new FileReader("savings.txt"));
				String st7;
				while((st7=br7.readLine())!=null){
				lblNewLabel_2.setText(st7);//proboli apotamiefshs
				}
				} catch (IOException e1) {//periorismos arxeiou
				// TODO Auto-generated catch block
				e1.printStackTrace();
				}				
				}//periorismos arxeiou
				} catch (NumberFormatException | IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				}
			JButton button = new JButton("\u03A0\u03AF\u03C3\u03C9");
			button.setBounds(0, 0, 89, 23);
			button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//epistrofi sto menu
			Menu m = new Menu();
			m.MenuScreen();
			close();
			}
			});
			contentPane.add(button);
			JButton button_1 = new JButton("\u039A\u03B1\u03C4\u03B1\u03C7\u03CE\u03C1\u03B7\u03C3\u03B7");
			button_1.setBounds(327, 302, 127, 49);
			button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			try {			
			String yp=lblNewLabel_1.getText();//proboli ypoloipou
			String s = textField_2.getText();//poso pou kataxorithike
			double ds=Double.parseDouble(s);
			if(ds<=0 || ds > Double.valueOf(yp)) {//periorismos eisodou
			JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
			}else {
				try {//evresi arxeiou mesw date
				BufferedReader br1=new BufferedReader(new FileReader("date.txt"));
				String st;
				try {
				
				BufferedReader br=new BufferedReader(new FileReader("savings.txt"));
				String sav;
				while((st=br1.readLine())!=null){
					while((sav=br.readLine())!=null){
						PrintWriter output = new PrintWriter("savings.txt");
						double dyp = Double.parseDouble(yp);
						double dsav = Double.parseDouble(sav);
						double ds1 = Double.parseDouble(s);
						double n = ds1 + dsav;//enimerwsh upoloipou(prosthesh posou p ithele na apotamiefsh sthn apotamiefsh
						double ypo = dyp - ds1;//enimerwsh upoloipou(meiwsh posou p ithele na balei stin apotamiefsh apo to upoloipo					
						output.print(n);//kataxorisi apotamiefshs
						output.close();
						BufferedReader br2=new BufferedReader(new FileReader(st.substring(2,8) + "_yp.txt"));
						String st2;
						while((st2=br2.readLine())!=null) {
							PrintWriter output3=new PrintWriter(st.substring(2,8) + "_yp.txt");
							output3.print(ypo);//kataxorisi sto upoloipo
							output3.close();
				}			
			}
			}
			} catch (IOException e) {//periorismos arxeiou
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			} catch (FileNotFoundException e) {//periorismos arxeiou
			e.printStackTrace();
			}
			Savings2GUI s2 = new Savings2GUI();//sunexeia sto deutero parathuro apotamiefshs
			s2.Savings2();
			close();
			}
			}catch(NumberFormatException e1) {//periorismos eisodou
			JOptionPane.showMessageDialog(null, "Λάθος Είσοδος!");
			}
			}
			});
			contentPane.add(button_1);			
			}			
			public void close(){//kleisimo parathurou
			this.setVisible(false);
			this.dispose();			
			}
	}