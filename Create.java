
import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {
    Scanner sc = new Scanner(System.in);
    public void read(String USERID) {
        String filename = USERID + ".txt";
        File file = new File(filename);
        try (Scanner fileScanner = new Scanner(file)) {
            System.out.println("Reading from Account: " + filename);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Account not found: " + filename);
            e.printStackTrace();
        }
    }
    void creating() {
        System.out.println("ENTER YOUR NAME");
        String name = sc.nextLine();
        Random random = new Random();
        int randomNumber = 1000 + random.nextInt(9000);
        String USERID = name + randomNumber;
        System.out.println("YOUR USER ID IS : " + USERID);

        String filename = USERID + ".txt";
        File file = new File(filename);

        try {
            if (file.createNewFile()) {
                System.out.println("Account created: " + file.getName());
            } else {
                System.out.println("Account already exists: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the Account.");
            e.printStackTrace();
        }
        update(USERID);
    }

    void update(String USERID) {
        System.out.print("Enter the Transactions Info you want to write to your Account: ");
        String userInput = sc.nextLine()+"\n";
        String filename = USERID + ".txt";
        File file = new File(filename);

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(userInput + "\n");
            System.out.println("Successfully appended to the Account: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the Account.");
            e.printStackTrace();
        }

    }

    void create() {
        System.out.println("Creating");
        int choice = 0;

        while (choice != 2) {
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("1. Create\n2. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // Clear the newline character

            switch (choice) {
                case 1:
                    creating();
                    break;
                case 2:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
