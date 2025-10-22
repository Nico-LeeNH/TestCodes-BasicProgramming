package looping2;


public class ForLoopNested {

    // Method untuk menghasilkan grid berdasarkan nomor yang diberikan
    public String getGrid(int Number) { 
        // StringBuilder untuk menyimpan hasil grid
        StringBuilder grid = new StringBuilder();
        // Melakukan looping untuk setiap baris
        for (int row = 1; row <= Number; row++){
            // Melakukan looping untuk setiap kolom dalam baris
            for (int col = 1; col <= Number; col++){
                // Menambahkan informasi baris dan kolom ke hasil grid
                grid.append("Row " + row + " Col " + col);
                // Menambahkan newline kecuali pada elemen terakhir
                if (!(row == Number && col == Number)){
                    grid.append("\n"); 
                }
            }
        
        }
    return grid.toString(); // Mengembalikan hasil grid sebagai string

    }
}
