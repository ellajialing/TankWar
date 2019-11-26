package tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
// 继承Frame类 ---> extends
public class TankFrame extends Frame{
	int x = 200;
	int y = 200;
	// constructor
	public TankFrame() {
		setSize(800, 600);
		setResizable(false);
		setTitle("Tank War");
		setVisible(true);
		
		this.addKeyListener(new MyKeyListener());
		// click X to close window
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	
	}
	
	@Override
	public void paint(Graphics g) {
		//坐标为变量，最小化paint再打开，就能看到动
		System.out.println("paint");
		g.fillRect(x, y, 50, 50);
	}
	
	class MyKeyListener extends KeyAdapter {
		boolean bL = false;
		boolean bU = false;
		boolean bR = false;
		boolean bD = false;
		
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			switch(key) {
			case KeyEvent.VK_LEFT:
				bL = true;
				break;
			case KeyEvent.VK_UP:
				bU = true;
				break;
			case KeyEvent.VK_RIGHT:
				bR = true;
				break;
			case KeyEvent.VK_DOWN:
				bD = true;
				break;
				
			default:
				break;
			}
			//x += 200;
			//repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			int key = e.getKeyCode();
			switch(key) {
			case KeyEvent.VK_LEFT:
				bL = false;
				break;
			case KeyEvent.VK_UP:
				bU = false;
				break;
			case KeyEvent.VK_RIGHT:
				bR = false;
				break;
			case KeyEvent.VK_DOWN:
				bD = false;
				break;
			default:
				break;
			}
		}
		
	}
}
