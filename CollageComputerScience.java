package collagecomputerscience;
import java.util.Scanner;


public class CollageComputerScience {

    
    public static void main(String[] args){
        ListLevel k = new ListLevel();
        EnRolentCS b = new EnRolentCS();
        ListCourse n = new ListCourse();
        Student s = new Student();
        Depart de = new Depart();
        Level le = new Level();
        Scanner sc = new Scanner(System.in);
        //String addet;
        //de.getListGraduates();
        s.UpdateAddress("k");
        //System.out.println("Helloworld");
        
        System.out.println(le);
        System.out.println("Add information or Get information :");
                 String add = sc.nextLine();
        switch (add){
            case "Add":
                System.out.println("To Computer Science Select 1\nTo Information Technaloge 2\nTo Information System 3");
                System.out.println("Chose :");
                int x = sc.nextInt();
        switch (x) {
            case 1:
                k.BubbleSortListLevel();
                System.out.println(k);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
                System.out.println("Enter the Level :");
                int y = sc.nextInt();
                if(y==0)System.out.println("Level1");
                int ko = sc.nextInt();
                n.QuickSortListCourse();
                if(ko==0)System.out.println("Enter to lock avalibale course :"+n);
                System.out.println("Enter the date mm/dd/yyyy :"+b);
                String sd = sc.nextLine();
                //b.EnrollCourse();
                System.out.println("assign a note :");
                String l = sc.nextLine();
                //BufferedReader reader =  
                   //new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        //String name = reader.readLine(); 
  
        // Printing the read line 
        //System.out.println(name);   
        break;
            case "Get":
                System.out.println("getSucceessCourse for a students : ");
                String vn = sc.nextLine();
                
                
        }
        
            
        
      
    }
}
