import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        //Array of string
        String[] cars = {"Volvo","BMW","Lexus"};
        //Array of integer
        int[] numbers = {1,2,3,4,5};

        //Access the array elements using index number, index starting from zero
        System.out.println(cars[0]); //Volvo
        cars[0] = "Prado"; // changing an element
        System.out.println(cars); // this will give memory address only
        System.out.println(Arrays.toString(cars)); //give actual elements of the array

        //also give elements of the array by looping, use the length property to specify how many times the loop should run
        for(int i = 0; i<cars.length;i++){
            System.out.println(cars[i]);
        }
        //for-each
        //used exclusively to loop through elements in arrays
        for(String i: cars){
            System.out.println(i);
        }

        //array length
        System.out.println(cars.length);

    }
}
