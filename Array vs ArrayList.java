import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        int[] intArray = new int[3]; 
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        System.out.println("Array elements:");
        for (int num : intArray) {
            System.out.println(num);
        }
        ArrayList<Integer> arrayList = new ArrayList<>(); 
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println("\nArrayList elements:");
        for (int num : arrayList) {
            System.out.println(num);
        }
        arrayList.remove(1);
        System.out.println("\nArrayList after removing element at index 1:");
        for (int num : arrayList) {
            System.out.println(num);
        }
        System.out.println("\nArray size: " + intArray.length);
        System.out.println("ArrayList size: " + arrayList.size());
    }
}
