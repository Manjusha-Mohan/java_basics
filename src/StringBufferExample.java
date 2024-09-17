public class StringBufferExample {
    private static StringBuffer buffer = new StringBuffer();
    public static void main(String[] args) {
        Runnable task = ()->{
            for(int i=0;i<10;i++){
                buffer.append(i);
            }
            System.out.println(buffer);
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

    }
}
