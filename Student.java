package collagecomputerscience;


import java.util.Scanner;



public class Student {
Scanner sc = new Scanner(System.in);
   

    public String Name;

    public int ID;

    public String Address;

    public Student Next;

    public ListLevel LevelStudent;


    
    Student getStudentInfo(Student ID) {
    ID.ID = 0;
    ID.Name = null;
    ID.LevelStudent = null;
    ID.Address = null;
    
    return null;
        
    }
        
    

    Student getStudnetByName(Student Name) {
        
    return null;
    }

    public int getID() {
    	LevelStudent.getLevel(ID);
        return ID;
    }
    public void setID(int id){
        this.ID = id;
    }

    public String getName() {
        return Name;
        
    }

    public void SetName(String name) {
        this.Name = name;
    }

    public boolean UpdateAddress(String address) {
      this.Address = address ;
      if(address == null ? Address == null : address.equals(Address)){
       this.Address.equals(this.getName());
      }
        return true;
    
    }
   
  }
 
   
    

