package Projects.P07_GeometrikHesaplama;

public class Cember extends Sekil {

	public void alanBul(double x){
		double alan=Math.PI*x*x;
		System.out.println("Çemberin alanı : "+alan);
	}


	public void cevreBul(double x){
		double cevre=2*Math.PI*x;
		System.out.println("Çemberin çevresi : "+cevre);
	}

}
