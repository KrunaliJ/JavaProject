import java.util.ArrayList;
import java.util.Iterator;

/*An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
It is called an "iterator" because "iterating" is the technical term for looping.
To use an Iterator, you must import it from the them by index.
*/

public class DataStruct3 {
    public static void main(String[] args){
        //array collection
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        Iterator<String> it = fruits.iterator();//The iterator() method can be used to get an Iterator for any collection
     // System.out.println(it.next());
        while (it.hasNext()){    //To loop through a collection, use the hasNext() and next() methods of the Iterator
            System.out.println(it.next());
        }

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(18);
        number.add(2);
        number.add(15);
        number.add(5);
        Iterator <Integer> itr  = number.iterator();
        while (itr.hasNext()){
            Integer i = itr.next();
            if(i<10){
                itr.remove();
            }
            
        }
        System.out.println(number);

        Integer myInt = 100;
        String myString  = myInt.toString();
        System.out.println(myString.length());


    }
    
}
