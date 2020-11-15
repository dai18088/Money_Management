import java.awt.EventQueue;
public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {//Ekkinisi me to parathuro Welcome
					WelcomeGUI frame = new WelcomeGUI();
					frame. setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	}