
package MainPackage;

import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.IllegalFormatException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonException extends Exception {
	private static final String str = "12345678";
    
	 public static void main(String[] args) 
	    {
		 try{
			 	//
	            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyy");
	            Date DOB = sdf.parse("10-12-2116");
	            Date currentDate = sdf.parse("10-12-2015");
	            
	           
	            if(DOB.after(currentDate)){
	                System.out.println("The DOB given is more than 100 years older than the current date");
	            }
	            

	        }catch(Exception ex){
	            ex.printStackTrace();
	        }
	    }
		 	

	 
	 }