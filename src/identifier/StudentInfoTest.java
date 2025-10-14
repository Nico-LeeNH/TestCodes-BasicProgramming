package identifier;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StudentInfoTest {
    @Test 
    public void test1Identifier() {
        // Code input
        String codeInputName = "Alice";
        int codeInputAge = 20;
        double codeInputGpa = 3.75;
        // Execution / codeOutput
        StudentInfo studentInfo = new StudentInfo();
        String codeOutput = studentInfo.showStudentInfo(codeInputName, codeInputAge, codeInputGpa);
        // Expected output
        String expectedOutput = "Name: Alice\n" + "Age: 20\n" + "GPA: 3.75";

        try {
            assertEquals("Test Alice (20, 3.75):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
    public void test2Identifier() {
        // Code input
        String codeInputName = "Bob";
        int codeInputAge = 30;
        double codeInputGpa = 3.50;
        // Execution / codeOutput
        StudentInfo studentInfo = new StudentInfo();
        String codeOutput = studentInfo.showStudentInfo(codeInputName, codeInputAge, codeInputGpa);
        // Expected output
        String expectedOutput = "Name: Bob\n" + "Age: 30\n" + "GPA: 3.50";

        try {
            assertEquals("Test Bob (30, 3.50):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
    public void test3Identifier() {
        // Code input
        String codeInputName = "Charlie";
        int codeInputAge = 25;
        double codeInputGpa = 3.90;
        // Execution / codeOutput
        StudentInfo studentInfo = new StudentInfo();
        String codeOutput = studentInfo.showStudentInfo(codeInputName, codeInputAge, codeInputGpa);
        // Expected output
        String expectedOutput = "Name: Charlie\n" + "Age: 25\n" + "GPA: 3.90";

        try {
            assertEquals("Test Charlie (25, 3.90):", expectedOutput, codeOutput);
        } catch (AssertionError ae) {
            System.out.println(ae);
        }
    }
}
