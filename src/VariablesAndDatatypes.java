public class VariablesAndDatatypes {
    //instance variable
    public String name;
    public int number;
    //constructor
    public VariablesAndDatatypes(){
        //initializing the variables
        this.name = "Manjusha";
        this.number = 100;
    }
    public static void main(String[] args) {
        //local variable
        int var = 10;
        System.out.println("Local variable " + var);
        //creating object for VariablesAndDatatypes class
        VariablesAndDatatypes obj1 = new VariablesAndDatatypes();
        //displaying name
        System.out.println("Instant variable Name: "+obj1.name);
        System.out.println("Instant variable Number is: "+ obj1.number);
        //area of  a rectangle
        float length = 4.5f;
        float width = 5.2f;
        float area = length * width;
        System.out.println("Area of triangle is: " + area);

        //student record
        String studentName = "Bharath";
        char division = 'D';
        int studentAge = 5;
        float studentMark = 98.2f;
        boolean isOTStudent = false;
        System.out.println("Student info-> " + "student name: " + studentName +
                ", division: "+ division +
                ", age: " + studentAge +
                ", mark: "+studentMark +
                ", OT student: " + isOTStudent);

        //Integer type
        //-128 to 127
        byte byteNum = 100;
        // -32768 to 32767
        short shortNum = 5000;
        // -2147483648 to 2147483647
        int intNum = 10000;
        //-9223372036854775808 to 9223372036854775807
        long lotNum = 15000000000L;


        //floating point type
        float floatNum = 5.2f;
        double doubleNum = 5.234d;

        //boolean type
        boolean isTrue = false;

        //char type
        char myGrade = 'B';
        //also used to store ASCII values
        char value = 65; // A
        System.out.println(value);

        //String
        String greeting = "Good Morning";
    }
}
