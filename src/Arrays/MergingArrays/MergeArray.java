package Arrays.MergingArrays;

import java.util.ArrayList;

public class MergeArray {

    public static ArrayList<Integer> mergeArrays(int[] arr1, int[] arr2){
        int i1 = 0;
        int i2 = 0;
        ArrayList<Integer> results = new ArrayList<>();
        while(i1 < arr1.length && i2 <arr2.length){
            if(arr1[i1] > arr2[i2]){
                results.add(arr2[i2]);
                i2++;
            }
            else if(arr1[i1] < arr2[i2]){
                results.add(arr1[i1]);
                i1++;
            }
            else{
                results.add(arr1[i1]);
                results.add(arr2[i2]);
                i1++;
                i2++;
            }

        }

        while(i1 < arr1.length){
            results.add(arr1[i1]);
            i1++;
        }
        while(i2 < arr2.length){
            results.add(arr2[i2]);
            i2++;
        }
        return results;
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};

        ArrayList<Integer> results = mergeArrays(myArray, alicesArray);

        for (Integer s : results){
            System.out.println(s);
        }
    }
}
