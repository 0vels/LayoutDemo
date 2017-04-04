package wang.layoutdemo.LinearLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class linearLayoutWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);

        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.GRAY);


        LinearLayout.LayoutParams text1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        text1.height = 0;
        text1.weight = 1;
        textView1.setBackgroundColor(Color.RED);
        textView1.setLayoutParams(text1);

        LinearLayout.LayoutParams text2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        text2.height = 0;
        text2.weight = 2;
        textView2.setBackgroundColor(Color.GREEN);
        textView2.setLayoutParams(text2);

        LinearLayout.LayoutParams text3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT,3);
        text3.height = 0;
//        text3.weight = 3;
        textView3.setBackgroundColor(Color.BLUE);
        textView3.setLayoutParams(text3);

        linearLayout.addView(textView1);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        setContentView(linearLayout);
    }
}
