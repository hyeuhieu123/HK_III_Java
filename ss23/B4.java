package ss23;

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}

class MessageThread extends Thread {
  
    public void run() {
        System.out.println();
       System.out.println( Thread.currentThread().getName()+" start");
    }
}

public class B4 {
    public static void main(String[] args) {
        Thread t1 = new NumberThread();
        Thread t2 = new MessageThread();
        Thread t3 = new MessageThread();
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        try {
            t1.join();
            t2.start();
            t3.start(); 
           
        } catch (Exception e) {
            // TODO: handle exception
        }
       
            
    }
}
