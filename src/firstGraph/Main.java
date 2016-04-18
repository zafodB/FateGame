package firstGraph;

import java.awt.EventQueue;

public class Main {

	public static MainWindow frame;
	static public int dimX;
	static public int dimY;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() { // DON'T WORRY ABOUT THIS NOW
			public void run() { // DON'T WORRY ABOUT THIS EITHER
				try {
					frame = new MainWindow();
				} catch (Exception e) { // NOR THIS
					e.printStackTrace(); // NOR THIS
				}
				
			}
		});
		
	}

}
