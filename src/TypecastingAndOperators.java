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

        //Arithmetic operator
        int x = 5;
        int y = 4;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        ++x; //Increases the value of a variable by 1
        System.out.println(x);
        --x; //Decreases the value of a variable by 1
        System.out.println(x);
        x +=5; // addition assignment
        System.out.println(x);
        System.out.println(x > y); //comparison operator, returns boolean
        System.out.println(x);
        System.out.println(x<12 || x==10); //logical operator

    }
}
