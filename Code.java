import java.lang.Math;
import java.util.Scanner;

class HelloWorld {
    
    public static double pythagoras(double num) {
        double cSquare = (num * num) + (num * num);
        return Math.sqrt(cSquare);
    }
    
    public static double abcRatio(double num1, double num2) {
        return num2 / num1;
    }
    
    public static void main(String[] args) {
        System.out.println("Please enter the value for side a and b of an equal distance right triangle\n");
        
        Scanner sizeScan = new Scanner(System.in);
        
        double abSize = sizeScan.nextDouble();
        
        double c = pythagoras(abSize);
        
        double r = abcRatio(abSize, c);
        
        System.out.println("The root of c of a and b squared equals " + c + ". \nThe ratio betweeen the a or b side of an equal distance right triangle to the c side will always be " + r + ". Same relationship extends to the average of a and b in any triangle");
    }
}
