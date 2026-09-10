public class NumbersRiddle{
    public static void main(String[] args){
        int startingNumber = 5;
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