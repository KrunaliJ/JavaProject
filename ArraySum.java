import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        int[] numbers= {5,10,15,20,25};
        int sum= 0;
        for(int num: numbers){
            sum += num;

        }
        System.out.println("sum:" +sum);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of elements in the array:");
        int size=scanner.nextInt();
        int[] numb=new int[size];
        System.out.println("Enter " + size + "Integers:");
        for(int i=0;i<size;i++){
            numb[i]=scanner.nextInt();
        }
        int sume=0;
        for(int numbe:numb){
            sume+= numbe;
        }
        System.out.println("Sum Of The Array is :" +sume);
        scanner.close();

    }
}
