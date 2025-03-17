package ss11.ss4;
public class TV implements Electronic {

    @Override
    public void turnOn() {
        System.out.println("turning on tv ......");
    }

    @Override
    public void turnOff(){
        System.out.println("turning off tv ......");
    }
}