package dynamic_beat_4;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DynamicBeat extends JFrame {

	private Image screenImage;
	private Graphics screenGraphics;

	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	// �ΰ��� �̹��� ������ �ʱ�ȭ

	private Image introBackground = new ImageIcon(Main.class.getResource("../images/introBackground.jpg")).getImage();;
	// Image �� ���� introBackground��ü�� �̹����� ����
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));
	// JLabel�� ���� menuBar��ü�� printcomponents�� ������ �̹����� ����

	private JButton exitButton = new JButton(exitButtonBasicImage);
	// JButton�� ���� exitBitton��ü�� �̹��� ���� - �⺻�̹����� �ʱ�ȭ

	private int mouseX, mouseY;
	// �޴��ٸ� �巹���ҋ� ȭ���� �����ϼ��ְ� �ϴ� �޼ҵ�

	public DynamicBeat() { // ������ : Ŭ������ �����̸��� �������ִ� �޼ҵ�
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);

		exitButton.setBounds(1245, 0, 30, 30); // �޴����� ���� ������ �� ��ġ�ϰ� ����
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); //�հ��� ������� �ٲ�
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false);	//��ư�����÷������� ȿ���� �ѹ���(false) ����
				buttonEnterdMusic.start();
			} // ���콺�� �����ư ���� �ö������� Enterd�̹����� ����

			@Override // �����ư�����ִٰ� �ٽ� �������������� �̺�Ʈ
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); //�հ��� ������� �ٲ�
				
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false);	//��ư�����÷������� ȿ���� �ѹ���(false) ����
				buttonPressedMusic.start();
				try {
					Thread.sleep(300);
				} catch(InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		add(exitButton);

		menuBar.setBounds(0, 0, 1280, 30);
		// setBounds ��ġ ũ�� ����
		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX(); // ���콺�� x��ǥ��
				mouseY = e.getY(); // y ��ǥ�� ����
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY); // ���콺�� �巹���Ҷ� ��ǥ�� ���ͼ� JFrame(����â)�� ��ġ�� ������
			}
		});

		add(menuBar); // JFrame�� menuBar�� �߰���

		Music introMusic = new Music("1.mp3", true);
		introMusic.start();
	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphics = screenImage.getGraphics();
		screenDraw(screenGraphics);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		printComponents(g); // ������ �̹����� �����ҋ� ���
		this.repaint();
	}
}
