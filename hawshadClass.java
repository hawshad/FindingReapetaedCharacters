import java.util.Scanner;
public class hawshadClass{
public static void main(String []args){

	Scanner s=new Scanner(System.in);

	//first name
	System.out.print("Enter Num of Characters in your first name:");
	int fnameNum=s.nextInt();

	//fathers name
	System.out.print("Enter Num of Characters in your seconcd name:");
	int SnameNum=s.nextInt();

	//grandfathers name
	System.out.print("Enter Num of Characters in your last name:");
	int LnameNum=s.nextInt();


	 String first="";
	 String middle="";
	 String last="";

	//an array for entering characters
	char [][] newArray =new char[3][];
	newArray [0]= new char[fnameNum];
	newArray [1]= new char[SnameNum];
	newArray [2]= new char[LnameNum];




	System.out.println("\n\n\n");

	for(int i=0;i<fnameNum;i++){

		//Enering characters for first name

		System.out.print("Enter Charecters for ("+(i+1)+") =");
		newArray[0][i]=s.next().charAt(0);
		String conv=Character.toString(newArray[0][i]);
		    first=first+conv;
	}
		System.out.println("\n");
	for(int i=0;i<SnameNum;i++){

		//Entering characters for fathersn name

		System.out.print("Enter Charecters for ("+(i+1)+") =");
		newArray[1][i]=s.next().charAt(0);
		String conv=Character.toString(newArray[1][i]);
            middle=middle+conv;

	}

	System.out.println("\n");
	for(int i=0;i<LnameNum;i++){

		//Entering characters for gradfathers name

		System.out.print("Enter Charecters for ("+(i+1)+") =");
		newArray[2][i]=s.next().charAt(0);
		String conv=Character.toString(newArray[2][i]);
            last=last+conv;
	}

	//putting all names into one variable
	String fullName=first+middle+last;
        int allChars;
        char array[]=fullName.toCharArray();
            for(int i=0;i<array.length;i++)
            {
             	  allChars=1;
                for(int j=i+1;j<array.length;j++)
                {
				if (array[i]==array[j])
                  	    {
							 allChars++;
                        array[j]='0';

			}
			}
				//Ensuring taht the character is exist
                if(allChars> 1 && array[i]!= '0'){
                    String numOfRepeated= Integer.toString(allChars);
					//Printing Repeated Characters
					System.out.println("\n");
                    System.out.println("Character "+ "("+array[i]+")" + " : Repeated " + "-"+numOfRepeated +"-"+" times" );
                }}


}
}