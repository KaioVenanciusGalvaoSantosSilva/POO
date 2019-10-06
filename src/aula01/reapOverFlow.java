package aula01;

public class reapOverFlow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int [][] principal = new int [5000][];
		
		
		for (int i = 0; i < 50000; i++) {
			int [] temp = new int [100000000];
			principal[i] = temp;
			
			System.out.println(i);
			Thread.sleep(1);
		}
	}
}