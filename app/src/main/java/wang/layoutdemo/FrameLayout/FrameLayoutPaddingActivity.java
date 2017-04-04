package wang.layoutdemo.FrameLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.TextView;

import wang.layoutdemo.MainActivity;

public class FrameLayoutPaddingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);
        frameLayout.setPadding(0, MainActivity.dp2px(20),0,0);
        FrameLayout.LayoutParams text1 = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);
        text1.height = MainActivity.dp2px(200);
        text1.width = MainActivity.dp2px(200);
        textView1.setBackgroundColor(Color.RED);
        textView1.setLayoutParams(text1);

        FrameLayout.LayoutParams text2 = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);
        text2.height = MainActivity.dp2px(150);
        text2.width = MainActivity.dp2px(150);
        textView2.setBackgroundColor(Color.GREEN);
        textView2.setLayoutParams(text2);

        FrameLayout.LayoutParams text3 = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);
        text3.height = MainActivity.dp2px(100);
        text3.width = MainActivity.dp2px(100);
        textView3.setBackgroundColor(Color.BLUE);
        textView3.setLayoutParams(text3);

        frameLayout.addView(textView1);
        frameLayout.addView(textView2);
        frameLayout.addView(textView3);
        setContentView(frameLayout);
    }
}
