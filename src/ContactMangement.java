import java.util.ArrayList;

public class ContactMangement {
    private ArrayList<Contact> contacts;

    //Constructor

    public ContactMangement() {
        contacts = new ArrayList<>();
    }

    //method to add a new contact
    public  void addContact(Contact contact){
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    //method to display all contacts
    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("No contacts available.");
        }else{
            for(Contact contact : contacts){
                System.out.println(contact);
            }
        }
    }

    //method to search for a contact by name
    public Contact searchContact(String name){
        for(Contact contact: contacts){
            if(contact.getName().equalsIgnoreCase(name)){
               return contact;
            }
        }
        return null;
    }

    //method to delete a contact by name
    public boolean deleteContact(String name){
        Contact contact = searchContact(name);
        if(contact != null){
            contacts.remove(contact);
            System.out.println("contact deleted successfully.");
            return true;
        }else{
            System.out.println("contact not found.");
            return false;
        }
    }

    //method to update  contact by name.
    public boolean updateContacts(String name, String newPhoneNumber, String newEmail){
        Contact contact = searchContact(name);
        if(contact != null){
            contact.setPhoneNumber(newPhoneNumber);
            contact.setEmail(newEmail);
            System.out.println("contact updated successfully.");
            return true;
        }else{
            System.out.println("contact not found.");
            return false;
        }
    }
}
