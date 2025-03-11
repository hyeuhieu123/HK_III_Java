public class B2 {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("chuoi ban dau " + sb.toString());
        sb.delete(5, 9);
        System.out.println("choi sau khi xoa  " + sb.toString());
        sb.replace(5,13 ," Universe");
        System.out.println("chuoi sau khi thay " + sb.toString());
    }
}
