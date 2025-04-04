package ss23.B6;

public class Main {
    public static void main(String[] args) {
        Priority thread1 = new Priority("Thread 1 (MIN)");
        Priority thread2 = new Priority("Thread 2 (NORM)");
        Priority thread3 = new Priority("Thread 3 (MAX)");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    /*
		- muc do uu tien ko dam bao theo thu tu thuc hien
		- muc do priotiry chi dua ra goi y cho lap trinh cua he dieu hanh, ko bat buoc java phai chay theo luong dung thu tu uu tien
    */
}