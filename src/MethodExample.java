public class MethodExample {
    int year;
    String model;

    public MethodExample(int y, String m){
        this.year = y;
        this.model = m;
    }

    public static void main(String[] args) {
        MethodExample example = new MethodExample(1991,"Manju");
        System.out.println(example.year + " " + example.model);
    }
}
