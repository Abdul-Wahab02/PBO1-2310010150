package tugas4;

public class Kendaraan {
    private String merk;           
    private int kecepatan;     

    public Kendaraan(String merk, int kecepatan) {
        this.merk = merk;        
        this.kecepatan = kecepatan; 
    }

    public String getMerk() {
        return merk;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        if (kecepatan > 0) {
            this.kecepatan = kecepatan; 
        } else {
            System.out.println("Kecepatan harus positif."); 
        }
    }

    public void info() {
        System.out.println("Kendaraan merk " + merk + " dengan kecepatan " + kecepatan + " km/jam");
    }
}