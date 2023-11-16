package com.example.ca2;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class MyView extends View {
    Paint p,p1,p2;
    int a,b,m= 0;
    int w=100, x1=400, y=1250, z=838, u=678, v= 838;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    void init()
    {
        p = new Paint();
        p1 = new Paint();
        p2  = new Paint();
    }



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {

       // Toast.makeText(getContext(), ""+rectC1+"\n"+rectC2, Toast.LENGTH_SHORT).show();

      canvas.drawColor(Color.YELLOW);
        p.setColor(Color.RED);
        p.setStrokeWidth(30);
        p.setStyle(Paint.Style.STROKE);
        p1.setColor(Color.BLACK);
        p2.setColor(Color.TRANSPARENT);


        canvas.drawRect(w+m,x1,y+m,z,p2);

        canvas.drawLine(100+m,600,300+m,600,p);

        canvas.drawLine(300+m,600,350+m,400,p);

        canvas.drawLine(350+m,400,900+m,400,p);

        canvas.drawLine(900+m,400,1000+m,600,p);

        canvas.drawLine(1000+m,600,1250+m,600,p);

        canvas.drawLine(370+m,600,950+m,600,p);

        canvas.drawLine(100+m,600,100+m,canvas.getWidth()/2+120,p);

        canvas.drawLine(1250+m,600,1250+m,canvas.getWidth()/2+120,p);

        canvas.drawLine(100+m,canvas.getWidth()/2+120,1250+m,canvas.getWidth()/2+120,p);

        canvas.drawCircle(350+m,canvas.getWidth()/2+120,110,p1);

        canvas.drawCircle(1000+m,canvas.getWidth()/2+120,110,p1);






    }




    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        a = (int) event.getX();
        b = (int) event.getY();


        switch (event.getAction())
        {
            case MotionEvent.ACTION_MOVE:
                if(a>w+m && a<u+m && b>x1+m && b<v+m)
                {
                    m-=05;
                    invalidate();
                }
                 if(a>u+m && a<y+m && b>x1+m && b<v+m)
                {
                   m+=05;
                     invalidate();
                }

                break;
        }

        return true;
    }
}
