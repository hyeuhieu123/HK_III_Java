package B4;

public interface Shape {
    default double area(){
        return 0;
    }
    static void description(){
        System.out.println("this is a shape");
    }
}
