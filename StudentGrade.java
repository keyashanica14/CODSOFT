import java.util.*;

class StudentGrade{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("ENTER THE NUMBER OF SUBJECTS");
		int totalsub = sc.nextInt();

		int totalmark=0;
		double avg=0;

		for(int i=1 ; i<=totalsub ; i++){
			 System.out.println("ENTER THE MARK OF SUBJECT "+i+" OUT OF 100");
			 int mark=sc.nextInt();
			 totalmark+=mark;

		}
		System.out.println();
		System.out.println("THE TOTAL MARK IS "+totalmark);
		avg=totalmark/totalsub;
		System.out.println();
		System.out.println("THE AVERAGE IS "+avg);

		String grade;
		if(avg>=90){
			grade="O";
			System.out.println("GRADE: "+grade);
		}
		else if (avg>=80 && avg<90){

			grade="A+";
			System.out.println("GRADE: "+grade);

		}

		else if (avg>=70 && avg<80){

			grade="A";
			System.out.println("GRADE: "+grade);

		}
		else if (avg>=60 && avg<70){

			grade="B+";
			System.out.println("GRADE: "+grade);
		}
		else if (avg>=50 && avg<60){

			grade="B";
			System.out.println("GRADE: "+grade);
		}
		else {
			grade="C";
			System.out.println("GRADE: "+grade);
		}

		switch(grade){
		case "O":
			System.out.println("OUTSTANDING PERFORMANCE !!");
			break;

		case "A+":
			System.out.println("EXCELLENT KEEP IT UP ...");
			break;

		case "A":
			System.out.println("GOOD, WORK HARD...");
			break;

		case "B+":
			System.out.println("NOT BAD, WORK MORE...");
			break;

		case "B":
			System.out.println("JUST PASSED...");
			break;

		case "C":
			System.out.println("VERY BAD... FAILED");
			break;

		default:
			System.out.println("BAD SCORE..");


		}
	}
}