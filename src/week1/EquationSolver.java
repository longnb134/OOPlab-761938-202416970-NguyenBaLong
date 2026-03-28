import javax.swing.JOptionPane;

public class EquationSolver {
    public static void main(String[] args) {
        String choice = JOptionPane.showInputDialog(null,
                "Select equation type:\n1. Linear Equation (ax + b = 0)\n2. Linear System\n3. Quadratic Equation (ax^2 + bx + c = 0)",
                "Equation Solver Menu", JOptionPane.QUESTION_MESSAGE);

        if (choice == null) {
            System.exit(0);
        }

        if (choice.equals("1")) {
            String strA = JOptionPane.showInputDialog("Enter a:");
            String strB = JOptionPane.showInputDialog("Enter b:");
            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);

            if (a == 0) {
                if (b == 0) {
                    JOptionPane.showMessageDialog(null, "Infinitely many solutions");
                } else {
                    JOptionPane.showMessageDialog(null, "No solution");
                }
            } else {
                JOptionPane.showMessageDialog(null, "x = " + (-b / a));
            }

        } else if (choice.equals("2")) {
            String strA11 = JOptionPane.showInputDialog("Enter a11:");
            String strA12 = JOptionPane.showInputDialog("Enter a12:");
            String strB1 = JOptionPane.showInputDialog("Enter b1:");
            String strA21 = JOptionPane.showInputDialog("Enter a21:");
            String strA22 = JOptionPane.showInputDialog("Enter a22:");
            String strB2 = JOptionPane.showInputDialog("Enter b2:");

            double a11 = Double.parseDouble(strA11);
            double a12 = Double.parseDouble(strA12);
            double b1 = Double.parseDouble(strB1);
            double a21 = Double.parseDouble(strA21);
            double a22 = Double.parseDouble(strA22);
            double b2 = Double.parseDouble(strB2);

            double d = a11 * a22 - a21 * a12;
            double d1 = b1 * a22 - b2 * a12;
            double d2 = a11 * b2 - a21 * b1;

            if (d != 0) {
                JOptionPane.showMessageDialog(null, "x1 = " + (d1 / d) + "\nx2 = " + (d2 / d));
            } else {
                if (d1 == 0 && d2 == 0) {
                    JOptionPane.showMessageDialog(null, "Infinitely many solutions");
                } else {
                    JOptionPane.showMessageDialog(null, "No solution");
                }
            }

        } else if (choice.equals("3")) {
            String strA = JOptionPane.showInputDialog("Enter a:");
            String strB = JOptionPane.showInputDialog("Enter b:");
            String strC = JOptionPane.showInputDialog("Enter c:");
            double a = Double.parseDouble(strA);
            double b = Double.parseDouble(strB);
            double c = Double.parseDouble(strC);

            if (a == 0) {
                if (b == 0) {
                    if (c == 0) JOptionPane.showMessageDialog(null, "Infinitely many solutions");
                    else JOptionPane.showMessageDialog(null, "No solution");
                } else {
                    JOptionPane.showMessageDialog(null, "x = " + (-c / b));
                }
            } else {
                double delta = b * b - 4 * a * c;
                if (delta < 0) {
                    JOptionPane.showMessageDialog(null, "No real root");
                } else if (delta == 0) {
                    JOptionPane.showMessageDialog(null, "Double root: x = " + (-b / (2 * a)));
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    JOptionPane.showMessageDialog(null, "Two distinct roots:\nx1 = " + x1 + "\nx2 = " + x2);
                }
            }
        }
        System.exit(0);
    }
}