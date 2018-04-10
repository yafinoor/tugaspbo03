package tugaspbo03;
public class SepatuRodaAksi {
    public static void main(String[] args) {
         SepatuRoda s = new SepatuRoda();
        s.setWarna("Biru Gelap");
        s.setMerk("Wimcycle");
        s.setHarga(70000);
         
         s.cetakinfo();
         
         System.out.println("Warnanya \t: ");
         System.out.println(s.getWarna());
         System.out.println("Merknya \t: ");
         System.out.println(s.getMerk());
         System.out.println("Harganya \t: ");
         System.out.println(s.getHarga());
         
         SepatuRenang sr = new SepatuRenang();
         sr.setWarna("Kuning");
         sr.setMerk("Adidis");
         sr.setHarga(50000);
         sr.setJenisSepatuRenang("SepatuAir");
         sr.cetakinfo();
         System.out.println("Jenis \t:"+sr.getJenisSepatuRenang());
         sr.throttle();
    }
}
