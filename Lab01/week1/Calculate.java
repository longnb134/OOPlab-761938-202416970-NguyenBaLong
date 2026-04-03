package week1;
import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1 = JOptionPane.showInputDialog(null, "Enter the first number:", "Input", JOptionPane.INFORMATION_MESSAGE);
        String strNum2 = JOptionPane.showInputDialog(null, "Enter the second number:", "Input", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = num1 - num2;
        double prod = num1 * num2;

        String result = "Sum: " + sum + "\nDifference: " + diff + "\nProduct: " + prod + "\n";

        if (num2 == 0) {
            result += "Quotient: Cannot divide by zero!";
        } else {
            double quot = num1 / num2;
            result += "Quotient: " + quot;
        }

        JOptionPane.showMessageDialog(null, result, "Results", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}