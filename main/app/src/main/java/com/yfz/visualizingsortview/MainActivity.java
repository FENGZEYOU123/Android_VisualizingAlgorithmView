package com.yfz.visualizingsortview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.yfz.visualizingsortview.algorithm.InsertSearch;

public class MainActivity extends AppCompatActivity {
    private final int mMax = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InsertSearch insertSearch = new InsertSearch();
//        int[] array = new int[mMax];
//        for (int i = 0; i<mMax; i++){
//            array[i]=i+1;
//        }
        int[] array = new int[]{1,2,3,9,13,22,45,99,103,111,112,521,812};
        insertSearch.InsertSearch(array,0,array.length-1,3);
    }

}