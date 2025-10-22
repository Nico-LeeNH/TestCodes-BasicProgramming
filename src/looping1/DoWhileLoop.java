package looping1;


public class DoWhileLoop {
    // Method untuk mendapatkan jumlah bilangan ganjil dari 1 hingga n
    public int getOddNumbersAndSum(int n) {
        // Inisialisasi variabel i untuk menghitung bilangan
        int i = 1;
        // Cek jika n kurang dari 1
        if (n < 1) {
            return 0;
        }
        // Looping untuk menghitung bilangan ganjil dan menjumlahkannya
        int sum = 0;  
        // Melakukan looping dengan do-while  
        do {
            // Cek apakah i adalah bilangan ganjil
            if (i % 2 == 1){
                sum += i; // Menambahkan i ke sum jika ganjil
            }
            i++; // update nilai i setiap iterasi

        }while (i <= n); 
    
        return sum; // Mengembalikan hasil penjumlahan bilangan ganjil
    }

}
