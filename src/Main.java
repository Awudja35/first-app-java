import java.util.Scanner;

public class Main  {
    public static void main(String[] args){

           //mad libs game
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;


        System.out.println("Enter adjective 1: ");
        adjective1 = scanner.nextLine();

        System.out.println("Enter noun 1: ");
        noun1 = scanner.nextLine();

        System.out.println("Enter adjective 2: ");
        adjective2 = scanner.nextLine();

        System.out.println("Enter verb1: ");
        verb1 = scanner.nextLine();

        System.out.println("Enter adjective3 : ");
        adjective3 = scanner.nextLine();


        System.out.println("Today i went to a " + adjective1 + " zoo");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " +  adjective2 + " and " + verb1 + "."  );
        System.out.println("I was " + adjective3 + ".");
scanner.close();

    }
}

