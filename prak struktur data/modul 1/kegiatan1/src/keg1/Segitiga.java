package keg1;

public class Segitiga<T> {
    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }



    public int getResultAsInt(int alas, int tinggi) {
        int luas = (int) (0.5 * alas * tinggi);
        return luas;
    }

    public double getResultAsDouble(double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }


}
