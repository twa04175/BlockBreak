package com.example.p.blockbreak;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by P on 2017-06-29.
 */

public class CustomView extends View {

    private int curValue = 0; //현재값 저장
    private int maxValue = 100; //최대값 저장
    private int lineColor = 0xff000000; //진행바 색 저장

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public int getLineColor() {
        return lineColor;
    }

    public void setLineColor(int color) {
        this.lineColor = color;
        invalidate();
        requestLayout();
    }

    public int getCurValue() {
        return curValue;
    }

    public void setCurValue(int curValue) {
        this.curValue = curValue;
        invalidate();
        requestLayout();
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
        invalidate();
        requestLayout();
    }

    Handler mHandler = new Handler();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width  =  this.getMeasuredWidth();
        int height = this.getMeasuredHeight();


        // 진행바 그리기 속성
        Paint circle = new Paint();
        circle.setColor(this.lineColor);
        circle.setStrokeWidth(10);
        circle.setAntiAlias(false);
        circle.setStyle(Paint.Style.STROKE);


        // 진행바 그리기
        canvas.drawArc(new RectF(0,0,width,height),-90,((float)this.curValue/(float)this.maxValue*360),false,circle);


        // 텍스트 그리기 속성
        Paint textp = new Paint();
        textp.setColor(Color.BLACK);
        textp.setTextSize(100);
        textp.setTextAlign(Paint.Align.CENTER);



        // 짝수초에는 텍스트를 표시하고 홀수초에는 텍스트를 표시하지 않는다.
        // 깜빡깜빡거리는 효과
        if(System.currentTimeMillis()/1000%2==0) {//짝수초 판정
            // 텍스트 그리기
            canvas.drawText(this.curValue + " / " + this.maxValue, width / 2, height / 2, textp);
            // this.curValue + " / " + this.maxValue 출력 , 가로크기,세로길이, 색상
        }


        // 1초후에 invalidate()호출을 통해 해당 View를 다시 그리게 한다.
        // 깜빡깜빡거리는 효과를 위해서 아래 코드 사용
        mHandler.postDelayed(new Runnable() {//시간제어용 2번째 인자로 마이크로초로 제어
            @Override
            public void run() {
                invalidate();// 뷰 재호출
                curValue++;
            }
        },1000);


    }
}
