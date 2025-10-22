package array1;

public class Array1D {
    // Method untuk mendapatkan informasi array dan jumlahnya
    public String getArrayInfo(int[] array) {
        // Mengembalikan elemen array dan jumlahnya dalam format string
        StringBuilder arr = new StringBuilder();
        int sum = 0; // Inisialisasi variabel sum untuk menyimpan hasil penjumlahan
        // Looping melalui setiap elemen dalam array
        for (int i =0; i < array.length; i++){
            arr.append(array[i]); // Menambahkan elemen array ke string
            sum += array[i]; // Menambahkan elemen array ke sum

            // Menambahkan spasi jika bukan elemen terakhir
            if (i < array.length - 1) {
                arr.append(" ");
            }
        }
        arr.append("\nSum: ").append(sum); // Menambahkan hasil penjumlahan ke string
        return arr.toString(); // Mengembalikan hasil sebagai string

    }

}
