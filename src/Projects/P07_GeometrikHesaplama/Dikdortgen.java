package Projects.P07_GeometrikHesaplama;

public class Dikdortgen extends Sekil{

	public void alanBul(double x, double y){
		double alan=x*y;
		System.out.println("Dikdörtgenin alanı : "+alan);
	}


	public void cevreBul(double x, double y){
		double cevre=(x+y)*2;
		System.out.println("Dikdörtgenin çevresi : "+cevre);
	}
}
