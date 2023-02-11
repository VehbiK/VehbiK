package VehbiKaranfil;

import java.util.Arrays;

public class LoopingThroughAMDArray {

	
	public static void main(String[] args) {
		
	
	
     	String[][] countries = { 
            {"Canada", "Vancouver", "Calgary", "Edmonton", "Ottawa", "Quebec City"},
            {"The USA", "New York City", "Los Angeles", "Chicago", "Houston", "Phoenix"},
            {"Mexico", "Mexico City", "Ecatepec", "Guadalajara", "Puebla", "Tijuana"}
     	};
     	
       	for (int i= 0; i<countries.length; i++) {	
     	System.out.println( Arrays.toString ( countries[i] ) );
       	}
       	
       	System.out.println();
     	
     	
     	
     	for(int i=0; i<countries.length; i++) {
     		String [] country = countries [i];
     		
     		for (int j=0; j< country.length; j++) {
     			System.out.print(country[j] + " ");
     			
     		}
     		System.out.println();
     		
     		
     		
     		
     	}
	
	
}
}
	