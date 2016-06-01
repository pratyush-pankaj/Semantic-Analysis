package sentiment;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class SplashScreen extends JWindow {
	
		Timer progressTimer;
		JProgressBar progressBar;
		@SuppressWarnings("unused")
		private String ImgLogo = "/Resource/uit.jpg";
		//JProgressBar progressbar = new JProgressBar();
		int progressCounter=1;
		
	
	public static void main(String[] args) {
		
		SplashScreen frame = new SplashScreen();
		frame.setVisible(true);
		frame.startProgress();
		
	}

	
	/**
	 * Create the frame.
	 */
	
	public SplashScreen() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		//Icon icon = new ImageIcon(ImgLogo);
		Icon icon =  new ImageIcon(SplashScreen.class.getResource("/images/finalnew.jpg"));
		//JLabel lbl = new JLabel("SENTIMENT ANALYZER");
		//lbl.setFont(new Font("Tahoma", Font.BOLD, 18));
	//	lbl.setBounds(200, 35, 215, 28);
		//getContentPane().add(lbl);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(29, 71, 388, 173);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(icon);
		//lblNewLabel.setI(icon);
	     progressBar = new JProgressBar();
		progressBar.setBackground(Color.DARK_GRAY);
		progressBar.setStringPainted(true);
		progressBar.setBounds(29, 264, 388, 14);
		getContentPane().add(progressBar);
		
		
		JLabel lblNewLabel_2 = new JLabel("                           D.E.A.R System");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(29, 11, 388, 23);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("                    Data Extractor Analyzer & Recommendation System");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(29, 37, 388, 23);
		getContentPane().add(lblNewLabel_1);
		
		
		//URL Imglogourl = this.getClass().getResource("/Resource/uit.jpg");
		
		setVisible(true);
//		try {
//			ImgLogo = ImageIO.read(Imglogourl);
//			//ImgBanner = ImageIO.read(bannerurl);
//			//Icons = ImageIO.read(Iconsurl);
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		

		
	}
	void startProgress() {
		progressTimer = new Timer(50, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(progressCounter<=100)
				{
					progressBar.setValue(progressCounter);
					progressCounter++;
				}
				else
				{
					progressTimer.stop();
					SplashScreen.this.setVisible(false);
					SplashScreen.this.dispose();
					new NewJFrame();
					

				}
			}
		});
		
		progressTimer.start();
		
	}
}
