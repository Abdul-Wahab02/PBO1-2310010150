
package tugas3;

public class Ujian {
    String nama, kelas, status;
    int nilai;
    
    //constructor
    public Ujian(String nama, String kelas, int nilai) {
        this.nama = nama;
        this.kelas = kelas;
        setNilai(nilai);
    }
    
    //mutator
    void setNilai(int nilai){
        this.nilai = nilai;
        if(nilai >= 75) {
            status = "Lulus";
        } else {
            status = "Tidak Lulus";
        }
    }
    
    
    //accessor
    String getNama(){
        return nama;
    }
    
    String getKelas() {
        return kelas;
    }
    
    int getNilai() {
        return nilai;
    }
    
    String getStatus() {
        return status;
    }
}

