
package Java_Program;

import java.util.Scanner;
public class If_Loop {
	
   public static void main (String []args ) {
	   
	   Scanner scanner = new Scanner (System.in);
	   
	   System.out.println("please enter which is the current weather [summer , winter . rainy , spring]");
	   
	    String weather = scanner.nextLine();
	    System.out.println("you enterd the season as  " + weather);
	    
	    if(weather.equalsIgnoreCase("summer")) {
	    	
	    	System.out.println("Dressing for summer requires choosing clothing that keeps you cool, comfortable, and stylish while protecting you from the heat");
	    }
	    
	    else if (weather.equalsIgnoreCase("rainy")) {
	    		System.out.println("Dressing for rainy weather requires choosing clothing and accessories that keep you dry and comfortable while being stylish");
	    	}
	    else if (weather.equalsIgnoreCase("winter")) {
	    	System.out.println("Dressing for winter involves layering to stay warm while still looking stylish");
	    }
	    else if (weather.equalsIgnoreCase("spring")) {
	    	System.out.println("Spring dressing is all about transitioning from the colder months to warmer weather, while embracing lighter layers, fresh colors, and floral patterns.");
	    }
	    else {
	    	System.out.println("you entered wrong thing please enter from the given season");
	    }
	    	
	    }

	   
   }
