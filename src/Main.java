import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hotel Booking Management System");
        System.out.println("Please select your preferred choice\n" +
                "\n" +
                "\t1. register account\n" +
                "\t2. book reservation\n" +
                "\t3. generate bill\n" +
                "\t4. feedback\n");

        System.out.print("Enter your choice (1-4): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected: Register Account");
                registerAccount();
                break;
            case 2:
                System.out.println("You selected: Book Reservation");
                bookReservation();
                break;
            case 3:
                System.out.println("You selected: Generate Bill");
                generateBill();
                break;
            case 4:
                System.out.println("You selected: Feedback");
                feedback();
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }

    private static void registerAccount() {
        String folderPath = "C:\\Users\\amahi\\IdeaProjects\\HotelBooking\\registeredAccounts\\";
        String fileName = "ACC_" + generateRandomNumber() + ".json";
        String filePath = folderPath + fileName;

        System.out.print("Enter first name: ");
        String firstName = scanner.next();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Enter email address: ");
        String emailId = scanner.next();

        System.out.print("Enter address: ");
        String address = scanner.next();

        try (FileWriter fileWriter = new FileWriter(filePath)){
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
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(10000);
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
