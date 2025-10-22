package condition1;

public class DayOfWeek {
    // Method untuk mendapatkan nama hari berdasarkan nomor hari
    public String getDayName(int day) {
        // Variabel untuk menyimpan nama hari
        String dayName;
        // Cek nomor hari 
        switch (day) {
            // Jika hari adalah 1 hingga 7, maka mengembalikan nama hari yang sesuai
            case 1:
                dayName = "Monday";
                break; // jika hari adalah 1, maka dayName adalah Monday
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Unknown";
        }
        return "Day: " + dayName; // Mengembalikan nama hari
    }

}
