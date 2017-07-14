package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(Color.DKGRAY);
        Path path = new Path();
        /*path.addCircle(200,200,100, Path.Direction.CW);
        canvas.drawPath(path,paint);
        paint.setStyle(Paint.Style.STROKE);
        path.moveTo(2,2);
        path.lineTo(300,300);
        path.rLineTo(300,0);
        canvas.drawPath(path,paint);*/
        path.moveTo(100,140);
        path.rQuadTo(20,-60,50,-10);
        path.rQuadTo(30,-50,50,20);
        path.rLineTo(-50,60);
        path.rLineTo(-50,-60);
        canvas.drawPath(path,paint);


    }
}
