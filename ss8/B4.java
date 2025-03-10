package ss8;

public class B4 {
	public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000);

        // ----------------- StringBuilder -----------------
        System.out.println("Testing with StringBuilder:");
        StringBuilder sb = new StringBuilder(initialString);

        // Đảo ngược chuỗi
        long start = System.nanoTime();
        sb.reverse();
        long end = System.nanoTime();
        System.out.println("StringBuilder - Reverse: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sb.insert(500000, "INSERTED_TEXT");
        end = System.nanoTime();
        System.out.println("StringBuilder - Insert: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sb.delete(400000, 400010);
        end = System.nanoTime();
        System.out.println("StringBuilder - Delete: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sb.replace(600000, 600010, "REPLACED_TEXT");
        end = System.nanoTime();
        System.out.println("StringBuilder - Replace: " + (end - start) / 1_000_000.0 + " ms");

        // ----------------- StringBuffer -----------------
        System.out.println("\nTesting with StringBuffer:");
        StringBuffer sbf = new StringBuffer(initialString);

        start = System.nanoTime();
        sbf.reverse();
        end = System.nanoTime();
        System.out.println("StringBuffer - Reverse: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sbf.insert(500000, "INSERTED_TEXT");
        end = System.nanoTime();
        System.out.println("StringBuffer - Insert: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sbf.delete(400000, 400010);
        end = System.nanoTime();
        System.out.println("StringBuffer - Delete: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        sbf.replace(600000, 600010, "REPLACED_TEXT");
        end = System.nanoTime();
        System.out.println("StringBuffer - Replace: " + (end - start) / 1_000_000.0 + " ms");
    }
}