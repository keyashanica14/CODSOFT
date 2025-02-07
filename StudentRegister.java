import java.util.*;

class Course{
	public int c_code , c_capacity , c_enrolled;
	public String c_title , c_description , c_schedule;

	public void Java(){	
		c_code = 2025001;
		c_title= "JAVA PROGRAMMING";
		c_description = "BASICS TO ADVANCED PROGRAMMING IN JAVA LANGUAGE.";
		c_capacity = 20;
		c_enrolled= 20;
		c_schedule = "MONDAY & FRIDAY 6-7PM";
		if (c_enrolled < c_capacity){
			System.out.println();
			System.out.println("THIS COURSE IS AVAILABLE");
			System.out.println();
			System.out.println("COURSE CODE : "+c_code+"\n"+"COURSE TITLE : "+c_title+"\n"+"DESCRIPTION : "+c_description+"\n"+"CAPACITY :"+c_capacity+"\n"+"SCHEDULE : "+ c_schedule);
			
		}
		else {
			System.out.println("THIS COURSE IS ENROLLED COMPLETELY");
		}
	}
	
	public void Python(){

		c_code = 2025002;
		c_title= "PYTHON PROGRAMMING";
		c_description = "BASICS TO ADVANCED PROGRAMMING IN PYTHON LANGUAGE.";
		c_capacity = 30;
		c_enrolled=15;
		c_schedule = "TUESDAY & SATURDAY 6-7PM";
		if (c_capacity > c_enrolled){
			System.out.println();
			System.out.println("THIS COURSE IS AVAILABLE");
			System.out.println();
			System.out.println("COURSE CODE : "+c_code+"\n"+"COURSE TITLE : "+c_title+"\n"+"DESCRIPTION : "+c_description+"\n"+"CAPACITY :"+c_capacity+"\n"+"SCHEDULE : "+ c_schedule);

		}
		else 
			System.out.println("THIS COURSE IS ENROLLED COMPLETELY");
	}

	public void Webdevelopment(){

		c_code = 2025003;
		c_title= "WEB DEVELOPMENT";
		c_description = "COMPLETE WEB DEVELOPMENT GUIDE.";
		c_capacity = 20;
		c_enrolled=15;
		c_schedule = "THURSDAY & SUNDAY 6-7PM";
		if (c_capacity > c_enrolled){
			System.out.println();
			System.out.println("THIS COURSE IS AVAILABLE");
			System.out.println();
			System.out.println("COURSE CODE : "+c_code+"\n"+"COURSE TITLE : "+c_title+"\n"+"DESCRIPTION : "+c_description+"\n"+"CAPACITY :"+c_capacity+"\n"+"SCHEDULE : "+ c_schedule);

		}
		else 
			System.out.println("THIS COURSE IS ENROLLED COMPLETELY");
		
	}
	public void Cloud(){

		c_code = 2025004;
		c_title= "CLOUD COMPUTING";
		c_description = "BASICS OF CLOUD COMPUTING";
		c_capacity = 25;
		c_enrolled=20;
		c_schedule = "TUESDAY & WEDNESDAY 5-6PM";
		if (c_capacity > c_enrolled){
			System.out.println();
			System.out.println("THIS COURSE IS AVAILABLE");
			System.out.println();
			System.out.println("COURSE CODE : "+c_code+"\n"+"COURSE TITLE : "+c_title+"\n"+"DESCRIPTION : "+c_description+"\n"+"CAPACITY :"+c_capacity+"\n"+"SCHEDULE : "+ c_schedule);

		}
		else 
			System.out.println("THIS COURSE IS ENROLLED COMPLETELY");
		

	}
	public void Networking(){

		c_code = 2025005;
		c_title= "NETWORKING SYSTEMS";
		c_description = "BASICS TO ADVANCED NETWORKING CONCEPTS.";
		c_capacity = 20;
		c_enrolled=13;
		c_schedule = "MONDAY & SATURDAY 5-6PM";
		if (c_capacity > c_enrolled){
			System.out.println();
			System.out.println("THIS COURSE IS AVAILABLE");
			System.out.println();
			System.out.println("COURSE CODE : "+c_code+"\n"+"COURSE TITLE : "+c_title+"\n"+"DESCRIPTION : "+c_description+"\n"+"CAPACITY :"+c_capacity+"\n"+"SCHEDULE : "+ c_schedule);

		}
		else 
			System.out.println("THIS COURSE IS ENROLLED COMPLETELY");
	}
}

class Students{
	Course c = new Course();
	Scanner sc= new Scanner(System.in);
	String name , id  , email;

	public void Details(){
		System.out.println("PLEASE ENTER YOUR NAME");
		name = sc.next();
		System.out.println();
		System.out.println("ENTER YOUR COLLEGE ID");
		id=sc.next();
		System.out.println();
		System.out.println("ENTER YOUR EMAIL ID");
		email=sc.next();
		System.out.println();

		Menu();
	}

	public void Menu(){

		System.out.println("THE COURSES AVAILABLE WITH US--");
		System.out.println();
		System.out.println("1.JAVA.\n"+"2.PYTHON.\n"+"3.WEB DEVELOPMENT.\n"+"4.CLOUD COMPUTING.\n"+"5.NETWORKING");
		System.out.println();
		System.out.println("ENTER THE COURSE YOU NEED");
		int choice = sc.nextInt();

		switch(choice){

		case 1: c.Java();
				c.c_enrolled++;
				break;

		case 2: c.Python();
			c.c_enrolled++;
			break;

		case 3 :c.Webdevelopment();
			c.c_enrolled++;
			
			break;

		case 4 : c.Cloud();
			c.c_enrolled++;
			break;
		case 5 : c.Networking();
			c.c_enrolled++;
			break;
		default : System.out.println("ENTER A PROPER CHOICE");
		}

		System.out.println("DO YOU WANT TO ENROLL FOR ANOTHER COURSE?");
		System.out.println("1.YES   2.NO");
		int opt = sc.nextInt();
		System.out.println();
		
		switch (opt) {
		case 1: Details();
			break;

		case 2: System.out.println("THANK YOU");
			break;

		default: System.out.println("ENTER A PROPER CHOICE");
		}
	}

}

class StudentRegister{

	public static void main(String[] args) {
		Students s = new Students();

		s.Details();
	}
}
	

