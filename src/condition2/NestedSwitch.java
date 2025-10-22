package condition2;

public class NestedSwitch {
    // Method untuk mendapatkan pilihan berdasarkan kategori dan pilihan
    public String getSelection(int category, int choice) {
        // Cek kategori
        switch (category) {
            // Kategori 1 adalah minuman
            case 1: 
                // Cek pilihan minuman
                switch (choice) {
                    case 1: 
                        return category + ", You selected: Tea"; 
                    case 2: 
                        return category + ", You selected: Coffee"; // jika pilihan adalah 2, maka mengembalikan Coffee
                    default: // jika pilihan bukan 1 atau 2, maka mengembalikan pesan berikut
                        return category + ", Invalid drink choice";
                }
            // Kategori 2 adalah makanan
            case 2: 
                // Cek pilihan makanan
                switch (choice) {
                    case 1: 
                        return category + ", You selected: Pizza"; // jika pilihan adalah 1, maka mengembalikan pizza
                    case 2: 
                        return category + ", You selected: Burger";
                    default: // jika pilihan bukan 1 atau 2, maka mengembalikan pesan berikut
                        return category + ", Invalid food choice"; 
                }
            // Jika kategori bukan 1 atau 2, maka mengembalikan pesan berikut
            default:
                return category + ", Invalid category";
        }
    }
}
