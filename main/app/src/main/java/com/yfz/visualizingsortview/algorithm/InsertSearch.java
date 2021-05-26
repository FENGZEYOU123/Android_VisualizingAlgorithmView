package com.yfz.visualizingsortview.algorithm;

import android.util.Log;

public class InsertSearch {
    private String TAG = "插值查找: ";
    int interval = 0;
    //int mid = lo + (hi - lo) * (target - array[lo]) / (array[hi]-array[lo])
    public int InsertSearch(int[] arr, int left, int right, int value){
        //注意:findVal < arr[0] 和 findVal > arr[arr.length - 1] 必须需要
        // 否则我们得到的 mid 可能越界
        if (left > right || value < arr[0] || value > arr[arr.length - 1]) {
            return -1;
        }
        // 求出middle
        int middle = left + (right - left) * (value - arr[left]) / (arr[right] - arr[left]);
        if(left>middle){
            return -1;
        }
        interval++;
        if (value > arr[middle]) {
            //向右递归
            Log.d(TAG, "\n   第 "+interval+" 次:"+"\n 指针向 右 移: "+"\n left: "+left+" \n right: "+right+" \n middle: " +middle +" \n value: "+value);
            return InsertSearch(arr, middle + 1, right,value);
        } else if (value < arr[middle]) {
            //向左递归
            Log.d(TAG, "\n   第 "+interval+" 次:"+"\n 指针向 左 移: "+"\n left: "+left+" \n right: "+right+" \n middle: " +middle +" \n value: "+value);
            return InsertSearch(arr, left,middle - 1,value);
        } else {
            Log.d(TAG, "\n   第 "+interval+" 次:"+"\n 指针找到结果，返回结果: "+middle);
            return middle;
        }
    }

}
