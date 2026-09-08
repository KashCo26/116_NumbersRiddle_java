public class NumbersRiddle{
    public static void main(String[] args){
        int startingNumber = 5;
        double numberDoubled = startingNumber * 2;
        
        System.out.println("Starting Number: " + startingNumber);
        System.out.println("Number Doubled: " + numberDoubled);

        double addSix = numberDoubled + 6;
        System.out.println("Add 6: " + addSix);

        double divideHalf = addSix / 2;
        System.out.println("Divide by 2: " + divideHalf);
    }
}