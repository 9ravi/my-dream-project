package pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Student {

    int rollno=1100001,max=11000010;
    String name;
    String course;
    double fee;
    boolean gender;
    int dob;
    String qualification;
    Student students[]=new Student[5];
    Student st;
	
    public Student(int rno, String sname, String course, double fee, boolean gen, int dob, String qual)
             {
        rollno = rno;
        name = sname;
        this.course = course;
        this.fee = fee;
        gender = gen;
        this.dob = dob;
        qualification = qual;
        
             }

  public Student registerStudent() throws IOException {
		while(rollno<=max)
		{
			InputStreamReader isr=new InputStreamReader(System.in);
	        BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter student Roll Number   :"+rollno);
		System.out.print("Enter student Name          :");
		name=br.readLine();
		System.out.print("Enter student Course        :");
		course=br.readLine();
		System.out.print("Enter student Fee           :");
		fee=Double.parseDouble(br.readLine());
		System.out.print("Enter student Gender        :");
	    gender=Boolean.parseBoolean(br.readLine());
		System.out.print("Enter student Dob           :");
		dob=Integer.parseInt(br.readLine());
		System.out.print("Enter student Qualification :");
		qualification=br.readLine();
		rollno++;
		}
		return st;
    }
	 public void maxStudents(int max)throws IOException{
	        for(int i=0;i<max;i++){
	            students[i]=registerStudent();
	        }
	    }
	 public Student(int rollNo, String name){
	        this.rollno=rollNo;
	        this.name=name;
	    }
	    
	    public Student(int rno, String sname, String course2, int fee2, String string, int dob2, String qual) {
		// TODO Auto-generated constructor stub
	}

		public void displayAll(int max){
	        for(int i=0;i<max;i++){
	            students[i].displayDetails();
	        }
	    }
    	
public void displayDetails() {
	System.out.println("Roll Number  :"+rollno);
	System.out.println("Name         :"+name);
	System.out.println("Course       :"+course);
	System.out.println("Fee          :"+fee);
	System.out.println("Gender       :"+gender);
	System.out.println("Dob          :"+dob);
	System.out.println("Qualification:"+qualification);
}


	public static void main(String args[]) throws IOException{
		// TODO Auto-generated method stub
		Student st=new Student(1100001,"Bhargavi","CSE",12000,"f",13,"btech");
		st.registerStudent();
        st.displayDetails();
	}

}
