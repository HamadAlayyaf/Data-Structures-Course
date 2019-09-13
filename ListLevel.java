package collagecomputerscience;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListLevel {
    Scanner sc = new Scanner(System.in);
    Student S = new Student();
    ListCourse get = new ListCourse();
    public Level head;
   
    

    public Level getLevel(int ID) {
    	S.ID = ID;
        //S.setID(ID);
        
        return null;
    }

    public void BubbleSortListLevel() {
        
        int[]ID = {1,2,3,4,5,6,7,8};
        if(ID==null || ID.length==0)
            return;
        
        int size = ID.length;
        for (int i = 0; i <size-1 ; i++) {
            for (int j = 0; j <size-i-1 ; j++) {
                //check the adjacent elements
                if(ID[j]>ID[j+1]){
                    //swap the elements
                    int temp = ID[j];
                    ID[j] = ID[j+1];
                    ID[j+1] = temp;
                }
            }
}
        String i = null;
        switch (i){
            case "1":
                get.QuickSortListCourse();
                System.out.println("the course of level 4 :"+get);
        }
        System.out.println(Arrays.toString(ID));
    }

    void CS(){
        String show,show1;
        String [] sub1 ={};
        String [] sub2 ={};
        String [] sub3 ={};
        String [] sub4 ={};
        String [] sub5 ={};
        String [] sub6 ={};
        String [] sub7 ={};
        String [] sub8 ={};
        String [] option ={"add","remove"};
        String [] listl = {"Level 1","Level 2","Level 3","Level 4","Level 5","Level 6","Level 7","Level 8"};
           System.out.println("Choice the Level : "+Arrays.toString(listl));
           show = sc.nextLine();
           while (!show.equals("quit")) {
               String add;
               switch(show){
                   case "Level 1":
                       System.out.println("Subjects : "+Arrays.toString(sub1));
                       show = sc.nextLine();
                        System.out.println("Option : "+Arrays.toString(option));
                       show = sc.nextLine();
                       switch(show){
                           case "add":
                               System.out.println("Good");
                            break;   
                       }
                       case "Level 2":
                       System.out.println("Subjects : "+Arrays.toString(sub2));
                       show = sc.nextLine();
                        System.out.println("Option : "+Arrays.toString(option));
                       show = sc.nextLine();
                       switch(show){
                           case "add":
                               System.out.println("Good");
                      break;
               }
                       case "Level 3":
                       System.out.println("Subjects : "+Arrays.toString(sub3));
                       show = sc.nextLine();
                        System.out.println("Option : "+Arrays.toString(option));
                       show = sc.nextLine();
                       switch(show){
                           case "add":
                               System.out.println("Good");
                               break;
           }
                       case "Level 4":
                       System.out.println("Subjects : "+Arrays.toString(sub4));
                       show = sc.nextLine();
                        System.out.println("Option : "+Arrays.toString(option));
                       show = sc.nextLine();
                       switch(show){
                           case "add":
                               System.out.println("Good");
                               break;
    }
                       case "Level 5":
                       System.out.println("Subjects : "+Arrays.toString(sub5));
                       show = sc.nextLine();
                        System.out.println("Option : "+Arrays.toString(option));
                       show = sc.nextLine();
                       switch(show){
                           case "add":
                               System.out.println("Good");
                       }
                       case "Level 6":
                       System.out.println("Subjects : "+Arrays.toString(sub6));
                       show = sc.nextLine();
                        System.out.println("Option : "+Arrays.toString(option));
                       show = sc.nextLine();
                       switch(show){
                           case "add":
                               System.out.println("Good");
                       }
                       case "Level 7":
                      System.out.println("Subjects : "+Arrays.toString(sub7));
                       show = sc.nextLine();
                        System.out.println("Option : "+Arrays.toString(option));
                       show = sc.nextLine();
                       switch(show){
                           case "add":
                               System.out.println("Good");
                       }
                       case "Level 8":
                       System.out.println("Subjects : "+Arrays.toString(sub8));
                       show = sc.nextLine();
                        System.out.println("Option : "+Arrays.toString(option));
                       show = sc.nextLine();
                       switch(show){
                           case "add":
                               System.out.println("Good");
                       }
                       
               }
           }
    }
}
