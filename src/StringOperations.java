public class StringOperations {
    private int count = 0;
    public void increment(){
        count ++;
    }
    public int getCount(){
        return count;
    }
    public synchronized void increment1(){
        count++;
    }
    public synchronized int getCount1(){
        return count;
    }
    public static void main(String[] args) {
        String str = "Hello world!"; //String literal stores in string pool
        String str1 = new String("Hi"); //new keyword-stores in heap

        int len = str.length();
        System.out.println("length of the string: "+len);

        char ch = str.charAt(0);
        System.out.println("Character at zeroth index: " + ch);

        String subStr = str.substring(0,5);
        System.out.println(subStr);

        boolean isEqual = str.equals("Hello");
        System.out.println(isEqual);
        System.out.println("---------literal, new keyword----------");
        String s1 = "abc";
        String s2 = "abc";
        if(s1 == s2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String s3 = new String("abc");
        String s4 = new String("abc");
        if(s3 == s4){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        System.out.println("---------String Buffer----------");
        StringBuffer sb = new StringBuffer();
        sb.append("Hello world! ");
        sb.append("I am learning java");
        System.out.println(sb);

        sb.insert(0,"Hi,");
        System.out.println(sb);
        sb.replace(0,3,"Hey,");
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        int cap = sb.capacity();
        System.out.println(cap);

        StringOperations so = new StringOperations();
        //so.increment();
        //so.increment();
        //Single-Threaded Example: In this example, the increment() method is called twice, so the count should be 2.
        System.out.println("Count: " + so.getCount()); //2

        //multithreading
        Thread t1 = new Thread(() -> {
            for(int i =0; i<1000; i++){
               // so.increment();
                so.increment1();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0;i<1000; i++){
               // so.increment();
                so.increment1();
            }
        });

        t1.start();
        t2.start();
        // Wait for both threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Call getCount() method
       // System.out.println("Count: " + so.getCount());
        System.out.println("Count: " + so.getCount1());

        //two threads are created (t1 and t2). Each thread calls the increment() method 1000 times.
        //Ideally, if both threads successfully incremented the counter 1000 times each, the total should be 2000.
        //However, since the Counter class is not thread-safe, the final output might be less than 2000
        //because of race conditions where multiple threads modify the count variable simultaneously.

        //making the counter class thread safe

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder.append(i);
        }
        System.out.println(builder.length());

        String result = "";
        for (int i = 0; i < 10; i++) {
            result += i; // Creates many temporary objects leading to inefficiency
            System.out.println(result);
        }
        System.out.println("-----------------");
        StringBuilder builder1 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            builder1.append(i); // Efficient and fast
            System.out.println(builder1);
        }

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            buffer.append(i); // Thread-safe but slower than StringBuilder
            System.out.println(buffer);
        }
    }

}
