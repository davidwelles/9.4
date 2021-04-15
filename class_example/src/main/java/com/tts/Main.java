package com.tts;
import java.util.*;





public class Main {
    public static void main(String[] args) {
        String[] fruitArray = {"Orange", "Apple", "Banana"};
        int[] intArray;
        boolean[] brokenLights;

        System.out.println("---Arrays---");
        System.out.println(fruitArray[1]);
        System.out.println(fruitArray.length);

        System.out.println("---Collections---");
        List<String> stringList= new ArrayList<>();
        List<String> stringLinkedList = new LinkedList<>();
        List<String> stringVector = new Vector<>();
        List<String> stringStack = new Stack<>();

        stringList.add("dog");
        stringList.add("cat");
        stringList.add(1,"wolf");
        stringList.remove(0);
//        stringList.clear();
//        clears the whole list
        Collections.reverse(stringList);
        System.out.println(stringList.get(1));
        System.out.println(stringList);

//        String to Array to Arraylist
        System.out.println("==== String Conversion ====");

        // first I set up a String
        String myString = "I really love ice cream";
        // then I take my string and split it at every whitespace
        // and turn it into a regular array
        String[] strArr = myString.split(" ");

        // setting up arrayList and making the value
        // that of the strArr
        List<String> splitList = Arrays.asList(strArr);

        System.out.println(splitList);

        //Array to String

        List<String> carList = Arrays.asList("BMW", "Honda", "Audi");
        Object[] carArr = carList.toArray();

        String carString = Arrays.toString(carArr);

        System.out.println(carString.replace("[", "")
                .replace("]", "")
                .replace(",", ""));


        HashMap<String, Integer> personMap = new HashMap<>();
        personMap.put("Mary", 37);
        personMap.put("bob",20);
        personMap.put("chris", 15);

        System.out.println(personMap);
        System.out.println("this is the value associated with Mary: " + personMap.get("Mary"));
        System.out.println(personMap.keySet());

        for (String i : personMap.keySet()) {
            System.out.println("key: " + i + " value: " + personMap.get(i));
        }

        for (Integer i : personMap.values()) {
            System.out.println("key: " + i + "\tvalue: " + personMap.get(i));
        }

        personMap.remove("Bob");
        System.out.println("is bob in my map?");personMap.containsKey("Bob");


        System.out.println("--Iterating--");

        List<String> fruitList = Arrays.asList("plums", "grape", "apple");

        for(String fruit: fruitList){
            System.out.println("here is one my fruits " + fruit);
        }

        fruitList.forEach((fruit) -> System.out.println(fruit));
        fruitList.forEach(System.out::println);

        System.out.println("--linkedlist--");
        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        // Puts shark as the first element in the ArrayList
        animalList.addFirst("shark");
        System.out.println(animalList);
// => [shark, frog, giraffe, buffalo, mongoose]

// Puts koala as the last element in the ArrayList
        animalList.addLast("koala");
        System.out.println(animalList);
// => [shark, frog, giraffe, buffalo, mongoose, koala]

// This adds the value cuttlefish to the 3rd index of the LinkedList
        animalList.add(3, "cuttlefish");
        System.out.println(animalList);
// => [shark, frog, giraffe, cuttlefish, buffalo, mongoose, koala]



        System.out.println("===== Queueing ====");
        Queue <Integer> myQueue = new LinkedList<>();

        //add elements {5, 6, 7, 8, 9} to queue
        for(int i=5; i<10; i++){
            myQueue.add(i);
        }
        myQueue.add(12);
        System.out.println("Elements of queue:" + myQueue);

        int removeHead= myQueue.remove();
        System.out.println("removed element from myQueue " + removeHead);

        //to veiw the head of a queue
        int head = myQueue.peek();
        System.out.println("head of queue " + head);

        int size = myQueue.size();
        System.out.println("size of the queue " + size);


// Imports the data we need to use the Stack class

        System.out.println("--stacks--");
        Stack<Integer> myStack;
// creates a reference variable for a Stack called myStack
        myStack = new Stack<Integer>();
// creates a new Integer Stack and assigns its address to myStack

        myStack.push(1);
// Pushes 1 to the top of our stack
// myStack now consists of [1]
        myStack.push(2);
// myStack now consists of [1, 2]
        myStack.push(3);
// myStack now consists of [1, 2, 3]

        System.out.println(myStack);

// Despite pushing to the "top" of the stack, the printed representation
// puts our new numbers at the back. The important part is that they are
// removed from the same place they are added.

        myStack.pop();
        System.out.println(myStack);

        int peek = myStack.peek();
        System.out.println(peek);

        boolean empty = myStack.empty();
        System.out.println(empty);








    }
}
