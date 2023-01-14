package com.example.wyther;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;


public class About extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.about);
        SunView sunView = new SunView(this);
        addContentView(sunView, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));


    }

    public static class SunView extends View {

        public SunView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int width = getWidth();
            int height = getHeight();

            Paint paint = new Paint();
            paint.setColor(Color.YELLOW);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);

            canvas.drawCircle(width / 2, (float) (height / 1.25), 150, paint);

            paint.setColor(Color.YELLOW);

            paint.setStyle(Paint.Style.STROKE);

            paint.setStrokeWidth(20);

            canvas.drawLine(width / 2 - 250, (float) (height / 1.25),
                    width / 2 + 250, (float) (height / 1.25), paint);
            canvas.drawLine(width / 2, (float) (height / 1.25) - 250,
                    width / 2, (float) (height / 1.25) + 250, paint);
            canvas.drawLine(width / 2 - 170, (float) (height / 1.25) - 170,
                    width / 2 + 170, (float) (height / 1.25) + 170, paint);
            canvas.drawLine(width / 2 - 170, (float) (height / 1.25) + 170,
                    width / 2 + 170, (float) (height / 1.25) - 170, paint);
            canvas.drawLine(width / 2 - 100, (float) (height / 1.25) - 250,
                    width / 2 + 100, (float) (height / 1.25) + 250, paint);
            canvas.drawLine(width / 2 - 100, (float) (height / 1.25) + 250,
                    width / 2 + 100, (float) (height / 1.25) - 250, paint);
            canvas.drawLine(width / 2 - 250, (float) (height / 1.25) - 100,
                    width / 2 + 250, (float) (height / 1.25) + 100, paint);
            canvas.drawLine(width / 2 - 250, (float) (height / 1.25) + 100,
                    width / 2 + 250, (float) (height / 1.25) - 100, paint);


        }
    }


}

