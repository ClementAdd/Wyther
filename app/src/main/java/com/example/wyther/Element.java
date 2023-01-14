package com.example.wyther;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class Element extends View {
    public Element(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int hauteur = getMeasuredHeight();
        int largeur = getMeasuredWidth();

        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);

        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        path.lineTo(0, 0);
        path.lineTo(0, hauteur);
        path.lineTo(largeur, hauteur);
        path.lineTo(largeur, 0);
        canvas.drawPath(path, paint);

        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(largeur / 2, hauteur / 2, largeur / 2, paint);
    }
}
