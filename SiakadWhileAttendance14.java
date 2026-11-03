import java.util.Scanner;
public class SiakadWhileAttendance14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int studentCount = input.nextInt();
        int i = 0;
        while (i < studentCount) {

            i++;
        }

        i = 0;
        while (i < studentCount) {
    System.out.print("Enter score for student " + (i + 1) + ": ");
    int score = input.nextInt();
    if (score < 0 || score > 100) {
    System.out.println("Invalid score. Please enter a valid score!");
    continue;
    }
    if (score > 80 && score <= 100) {
    System.out.println("The grade of student " + (i + 1) + " is A");
    }  else if (score > 73 && score <= 80) {
    System.out.println("The grade of student " + (i + 1) + " is B+");
    } else if (score > 65 && score <= 73) {
    System.out.println("The grade of student " + (i + 1) + " is B");
    } else if (score > 60 && score <= 65) {
    System.out.println("The grade of student " + (i + 1) + " is C+");
    } else if (score > 50 && score <= 60) {
    System.out.println("The grade of student " + (i + 1) + " is C");
    } else if (score > 39 && score <= 50) {
    System.out.println("The grade of student " + (i + 1) + " is D");
    } else {
    System.out.println("The grade of student " + (i + 1) + " is E");
    }
 i++;
        }

     
    }
}
