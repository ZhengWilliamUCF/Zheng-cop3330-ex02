import java.util.Scanner;

//Be sure the output contains the original string.
// Use a single output statement to construct the output.
// Use a built-in function of the programming language to determine the length of the string.
public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        App myApp = new App();
        String str = myApp.readString();
        System.out.println(str + " has " + str.length() + " characters.");
    }

    // Reads User String
    public String readString() {
        System.out.print("What is the input string? ");
        String string = input.nextLine();
        while (string.equals("")){
            System.out.println("Please enter a valid input!");
            System.out.print("What is the input string? ");
            string = input.nextLine();
        }
        return string;
    }
}
