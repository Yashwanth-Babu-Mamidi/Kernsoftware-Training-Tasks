package feb25th;

import java.util.*;

public class CompleteCollectionsDemo {

    public static void main(String[] args) {

        /* ================= ARRAYLIST ================= */
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Spring");

        List<String> extra = new ArrayList<>();
        extra.add("Hibernate");
        extra.add("Microservices");

        arrayList.addAll(extra);                      // addAll()
        System.out.println("ArrayList: " + arrayList);

        arrayList.remove("Python");                   // remove()
        System.out.println("After remove: " + arrayList);

        System.out.println("Get index 1: " + arrayList.get(1));   // get()
        System.out.println("Contains Java? " + arrayList.contains("Java")); 
        System.out.println("Size: " + arrayList.size());          
        System.out.println("Is Empty? " + arrayList.isEmpty());   

        /* ================= LINKEDLIST ================= */
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        linkedList.removeFirst();                     // removeFirst()
        linkedList.removeLast();                      // removeLast()
        System.out.println("LinkedList: " + linkedList);

        /* ================= VECTOR ================= */
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.addElement(2);                         // addElement()
        System.out.println("Vector: " + vector);
        vector.removeElement(2);                      // removeElement()

        /* ================= STACK ================= */
        Stack<Integer> stack = new Stack<>();
        stack.push(100);                              // push()
        stack.push(200);
        System.out.println("Stack Peek: " + stack.peek()); 
        System.out.println("Stack Pop: " + stack.pop());   

        /* ================= HASHSET ================= */
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("A");                             
        System.out.println("HashSet: " + hashSet);

        /* ================= LINKEDHASHSET ================= */
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        /* ================= TREESET ================= */
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("First: " + treeSet.first());     
        System.out.println("Last: " + treeSet.last());       

        /* ================= PRIORITYQUEUE ================= */
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(50);                       // offer()
        priorityQueue.offer(10);
        priorityQueue.offer(30);

        System.out.println("PriorityQueue Peek: " + priorityQueue.peek());
        System.out.println("PriorityQueue Poll: " + priorityQueue.poll()); 
        System.out.println("PriorityQueue After Poll: " + priorityQueue);

        /* ================= ARRAYDEQUE ================= */
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Middle");
        deque.addFirst("First");
        deque.addLast("Last");
        System.out.println("ArrayDeque: " + deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println("ArrayDeque After Remove: " + deque);

        /* ================= HASHMAP ================= */
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "Spring");

        System.out.println("HashMap: " + hashMap);
        System.out.println("Get Key 2: " + hashMap.get(2));
        hashMap.remove(3);

        System.out.println("Keys: " + hashMap.keySet());       // keySet()
        System.out.println("Values: " + hashMap.values());     // values()

        /* ===== entrySet() + getKey() + getValue() ===== */
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + 
                               ", Value: " + entry.getValue());
        }

        /* ================= LINKEDHASHMAP ================= */
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101, "A");
        linkedHashMap.put(102, "B");
        System.out.println("LinkedHashMap: " + linkedHashMap);

        /* ================= TREEMAP ================= */
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");

        System.out.println("TreeMap: " + treeMap);
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());

        /* ================= HASHTABLE ================= */
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Ten");
        hashtable.put(20, "Twenty");
        System.out.println("Hashtable: " + hashtable);

        /* ================= CLEAR ================= */
        arrayList.clear();
        System.out.println("ArrayList after clear(): " + arrayList);

        System.out.println("\nProgram Executed Successfully ✅");
    }
}