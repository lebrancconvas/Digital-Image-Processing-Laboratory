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

		ImageManager rect1 = new ImageManager();
		rect1.readImage("images/Rect1.bmp");
		rect1.writeImage("images/Rect1_Original.bmp");
		rect1.convertToBlue();
		rect1.writeImage("images/Rect1_Blue.bmp");
		rect1.restoreToOriginal();
		rect1.convertToViolet();
		rect1.writeImage("images/Rect1_Violet.bmp");

		ImageManager prc = new ImageManager();
		prc.readImage("images/puertoricoflag.bmp");
		prc.writeImage("images/prc_original.bmp");

		ImageManager solar = new ImageManager();
		solar.readImage("images/solarsystem.bmp");
		solar.writeImage("images/output/solar_original.bmp");
		solar.convertToSkyBlue();
		solar.writeImage("images/output/solar_skyblue.bmp");
		solar.restoreToOriginal();
		solar.convertToRed();
		solar.writeImage("images/output/solar_red.bmp");
		solar.restoreToOriginal();

		ImageManager parrot = new ImageManager();
		parrot.readImage("images/parrot.bmp");
		parrot.writeImage("images/output/parrot_original.bmp");
		parrot.convertToBlue();
		parrot.writeImage("images/output/parrot_blue.bmp");
		parrot.restoreToOriginal();
		parrot.convertToViolet();
		parrot.writeImage("images/output/parrot_violet.bmp");
	}
}