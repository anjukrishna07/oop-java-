import java.util.*;
class sort {
String str;
public void getstring() 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string: ");
this.str = sc.nextLine();
}
public void sort() 
{
char charArray[] = str.toCharArray();
Arrays.sort(charArray);
System.out.println(new String(charArray));
}
public static void main(String[] args) 
{
sort data = new sort();
data.getstring();
data.sort();
}
}
