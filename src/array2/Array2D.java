package array2;

import java.util.Locale;

public class Array2D {
    // Method untuk mendapatkan informasi matriks 2D
    public String getMatrixInfo(int[][] arr) {
        // StringBuilder untuk menyimpan representasi matriks
        StringBuilder matrix = new StringBuilder();
        // Variabel untuk menghitung total dan jumlah elemen
        int count = 0;
        int total = 0;
        // Looping melalui setiap elemen dalam matriks
        for(int i = 0; i < arr.length; i++){
            matrix.append("Row ").append(i+1).append(": ");// Menambahkan informasi baris ke representasi matriks
            // Looping melalui setiap kolom dalam baris
            for(int j = 0; j < arr[i].length; j++){
                int value = arr[i][j]; // Mengambil nilai elemen 
                total += value; // Menambahkan nilai elemen ke total
                count++; // Menambah jumlah elemen

                // Menambahkan nilai elemen dan informasi genap/ganjil ke representasi matriks
                if (value % 2 == 0) {
                    matrix.append(value).append("E "); // Jika nilai genap, maka menambahkan "E"
                }else{
                    matrix.append(value).append("O "); // Jika nilai ganjil, maka menambahkan "O"
                }
            }
            matrix.append("\n"); // Menambahkan newline setelah setiap baris
        }
        double average = (double) total / count; // Menghitung rata-rata nilai elemen
        matrix.append("Total: ").append(total).append("\n"); // Menambahkan total ke representasi matriks
        matrix.append("Average: ").append(String.format(Locale.US,"%.1f", average)); // Menambahkan rata-rata ke representasi matriks dengan format 1 desimal
        return matrix.toString(); // Mengembalikan representasi matriks sebagai string
        
    }

   
}
