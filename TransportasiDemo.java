import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil Mobil1 = new Mobil();
        Mobil1.jumlahRoda = 4;
        System.out.println("Mobil memiliki "+Mobil1.jumlahRoda+" roda");
        int jumlahmesin = Mobil1.mesin;
        System.out.println("Mobil memiliki "+jumlahmesin+" mesin");
        Mobil1.maju();
        Mobil1.belok();
        Mobil1.mundur();
        Mobil1.ngerem();

        System.out.println("====================================");
        
        Bicycle Sepeda1 = new Bicycle();
        Sepeda1.jumlahRoda = 2;
        System.out.println("Sepeda memiliki "+Sepeda1.jumlahRoda+" roda");
        Sepeda1.maju();
        Sepeda1.belok();
        Sepeda1.mundur();
        Sepeda1.ngerem();
        Sepeda1.berhenti();
    }
}
