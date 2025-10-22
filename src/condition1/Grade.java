package condition1;

public class Grade {
    // Method untuk mendapatkan grade berdasarkan skor
    public String getGrade(int score) {
        // Variabel untuk menyimpan grade
        String grade;
        // Cek skor untuk menentukan grade, jika score adalah 90 maka grade A, 89 B, 74 C, 59 F, lainnya Invalid Score
        if (score == 90) {
            grade = "A";
        } else if (score == 89) {
            grade = "B";
        } else if (score == 74) {
            grade = "C";
        } else if (score == 59) {
            grade = "F";
        } else {
            grade = "Invalid Score";
        }
            
        return "Grade: " + grade; // Mengembalikan informasi grade
    }

}
