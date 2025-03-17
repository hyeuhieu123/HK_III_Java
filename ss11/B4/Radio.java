package B4;


public class Radio implements Electronic{

    @Override
    public void turnOn(){
        System.out.println("turning on radio .......");
    }

    @Override
    public void turnOff(){
        System.out.println("turning off radio ......");
    }
}