public class NumbersRiddle{
    public static void main(String[] args){
        double startingNumber;
        int startingPosInt = 5;
        int startingNegInt = -5;
        int startingZero = 0;
        int startingOne = 1;
        double startingPosDouble = 5.5;
        double startingNegDouble = -5.5;

        startingNumber = startingOne;
        // Multiply by 2
        double numberDoubled = startingNumber * 2;
        
        System.out.println("Starting Number: " + startingNumber);
        System.out.println("Number Doubled: " + numberDoubled);

        // Add 6
        double addSix = numberDoubled + 6;
        System.out.println("Add 6: " + addSix);

        // Divide by 2
        double divideHalf = addSix / 2;
        System.out.println("Divide by 2: " + divideHalf);

        // Subtract Starting Number
        double subtractStarting = divideHalf - startingNumber;
        System.out.println("Subtract Starting Number: " + subtractStarting);
    }
}