import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Difference {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 11_000_000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        /****************** FETCHING DATA ******************/
        // # How long it takes to get an element at a certain index?
        // # ArrayList >> LinkedList

        System.out.println("\nFETCHING DATA\n");

        long start = System.currentTimeMillis();
        linkedList.get(4_500_000);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms"); // 41ms

        start = System.currentTimeMillis();
        arrayList.get(4_500_000);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms"); // 0ms

        /****************** FIRST / LAST INDEX ******************/
        // # How long it takes to get the first and last element?
        // # ArrayList == LinkedList

        System.out.println("\nFIRST / LAST INDEX\n");

        start = System.currentTimeMillis();
        linkedList.get(0);
        linkedList.get(linkedList.size() - 1);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) +
                "ms");
        // 0s

        start = System.currentTimeMillis();
        arrayList.get(0);
        arrayList.get(arrayList.size() - 1);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) +
                "ms");
        // 0s

        /****************** INSERTION FROM MIDDLE ******************/
        // # How long it takes to add an element in the middle?
        // # LinkedList >> ArrayList

        System.out.println("\nINSERTION FROM MIDDLE\n");

        start = System.currentTimeMillis();
        linkedList.add(5, 121); // insert 121 at index 5
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) +
                "ms");

        start = System.currentTimeMillis();
        arrayList.add(5, 121); // insert 121 at index 5
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) +
                "ms");

        /****************** INSERTION ******************/
        // # How long it takes to add an element at the end of the list?
        // # ArrayList == LinkedList

        System.out.println("\nINSERTION\n");

        start = System.currentTimeMillis();
        linkedList.add(121);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) +
                "ms");

        start = System.currentTimeMillis();
        arrayList.add(121);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) +
                "ms");

        /****************** REMOVAL ******************/
        // # How long it takes to remove an element from the middle of the list?
        // # LinkedList >> ArrayList

        System.out.println("\nREMOVAL\n");

        start = System.currentTimeMillis();
        linkedList.remove(400);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) +
                "ms");

        start = System.currentTimeMillis();
        arrayList.remove(400);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) +
                "ms");

        /****************** UPDATES ******************/
        // # How long it takes to update an element of the list?
        // # ArrayList >> LinkedList

        System.out.println("\nUPDATES\n");

        start = System.currentTimeMillis();
        linkedList.set(4_500_000, 5);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) +
                "ms");

        start = System.currentTimeMillis();
        arrayList.set(4_500_000, 5);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) +
                "ms");

    }

}
