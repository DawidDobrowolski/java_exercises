package exercises.java;

public class Method {


    public static void main(String[] args) {

        // basic exercise1

        int number = 10;
        int sign = numberSign(number);
        printResult(sign);

        printResult(numberSign(-10));
        printResult(numberSign(0));

        // basic exercise2

        kmToMiles(1);
        kmToMiles(2384239432432L);

        // basic exercise3

        System.out.println(dogBarking(true,5));
        System.out.println(dogBarking(true,-1));
        System.out.println(dogBarking(false,1));

    }

    // basic exercise1

    public static int numberSign(int number) {
        if (number > 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void printResult(int sign) {
        String message;
        switch (sign) {
            case -1:
                message = "number is below 0";
                break;
            case 1:
                message = "number is above 0";
                break;
            default:
                message = "number is equal to 0";
        }
        System.out.println(message);
    }

    // basic exercise2

    public static void kmToMiles(long km) {
        double miles = Math.round((km * 0.621371192d) * 100) / 100d;
        System.out.println(km + " km = " + miles + " miles");
    }


    // basic exercise3

    public static boolean dogBarking(boolean isBarking, int hour) {
        if ((hour >= 0 && hour < 8) || (hour > 22 && hour < 25)) {
            if (isBarking) {
                return true;
            } else {
                return false;
            }
        } else if (hour >= 8 && hour <= 22) {
            return false;
        } else {
            System.out.println("Wrong hour of day");
            return false;
        }
    }
}
