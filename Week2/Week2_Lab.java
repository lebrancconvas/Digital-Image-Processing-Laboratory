package Week2; 
public class Week2_Lab {
	public static void main(String[] args) {
		ImageManager img1 = new ImageManager();
		img1.readImage("images/mandril.bmp");
		img1.convertToRed();
		img1.writeImage("images/redmaker.bmp");
		img1.restoreToOriginal(); 
		img1.writeImage("images/classmaker.bmp");  
		
		ImageManager img2 = new ImageManager();
		img2.readImage("images/colorful.bmp");
		img2.writeImage("images/fulloforiginal.bmp"); 
		img2.convertToRed();
		img2.writeImage("images/fullofred.bmp");
		img2.restoreToOriginal();
		img2.convertToBlue();
		img2.writeImage("images/fullofblue.bmp"); 
		img2.restoreToOriginal();
		img2.convertToGreen(); 
		img2.writeImage("images/fullofgreen.bmp");
		img2.restoreToOriginal();
		img2.convertToBlack();
		img2.writeImage("images/fullofblack.bmp");  
		img2.restoreToOriginal();
		img2.convertToViolet();
		img2.writeImage("images/fullofviolet.bmp"); 
		img2.restoreToOriginal();
		img2.convertToYellow();
		img2.writeImage("images/fullofyellow.bmp"); 
		img2.restoreToOriginal();
		img2.convertToSkyBlue();
		img2.writeImage("images/fullofskyblue.bmp"); 
	}
}