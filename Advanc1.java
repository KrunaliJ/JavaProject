/*
 The try statement allows you to define a block of code to be tested for errors while it is being executed.

The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

The try and catch keywords come in pairs:

The finally statement lets you execute code, after try...catch, regardless of the result

The throw statement allows you to create a custom error.
The throw statement is used together with an exception type.
 There are many exception types available in Java: 
 ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc
 */
public class Advanc1{

    static void checkAge(int age){
        if (age<18) {
            throw new ArithmeticException("Access denied - you must be atleast 18 years old");
            
        }else{
            System.out.println("Access granted-ypu are old enough");
        }
    }
    public static void main(String[] args){
        
        try{
            int[] myNumber = {1,2,3};
            System.out.println(myNumber[10]);
        }catch(Exception e){
            System.out.println("something went wrong");
        }finally{
            System.out.println("the try catch is finished");
        }
        checkAge(15);
    }
}