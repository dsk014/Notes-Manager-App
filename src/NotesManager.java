import java.io.*;
import java.util.Scanner;

public class NotesManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n ==== Notes Manager ====");
            System.out.println("1. add note");
            System.out.println("2. read notes");
            System.out.println("3. exit");
            System.out.print("enter your choice: ");

           int choice = sc.nextInt();
           sc.nextLine();

           switch (choice){

               case 1:
                   addNote(sc);
                   break;
               case 2:
                   readNote();
                   break;
               case 3:
                   System.out.println("exiting....!");
                   System.exit(0);
                   break;
               default:
                   System.out.println("invalid choice");
                   break;
           }


        }


    }

    private static void addNote(Scanner sc) {
        System.out.println("enter the note: ");

        String note = sc.nextLine();

        try (FileWriter fw = new FileWriter("notes.txt", true)){

            fw.write(note + "\n");
            System.out.println("note added successfully");
        } catch (IOException e) {
            System.out.println("error adding note to file: " + e.getMessage());
        }


    }

    private static void readNote() {

        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader("notes.txt"))){

            String line;
            System.out.println("\n --- Your Notes ---");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("- " + line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No notes found yet!");

        } catch (IOException e) {
            System.out.println("error reading notes: " + e.getMessage());
        }
    }
}




