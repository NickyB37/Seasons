import java.util.Scanner;


public class ifElse {

	public static void main(String[] args) {
		
		 Scanner scnr = new Scanner(System.in); 
	      String inputMonth;
	      int inputDay;
	      
	      
	  
	  
	  
	  System.out.println("Please enter a Month");
	  inputMonth = scnr.next();
	  
	  if(inputMonth.equals("January") ||inputMonth.equals("February")||inputMonth.equals("March")||inputMonth.equals("April")||inputMonth.equals("May")||inputMonth.equals("June")||inputMonth.equals("July")||inputMonth.equals("August")||inputMonth.equals("September")||inputMonth.equals("October")||inputMonth.equals("November")||inputMonth.equals("December")){
	     System.out.println(inputMonth);
	  }
	  else {
	     System.out.println("Invalid");
	  }
	  
	  System.out.println("Please enter a Day");
	  inputDay = scnr.nextInt();
	 
	   if( inputDay < 1 && inputDay > 31){
	      System.out.println("Invalid");
	   }
	   else{
	      System.out.println( inputDay );
	   }
	    if((inputMonth.equals("March"))  |((inputMonth.equals("April"))) |((inputMonth.equals("May"))) | ((inputMonth.equals("June"))) && ((inputDay >= 20))){
	       System.out.println("Spring");
	    }
	  else if((inputMonth.equals("June"))  |((inputMonth.equals("July"))) | ((inputMonth.equals("August"))) | ((inputMonth.equals("September")) && ((inputDay == 21)) | (inputDay <= 22))) {
	       System.out.println("Summer");
	    }
	  else if((inputMonth.equals("September"))  |((inputMonth.equals("October"))) | ((inputMonth.equals("November"))) | ((inputMonth.equals("December")) && ((inputDay >= 22)) | (inputDay <= 20))) {
	       System.out.println("Autumn");
	    }
	  else if((inputMonth.equals("December"))  | ((inputMonth.equals("January"))) | ((inputMonth.equals("February"))) | ((inputMonth.equals("March")) && ((inputDay >= 22)) | (inputDay <= 19))) {
	       System.out.println("Winter");
	  }
	}

}
