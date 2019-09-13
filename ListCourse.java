package collagecomputerscience;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class ListCourse {
	//ListLevel get = new ListLevel();
    LinkedList<Course> Course= new LinkedList<>();
    Scanner sc = new Scanner(System.in);
     Course head ;
     
     
    
     
    //ArrayList<String> CSsub4 = new ArrayList<String>();
    public void QuickSortListCourse() {
		Course.sort(null);
    }

    public ListCourse getEnrolmentCourse() {
       Course.add(Course.size(), null);
       return null;
    }

    public ListCourse getDeletedCourse() {
    	Course.remove(Course.size());
        return null;
        
    }

    
   
}
