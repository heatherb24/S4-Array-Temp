import java.util.Scanner;

public class Main { public static void main(String[] args) { Scanner input = new Scanner(System.in);


    System.out.print("Enter the number of days: ");
    int numDays = input.nextInt();

    int[] temperatures = new int[numDays];
    int sum = 0;

    for (int i = 0; i < numDays; i++) {
        System.out.print("Enter the temperature for day " + (i + 1) + ": ");
        temperatures[i] = input.nextInt();
        sum += temperatures[i];
    }

    double average = (double) sum / numDays;
    System.out.println("Average temperature: " + average);

    int aboveAverageCount = 0;
    for (int i = 0; i < numDays; i++) {
        if (temperatures[i] > average) {
            aboveAverageCount++;
        }
    }

    System.out.println(aboveAverageCount + " days are above the average temperature.");
}
}
