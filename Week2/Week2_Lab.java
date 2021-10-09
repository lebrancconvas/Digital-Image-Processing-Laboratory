package Week2; 
public class Week2_Lab {
	public static void main(String[] args) {
		ImageManager img1 = new ImageManager();
		img1.readImage("images/mandril.bmp");
		img1.writeImage("images/classmaker.bmp");  
	}
}