package com.example.p.blockbreak;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import static android.R.attr.maxHeight;
import static android.R.attr.maxWidth;

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
        // 차일드 뷰의 위치를 잡아준다

        int maxWidth = getMeasuredWidth();// 뷰의 전체 넓이
        int maxHeight = getMeasuredHeight();// 뷰의 전체 높이

        final int count = getChildCount();// 뷰의 갯수

        for (int i = 0; i < count; i++) {// 뷰만큼 반복
            final View child = getChildAt(i);// 첫번쨰 뷰를 얻는다
            final LayoutParams lp = (LayoutParams) child.getLayoutParams();// 첫번째 뷰의 레이아웃을 얻는다

            int cl = lp.x;
            int ct = lp.y;
            int cr = cl+lp.width;
            int cb = cl+lp.height;

            /*자식뷰 위치지정*/
            child.layout(50, 50, 50, 50);
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        final int count = getChildCount();

        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
            final LayoutParams lp = (LayoutParams)child.getLayoutParams();


            /*자식뷰 크기지정*/
            /*고정크기로 설정하기 위해 MeasureSpec.EXACTLY 사용 */
            child.measure(MeasureSpec.makeMeasureSpec(0,MeasureSpec.EXACTLY)
                    ,MeasureSpec.makeMeasureSpec(0,MeasureSpec.EXACTLY));

        }

        setMeasuredDimension(maxWidth,maxHeight);
    }

    // 모든 레이아웃은 LayoutParams 클래스를 포합하고 있다.
    public static class LayoutParams extends ViewGroup.LayoutParams {// LayoutParams InnerClass
        /*ViewGroup.LayoutParams Class가 static이기 때문에,
          생성자를 사용하기 위해서는 CustomLayout.LayoutParams도 static이어야함.*/
        public int x;// x값
        public int y;// y값

        public LayoutParams(int width, int height, int x, int y) {
            super(width,height);//레이아웃 가로세로
            this.x = x;// 포지션
            this.y = y;// 포지션
        }

    }





}
