import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.prefs.Preferences;

public class Main {

    public static void main(String[] args){
        System.out.println("Hi");
        basicVariables();
        referenceVariables();
        controlFlow();
        divideTest();
    }
    public static void basicVariables(){
        int credit = 123_456;
        Date today = new Date();
        System.out.println(today);
        System.out.println(today.getTime());
        String message = "Let's learn some Java!";
        System.out.println(message);
    }

    public static void referenceVariables(){
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[5] = 11;
        System.out.println(Arrays.toString(numbers));
    }

    public static void casting(){
        String x = "1";
        int y = Integer.parseInt(x);
        System.out.println(y);
    }

    public static void controlFlow(){
        int x = 1;
        int y = 1;
        System.out.println(x==y);
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println("Is it warm?: " + isWarm);
        temperature = 45;
        if (temperature > 30) {
            System.out.println("It's a hot day today!");
        }
        int income = 120_000;
        String passengerType = income > 100_000 ? "First" : "Economy";
        System.out.println("We've got a " + passengerType + " class passenger");

    }

    public static void divideTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number =scanner.nextInt();

        if (number % 5 == 0 && number % 3 ==0){
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0)
            System.out.println("Buzz");
        else if (number % 3 == 0)
            System.out.println("Fizz");
        else
            System.out.println(number);
    }




}
