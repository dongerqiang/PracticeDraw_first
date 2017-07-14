package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    int wid = 500;
    int heig = 300;
    int xSpace = 10;
    int rectWid = 60;
    String[] title = {"Froyo","GB","IC S","JB","KitKat","L","M"};

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        canvas.drawLine(100,0,100,400,paint);
        canvas.drawLine(100,400,600,400,paint);

        //文字
        Rect rect = new Rect();
        paint.setTextSize(15);
        for (int i=0;i<7;i++){
            paint.getTextBounds(title[i],0,title[i].length(),rect);
            canvas.drawText(title[i],0,title[i].length(),100+rectWid*i+xSpace*(i+1)+(rectWid-rect.width())/2,420,paint);

        }
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL);
        float index =0;
        for (int i=0;i<7;i++){
            if(i==0){
                index=0;
            }else if(i ==1 || i==2){
                index = 0.05f;
            }else if(i ==3){
                index = 0.3f;
            }else if(i ==4){
                index = 0.5f;
            }else if(i ==5){
                index = 0.6f;
            }else if(i ==6){
                index = 0.2f;
            }
            canvas.drawRect(100+rectWid*i+xSpace*(i+1),400*(1-index),100+rectWid*i+xSpace*(i+1)+rectWid,400,paint);
        }
    }
}
