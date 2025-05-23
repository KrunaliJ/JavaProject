import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*An ArrayList is a resizable array that can grow as needed.
It allows you to store elements and access them by index.

A LinkedList works like an ArrayList, but it stores elements in a chain.
It's good when you need to add or remove items often.
*/
public class DataStrct1 {
    public static void main(String[] args){
        ArrayList<String> fruits= new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("watermelon");
        fruits.add("orange");

        fruits.add(1,"kiwi"); //you can also add an item at a specified position by referring to the index number

        fruits.set(0, "muskmelon"); //To modify an element, use the set() method and refer to the index number
       //ruits.clear();To remove all the elements in the ArrayList, use the clear() method:

        Collections.sort(fruits);
        for(String i : fruits){
            System.out.println(i);
        }
        
        System.out.println(fruits.size());//To find out how many elements an ArrayList have, use the size method:
        System.out.println(fruits.get(4));//To access an element in the ArrayList, use the get() method and refer to the index number:

        /*Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type).
         To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:
         */
        //Create an ArrayList to store numbers (add elements of type Integer)
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(47);
        myNumber.add(20);
        myNumber.add(13);
        myNumber.add(15);
        myNumber.add(23);
        myNumber.add(34);
        myNumber.add(40);
        Collections.sort(myNumber);//Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:
        for(int i:myNumber){
            System.out.println(i);
        }

        LinkedList<String> students= new LinkedList<String>();
        students.add("joy");
        students.add("emu");
        students.add("sunita");
        students.add("smith");
        //students.getFirst();
       
        students.addFirst("jon");
        
        students.addLast("don");
        /*students.getlast();
        students.removeFirst();
        students.removeLast();
       */
            System.out.println(students);
       
       

    }
    
}
