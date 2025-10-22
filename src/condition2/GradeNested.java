package condition2;

public class GradeNested {
    // Method untuk mendapatkan informasi grade berdasarkan mata pelajaran dan skor
    public String getGradeInfo(String subject, int score) {
        // Variabel untuk menyimpan grade
        String grade;
        // Cek mata pelajaran, jika Math
        if (subject.equals("Math")) {
            // Cek skor untuk menentukan grade, jika score lebih/sama dengan 90 maka grade A, lebih/sama dengan 74 B, lainnya C
            if (score >= 90) { 
                grade = "A";
            } else if (score >= 75) {
                grade = "B";
            } else {
                grade = "C";
            }
            return "Subject: Math, Grade: " + grade; // Mengembalikan informasi mata pelajaran dan grade
        // Jika mata pelajaran adalah English
        } else if (subject.equals("English")) {
            // Cek skor untuk menentukan grade, jika score lebih/sama dengan 85 maka grade A, lebih/sama dengan 70 maka grade B, lainnya C
            if (score >= 85) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else {
                grade = "C";
            }
            return "Subject: English, Grade: " + grade; // Mengembalikan informasi mata pelajaran dan grade
        // Jika mata pelajaran bukan keduanya, maka akan mengembalikan Subject: Unknown, Grade: N/A
        } else {
            return "Subject: Unknown, Grade: N/A"; 
        }
        
    }

}
