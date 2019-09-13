package collagecomputerscience;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Scanner;

public class EnRolentCS {

    public Student S;

    public String Universityear;

    public int semester;

    public Hashtable Mark;

    public boolean Success;

    public Course C;

    public ListCourse getSuccessCourse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

     void EnrollCourse(Course C,Date S) { 
         C.CRN = 0;
         C.ContactH = 0;
         C.CreditH = 0 ;
         C.Name = null;
         S.setDate(semester);
         S.setMonth(semester);
         S.setYear(semester);
         try(Scanner kb = new Scanner(System.in)) {
            SimpleDateFormat sdf = new SimpleDateFormat("01/01/2019");
            sdf.setLenient(false);
            System.out.println("Please enter a date (mm/dd/yyyy)"+S);
            String uDate = kb.nextLine();
            try{
                sdf.parse(uDate);
                System.out.println(uDate+" is a valid Date");
            }
            catch(ParseException e)
            {
                System.out.println(uDate+" is not a valid Date");
            }
        }
     }
              
    

    public void AddMarktoCourse(boolean mark) {
    	
    	if(mark < 90) {
    		
    	}
    }

    public boolean checkifSuccess(Course C) {
        C.CRN = 0;
        C.Name = null;
        int Sec;
        if(Sec == 90) {
        	
        }
    }
}
