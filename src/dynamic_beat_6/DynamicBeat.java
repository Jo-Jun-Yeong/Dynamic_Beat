package dynamic_beat_6;

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
	private ImageIcon startButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));

	private ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/leftButtonEntered.png"));
	private ImageIcon leftButtonBasicImage = new ImageIcon(Main.class.getResource("../images/leftButtonBasic.png"));
	private ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/rightButtonBasic.png"));
	private ImageIcon rightButtonBasicImage = new ImageIcon(Main.class.getResource("../images/rightButtonEntered.png"));

	private Image title1 = new ImageIcon(Main.class.getResource("../images/title1.png")).getImage();
	private Image title2 = new ImageIcon(Main.class.getResource("../images/title2.png")).getImage();
	private Image title3 = new ImageIcon(Main.class.getResource("../images/title3.png")).getImage();

	private Image selectedImage = new ImageIcon(Main.class.getResource("../images/cover3.png")).getImage();
	private Image background = new ImageIcon(Main.class.getResource("../images/introbackground.jpg")).getImage();;
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	private JButton leftButton = new JButton(leftButtonBasicImage);
	private JButton rightButton = new JButton(rightButtonBasicImage);

	private int mouseX, mouseY;

	private boolean isMainScreen = false;

	public DynamicBeat() {
		setUndecorated(true);
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBackground(new Color(0, 0, 0, 0));
		setLayout(null);


		// exit Button start
		exitButton.setBounds(1245, 0, 30, 30);
		exitButton.setBorderPainted(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setFocusPainted(false);
		exitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setIcon(exitButtonEnteredImage);
				exitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setIcon(exitButtonBasicImage);
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // �հ��� ������� �ٲ�

			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false); // ��ư�����÷������� ȿ����
																						// �ѹ���(false) ����
				buttonPressedMusic.start();
				try {
					Thread.sleep(300);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		add(exitButton);

		// exit Button end

//------------------------------------------------------------------------

		// start Button start
		startButton.setBounds(40, 200, 400, 100);
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setIcon(startButtonEnteredImage);
				startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false);

				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setIcon(startButtonBasicImage);
				startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false);
				buttonPressedMusic.start();
				startButton.setVisible(false);
				quitButton.setVisible(false);
				leftButton.setVisible(true);
				rightButton.setVisible(true);
				background = new ImageIcon(Main.class.getResource("../images/mainBackground2.jpg")).getImage();
				isMainScreen = true;
			}
		});
		add(startButton);
		// start Button end

		// ------------------------------------------------------------------------

		// quit Button start
		quitButton.setBounds(40, 330, 400, 100);
		quitButton.setBorderPainted(false);
		quitButton.setContentAreaFilled(false);
		quitButton.setFocusPainted(false);
		quitButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				quitButton.setIcon(quitButtonEnteredImage);
				quitButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false); // ��ư�����÷������� ȿ����
																						// �ѹ���(false) ����
				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR)); // �հ��� ������� �ٲ�

			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false); // ��ư�����÷������� ȿ����
																						// �ѹ���(false) ����
				buttonPressedMusic.start();
				try {
					Thread.sleep(300);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
				System.exit(0);
			}
		});
		add(quitButton);
		// quit Button end

		// ------------------------------------------------------------------------

		// left Button start
		leftButton.setVisible(false);
		leftButton.setBounds(140, 310, 60, 60);
		leftButton.setBorderPainted(false);
		leftButton.setContentAreaFilled(false);
		leftButton.setFocusPainted(false);
		leftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				leftButton.setIcon(leftButtonEnteredImage);
				leftButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false); // ��ư�����÷������� ȿ����
																						// �ѹ���(false) ����
				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				leftButton.setIcon(leftButtonBasicImage);
				leftButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false);
//				rightButtond.setvisible
				buttonPressedMusic.start();
				// leftbutton event
			}
		});
		add(leftButton);
		// left Button end

		// ------------------------------------------------------------------------

		// right Button start
		rightButton.setVisible(false);
		rightButton.setBounds(1080, 310, 60, 60);
		rightButton.setBorderPainted(false);
		rightButton.setContentAreaFilled(false);
		rightButton.setFocusPainted(false);
		rightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rightButton.setIcon(rightButtonEnteredImage);
				rightButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false); // ��ư�����÷������� ȿ����
																						// �ѹ���(false) ����
				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				rightButton.setIcon(rightButtonBasicImage);
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false); // ��ư�����÷������� ȿ����
																						// �ѹ���(false) ����
				buttonPressedMusic.start();
				// rightbutton event
			}
		});
		add(rightButton);
		// right Button end
		// ------------------------------------------------------------------------

		menuBar.setBounds(0, 0, 1280, 30);

		menuBar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menuBar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});

		add(menuBar);

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
		g.drawImage(background, 0, 0, null);
		if (isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null);
			g.drawImage(title1, 365, 70, null);
		}
		printComponents(g); 	//show Added Elements in mainframe ex) add(menuBar);....								 
		this.repaint();
	}
}
