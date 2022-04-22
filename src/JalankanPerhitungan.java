import Model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);

        // Tugas /TM
        // Tampilkan hasil perhitungan dengan memanggil method yang ada pada perhitungan .java. Method yang di buat, Menerima  parameter  dan mengembalikan nilai (Method  with return)
        // Dikumpulkan Hari Sabtu , 23 April 2022
        // Hasil di email ke aherijanto@mimoapps.xyz berupa github repo masing masing siswa
        // Subject email Tm_NIM_Nama Kelas

        int hasiltambah = s.hitung(4,3);
        System.out.println("Hasil Dari Penjumlahan= "+ hasiltambah);

        int hasilperkalian = s.Perkalian(2, 9);
        System.out.println("Hasil Dari Perkalian = " + hasilperkalian);

        s.printJudul();
    }
}
