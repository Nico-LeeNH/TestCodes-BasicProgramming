package looping1;


public class WhileLoop {
    // Method untuk mendapatkan jumlah dari angka genap dari 1 hingga n
    public int getEvenNumbersAndSum(int n) {
        // Inisialisasi variabel i untuk menghitung bilangan
        int i = 1;
        // Cek jika n kurang dari 1
        int sum = 0; 
        // Looping untuk menghitung bilangan genap dan menjumlahkannya
        while (i <= n) {
            // Cek apakah i adalah bilangan genap
            if (i % 2 == 0){
                sum += i; // Menambahkan i ke sum jika genap
        }
        i++; // update nilai i setiap iterasi
    }
        return sum; // Mengembalikan hasil penjumlahan bilangan genap
        
    }

}
