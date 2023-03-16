import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepGoing = true;
        double radie = 0;

        while (keepGoing) {
            try {
                System.out.print("Ange sfärens radie: ");
                radie = Double.parseDouble(input.nextLine());
                if (radie <= 0) {
                    System.out.println("Radien måste vara > 0.");
                } else {
                    keepGoing = false;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Du måste ange ett tal.");
            }
        }

        double volume = (4 * Math.PI * radie * radie * radie) / 3;
        double area = 4 * Math.PI * radie * radie;

        System.out.println("En sfär med radien " + radie + " har:");
        System.out.println("Volymen: " + volume);
        System.out.println("Arean: " + area);
    }
}