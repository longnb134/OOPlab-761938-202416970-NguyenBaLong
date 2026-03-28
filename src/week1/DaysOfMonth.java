package week1;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = -1;
        int month = -1;

        String[] monthFull = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] monthAbbr = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String[] month3Let = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] monthNum = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (year < 0) {
            System.out.print("Enter a valid year (e.g., 1999): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year < 0) System.out.println("Invalid year. Try again.");
            } else {
                System.out.println("Invalid year. Try again.");
                scanner.next();
            }
        }

        while (month == -1) {
            System.out.print("Enter a valid month: ");
            String inputMonth = scanner.next();
            for (int i = 0; i < 12; i++) {
                if (inputMonth.equals(monthFull[i]) || inputMonth.equals(monthAbbr[i]) || 
                    inputMonth.equals(month3Let[i]) || inputMonth.equals(monthNum[i])) {
                    month = i;
                    break;
                }
            }
            if (month == -1) System.out.println("Invalid month. Try again.");
        }

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        int days = daysInMonth[month];
        if (month == 1 && isLeapYear) {
            days = 29;
        }

        System.out.println("Number of days: " + days);
    }
}