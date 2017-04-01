package wang.layoutdemo.RelativeLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import wang.layoutdemo.MainActivity;

public class RelativeLayoutAlighParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setId(0);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);

        RelativeLayout.LayoutParams text1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        text1.height = MainActivity.dp2px(100);
        text1.width = MainActivity.dp2px(100);
        text1.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        textView1.setBackgroundColor(Color.BLUE);
        textView1.setLayoutParams(text1);
        textView1.setId(View.generateViewId());


        RelativeLayout.LayoutParams text2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        text2.height = MainActivity.dp2px(100);
        text2.width = MainActivity.dp2px(100);
        text2.addRule(RelativeLayout.LEFT_OF, textView1.getId());
        textView2.setBackgroundColor(Color.RED);
        textView2.setLayoutParams(text2);
        textView2.setId(View.generateViewId());

        RelativeLayout.LayoutParams text3 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        text3.height = MainActivity.dp2px(100);
        text3.width = MainActivity.dp2px(100);
        text3.addRule(RelativeLayout.CENTER_IN_PARENT);
        textView3.setBackgroundColor(Color.GREEN);
        textView3.setLayoutParams(text3);
        textView3.setId(View.generateViewId());

        relativeLayout.addView(textView1);
        relativeLayout.addView(textView2);
        relativeLayout.addView(textView3);

        setContentView(relativeLayout);
    }
}
