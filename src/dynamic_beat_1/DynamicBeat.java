package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame 
{
	public DynamicBeat() 
	{ 	//생성자 : 클래스와 같은이름을 가지고있는 메소드
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
