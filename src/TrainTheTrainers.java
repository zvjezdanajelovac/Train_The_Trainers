import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counterGrades = 0;
        double totalGradesSum =0;
        double totalAverageGrades = 0;

        while (true) {
            String presentation = scanner.nextLine();

            if (presentation.equals("Finish")) {
                break;
            }

            double sumGrades = 0;
            double averageGrades = 0;
            for (int i = 1; i<=n; i++) {

                double grade = Double.parseDouble(scanner.nextLine());
                sumGrades = sumGrades + grade;
                averageGrades = sumGrades/n;

                totalGradesSum = totalGradesSum+grade;
                counterGrades++;
                totalAverageGrades = totalGradesSum/counterGrades;

            }
            System.out.printf("%s - %.2f.\n", presentation, averageGrades);

        }
        System.out.printf("Student's final assessment is %.2f.\n", totalAverageGrades);




    }
}
