import java.util.ArrayList;
import java.util.List;

public class ContactBook {


    private List<Contact> contacts;

    public ContactBook() {
        contacts = new ArrayList<>();
    }

    public void AddContact(Contact contact){
        contacts.add(contact);
    }

    public void RemoveContact(String name){
        contacts.removeIf(contact -> contact.getName().equals(name));
    }

    public void ViewContacts(){
        // if the contact list is empty, return a string saying so
        if (contacts.isEmpty()){
            System.out.println("No contacts found");
        } else {
            System.out.println("Contacts:\n");
            for (Contact contact : contacts) {
                System.out.println(contact.toString() + "\n");
            }
        }
        // if contacts exist, loop through them, and output the information
    }

    public void SearchContact(String name){
        for(var contact : contacts){
            if(contact.getName().equals(name)){
                System.out.println("Contact found: " + contact.toString());
            }
        }
    }
}
