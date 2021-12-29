package forLoopHw;

public class DoWhileHomeWork {
	
	public static void main(String[] args) {
		
		int f = 3;
		
		do { 
			System.out.println(f);
			f++;
			
		 }while (f <= 36);
		
		if ( f % 3 == 0 && f % 7 == 0) {
			System.out.println("CozaLoza");
			
		
		}else if ( f % 3 == 0) {
	    	System.out.println("Coza");
	    	
		}else if ( f % 5 == 0) {
			System.out.println("Loza");
			
			
			
		}else if (f % 7 == 0) {
		    System.out.println("Woza");
		    
	    
	    	
	    }else
	    	System.out.println(f);
		
		
		
		
	}

}
