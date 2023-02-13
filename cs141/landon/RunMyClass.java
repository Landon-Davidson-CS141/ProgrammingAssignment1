package cs141.landon;

public class RunMyClass {
    public static void main(String[] args) {
        BirthdayWizard bday = new BirthdayWizard();
        for (int i = 0; i < 3; i++) {
            System.out.format("%nRun %d%n", i + 1);
            bday.setYears();
            bday.findResultYear();
        }

        GpaCalculator calc = new GpaCalculator();
        for (int i = 0; i < 3; i++) {
            System.out.format("%nRun %d%n", i + 1);
            calc.setGrades();
            calc.printGpa();
        }
    }
}
