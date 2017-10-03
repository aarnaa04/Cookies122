package com.example.android.cookies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnClickListener;
import static com.example.android.cookies.R.id.status_text_view;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    //ImageView image;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      // image =(ImageView) findViewById(R.id.android_cookie_image_view);
         b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(MainActivity.this);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.



        // TODO: Find a reference to the TextView in the layout. Change the text.

    }

    @Override
    public void onClick(View v) {
        ImageView imageview =(ImageView) findViewById(R.id.android_cookie_image_view);
        imageview.setImageResource(R.drawable.after_cookie);
       // imageview.setImageResource(R.drawable.before_cookie);
        TextView textView=(TextView) findViewById(status_text_view);
        textView.setText("I'm Full");
        textView.setTextSize(40);
    }
}