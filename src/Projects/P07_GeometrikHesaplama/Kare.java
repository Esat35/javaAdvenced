package Projects.P07_GeometrikHesaplama;

public class Kare  extends  Dikdortgen{


	public void alanBul(double x, double y){
		double alan=x*y;
		System.out.println("Karenin alanı : "+alan);
	}


	public void cevreBul(double x, double y){
		double cevre=(x+y)*2;
		System.out.println("Karenin çevresi : "+cevre);
	}
	
}
