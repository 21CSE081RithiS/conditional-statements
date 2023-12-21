import java.util.Scanner;

public class ProjectCompletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of hours needed: ");
        int totalHoursNeeded = scanner.nextInt();

        System.out.print("Enter the number of days: ");
        int numberOfDays = scanner.nextInt();

        System.out.print("Enter the number of workers: ");
        int numberOfWorkers = scanner.nextInt();

        int normalWorkingHoursPerDay = 8;
        int overtimeHoursPerDay = 2;
        int trainingDays = (int) (0.1 * numberOfDays);
        int workingDays = numberOfDays - trainingDays;

        double totalWorkingHours = workingDays * (numberOfWorkers * (normalWorkingHoursPerDay + overtimeHoursPerDay));

        int totalWorkingHoursRounded = (int) totalWorkingHours;

        if (totalWorkingHoursRounded >= totalHoursNeeded) {
            int hoursLeft = totalWorkingHoursRounded - totalHoursNeeded;
            System.out.println("Yes! " + hoursLeft + " hours left.");
        } else {
            int additionalHoursNeeded = totalHoursNeeded - totalWorkingHoursRounded;
            System.out.println("Not enough time! " + additionalHoursNeeded + " hours needed.");
        }

        scanner.close();
    }
}
