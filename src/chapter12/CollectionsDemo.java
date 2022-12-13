package chapter12;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//        System.out.println(fruit.size());
//        System.out.println(fruit);

        //loop through set collection
        // iterator way
//        var i =fruit.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
        // advanced for loop way
//        for (String val : fruit){
//            System.out.println(val);
//        }
        // for each & lamda expression way : lamda = x "any variable name" -> action
//          fruit.forEach(x -> System.out.println(x));
        // another way to write lamda = System.out::printLn , so we don't need variable name
            fruit.forEach(System.out::println);
    }

    public static void listDemo(){
        List fruit = new ArrayList();

        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//        System.out.println(fruit.get(2));
//        System.out.println(fruit.size());
//        System.out.println(fruit);

        //loop through list collection
        // iterator way
//        var i =fruit.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
        // advanced for loop way
//        for (String val : fruit){
//            System.out.println(val);
//        }
        // for each & lamda expression way : lamda = x "any variable name" -> action
//          fruit.forEach(x -> System.out.println(x));
        // another way to write lamda = System.out::printLn , so we don't need variable name
        fruit.forEach(System.out::println);

    }

    public static void queueDemo(){
        Queue fruit = new LinkedList();

        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

//        System.out.println(fruit.size());
//        System.out.println(fruit);

        //loop through queue collection
        // iterator way
//        var i =fruit.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
        // advanced for loop way
//        for (String val : fruit){
//            System.out.println(val);
//        }
        // for each & lamda expression way : lamda = x "any variable name" -> action
//          fruit.forEach(x -> System.out.println(x));
        // another way to write lamda = System.out::printLn , so we don't need variable name
        fruit.forEach(System.out::println);
    }

    public static void mapDemo(){
        Map<String , Integer> fruitCalories = new HashMap();

        fruitCalories.put("apple" , 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana" , 105);
        fruitCalories.put("orange" , 45);
        fruitCalories.put("lemon" , 17);

//        System.out.println(fruitCalories.size());
//        System.out.println(fruitCalories);
//
//        System.out.println(fruitCalories.get("lemon"));
//
//        System.out.println(fruitCalories.entrySet());
//
//        fruitCalories.remove("orange");
//        System.out.println(fruitCalories);

        //loop through map

        // enhanced loop way
        for (var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }
        // for each way
        fruitCalories.forEach((k,v) -> System.out.println("Fruit : "+k+
                ", Calories : " +v));
    }
}
