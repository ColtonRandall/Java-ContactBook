import java.util.Scanner;

public class Main {

    ContactBook contactBook = new ContactBook();
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    public void PrintMenu()
    {
        System.out.println("\nContact Book Menu:");
        System.out.println("1. Add contact");
        System.out.println("2. Remove contact");
        System.out.println("3. View all contacts");
        System.out.println("4. Search by name");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    public void Run() {
        while (!exit) {

            PrintMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Add a contact
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter phone number: ");
                    String phoneNum = scanner.nextLine();
                    System.out.println("Enter email address: ");
                    String email = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNum, email);
                    contactBook.AddContact(newContact);
                    break;

                case 2:
                    // remove contact
                    System.out.println("Enter the name of the contact you would like to remove:\n");
                    String contactToRemove = scanner.nextLine();
                    contactBook.RemoveContact(contactToRemove);
                    break;
                case 3:
                    contactBook.ViewContacts();
                    break;

                case 4:
                    System.out.println("Enter the name of the contact you would like to search:\n");
                    String contactToSearch = scanner.nextLine();
                    contactBook.SearchContact(contactToSearch);
                    break;

                case 5:
                    exit = true;
                    break;
            }
        }
    }

    public static void main (String[]args){
        Main main = new Main();
        main.Run();
    }

}
