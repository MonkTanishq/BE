import java.util.*;
public class CommonElement {
    public static void FindCommonElements(int[] array1, int[] array2) {
        Set<Integer>set1 = new HashSet<>();
        Set<Integer>set2 = new HashSet<>();

        for(int i : array1)
        {
            set1.add(i);
        }
        for(int i : array2)
        {
            set2.add(i);
        }

        set1.retainAll(set2);
        System.out.println("Common elements are: " + set1);
    }

    public static void main(String[] args) {
        
        int[] array1 = {25,55,89,12,67,23,1};
        int[] array2 = {67,55,1,45,97,81,25,60};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        FindCommonElements(array1, array2);
    }
}
