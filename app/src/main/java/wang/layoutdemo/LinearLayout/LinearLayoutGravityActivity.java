package wang.layoutdemo.LinearLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import wang.layoutdemo.MainActivity;

public class LinearLayoutGravityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);

        linearLayout.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams text1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        text1.height = MainActivity.dp2px(50);
        text1.width = MainActivity.dp2px(50);
        text1.gravity = Gravity.CENTER_HORIZONTAL;
        textView1.setBackgroundColor(Color.RED);
        textView1.setLayoutParams(text1);

        LinearLayout.LayoutParams text2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        text2.height = MainActivity.dp2px(50);
        text2.width = MainActivity.dp2px(200);
        textView2.setBackgroundColor(Color.GREEN);
        textView2.setGravity(Gravity.END);
        textView2.setText("Gravity");
        textView2.setLayoutParams(text2);

        LinearLayout.LayoutParams text3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        text3.height = MainActivity.dp2px(50);
        text3.width = MainActivity.dp2px(50);
        textView3.setBackgroundColor(Color.BLUE);
        textView3.setLayoutParams(text3);

        linearLayout.addView(textView1);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        setContentView(linearLayout);
    }
}
