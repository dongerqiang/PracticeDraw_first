package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        drawPie(canvas);
    }

    String[] title = {"Froyo","GB","IC S","JB","KitKat","L","M"};
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void drawPie(Canvas canvas) {
        //0.4
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        canvas.drawArc(100,0,400,300,-184,140,true,paint);
        canvas.translate(10,15);
        //0.1
        paint.setColor(Color.RED);
        canvas.drawArc(100,0,400,300,-40,36,true,paint);
        //0.02
        paint.setColor(Color.GRAY);
        canvas.drawArc(100,0,400,300,-4,7.2F,true,paint);
        //0.04 0.04
        paint.setColor(Color.BLUE);
        canvas.drawArc(100,0,400,300,3.2F,14.4F,true,paint);
        paint.setColor(Color.MAGENTA);
        canvas.drawArc(100,0,400,300,17.6F,14.4F,true,paint);
        //0.2
        paint.setColor(Color.GREEN);
        canvas.drawArc(100,0,400,300,32F,72F,true,paint);
        //0.2
        paint.setColor(Color.CYAN);
        canvas.drawArc(100,0,400,300,104,72F,true,paint);
    }
}
