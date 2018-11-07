import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    //Using ArrayList to find out sum
    public static boolean usingArrayList(int[] array, int n, int sum){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(aList.contains(Math.abs(sum-array[i])))
                return true;
            else
                aList.add(array[i]);
        }
        return false;
    }


    //Find if sum present in a sorted array pair
    public static boolean isSumPresent(int[] array, int n, int sum){
        int i=0,j=n-1;
        while(i!=j){
            if(array[i]+array[j]==sum)
                return true;
            else if(array[i]+ array[j]<sum){
                i++;
            }else j--;
        }
        return false;

    }

    //MoveAllZerostoendofArray
    public static Integer[] moveZero(Integer[] array, int n){
        Integer[] result= new Integer[n];
        int i=0;
        for(int j=0;j<n;j++){
            if(array[j]!=0)
                result[i++]=array[j];
        }
        while (i!=n)
            result[i++]=0;

        return result;
    }
    //Rearanging positive and Negitive numbers Using builtin  sort
    public static Integer[] rearangeArray(Integer[] array, int n){
        Arrays.sort(array,(a,b)-> Boolean.compare(a>0,a<0));
        return array;
    }
    //Rearange Even and Odd numbers Using builtIn function
    public static Integer[] rearangeUsingSort(Integer[] array, int n){
        Arrays.sort(array,(a,b)-> Integer.compare(a%2,b%2));
        return array;
    }


}
