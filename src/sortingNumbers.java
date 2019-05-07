import java.util.Scanner;

public class sortingNumbers {

	public static void main(String[] args) {

	int num, i , j , temp;	
	Scanner scanner=new Scanner(System.in);	
	System.out.println("how many numbers do you want to short?:");
	num=scanner.nextInt();	
	int array[]= new int[num];
	System.out.println("brilliant, give us now " + num + " numbers");	
		
	for(i=0; i<num; i++) {
		array[i]= scanner.nextInt();		// array to hold the numbers!
	} // for loop 
	
	for (i=0; i<(num-1); i++) {
		for(j=0; j<num-i-1; j++) {
			if (array[j] > array[j+1]) {
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}		
	}
	 System.out.println("Sorted list of integers:");
	for (i=0; i<num; i++) {
		System.out.println(array[i]);
	}
	
	

	}//main loop
} //class
