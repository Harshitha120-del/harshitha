import java.util.Scanner;
public class palindrome{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String:");
String input=sc.nextLine();
String reversed=new StringBuilder(input).reverse().toString();
if(input.equals(reversed)){
System.out.println(input+"is a palindrome.");
}
else
{
System.out.println(input+"is not a palindrome.");
}
}
}

