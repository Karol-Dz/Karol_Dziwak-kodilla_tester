import java.util.Scanner;

public class Colour {

    public static char takeTheFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first letter of the colour: ");
        String input = scanner.nextLine().trim();

        return input.toLowerCase().charAt(0);
    }

    public String chooseColour(char letter) {
        String colour;

        switch (letter) {
            case 'r':
                colour = "red";
                break;
            case 'g':
                colour = "green";
                break;
            case 'b':
                colour = "blue";
                break;
            case 'o':
                colour = "orange";
                break;
            case 'v':
                colour = "violet";
                break;
            case 'w':
                colour = "white";
                break;
            case 'p':
                colour = "pink";
                break;
            case 'y':
                colour = "yellow";
                break;
            default:
                colour = "Unknown colour";
        }

        return colour;
    }

    public static void main(String[] args) {
        char letterColour = takeTheFirstLetter();
        Colour colour = new Colour();

        String result = colour.chooseColour(letterColour);
        System.out.println("The selected colour is: " + result);
    }
}

