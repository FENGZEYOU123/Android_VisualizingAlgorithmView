package com.yfz.visualizingsortview.algorithm;

import android.util.Log;

public class InsertSearch {
    private String TAG = "插值查找: ";
    int interval = 0;
    //int mid = lo + (hi - lo) * (target - array[lo]) / (array[hi]-array[lo])
    public int InsertSearch(int[] array, int lo, int hi, int target){
        //注意:findVal < arr[0] 和 findVal > arr[arr.length - 1] 必须需要
        // 否则我们得到的 mid 可能越界
        interval++;
        if (lo > hi || target < array[0] || target > array[array.length - 1]) {
            Log.d(TAG, "\n   第 "+interval+" 次:"+"\n 结果不存在，返回-1: ");
            return -1;
        }
        // 求出middle
        final int mid = lo + (hi - lo) * (target - array[lo]) / (array[hi] - array[lo]);
        final int midValue = array[mid];
        if(lo>mid){
            Log.d(TAG, "\n   第 "+interval+" 次:"+"\n 结果不存在，返回-1: ");
            return -1;
        }
        if (target > midValue) {
            //向右递归
            Log.d(TAG, "\n   第 "+interval+" 次:"+"\n 指针向 右 移: "+"\n left: "+lo+" \n right: "+hi+" \n middle: " +mid +" \n value: "+target);
            return InsertSearch(array, mid + 1, hi,target);
        } else if (target < midValue) {
            //向左递归
            Log.d(TAG, "\n   第 "+interval+" 次:"+"\n 指针向 左 移: "+"\n left: "+lo+" \n right: "+hi+" \n middle: " +mid +" \n value: "+target);
            return InsertSearch(array, lo,mid - 1,target);
        } else {
            Log.d(TAG, "\n   第 "+interval+" 次:"+"\n 指针找到结果，返回结果: "+mid);
            return mid;
        }
    }

}
