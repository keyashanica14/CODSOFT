import java.util.*;

class Questions{
	Scanner sc= new Scanner(System.in);

	public void Biology(){
		int points=0;
		System.out.println("GET READY FOR THE BIOLOGY QUIZ...LET'S GET STARTED");
		System.out.println();
		System.out.println("Which organelle is known as the powerhouse of the cell?");
		System.out.print("a. Nucleus.\n" + "b. Mitochondria.\n"+"c. Ribosome.\n" +"d. Golgi apparatus.\n");
		
		char ans1='b';
		char bio1 = sc.next().charAt(0);

		if (bio1==ans1){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println();
		System.out.print("What is the main function of red blood cells in the human body?.\n" + "a.Fighting infections.\n" + "b.Transporting oxygen.\n" + "c. Producing hormones.\n" + "d.Digesting food.\n");

		char ans2='b';
		char bio2 = sc.next().charAt(0);

		if (bio2==ans2){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println();
		System.out.print("Which type of blood vessel carries blood away from the heart?.\n" + "a.Veins.\n" + "b.Capillaries.\n" + "c.Arteries .\n" + "d.Lymph vessels.\n");
		
		char ans3='a';
		char bio3 = sc.next().charAt(0);

		if (bio3==ans3){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}
		System.out.println();
		System.out.print("What is the basic unit of life in all living organisms?.\n" + "a.Tissue.\n" + "b.Organ.\n" + "c.Cell .\n" + "d.Molecule.\n");

		char ans4='c';
		char bio4 = sc.next().charAt(0);

		if (bio4==ans4){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println();						
		System.out.print("Which gas do plants absorb from the atmosphere during photosynthesis?.\n" + "a.Oxygen.\n" + "b.Nitrogen.\n" + "c.Hydrogen.\n" + "d.Carbon dioxide.\n");		

		char ans5='d';
		char bio5 = sc.next().charAt(0);

		if (bio5==ans5){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}
		System.out.println();
		System.out.println("YOUR TOTAL SCORE: "+points+"/5");

	}

	public void Physics(){

		int points=0;
		System.out.println("GET READY FOR THE PHYSICS QUIZ...LET'S GET STARTED");
		System.out.println();
		System.out.println("What is the SI unit of force?");
		System.out.print("a. Newton.\n" + "b. Joule.\n"+"c. Watt.\n" +"d. Pascal.\n");
		
		char ans6='a';
		char phy1 = sc.next().charAt(0);

		if (phy1==ans6){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println();
		System.out.print("Which law states that for every action, there is an equal and opposite reaction?.\n" + "a.Newton First Law.\n" + "b.Newton Second Law.\n" + "c. Newton Third Law.\n" + "d.Gravitational Law.\n");
		
		char ans7='c';
		char phy2 = sc.next().charAt(0);

		if (phy2==ans7){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println();
		System.out.print("What type of energy is stored in a stretched rubber band?.\n" + "a.Kinetic energy.\n" + "b.Thermal energy.\n" + "c.Potential energy .\n" + "d.Sound energy.\n");
		
		char ans8='c';
		char phy3 = sc.next().charAt(0);

		if (phy3==ans8){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}
		System.out.println();
		System.out.print("Which wave property determines the pitch of a sound?.\n" + "a.Amplitude.\n" + "b.Wavelength.\n" + "c.Frequency .\n" + "d.Speed.\n");

		char ans9='c';
		char phy4 = sc.next().charAt(0);

		if (phy4==ans9){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println();						
		System.out.print("What happens to the speed of light when it moves from air to water.\n" + "a.Decrease.\n" + "b.Increase.\n" + "c.Remains same.\n" + "d.Becomes zero.\n");		

		char ans10='a';
		char phy5 = sc.next().charAt(0);

		if (phy5==ans10){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}
		System.out.println();
		System.out.println("YOUR TOTAL SCORE: "+points+"/5");

	}

	public void Chemistry(){

		int points=0;
		System.out.println("GET READY FOR THE CHEMISTRY QUIZ...LET'S GET STARTED");
		System.out.println();
		System.out.println("What is the chemical formula of water?");
		System.out.print("a.H2O2.\n" + "b. HO2.\n"+"c. H2O.\n" +"d. HCO2.\n");
		
		char ans11='c';
		char chem1 = sc.next().charAt(0);

		if (chem1==ans11){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println();
		System.out.print("Which gas is most abundant in Earth's atmosphere.\n" + "a.O2.\n" + "b.N2.\n" + "c. CO2.\n" + "d.H2.\n");
		
		char ans12='b';
		char chem2 = sc.next().charAt(0);

		if (chem2==ans12){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println();
		System.out.print("What is the pH value of pure water?.\n" + "a.5.\n" + "b.6.\n" + "c.3 .\n" + "d.7.\n");
		
		char ans13='d';
		char chem3 = sc.next().charAt(0);

		if (chem3==ans13){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}
		System.out.println();
		System.out.print("Which element is known as the King of Chemicals?.\n" + "a.H2.\n" + "b.O2.\n" + "c.H2SO4 .\n" + "d.Carbon.\n");

		char ans14='c';
		char chem4 = sc.next().charAt(0);

		if (chem4==ans14){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

			System.out.println();					
		System.out.print("What type of bond is formed when two atoms share electrons?.\n" + "a.Covalent bond.\n" + "b.Ionic bond.\n" + "c.Metallic bond.\n" + "d.Hydrogen bond.\n");		

		char ans15='a';
		char chem5 = sc.next().charAt(0);

		if (chem5==ans15){
			System.out.println("Correct answer");
			points+=1;
		}
		else{
			System.out.println("Incorrect answer");
		}

		System.out.println("YOUR TOTAL SCORE: "+points+"/5");

	}

	public void Menu(){
		System.out.println("WELCOME TO THE QUIZ APP");
		System.out.println();
		System.out.println("Select the topic for your Quiz..");
		System.out.print("1.BIOLOGY.\n" + "2.PHYSICS.\n" + "3.CHEMISTRY.\n");
		int opt=sc.nextInt();

		switch(opt){

		case 1: Biology();
			break;

		case 2: Physics();
			break;

		case 3: Chemistry();
			break;

		default: System.out.println("Invalid choice");
		}

		Again();

	}

	public void Again(){
		System.out.println();
		System.out.println("DO YOU WANT TO PLAY AGAIN?.\n"+"1.YES      2.NO.\n");
		int again=sc.nextInt();

		if (again==1){
			Menu();
		}
		else if (again==2){
			System.out.println("THANK YOU.....");

		}
		else{
			System.out.println("Enter a proper choice");
		}
	}


	}


class QuizApp{
	public static void main(String[] args) {
		
	Questions q = new Questions();
	q.Menu();
	

	}
}