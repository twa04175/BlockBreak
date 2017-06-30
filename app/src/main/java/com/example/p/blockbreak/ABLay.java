package com.example.p.blockbreak;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by P on 2017-06-29.
 */

public class ABLay extends ViewGroup {// 앱솔루트 클래스를 대체할 새로운 클래스를 만들어 보자

    private int x;
    private int y;

    public ABLay(Context context){
        super(context);
    };// 코딩에서 사용할 생성자

    public ABLay(Context context, AttributeSet attrs){
        super(context,attrs);
    }// XML 에서 사용하는 생성자

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {//실제로 Child View 를 배치하는 부분

    }

    // 모든 레이아웃은 LayoutParams 클래스를 포합하고 있다.
    public static class LayoutParams extends ViewGroup.LayoutParams {// LayoutParams InnerClass
        /*ViewGroup.LayoutParams Class가 static이기 때문에,
          생성자를 사용하기 위해서는 CustomLayout.LayoutParams도 static이어야함.*/
        public int x;
        public int y;

        public LayoutParams(int width, int height, int x, int y) {
            super(width,height);
            this.x = x;
            this.y = y;
        }


    }



}
