package RotateArray;

import java.util.Arrays;

public class RotateClass {
    public static void main(String[] args){
    }

    //Rotate array One by One
    public static Integer[] usingOneByOne(Integer[] array, int rotateBy, int n){
        Integer[] result = Arrays.copyOf(array,n);
        for(int i=0;i<rotateBy;i++){
            int temp=result[0];
            for(int j=0;j<n-1;j++){
                result[j]=result[j+1];
            }
            result[n-1]=temp;
        }
        return result;
    }

    //Using Mod
    public static Integer[] usingMod(Integer[] array, int rotateBy, int n){
        Integer[] result = new Integer[n];
        int mod = rotateBy % n;
        for(int i=0,j=0;i<n;++i)
            result[j++] = array[(mod+i)%n];
        return result;
    }

    //using reverse algorithm
    public static Integer[] usingReverse(Integer[] array, int rotateBy, int n){
        Integer[] result = Arrays.copyOf(array,n);
        reverse(result,0,rotateBy-1);
        reverse(result,rotateBy,n-1);
        reverse(result,0,n-1);
        return result;
    }
    public static void reverse(Integer[] a, int start, int end){
        while(start<end){
            int temp = a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }


    //Using extra array
    //O(n)-Time Complexity
    //O(d)- Space Complexity
    public static Integer[] usingTempArray(Integer[] array, int rotateBy, int n){
        Integer[] result= new Integer[n];
        int j=0,k=0;
        for(int i=rotateBy;i<n;i++)
            result[j++]=array[i];
        while (k!=rotateBy)
            result[j++] = array[k++];
        return result;
    }
}
