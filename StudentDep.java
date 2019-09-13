package collagecomputerscience;
import java.util.Objects;
import java.util.PriorityQueue;


   class StudentDep{
    //Deque<Integer> Student = new LinkedList<>();
    /*private final Queue<String>Student;
    private final Scanner in;
    public StudentDep(){
        Student = new LinkedList<>();
        in = new Scanner(System.in);*/
	   PriorityQueue<Student> S = new PriorityQueue<>();
    public StudentDep getStudentDep() {
    	S.add(new Student());
        return null;

    }

    public void SubscribeStudentDep(Student S) {
        S.Name = null;
        S.ID = 0;
        S.Address = null;
        S.LevelStudent = null;
       
    }

    public boolean RemoveStudentS() {
        //this.SubscribeStudentDep(rearStudent);
        return false;
    }

    public void sortListStudnetS() {
    }

}