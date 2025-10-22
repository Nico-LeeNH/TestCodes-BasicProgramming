package looping1;


public class ForLoop {

    // Method untuk mendapatkan jumlah dari angka 1 hingga maxnumber
    public Integer getNumbersAndSum(int maxnumber) {
        // Inisialisasi variabel sum untuk menyimpan hasil penjumlahan
        int sum = 0;
        // Looping dari 1 hingga maxnumber
        for (int i = 1; i <=maxnumber; i++) {
            sum += i; // Menambahkan i ke sum setiap iterasi
        }
        
        return sum; // Mengembalikan hasil penjumlahan
        
    }
}
