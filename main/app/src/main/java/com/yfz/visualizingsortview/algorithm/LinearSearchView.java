package com.yfz.visualizingsortview.algorithm;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.annotation.NonNull;

/**
 * https://github.com/FENGZEYOU123/Android_VisualizingAlgorithmView
 */

public class LinearSearchView extends SurfaceView implements SurfaceHolder.Callback{
    private Context mContext;
    //监听surface
    private SurfaceHolder mHolder;
    //画笔
    private Paint mPaint;
    //文字颜色
    private int mColorText = Color.BLACK;
    public LinearSearchView(Context context) {
        super(context);
        initial(context);
    }
    public LinearSearchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initial(context);
    }
    private void initial(Context context){
        mContext = context;
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mHolder= getHolder();
        mHolder.addCallback(this);
        mHolder.setFormat(PixelFormat.TRANSLUCENT);
        this.setKeepScreenOn(true);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder holder) {

    }
    private int doLinearSearch(int[] array, int targetInt){
        for(int i=0; i<array.length ;i++){
            if (array[i] == targetInt) {
                return i;
            }
        }
        return -1;
    }
}
