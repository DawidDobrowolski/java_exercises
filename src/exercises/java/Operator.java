package exercises.java;

public class Operator {

    public static void main(String[] args) {

        boolean test = false;

        if (test)
            System.out.println("test is false");
        System.out.println("test");  // out of if

        if (test) {
            System.out.println("test is false");
            System.out.println("test");
        }


        int guessNumber = 9;
        if(guessNumber == 10){
            System.out.println("you win");
        }else if(guessNumber > 10){
            System.out.println("too big number");
        }else{
            System.out.println("too low number");
        }

        boolean boolean1 = true;
        boolean boolean2 = true;
        boolean boolean3 = false;
        boolean boolean4 = false;


        // and

        boolean andOp = boolean1 && boolean2 ? true: false;
        System.out.println(andOp);  // true

        andOp = boolean1 && boolean4 ? true: false;
        System.out.println(andOp);  // false

        andOp = boolean3 && boolean4 ? true: false;
        System.out.println(andOp);  // false


        // or

        boolean orOp = boolean1 || boolean2 ? true: false;
        System.out.println(orOp);  // true

        orOp = boolean1 || boolean4 ? true: false;
        System.out.println(orOp); // true

        orOp = boolean3 || boolean4 ? true: false;
        System.out.println(orOp);  // false


        // xor

        boolean xorOp = boolean1 ^ boolean2 ? true: false;
        System.out.println(xorOp);  // false

        xorOp = boolean1 ^ boolean4 ? true: false;
        System.out.println(xorOp);  // true

        xorOp = boolean3 ^ boolean4 ? true: false;
        System.out.println(xorOp);  // false


    }
}
