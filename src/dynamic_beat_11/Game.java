package dynamic_beat_11;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;

import dynamic_beat_7.Main;



public class Game extends Thread {
	private Image noteBaiscImage = new ImageIcon(Main.class.getResource("../images/noteBasic.png")).getImage();;
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

	}

}
