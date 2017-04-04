package wang.layoutdemo.RelativeLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

import wang.layoutdemo.MainActivity;

public class RelativeLayoutBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);

        RelativeLayout.LayoutParams text1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        text1.height = MainActivity.dp2px(200);
        text1.width = MainActivity.dp2px(200);
        textView1.setBackgroundColor(Color.RED);
        textView1.setLayoutParams(text1);

        RelativeLayout.LayoutParams text2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        text2.height = MainActivity.dp2px(150);
        text2.width = MainActivity.dp2px(150);
        textView2.setBackgroundColor(Color.GREEN);
        textView2.setLayoutParams(text2);

        RelativeLayout.LayoutParams text3 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        text3.height = MainActivity.dp2px(100);
        text3.width = MainActivity.dp2px(100);
        textView3.setBackgroundColor(Color.BLUE);
        textView3.setLayoutParams(text3);

        relativeLayout.addView(textView1);
        relativeLayout.addView(textView2);
        relativeLayout.addView(textView3);

        setContentView(relativeLayout);
    }
}
