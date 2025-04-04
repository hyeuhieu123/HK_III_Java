package ss23;
class SharedData {
    private String message;
    private boolean hasMessage = false;

    public synchronized void writeMessage(String msg) {
        while (hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.message = msg;
        hasMessage = true;
        notify();
    }

    public synchronized String readMessage() {
        while (!hasMessage) {
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        hasMessage = false;
        notify();
        return message;
    }
}

class Writer extends Thread {
    private SharedData sharedData;
    public Writer(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    public void run() {
        sharedData.writeMessage("hello");
        System.out.println("writer sent");
    }
}

class Reader extends Thread {
    private SharedData sharedData;
    public Reader(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    public void run() {
        String msg = sharedData.readMessage();
        System.out.println("nhan dc tn " + msg);
    }
}

public class B5 {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Writer writer = new Writer(sharedData);
        Reader reader = new Reader(sharedData);
        
        reader.start();
        writer.start();
    }
}
