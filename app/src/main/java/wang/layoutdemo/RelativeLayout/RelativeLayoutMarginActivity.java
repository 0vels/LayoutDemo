package wang.layoutdemo.RelativeLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import wang.layoutdemo.MainActivity;

public class RelativeLayoutMarginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);
        ImageView imageView = new ImageView(this);

        RelativeLayout.LayoutParams text1 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        text1.height = MainActivity.dp2px(100);
        text1.width = MainActivity.dp2px(100);
        text1.setMargins(MainActivity.dp2px(10), MainActivity.dp2px(10), 0, 0);
        textView1.setBackgroundColor(Color.RED);
        textView1.setLayoutParams(text1);

//        RelativeLayout.LayoutParams imageParam = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
//        imageParam.height = MainActivity.dp2px(100);
//        imageParam.width = MainActivity.dp2px(100);
//        imageParam.addRule(RelativeLayout.CENTER_IN_PARENT);
//        imageView.setBackgroundColor(Color.GRAY);
//        imageView.setPadding(MainActivity.dp2px(20), MainActivity.dp2px(20), 0, 0);
//        imageView.setImageDrawable(getDrawable(R.drawable.zhs));
//        imageView.setLayoutParams(imageParam);
//
//        RelativeLayout.LayoutParams text2 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
////        RelativeLayout.LayoutParams text4 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,RelativeLayout.LayoutParams.MATCH_PARENT);
//        text2.height = MainActivity.dp2px(100);
//        text2.width = MainActivity.dp2px(100);
////        textView4.setBackgroundColor(Color.BLACK);
//        textView2.setPadding(MainActivity.dp2px(10),MainActivity.dp2px(15),0,0);
//        textView2.setBackgroundColor(Color.RED);
////        textView4.setLayoutParams(text4);
//        textView2.setLayoutParams(text2);
//
//        RelativeLayout.LayoutParams text3 = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
//        text3.height = MainActivity.dp2px(100);
//        text3.width = MainActivity.dp2px(100);
//        textView3.setBackgroundColor(Color.GREEN);
//        textView3.setLayoutParams(text3);

        relativeLayout.addView(textView1);
//        relativeLayout.addView(imageView);
//        relativeLayout.addView(textView2);
//        relativeLayout.addView(textView3);

        setContentView(relativeLayout);
    }
}
