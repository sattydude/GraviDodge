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
    Bitmap bmp;
    Canvas bitmap;
    public Background(Bitmap res, int screenWidth, int screenHeight)
    {

        image = res;
        Bitmap.Config conf = Bitmap.Config.ARGB_8888; // see other conf types
        bmp = Bitmap.createBitmap(screenWidth, screenHeight, conf); // this creates a MUTABLE bitmap

        bitmap = new Canvas(bmp);

        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        int starCount = 4000;
        // int[] stars = new int[starCount];

       // while (true){   System.out.println(Math.random());   }
        for (int i = 0 ; i < starCount; ++i){
            int xPixel = (int)Math.floor(Math.random() * screenWidth);
            int yPixel = (int)Math.floor(Math.random() * screenHeight);
            //  bitmap.drawPoint( (int)Math.floor(Math.random() % screenWidth) , (int)Math.floor(Math.random() % screenHeight), paint);
            bmp.setPixel(xPixel, yPixel, Color.WHITE);

            System.out.println("( " + xPixel + ", " + yPixel + " )");
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

        canvas.drawBitmap(bmp, 0, 0, null);
       // canvas.drawBitmap(image, x, y,null);
        if(x<0)
        {
            canvas.drawBitmap(bmp, x+GamePanel.WIDTH, y, null);
        }
    }
    public void setVector( int dx )
    {

        this.dx = dx;
    }
}
