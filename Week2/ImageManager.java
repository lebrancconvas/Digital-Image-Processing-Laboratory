package Week2;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageManager {
	private BufferedImage img;	
	public int width, height, bitdepth; 

	public ImageManager() {

	}

	/* Read Image. */ 
	public boolean readImage(String fileName) {
		File f = new File(fileName);
		
		try {
			img = ImageIO.read(f);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		width = img.getWidth();
		height = img.getHeight();
		bitdepth = img.getColorModel().getPixelSize();

		System.out.println("Image Width: " + width + "\nImage Height: " + height + "\nBitDepth: " + bitdepth);
		return true;	
	}

	/* Write Image */
	public boolean writeImage(String fileName) {
		File f = new File(fileName);

		try {
			ImageIO.write(img, "bmp", f);	
			System.out.println("Image has been written.");
		} catch (IOException e) {
			e.printStackTrace(); 
			return false; 
		}

		return true; 
	}
} 