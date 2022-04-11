package Projects.P07_GeometrikHesaplama;

public class Sekil {
    double kısaKenar;
    double uzunKenar;
    double yarıCap;

    public Sekil(double kısaKenar, double uzunKenar) {
        this.kısaKenar = kısaKenar;
        this.uzunKenar = uzunKenar;
    }

    public Sekil(double yarıCap) {
        this.yarıCap = yarıCap;
    }
    public Sekil() {
        this.yarıCap = yarıCap;
    }



    public void alanBul(double x, double y){
        double alan=x*y;
        System.out.println("Alan : "+alan);
    }


    public void cevreBul(double x, double y){
        double cevre=(x+y)*2;
        System.out.println("Cevre : "+cevre);
    }

    public void alanBul(double x){
        double alan=Math.PI*x*x;
        System.out.println("Alan : "+alan);
    }


    public void cevreBul(double x){
        double cevre=2*Math.PI*x;
        System.out.println("Cevre : "+cevre);
    }
}
