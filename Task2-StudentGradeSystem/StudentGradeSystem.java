import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        int[] marks = new int[3];
        int total = 0;

        for (int i = 0; i < 3; i++) {
            int mark;
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + " (0-100): ");
                mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    break;
                } else {
                    System.out.println(" Invalid input! Marks must be between 0 and 100.");
                }
            }
            marks[i] = mark;
            total += mark;
        }

        double average = total / 3.0;
        String grade;

        if (average >= 90) grade = "A";
        else if (average >= 75) grade = "B";
        else if (average >= 50) grade = "C";
        else grade = "Fail";

        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

