public class B6 {
    public static void main(String [] args){
        String str1 = "hello";
        long start, end;
        start = System.currentTimeMillis();
        for(int i = 0 ;i<1000000;i++){
            str1 +="world";
        }
        end = System.currentTimeMillis();
        System.out.println("string "+ (end-start) + " ms");

        StringBuilder sb = new StringBuilder("hello");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("world");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start) + " ms");

        // test với StringBuffer
        StringBuffer sbf = new StringBuffer("hello");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            sbf.append("world");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start) + " ms");

        // lấy start time trước khi làm sau đó chạy xong thì lấy end time trừ đi start time
    }
}
