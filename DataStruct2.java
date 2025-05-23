import java.util.HashMap;
//A HashMap stores key-value pairs, which are great when you want to store values and find them by a key (like a name or ID):
import java.util.HashSet;
//A HashSet is a collection of items where every item is unique, and it is found in the java.util package

public class DataStruct2 {
    public static void main(String [] args){
        HashMap<Integer,String> employee = new HashMap<Integer,String>();
        //The HashMap class has many useful methods. For example, to add items to it, use the put() method
        employee.put(1,"joy");
        employee.put(2,"rit");
        employee.put(3,"riya");
        employee.put(4,"jhon");

      //employee.remove(2);To remove an item, use the remove() method and refer to the key:and To remove all items, use the clear() method:
      //employee.clear();
      System.out.println(employee);
      System.out.println(employee.get(3));//To access a value in the HashMap, use the get() method and refer to its key
      System.out.println(employee.size());//To find out how many items there are, use the size() method:

      /*Loop through the items of a HashMap with a for-each loop.
        Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:*/
      for (Integer i:employee.keySet()){
        System.out.println("ID:" +i+ "Name=" + employee.get(i));
      }

      HashSet<Integer> evennum = new HashSet<Integer>();
      //The HashSet class has many useful methods. For example, to add items to it, use the add() method
      evennum.add(2);
      evennum.add(4);
      evennum.add(6);
      evennum.add(8);
      evennum.add(10);

      System.out.println(evennum);
      System.out.println(employee.size());
      for(Integer i =1 ;i<=10;i++){
        //To check whether an item exists in a HashSet, use the contains() method:
        if (evennum.contains(i)){
            System.out.println(i + "it is a even number");
        }
        else{
            System.out.println(i + "it is a odd number");
        }
            
        }
      }



    }

