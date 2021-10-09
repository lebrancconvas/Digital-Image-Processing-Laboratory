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
		File f = new File(fileName); //Init Object of File to get File Name. 
		
		try {
			img = ImageIO.read(f); // Reading Image from File. 
		} catch (IOException e) {
			e.printStackTrace(); // Error Explained when Reading Image from File is fail.
			return false;
		}

		width = img.getWidth(); // Get Width Value from Image that we read.
		height = img.getHeight(); // Get Height Value from Image that we read. 
		bitdepth = img.getColorModel().getPixelSize(); // Get Bits per pixel value from Image that we read. 

		System.out.println("Image Width: " + width + "\nImage Height: " + height + "\nBitDepth: " + bitdepth);
		return true;	
	}

	/* Write Image */
	public boolean writeImage(String fileName) {
		File f = new File(fileName); // Init Another Object of File to get File Name. 

		try {
			ImageIO.write(img, "bmp", f); // Writing New Image from Original Image that we read, New Image's File Type and New File Name. 
			System.out.println("Image has been written.");
		} catch (IOException e) {
			e.printStackTrace(); 
			return false; 
		}

		return true; // If all processes work, It will return true. 
	}
} 