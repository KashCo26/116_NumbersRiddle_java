public class NumbersRiddleBetter{
    public static void main(String[] args){
        double startingNumber;
        int startingPosInt = 5;
        int startingNegInt = -5;
        int startingZero = 0;
        int startingOne = 1;
        double startingPosDouble = 5.5;
        double startingNegDouble = -5.5;

        startingNumber = startingNegDouble;
        // Add 1.5
        double numberAdded = startingNumber + 1.5;
        
        System.out.println("Starting Number: " + startingNumber);
        System.out.println("Number Added: " + numberAdded);

        // Add 6
        double numberDoubled = numberAdded * 2;
        System.out.println("Multiplied by 2: " + numberDoubled);

        // Subtract Starting Number
        double subtractStartingTwice = numberDoubled - 2*startingNumber;
        System.out.println("Subtract Starting Number Twice: " + subtractStartingTwice);

        // Add 9    
        double addNine = subtractStartingTwice + 9;
        System.out.println("Add 9: " + addNine);

        // Divide by 4
        double divideFour = addNine / 4;
        System.out.println("Divide by 4: " + divideFour);
    }
}