package calenderPack;
import java.util.Scanner;

public class Calender_V1 {
	static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    	System.out.println("Enter the week number");
        int week = scanner.nextInt();
        System.out.println("Enter the day that the month start in:");
        int days = scanner.nextInt();
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");

        for (int blank = 1; blank < week; blank++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            if(day < 10) {
                System.out.print("  "+ day);
            } else {
                System.out.print(" " + day);
            }

            if ((week + day - 1) % 7 != 0) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
        }
    }
}