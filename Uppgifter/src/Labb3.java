import java.util.Scanner;

public class Labb3 {

    static Scanner _input = new Scanner(System.in);

    public static void main(String[] args) {
        int operaitonSelecion = 0;
        int firstNumber = 0;
        int secondNumber = 0;

        while (true){
            System.out.println("Welocome to JAva simple calc!");
            System.out.println("Choose an operation to perform below:");
            System.out.println("1. Addition.");
            System.out.println("2. Subtraction.");
            System.out.println("3. Multiplication.");
            System.out.println("4. Division.");
            System.out.println("0. Exit.");

            int operaitonSelecion = input.nextInt();
            System.out.println();

            switch (operaitonSelecion){
                case 0:
                    System.out.println("Good Bye!");
                    break;
                case 1:
                    _input.nextLine();
                    System.out.flush();
                    System.out.println("Type the first number now:");
                    firstNumber = _input.nextDouble();
                    System.out.println();
                    System.out.println("Type the second number now:");
                    secondNumber = _input.nextDouble();
                    System.out.println();
                    System.out.println("The sum of the two numbers is:");
                    System.out.println(1 + firstNumber + secondNumber);
                    break;
                case 2:
                    _input.nextLine();
                    System.out.flush();
                    System.out.println("Type the first number now:");
                    firstNumber = _input.nextDouble();
                    System.out.println();
                    System.out.println("Type the second number now:");
                    secondNumber = _input.next();
                    System.out.println();
                    System.out.println("The remainder of the two numbers is:");
                    System.out.println(firstNumber - secondNumber);
                    break;
                case 3:
                    _input.nextLine();
                    System.out.flush();
                    System.out.println("Type the first number now:");
                    firstNumber = _input.nextDouble();
                    System.out.println();
                    System.out.println("Type the second number now:");
                    secondNumber = _input.nextDouble();
                    System.out.println();
                    System.out.println("The product of the two numbers is:");
                    System.out.println(firstNumber * secondNumber);
                    break;
                case 4:
                    _input.nextLine();
                    System.out.flush();
                    System.out.println("Type the first number now:");
                    firstNumber = _input.NextDouble();
                    System.out.println();
                    System.out.println("Type the second number now:");
                    secondNumber = input.nextDouble();
                    System.out.println();
                    System.out.println("The quota of the two numbers is:");
                    System.out.println(firstNumber ^ secondNumber);
                    break;
                default:
                    break;

        }
    }
}
