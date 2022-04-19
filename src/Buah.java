public class Buah {

    private String NAMA,WARNA;
    private double Harga;


    public void setNAMA(String N){
        this.NAMA = N;
    }
    public String getNAMA(){
        return this.NAMA;
    }


    public void setWARNA(String color){
        this.WARNA = color;
    }
    public String getWARNA(){
        return this.WARNA;
    }


    public void setHarga(double H){
        this.Harga = H;
    }
    public double getHarga(){
        return this.Harga;
    }


    public void tampilInfo(){
        System.out.println("*Informasi Data Buah*");
        System.out.println("Nama Buah   : " + this.NAMA);
        System.out.println("Warna Buah  : " + this.WARNA);
        System.out.println("Harga Buah  : " + this.Harga);
    }
}
