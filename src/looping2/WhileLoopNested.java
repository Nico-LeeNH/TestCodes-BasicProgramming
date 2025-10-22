package looping2;

public class WhileLoopNested {
    // Method untuk menghasilkan segitiga bintang 
    public String getTriangle(int n) {
        // Menyimpan hasil segitiga dalam StringBuilder
        StringBuilder triangle = new StringBuilder();
        // Inisialisasi variabel i untuk menghitung baris
        int i = 1;
        // Looping untuk setiap baris
        while (i <= n)  {
            // Inisialisasi variabel j untuk mencetak bintang pada setiap baris
            int j = 1;
            // Mencetak bintang pada baris ke-i
            while (j <= i){
                triangle.append("*"); // Menambahkan bintang ke hasil
                j++; // update nilai j setiap kolom
            } 
            // Menambahkan baris baru setelah setiap baris bintang
            if (i < n) 
                triangle.append("\n"); // Menambahkan newline kecuali pada baris terakhir
                i++; // update nilai i setiap baris
            } 
            // Mengembalikan hasil segitiga sebagai string
            return triangle.toString();
        }

    
}
