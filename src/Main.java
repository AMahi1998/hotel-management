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
}