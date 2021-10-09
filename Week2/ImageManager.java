package Week2;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageManager {
	private BufferedImage img;
	private BufferedImage original;	
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
		
		original = new BufferedImage(width, height, img.getType()); 

		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				original.setRGB(x, y, img.getRGB(x, y));
			}
		}
		
		return true;	
	}

	public void restoreToOriginal() {
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				img.setRGB(x, y, original.getRGB(x, y)); 
			}
		}
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

	public void convertToRed() {
		if(img == null) return;

		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int color = img.getRGB(x, y);
				int b = color & 0xFF;
				int g = (color >> 8) & 0xFF;
				int r = (color >> 16) & 0xFF;

				color = (r << 16) | (0 << 8) | 0;

				img.setRGB(x, y, color); 
			}
		}
	}

	public void convertToBlue() {
		if(img == null) return;

		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int color = img.getRGB(x, y);
				int b = color & 0xFF;
				int g = (color >> 8) & 0xFF;
				int r = (color >> 16) & 0xFF;

				color = (0 << 16) | (0 << 8) | b;

				img.setRGB(x, y, color); 
			}
		}
	}

	public void convertToGreen() {
		if(img == null) return;

		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int color = img.getRGB(x, y);
				int b = color & 0xFF;
				int g = (color >> 8) & 0xFF;
				int r = (color >> 16) & 0xFF;

				color = (0 << 16) | (g << 8) | 0; 

				img.setRGB(x, y, color); 
			}
		}
	}

	public void convertToBlack() {
		if(img == null) return;

		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int color = img.getRGB(x, y);
				int b = color & 0xFF;
				int g = (color >> 8) & 0xFF;
				int r = (color >> 16) & 0xFF;

				color = (0 << 16) | (0 << 8) | 0; 

				img.setRGB(x, y, color); 
			}
		}
	}

	public void convertToViolet() {
		if(img == null) return;

		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int color = img.getRGB(x, y);
				int b = color & 0xFF;
				int g = (color >> 8) & 0xFF;
				int r = (color >> 16) & 0xFF;

				color = (r << 16) | (0 << 8) | b;

				img.setRGB(x, y, color); 
			}
		}
	}

	public void convertToYellow() {
		if(img == null) return;

		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int color = img.getRGB(x, y);
				int b = color & 0xFF;
				int g = (color >> 8) & 0xFF;
				int r = (color >> 16) & 0xFF;

				color = (r << 16) | (g << 8) | 0; 

				img.setRGB(x, y, color); 
			}
		}
	}

	public void convertToSkyBlue() {
		if(img == null) return;

		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int color = img.getRGB(x, y);
				int b = color & 0xFF;
				int g = (color >> 8) & 0xFF;
				int r = (color >> 16) & 0xFF;

				color = (0 << 16) | (g << 8) | b;

				img.setRGB(x, y, color); 
			}
		}
	}
	
	public void rgbNum() {
		if(img == null) return;
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				int color = img.getRGB(x, y);
				System.out.println(color);
			}
		}
	}
} 