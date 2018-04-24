package c.example.bernadette.graphic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //paint method is use to draw a proper rectangle
        Paint paint=new Paint();
        paint.setColor(Color.parseColor("#da4747"));
// bitmap is used to set the background
        Bitmap bg=Bitmap.createBitmap(480,800,Bitmap.Config.ARGB_8888);
//use canvas where we draw the rectangle
        Canvas canvas=new Canvas(bg);
        canvas.drawRect(50,50,200,200,paint);//draw the rectangle within these coordinates
        LinearLayout ii=(LinearLayout) findViewById(R.id.comm);//specify under which the rectangle will appear
        ii.setBackground(new BitmapDrawable(bg));
    }

    }

