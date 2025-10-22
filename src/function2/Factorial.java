package function2;


public class Factorial {
    // Method untuk menghitung faktorial dari sebuah bilangan
    public int factorial(int n) {
        // Cek jika n adalah 0, jika ya hasilnya adalah 1
        if (n == 0 || n == 1) {
            return 1; 
        }
        // Inisialisasi variabel result untuk menyimpan hasil faktorial
        int result = 1;
        // Looping dari 1 hingga n untuk menghitung faktorial
        for (int i = 1; i <= n; i++) {
            result *= i; // Mengalikan result dengan i setiap iterasi
        }

        return result; // Mengembalikan hasil faktorial
    }

}
