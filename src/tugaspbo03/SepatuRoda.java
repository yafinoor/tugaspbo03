package tugaspbo03;

public class SepatuRoda {
     private String warna;
     private String merk;
     private double harga;
     
     void cetakinfo(){
         System.out.println("Warna \t: "+warna+"\n"+
                "Merk \t: "+merk+"\n"+
                "Harga \t:"+harga);
     }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
     
     
    
}