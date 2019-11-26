package tank;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		/*
		//认识Frame类
		Frame f = new Frame();
		f.setSize(800, 600);
		f.setResizable(false);
		f.setTitle("Tank War");
		f.setVisible(true);
		
		// click X to close window
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		*/
		// 继承Frame类，重写paint，画形状
		TankFrame tf = new TankFrame();
		while(true) {
			Thread.sleep(50);
			tf.repaint();
		}
	}
}
