package com.codingshuttle.youtube.LearningRESTAPIs.practices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactOperations obj = new ContactOperations();

        while(true) {
            System.out.println("-----Contact Operations------");
            System.out.println("1. Add Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Search contact by name");
            System.out.println("4. Display list of contacts");
            System.out.println("5.Exit");

            System.out.println("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Email:");
                    String email = sc.nextLine();
                    System.out.println("Enter Phone:");
                    String phone = sc.nextLine();

                    Contact contact = new Contact(name, email, phone);

                    obj.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter name of user to delete contact: ");
                    String delName = sc.nextLine();
                    obj.deleteContact(delName);
                    break;

                case 3:
                    System.out.print("Enter name of user to search contact: ");
                    String searchName = sc.nextLine();
                    obj.searchContact(searchName);
                    break;

                case 4:
                    obj.displayAllContacts();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again.");

            }
        }
    }
}

/*

output - >

-----Contact Operations------
1. Add Contact
2. Delete Contact
3. Search contact by name
4. Display list of contacts
5.Exit
Enter your choice:
1
Enter Name:
Rohit
Enter Email:
rohit@gmail.com
Enter Phone:
21324244
Contact added successfully!
-----Contact Operations------
1. Add Contact
2. Delete Contact
3. Search contact by name
4. Display list of contacts
5.Exit
Enter your choice:
1
Enter Name:
Harsh
Enter Email:
h@gmail.com
Enter Phone:
234454543
Contact added successfully!
-----Contact Operations------
1. Add Contact
2. Delete Contact
3. Search contact by name
4. Display list of contacts
5.Exit
Enter your choice:
3
Enter name of user to search contact: rohit
Contact found: Name: Rohit, Email: rohit@gmail.com, Phone: 21324244
-----Contact Operations------
1. Add Contact
2. Delete Contact
3. Search contact by name
4. Display list of contacts
5.Exit

Enter your choice:
2
Enter name of user to delete contact: harsh
Contact removed successfully!
-----Contact Operations------
1. Add Contact
2. Delete Contact
3. Search contact by name
4. Display list of contacts
5.Exit
Enter your choice:
4
Contact List:
Name: Rohit, Email: rohit@gmail.com, Phone: 21324244
-----Contact Operations------
1. Add Contact
2. Delete Contact
3. Search contact by name
4. Display list of contacts
5.Exit
Enter your choice:
5
Exiting...

 */
