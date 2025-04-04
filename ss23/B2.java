package ss23;
class MyRunable implements Runnable{

	@Override
	public void run() {
		for(int i = 1 ; i<=10;i++){
			System.out.println(i);
		}
	}
	
}
public class B2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunable());
		t1.start();
	}
}
