/*
Name: Landon Davidson
Section: 27258
Program Name: GPA Program

Description: This program assigns user defined grades to the array grades in the method
setGrades(). Then it finds the average grade and uses if statements to convert the grade
to a letter grade in the printGpa() method.
 */

import java.util.Scanner;

public class GpaCalculator {
    Scanner input = new Scanner(System.in);
    private int[] grades = new int[5];

    public void setGrades() {
        int temp;
        System.out.println("Enter 5 of your grades from 0 - 100 (Separate each one with a space): ");
        for (int i = 0; i < 5; i++) {
            if (input.hasNextInt()) {
                temp = input.nextInt();
                if (temp > 100) {
                    temp = 100;
                } else if (temp < 0) {
                    temp = 0;
                }
                grades[i] = temp;
            }
            else {
                break;
            }
        }
    }

    public void printGpa() {
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += grades[i];
        }
        double average = total / 5.0;
        char letterGrade;
        if (average >= 90) {
            letterGrade = 'A';
        } else if (average >= 80) {
            letterGrade = 'B';
        } else if (average >= 70) {
            letterGrade = 'C';
        } else if (average >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        System.out.format("You're average grade is %.2f, with a letter grade of %c",
                average, letterGrade);
    }
}
