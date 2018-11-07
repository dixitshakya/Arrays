package ReverseArray;

import java.util.Stack;
public class ReverseArray {




//Using stack
public static Integer[] usingStack(Integer[] array, int n){
    Stack<Integer> arrayStack =  new Stack<>();
    for(Integer i: array)
        arrayStack.push(i);
    int j=0;
    while (!arrayStack.isEmpty()){
        array[j++] = arrayStack.pop();
    }
    return array;
}

//Using start and end index
    public static Integer[] usingSE(Integer[] array,int n){
    int temp=0;
    for(int i=0,j=n-1;i<n/2;i++,j--){
        temp = array[i];
        array[i]=array[j];
        array[j]= temp;
    }
    return array;
    }

    //Using Recursion to reverse string

    public static String  usingRecursion(String str){
    return reverseArray(str);

    }
    public static String  reverseArray(String str){
    if(str.length()==1)
        return str;
    return reverseArray(str.substring(1)) + str.charAt(0);
    }
}
