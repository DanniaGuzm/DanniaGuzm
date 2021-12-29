package forLoopHw;

public class WhileHomeWork {
	
	public static void main (String[] args) {
		
		int d = 0;
		
		while ( d <= 36) {
			d++;
			
			if ( d % 3 == 0 && d % 7 == 0) {
				System.out.println("CozaLoza");
				
			
			}else if ( d % 3 == 0) {
		    	System.out.println("Coza");
		    	
			}else if ( d % 5 == 0) {
				System.out.println("Loza");
				
				
				
			}else if (d % 7 == 0) {
			    System.out.println("Woza");
			    
		    
		    	
		    }else
		    	System.out.println(d);
				
				
			}
		}
	}


