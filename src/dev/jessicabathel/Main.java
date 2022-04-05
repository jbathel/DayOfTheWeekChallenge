package dev.jessicabathel;

public class Main {

    public static void main(String[] args) {
        // Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("The day of the week is Monday");
                break;
            case 1:
                System.out.println("The day of the week is Tuesday");
                break;
            case 2:
                System.out.println("The day of the week is Wednesday");
                break;
            case 3:
                System.out.println("The day of the week is Thursday");
                break;
            case 4:
                System.out.println("The day of the week is Friday");
                break;
            case 5:
                System.out.println("The day of the week is Saturday");
                break;
            case 6:
                System.out.println("The day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}


