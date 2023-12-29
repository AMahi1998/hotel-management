/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("hotel booking management!");
        System.out.println("Please select your preferred choice\n" +
                "\n" +
                "\t1. register account\n" +
                "\t2. book reservation\n" +
                "\t3. generate bill\n" +
                "\t4. feedback\n");

        System.out.print("Enter your choice (1-4): ");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("You selected: Register Account");
                break;
            case 2:
                System.out.println("You selected: Book Reservation");
                break;
            case 3:
                System.out.println("You selected: Generate Bill");
                break;
            case 4:
                System.out.println("You selected: Feedback");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

    }
}*/

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hotel Booking Management System");
        System.out.println("Please select your preferred choice:");
        System.out.println("1. Register Account");
        System.out.println("2. Book Reservation");
        System.out.println("3. Generate Bill");
        System.out.println("4. Feedback");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                registerAccount();
                break;
            case 2:
                bookReservation();
                break;
            case 3:
                generateBill();
                break;
            case 4:
                feedback();
                break;
            // Add cases for other options (2, 3, 4) as needed
            default:
                System.out.println("Invalid choice. Exiting...");
        }

        scanner.close();
    }

    private static void registerAccount() {
        Scanner scanner = new Scanner(System.in);

        // Create a folder in the system (change the path as needed)
        String folderPath = "C:\\Users\\amahi\\IdeaProjects\\HotelBooking\\registeredAccounts\\";
        String fileName = "ACC_" + generateRandomNumber() + ".json";
        String filePath = folderPath + fileName;

        // Ask user for details
        System.out.print("Enter first name: ");
        String firstName = scanner.next();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter email address: ");
        String emailId = scanner.next();

        System.out.print("Enter address: ");
        String address = scanner.next();

        // Write details to JSON file
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write("{\n");
            fileWriter.write("  \"firstName\": \"" + firstName + "\",\n");
            fileWriter.write("  \"phoneNumber\": \"" + phoneNumber + "\",\n");
            fileWriter.write("  \"emailId\": \"" + emailId + "\",\n");
            fileWriter.write("  \"address\": \"" + address + "\"\n");
            fileWriter.write("}\n");

            System.out.println("Account registered successfully. File saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        scanner.close();
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000); // Adjust the range as needed
    }

    private static void bookReservation()
    {

    }

    private static void generateBill()
    {

    }
    private static void feedback()
    {

    }


}
