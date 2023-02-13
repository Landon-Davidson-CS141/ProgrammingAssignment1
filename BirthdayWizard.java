/*
Name: Landon Davidson
Section: 27258
Program Name: Birthday Wizard

Description: This program finds the year the user was born as well as the target year
using the setYears() method. The findResultYear() method finds what year the user will
become the target age.
 */

import java.util.Scanner;

public class BirthdayWizard {
    Scanner input = new Scanner(System.in);
    private int birthYear;
    private int targetAge;

    public BirthdayWizard() {

    }

    public void setYears() {
        System.out.println("What year were you born? ");
        birthYear = input.nextInt();
        System.out.println("Choose an age in years: ");
        targetAge = input.nextInt();
    }

    public void findResultYear() {
        System.out.format("You will turn %d in the year %d", targetAge, birthYear + targetAge);
    }
}
