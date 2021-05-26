package com.yfz.visualizingsortview.algorithm;

public class BinarySearch {
    public int BinarySearch(int[] array, int targetInt){
        int lo = 0; //左坐标
        int hi = array.length - 1; //右坐标
        while (lo <= hi){
            int middle = lo + (hi - lo)/2;
            if(array[middle] == targetInt){
                return middle;
            }else if(targetInt > array[middle]){
                lo = middle+1;
            }else if(targetInt < array[middle]){
                hi = middle-1;
            }
        }
        return -1;
    }
}
