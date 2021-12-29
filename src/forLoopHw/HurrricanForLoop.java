package forLoopHw;

public class HurrricanForLoop {
	
	public static void main(String[] args) {
		
		
		
		for( int windSpeed = 170; windSpeed <= 200; windSpeed = windSpeed ++) {
		
	
			System.out.println(windSpeed);
			
		
		if ( windSpeed >= 74 || windSpeed <= 95) {
			System.out.println("Category 1");
			
		}else if ( windSpeed >= 105 && windSpeed <= 110) {
		    System.out.println("Category 2");
		    break;
		    
		    
	    }else if ( windSpeed >= 120 && windSpeed <= 130) {
	        System.out.println("Category 3");
	        break;
	        
        
        }else if ( windSpeed >= 140 && windSpeed <= 155) {
            System.out.println("Categroy 4");
            break;
            
        }else if ( windSpeed >= 165 && windSpeed <= 194) {
        	System.out.println("Categroy 5");
        	break;
        	
        	
        }else {
        	System.out.println( "windSpeed");
        	break;
        	
	        
        }
		}
	}
			
}	
	

	
