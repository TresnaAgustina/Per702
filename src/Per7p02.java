public class Per7p02 {
    public static void main(String[] args) {
        Buah B = new Buah();
        Leci L = new Leci();

        B.setNAMA("Leci");
        B.setWARNA("Merah");
        B.setHarga(14.000);

        B.tampilInfo();


        L.setNAMA("Leci A");
        L.setWARNA("Putih");
        L.setHarga(18.000);
        L.tampilInfo();
    }
}
