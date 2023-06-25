package Recursion;

import java.util.ArrayList;

public class linearSearch_recursion {
    static boolean isFound(int [] arr, int target, int index){
        if (index == arr.length){
            return false;
        }

        return arr[index] == target || isFound(arr,target,index + 1);
    }
    static int findIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return findIndex(arr,target,index + 1);
        }
    }
    static int findIndexFromLast(int [] arr, int target, int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else{
            return findIndexFromLast(arr,target,index - 1);
        }
    }


    static ArrayList<Integer> findAllEle(int [] arr, int target, int index, ArrayList<Integer> ans){

        if (index == arr.length){
            return ans;
        }
        if (arr[index] == target){
            ans.add(index);
        }
        return findAllEle(arr,target,index + 1, ans);
    }

    static ArrayList<Integer> findAllEle2(int [] arr, int target, int index){
        ArrayList<Integer> ans = new ArrayList<>();
        if (index == arr.length){
            return ans;
        }
        if (arr[index] == target){
            ans.add(index);
        }
        ArrayList<Integer> ansfrombelowcalls =  findAllEle2(arr,target,index + 1);
        ans.addAll(ansfrombelowcalls);

        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {2, 5 , 8, 9, 100, 100 , 41};
        System.out.println(isFound(arr,100,0));
        System.out.println(findIndex(arr,100,0));
        System.out.println(findIndexFromLast(arr,100,arr.length - 1));
        ArrayList<Integer> ans = findAllEle(arr,100,0, new ArrayList<>());
        System.out.println(ans);

        System.out.println(findAllEle2(arr,100,0));
    }
}
