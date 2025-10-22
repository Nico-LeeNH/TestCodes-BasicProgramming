package looping2;

public class DoWhileLoopNested {
    // Method untuk menghasilkan segitiga angka
    public String getNumberTriangle(int n) {
        // StringBuilder untuk menyimpan hasil segitiga
        StringBuilder triangle = new StringBuilder();
        // Inisialisasi variabel i untuk menghitung baris
        int i = 1;
        // Looping untuk setiap baris
        do {
            // Inisialisasi variabel j untuk mencetak angka pada setiap baris
            int j = 1;
            // Mencetak angka pada baris ke-i
            do {
                triangle.append(j); // Menambahkan angka ke hasil
                j++; // update nilai j setiap kolom
            } while (j <= i); // Looping dalam untuk mencetak angka pada setiap baris

            if (i < n) // Menambahkan baris baru setelah setiap baris angka
                triangle.append("\n"); // Menambahkan newline kecuali pada baris terakhir
                i++; // update nilai i setiap baris
            } while (i <= n);  

            return triangle.toString(); // Mengembalikan hasil segitiga sebagai string
        }
        
    }

