import java.util.Scanner;
public class Student_marks
{
	public static void main(String args[])
	{
		int n,total=0;
		float percentage;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. of subjects:");
		n=s.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter marks out of 100:");
		for(int i=0;i<n;i++)
		{
			marks[i]=s.nextInt();
			total=total+marks[i];
		}
		percentage=(total / (float)n);
		System.out.println("Total mark obtained:"+total);
		System.out.println("Percentage:"+percentage + "%");
	}
}


//
Enter no. of subjects:
4
Enter marks out of 100:
90
60
88
77
Total mark obtained:315
Percentage:78.75%


