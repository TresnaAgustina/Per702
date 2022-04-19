public class Leci extends Buah{
    private String NAMA, WARNA;
    private double Harga;

    @Override
    public void tampilInfo(){
        System.out.println("*Informasi Data Buah Leci*");
        System.out.println("Nama Buah   : " + this.getNAMA());
        System.out.println("Warna Buah  : " + this.getWARNA());
        System.out.println("Harga Buah  : " + this.getHarga());
    }
}
