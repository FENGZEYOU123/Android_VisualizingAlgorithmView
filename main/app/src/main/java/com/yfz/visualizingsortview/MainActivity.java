package com.yfz.visualizingsortview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.yfz.visualizingsortview.algorithm.InsertSearch;

public class MainActivity extends AppCompatActivity {
    private final int[] array = new int[]{1,2,3,9,13,22,33,45,99,103,111,112,235,496,521,812,1002};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InsertSearch insertSearch = new InsertSearch();
        insertSearch.InsertSearch(array,0,array.length-1,125);
    }

}