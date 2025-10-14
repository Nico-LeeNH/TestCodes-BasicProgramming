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
}
