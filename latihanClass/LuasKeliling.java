package latihanClass;

public class LuasKeliling {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(8, 8, 8, 8, 10);
        Persegi persegi = new Persegi(4);
        Lingkaran lingkaran = new Lingkaran(7);

        System.out.println("SEGITIGA");
        System.out.printf("Luas : %.2f \n", segitiga.getLuas());
        System.out.printf("Keliling : %.2f \n", segitiga.getKeliling());

        System.out.println("\nPERSEGI");
        System.out.printf("Luas : %.2f \n", persegi.getLuas());
        System.out.printf("Keliling : %.2f \n", persegi.getKeliling());

        System.out.println("\nLINGKARAN");
        System.out.printf("Luas : %.2f \n", lingkaran.getLuas());
        System.out.printf("Keliling : %.2f \n", lingkaran.getKeliling());
    }
}
