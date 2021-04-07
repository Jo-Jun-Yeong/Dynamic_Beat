package dynamic_beat_14;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

//import dynamic_beat_13.Main;



public class Game extends Thread {
	
	private Image noteRouteLine = new ImageIcon(Main.class.getResource("../images/noteRouteLine.png")).getImage();;
	private Image gameInforImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();;
	private Image judgmentLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();;
	private Image noteRoute = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;

	private Image noteRouteSImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	private Image noteRouteDImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	private Image noteRouteFImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	private Image noteRouteSpace1Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	private Image noteRouteSpace2Image = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	private Image noteRouteJImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	private Image noteRouteKImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	private Image noteRouteLImage = new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	
	private String titleName;
	private String difficulty;
	private String musicTitle;
	private Music gameMusic;
	
	ArrayList<Note> noteList = new ArrayList<Note>(); // note becoming array
	
	public Game(String titleName, String difficulty, String musicTitle) {
		this.titleName = titleName;
		this.difficulty = difficulty;
		this.musicTitle = musicTitle;
		gameMusic = new Music(this.musicTitle, false);
	
	}
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteSImage, 228, 30, null);
		g.drawImage(noteRouteDImage, 332, 30, null);
		g.drawImage(noteRouteFImage, 436, 30, null);
		g.drawImage(noteRouteSpace1Image, 540, 30, null);
		g.drawImage(noteRouteSpace2Image, 640, 30, null);
		g.drawImage(noteRouteJImage, 744, 30, null);
		g.drawImage(noteRouteKImage, 848, 30, null);
		g.drawImage(noteRouteLImage, 952, 30, null);
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
		
		for(int i = 0; i < noteList.size(); i++) {  	//load saved in noteclass
			Note note = noteList.get(i);
			note.screenDraw(g);
		}
		
		
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		// resolve broken world by adding Graphics2D
		g.setColor(Color.WHITE);
		g.setFont(new Font("ARial", Font.BOLD, 30));
		g.drawString(titleName, 20, 702);
		g.drawString(difficulty, 1190, 702);
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
		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("00000", 565, 702);
		
		
	}

	public void pressS() {
		noteRouteSImage =new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();;
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void realeaseS() {
		noteRouteSImage =new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
		
	}
	public void pressD() {
		noteRouteDImage =new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();;
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void realeaseD() {
		noteRouteDImage =new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	}
	public void pressF() {
		noteRouteFImage =new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();;
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void realeaseF() {
		noteRouteFImage =new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	}
	public void pressSpace() {
		noteRouteSpace1Image =new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();;
		noteRouteSpace2Image =new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();;
		new Music("drumBig1.mp3", false).start();
	}
	
	public void realeaseSpace() {
		noteRouteSpace1Image =new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
		noteRouteSpace2Image =new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	}
	public void pressJ() {
		noteRouteJImage =new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();;
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void realeaseJ() {
		noteRouteJImage =new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	}
	public void pressK() {
		noteRouteKImage =new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();;
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void realeaseK() {
		noteRouteKImage =new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();;
	}
	public void pressL() {
		noteRouteLImage =new ImageIcon(Main.class.getResource("../images/noteRoutePressed.png")).getImage();;
		new Music("drumSmall1.mp3", false).start();
	}
	
	public void realeaseL() {
		noteRouteLImage =new ImageIcon(Main.class.getResource("../images/noteRoute.png")).getImage();
	}
	
	@Override
	public void run() {
		dropNotes();
	}
	
	public void close() {
		gameMusic.close();
		this.interrupt();
	}
	//each Musics beat
	public void dropNotes() {
		Beat[] beats = null;
		if(titleName.equals("Young & Reckless (feat. Ria Choony)")) {
			int startTime = 4460 - Main.REACH_TIME * 1000;
			int gap = 125;
			beats = new Beat[] { 	//insert place of  fall down note
					new Beat(startTime,  "D"),
					new Beat(startTime + gap * 2, "D"),
					new Beat(startTime + gap * 4, "S"),
					new Beat(startTime + gap * 6, "D"),
					new Beat(startTime + gap * 8, "S"),
					new Beat(startTime + gap * 10, "D"),
					new Beat(startTime + gap * 12, "S"),
					new Beat(startTime + gap * 14, "D"),
					new Beat(startTime + gap * 18, "J"),
					new Beat(startTime + gap * 20, "K"),
					new Beat(startTime + gap * 22, "J"),
					new Beat(startTime + gap * 24, "K"),
					new Beat(startTime + gap * 26, "J"),
					new Beat(startTime + gap * 28, "K"),
					new Beat(startTime + gap * 30, "J"),
					new Beat(startTime + gap * 32, "K"),
					new Beat(startTime + gap * 34, "S"),
					new Beat(startTime + gap * 36, "D"),
					new Beat(startTime + gap * 38, "S"),
					new Beat(startTime + gap * 40, "D"),
					new Beat(startTime + gap * 42, "S"),
					new Beat(startTime + gap * 44, "D"),
					new Beat(startTime + gap * 46, "J"),
					new Beat(startTime + gap * 48, "K"),
					new Beat(startTime + gap * 50, "L"),
					new Beat(startTime + gap * 52, "F"),
					new Beat(startTime + gap * 52, "Space"),
					new Beat(startTime + gap * 52, "J"),

			};
		}
		else if(titleName.equals("Let It Burn - Cjbeards")) {
			int startTime = 1000;
			beats = new Beat[] {
					new Beat(startTime, "Space"),
			};
		}
		else if(titleName.equals("Perfect Summer (feat. Aleesia)")) {
			int startTime = 1000;
			beats = new Beat[] {
					new Beat(startTime, "Space"),
			};
		}
//			{
//				new Beat(1000, "S"),
//				new Beat(2000, "D"),
//				new Beat(3000, "F"),
//				new Beat(4000, "Space"),
//				new Beat(5000, "J"),
//				new Beat(6000, "K"),
//				new Beat(7000, "L"),
//		};
		
		int i = 0;
		gameMusic.start();
		while(i<beats.length && !isInterrupted()) {
			boolean dropped= false;
			if(beats[i].getTime() <= gameMusic.getTime()) {
				Note note = new Note(beats[i].getNoteName());
				note.start();
				noteList.add(note);
				i++;
				dropped = true;
			}
			if(!dropped) {
				try {
					Thread.sleep(5);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
