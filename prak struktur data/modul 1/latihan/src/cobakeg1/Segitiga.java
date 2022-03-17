package cobakeg1;

public class Segitiga<N> {
    private N alas;
    private N tinggi;

    public Segitiga(N alas, N tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }


    public N getAlas(){
        return alas;
    }

    public N getTinggi(){
        return tinggi;
    }

    public  int getResultAsInt(){
        
        return this.getAlas()*getTinggi()*0.5;
    }

    public double getResultAsDouble(double alas, double tinggi){
        double luas = 0.5*alas*tinggi;
        return luas;
    }


}
