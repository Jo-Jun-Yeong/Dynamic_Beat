package dynamic_beat_10;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import dynamic_beat_7.Main;
import dynamic_beat_7.Music;
import dynamic_beat_7.Track;

public class DynamicBeat extends JFrame {

	private Image screenImage;
	private Graphics screenGraphics;

	private ImageIcon exitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/exitButtonBasic.png"));
	private ImageIcon exitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/exitButtonEntered.png"));
	private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("../images/startButtonBasic.png"));
	private ImageIcon startButtonEnteredImage = new ImageIcon(
			Main.class.getResource("../images/startButtonEntered.png"));
	private ImageIcon quitButtonBasicImage = new ImageIcon(Main.class.getResource("../images/quitButtonBasic.png"));
	private ImageIcon quitButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/quitButtonEntered.png"));

	private ImageIcon leftButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/leftButtonEntered.png"));
	private ImageIcon leftButtonBasicImage = new ImageIcon(Main.class.getResource("../images/leftButtonBasic.png"));
	private ImageIcon rightButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/rightButtonBasic.png"));
	private ImageIcon rightButtonBasicImage = new ImageIcon(Main.class.getResource("../images/rightButtonEntered.png"));

	private ImageIcon easyButtonBasicImage = new ImageIcon(Main.class.getResource("../images/easyButtonBasic.png"));
	private ImageIcon easyButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/easyButtonEntered.png"));
	private ImageIcon hardButtonBasicImage = new ImageIcon(Main.class.getResource("../images/hardButtonBasic.png"));
	private ImageIcon hardButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/hardButtonEntered.png"));

	private ImageIcon backButtonBasicImage = new ImageIcon(Main.class.getResource("../images/backButtonBasic.png"));
	private ImageIcon backButtonEnteredImage = new ImageIcon(Main.class.getResource("../images/backButtonEntered.png"));
	
	private Image gameInforImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();;
	private Image judgmentLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();;
	private Image noteRoute = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	private Image noteRouteLine = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png")).getImage();;
	private Image noteBaiscImage = new ImageIcon(Main.class.getResource("../images/noteBasic.png")).getImage();;
	
	private Image background = new ImageIcon(Main.class.getResource("../images/introbackground.jpg")).getImage();;
	private JLabel menuBar = new JLabel(new ImageIcon(Main.class.getResource("../images/menuBar.png")));

	private JButton exitButton = new JButton(exitButtonBasicImage);
	private JButton startButton = new JButton(startButtonBasicImage);
	private JButton quitButton = new JButton(quitButtonBasicImage);
	private JButton leftButton = new JButton(leftButtonBasicImage);
	private JButton rightButton = new JButton(rightButtonBasicImage);

	private JButton easyButton = new JButton(easyButtonBasicImage);
	private JButton hardButton = new JButton(hardButtonBasicImage);
	
	private JButton backButton = new JButton(backButtonBasicImage);
	
	private int mouseX, mouseY;

	private boolean isMainScreen = false;
	private boolean isGameScreen = false;

	ArrayList<Track> trackList = new ArrayList<Track>(); // ArrayList is which array that already be maked Array
	
	private Music introMusic = new Music("1.mp3", true);
	private Music selectedMusic;
	private Image titleImage;
	private Image selectedImage;
	private int nowSelected = 0;

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
		
		introMusic.start();

		trackList.add(new Track("title1.png", "cover1.png", "select1.png", "SelectedMusic1.mp3", "Music1.mp3"));
		trackList.add(new Track("title2.png", "cover2.png", "select2.png", "SelectedMusic2.mp3", "Music2.mp3"));
		trackList.add(new Track("title3.png", "cover3.png", "select3.png", "SelectedMusic3.mp3", "Music3.mp3"));

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
				exitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false);
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

		// exit Button
		// end------------------------------------------------------------------------

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
				introMusic.close();
				enterMain();
			}
		});
		add(startButton);

		// start Button
		// end------------------------------------------------------------------------

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
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false); 
				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				quitButton.setIcon(quitButtonBasicImage);
				quitButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false); 
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

		// quit Button
		// end------------------------------------------------------------------------

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
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false);
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
				buttonPressedMusic.start();
				selectLeft();
			}
		});
		add(leftButton);

		// left Button
		// end------------------------------------------------------------------------

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
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false);
				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				rightButton.setIcon(rightButtonBasicImage);
				rightButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false);
				buttonPressedMusic.start();
				selectRight();
			}
		});
		add(rightButton);
		// right Button
		// end------------------------------------------------------------------------
		// easy Button start
		easyButton.setVisible(false);
		easyButton.setBounds(375, 600, 250, 67);
		easyButton.setBorderPainted(false);
		easyButton.setContentAreaFilled(false);
		easyButton.setFocusPainted(false);
		easyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				easyButton.setIcon(easyButtonEnteredImage);
				easyButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false);

				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				easyButton.setIcon(easyButtonBasicImage);
				easyButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false);
				buttonPressedMusic.start();
				gamestart(nowSelected, "difficulty");
			}
		});
		add(easyButton);
		// easy Button
		// end------------------------------------------------------------------------

		// hard Button start
		hardButton.setVisible(false);
		hardButton.setBounds(655, 600, 250, 67);
		hardButton.setBorderPainted(false);
		hardButton.setContentAreaFilled(false);
		hardButton.setFocusPainted(false);
		hardButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				hardButton.setIcon(hardButtonEnteredImage);
				hardButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false);

				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				hardButton.setIcon(hardButtonBasicImage);
				hardButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false);

				buttonPressedMusic.start();
				gamestart(nowSelected, "difficulty");
			}
		});
		add(hardButton);
		// hard Button
		// end------------------------------------------------------------------------


		// back Button start
		backButton.setVisible(false);
		backButton.setBounds(20, 50, 60, 60);
		backButton.setBorderPainted(false);
		backButton.setContentAreaFilled(false);
		backButton.setFocusPainted(false);
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backButton.setIcon(backButtonEnteredImage);
				backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
				Music buttonEnterdMusic = new Music("buttonEnteredMusic.mp3", false);

				buttonEnterdMusic.start();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				backButton.setIcon(backButtonBasicImage);
				backButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}

			@Override
			public void mousePressed(MouseEvent e) {
				Music buttonPressedMusic = new Music("buttonPressedMusic.mp3", false);
				backMain();
				// function of back to mainscreen event
			}
		});
		add(backButton);
		// back Button end------------------------------------------------------------------------
		
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

	}

	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		screenGraphics = screenImage.getGraphics();
		screenDraw((Graphics2D) screenGraphics);
		g.drawImage(screenImage, 0, 0, null);
	}

	public void screenDraw(Graphics2D g) {
		g.drawImage(background, 0, 0, null);
		if (isMainScreen) {
			g.drawImage(selectedImage, 340, 100, null);
			g.drawImage(titleImage, 365, 70, null);
		}
		printComponents(g); // show Added Elements in mainframe ex) add(menuBar);....
		this.repaint();
		if(isGameScreen) {
			g.drawImage(noteRoute, 228, 30, null);
			g.drawImage(noteRoute, 332, 30, null);
			g.drawImage(noteRoute, 436, 30, null);
			g.drawImage(noteRoute, 540, 30, null);
			g.drawImage(noteRoute, 640, 30, null);
			g.drawImage(noteRoute, 744, 30, null);
			g.drawImage(noteRoute, 848, 30, null);
			g.drawImage(noteRoute, 952, 30, null);
			g.drawImage(noteRouteLine, 224, 30, null);
			g.drawImage(noteRouteLine, 328, 30, null);
			g.drawImage(noteRouteLine, 432, 30, null);
			g.drawImage(noteRouteLine, 536, 30, null);
			g.drawImage(noteRouteLine, 740, 30, null);
			g.drawImage(noteRouteLine, 844, 30, null);
			g.drawImage(noteRouteLine, 948, 30, null);
			g.drawImage(noteRouteLine, 1052, 30, null);
			g.drawImage(gameInforImage, 0, 660, null);
			g.drawImage(judgmentLineImage, 0, 580, null);
			
			g.drawImage(noteBaiscImage, 228, 120, null);
			g.drawImage(noteBaiscImage, 332, 580, null);
			g.drawImage(noteBaiscImage, 436, 500, null);
			g.drawImage(noteBaiscImage, 540, 340, null);
			g.drawImage(noteBaiscImage, 640, 340, null);
			g.drawImage(noteBaiscImage, 744, 325, null);
			g.drawImage(noteBaiscImage, 848, 305, null);
			g.drawImage(noteBaiscImage, 952, 305, null);
			
			g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
			// resolve broken world by adding Graphics2D
			g.setColor(Color.WHITE);
			g.setFont(new Font("ARial", Font.BOLD, 30));
			g.drawString("asdawdasdasdasdasdasd", 20, 702);
			g.drawString("Easy", 1190, 702);
			g.setFont(new Font("Elephant", Font.BOLD, 26));
			g.setColor(Color.DARK_GRAY);
			g.drawString("S", 270, 609);
			g.drawString("D", 374, 609);
			g.drawString("F", 478, 609);
			g.drawString("Space Bar", 580, 609);
			g.drawString("J", 784, 609);
			g.drawString("K", 889, 609);
			g.drawString("L", 993, 609);			
			g.setColor(Color.LIGHT_GRAY);
			g.setFont(new Font("Elephant", Font.BOLD, 30));			g.drawString("00000", 565, 702);
			g.drawString("000000", 5, 702);	
		}
	}

	public void selectTrack(int nowSelected) {
		if (selectedMusic != null) 
			selectedMusic.close();
		titleImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getTitleImage()))
				.getImage();
		selectedImage = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getStartImage()))
				.getImage();
		selectedMusic = new Music(trackList.get(nowSelected).getStartMusic(), true);
		selectedMusic.start();
	}

	public void selectLeft() {
		if (nowSelected == 0)
			nowSelected = trackList.size() - 1;
		else
			nowSelected--;
		selectTrack(nowSelected);
	}
	
	public void selectRight() {
		if (nowSelected == trackList.size() - 1)
			nowSelected = 0; 
		else
			nowSelected++;
		selectTrack(nowSelected);
	}
	/////gamestart/////
	public void gamestart(int nowSelected, String difficulty) {
		if (selectedMusic != null)
			selectedMusic.close();
		isMainScreen = false;
		leftButton.setVisible(false);
		rightButton.setVisible(false);
		easyButton.setVisible(false);
		hardButton.setVisible(false);
		isGameScreen = true;
		
		add(leftButton);
		
		background = new ImageIcon(Main.class.getResource("../images/" + trackList.get(nowSelected).getGameImage()))
				.getImage();
		backButton.setVisible(true);
	}
	
	public void backMain() {
		isMainScreen = true;
		leftButton.setVisible(true);
		rightButton.setVisible(true);
		easyButton.setVisible(true);
		hardButton.setVisible(true);
		background = new ImageIcon(Main.class.getResource("../images/introbackground.jpg")).getImage();;
		backButton.setVisible(false);
		selectTrack(nowSelected);
		isGameScreen = false;
		}
	
	public void enterMain() {
		isMainScreen = true;
		startButton.setVisible(false);
		quitButton.setVisible(false);
		background = new ImageIcon(Main.class.getResource("../images/mainBackground2.jpg")).getImage();
		leftButton.setVisible(true);
		rightButton.setVisible(true);
		easyButton.setVisible(true);
		hardButton.setVisible(true);
		introMusic.close();
		selectTrack(0);
	}
	
}