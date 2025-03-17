package B4;


public class Main {
    public static void main(String[] args) {
        Electronic[] electronics = new Electronic[2];

        electronics[0] = new TV();
        electronics[1] = new Radio();

        // tv on of

        for (int i = 0; i<electronics.length-1;i++) {
            electronics[i].turnOn();
            electronics[i].turnOff();
        }

        for (int i = 1; i<electronics.length;i++) {
            electronics[i].turnOn();
            electronics[i].turnOff();
        }

    }
}
