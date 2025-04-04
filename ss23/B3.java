package ss23;
class   SharedResource  extends Thread{ 
	
	public synchronized void printAlphabet(){
		
		for(char c ='a';c<= 'z';c++){
			try {
				System.out.print(c);
				Thread.sleep(300);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	
}
public class B3 {
	public static void main(String[] args) {
			SharedResource t1 =new SharedResource(); 
			SharedResource t2 =new SharedResource(); 
		
			t1.printAlphabet();
			t2.printAlphabet();
	}
}
