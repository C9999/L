
public class Basic {

	public static void main(String[] args) {
		// Different data types (eg) int, double, string, char
		int age = 23;
		double cash = 5.780;
		String jobTitle = "Developer";
		char joblLevel = 'A';
		
		//Output Statements (eg) System.out.print
		String varOutput = "Do you want to go to the Anitta show?";
		System.out.println(varOutput);
		
		//Input statements (eg) Scanner class
		// #TO-DO
		
		//Mathematical, relational & Boolean operators (eg) <, >, ==, != etc
		int ageUpdate = age + 1;
		cash = cash - 80;
		
		boolean blocked = true;
		boolean ticket = true;
		
		//If statements
		if(age > 18){
			blocked = false;
		}else{
			System.out.println("You do not have access to the event");
		}
		
		if((blocked == false) && (ticket == true)){
			System.out.println("Welcome to the event :)");
		}else{
			System.out.println("Please, buy the ticket bro/mina");
		}
		
		//Iteration statements (eg) do while, for loops
		int  i = 2;
		do{
			System.out.println("Dancing for " +i+ " hours o/");
			i++;
		}while(i != 11);
		
		
		for(int j = 10; j <= 20; j++){
			System.out.println(j);
		}

	}
}
