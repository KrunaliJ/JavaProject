import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserInput {


    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        
        LocalDateTime myTime =  LocalDateTime.now();
         System.out.println("today's date and time is:"+myTime);
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String myString = myTime.format(myFormatter);
        System.err.println("time after formatting:"+myString);

        System.out.println("Enter name ,age and salary");
       

        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        System.out.println("Name is: "+name);
        System.out.println("Age is :"+age);
        System.out.println("Earns Salary:"+salary);
    }
}
