package forLoopHw;

public class HomeWorkForLoop {
	
public void main(String[] args) {
		
		
		
	for (int i = 3; i<= 36; i++) {
		if (i % 3 == 0 && i % 5 == 0) {
		
		System.out.println("CozaLoza");
		
		}else if ( i % 3 ==0) {
			System.out.println("coza");
		
			
		} else if ( i % 5 ==0) {
			System.out.println("Loza");
			
			
		}else if (i % 7 ==0) {
			System.out.println("Wosa");
			
		
		
		}else
			System.out.println(i);
		

}
}
}
