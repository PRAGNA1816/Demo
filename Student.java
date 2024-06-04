import java.util.Scanner;
class Student{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
String name = sc.nextLine();
System.out.println("Enter your rollno:");
String rollno = sc.nextLine();
System.out.println("Enter your branch:");
String branch = sc.nextLine();
System.out.println("Enter your phone number:");
String num = sc.nextLine();
System.out.println("---------------------- Student Details ------------------------------");
System.out.printf("Student name:%s \n",name);
System.out.printf("Student Rollno:%s \n",rollno);
System.out.printf("Student branch:%s \n",branch);
System.out.printf("Student phone number:%s \n",num);

}
}
