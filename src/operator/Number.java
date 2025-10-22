package operator;


public class Number {

    public String getOperatorResults(int a, int b) {
        
        return "Sum: " + (a + b) + "\n" + 
                "Product: " + (a * b) + "\n" + 
                "Is Equal: " + (a == b) + "\n" + 
                "Logical AND: " + (a > 0 && b > 0) + "\n" + 
                "Logical OR: " + (a < 0 || b > 0); 
    }
    
}
