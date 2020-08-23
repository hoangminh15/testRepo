package GuiMan;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("linh.jpg"));
			img = new BufferedImage(img.getWidth() / 2, img.getHeight(), BufferedImage.TYPE_INT_ARGB);

			g2 = img.createGraphics();

			Color startColor = new Color(15, 15, 15);
			Color endColor = new Color(150, 150, 150);
			
			GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
			g2.setPaint(gradient);
			g2.fillOval(70, 70, 100, 100);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
