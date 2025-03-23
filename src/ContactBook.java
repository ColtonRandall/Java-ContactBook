import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactBook {


    private List<Contact> contacts;
    Scanner scanner = new Scanner(System.in);

    public ContactBook() {
        contacts = new ArrayList<>();
    }

    public void AddContact(Contact contact){
        contacts.add(contact);
        System.out.println("✅ " + contact.getName() + " added to Contact Book");
    }

    public void RemoveContact(String name){
        contacts.removeIf(contact -> contact.getName().equals(name));
        System.out.println("✅ " + name + " removed from Contact Book");
    }

    public void ViewContacts(){
        if (contacts.isEmpty()){
            System.out.println("Contact Book is Empty");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact.toString());
            }
        }
    }

    public void SearchContact(String input){
        for(var contact : contacts){
            if(contact.getName().equals(input) || contact.getPhoneNumber().equals(input) || contact.getEmailAddress().equals(input)){
                System.out.println("✅ Contact found: " + contact.toString());
            } else {
                System.out.println("❌ Contact not found");
            }
        }
    }
}
