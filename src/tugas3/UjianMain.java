
package tugas3;

public class UjianMain {
    public static void main(String[] args) {
        Ujian Siswa = new Ujian("Wahab", "4C", 90);
        
        Siswa.setNilai(60);
        
        System.out.println("Nama: "+Siswa.getNama());
        System.out.println("Kelas: "+Siswa.getKelas());
        System.out.println("Nilai: "+Siswa.getNilai());
        System.out.println("Status: "+Siswa.getStatus());
    }
}
