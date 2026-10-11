import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dosa = 40, idly = 20, biryani = 150;
        int meals = 100, parotta = 30;

        System.out.println("1. Dosa - Rs.40");
        System.out.println("2. Idly - Rs.20");
        System.out.println("3. Chicken Biryani - Rs.150");
        System.out.println("4. Meals - Rs.100");
        System.out.println("5. Parotta - Rs.30");

        System.out.print("Enter Dosa quantity: ");
        int q1 = sc.nextInt();

        System.out.print("Enter Idly quantity: ");
        int q2 = sc.nextInt();

        System.out.print("Enter Biryani quantity: ");
        int q3 = sc.nextInt();

        System.out.print("Enter Meals quantity: ");
        int q4 = sc.nextInt();

        System.out.print("Enter Parotta quantity: ");
        int q5 = sc.nextInt();

        double total = dosa*q1 + idly*q2 + biryani*q3
                     + meals*q4 + parotta*q5;

        double gst = total * 18 / 100;
        double service = total * 5 / 100;
        double bill = total + gst + service;

        System.out.println("Total = Rs." + total);
        System.out.println("GST = Rs." + gst);
        System.out.println("Service Charge = Rs." + service);
        System.out.println("Final Bill = Rs." + bill);

        sc.close();
    }
}