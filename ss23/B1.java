package ss23;

class MyThread extends Thread{
	@Override
	public void run(){
		System.out.println("thread dang chay "+Thread.currentThread().getName());
	}
}
public class B1 {
	public static void main(String[] args) {
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		t1.setName("hieu");
		t2.setName("trung");
		t1.start();
		t2.start();
		
		
	}
}
