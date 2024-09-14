public class TypecastingAndOperators {
    public static void main(String[] args) {
        /*Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte*/
        int num = 10;
        double doubleNum = num; // Automatic casting
        System.out.println(doubleNum);

        short shortNum = (short)doubleNum;
        System.out.println(shortNum); //Manual casting
    }
}
