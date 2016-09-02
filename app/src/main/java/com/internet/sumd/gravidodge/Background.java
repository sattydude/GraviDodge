package com.internet.sumd.gravidodge;

/**
 * Created by satty on 9/2/2016.
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Bitmap.Config;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.DisplayMetrics;

public class Background {

    private Bitmap image;
    private int x, y, dx;

    Bitmap back, middle, front;
    Canvas bitmap;
    public Background(Bitmap res)
    {

        image = res;

    }
    public Background(int screenWidth, int screenHeight)
    {



        Bitmap.Config conf = Bitmap.Config.ARGB_8888; // see other conf types
        Bitmap bmp = Bitmap.createBitmap(screenWidth, screenHeight, conf); // this creates a MUTABLE bitmap
        bitmap = new Canvas(bmp);
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        int starCount = 200;
       // int[] stars = new int[starCount];
        for (int i = 0 ; i < starCount; ++i){
            bitmap.drawPoint( (int)Math.floor(Math.random() % screenWidth) , (int)Math.floor(Math.random() % screenHeight), paint);
        }




    }
    public void update()
    {
        x += dx;

        if( x <- GamePanel.WIDTH )
        {
            x = 0;
        }
    }
    public void draw(Canvas canvas)
    {

        canvas.paint(bitmap);
        canvas.drawBitmap(image, x, y,null);
        if(x<0)
        {
            canvas.drawBitmap(image, x+GamePanel.WIDTH, y, null);
        }
    }
    public void setVector( int dx )
    {

        this.dx = dx;
    }
}
