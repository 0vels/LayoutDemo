package wang.layoutdemo.FrameLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import wang.layoutdemo.MainActivity;
import wang.layoutdemo.R;

import static android.view.Gravity.LEFT;
import static android.view.Gravity.TOP;

public class FrameLayoutForegroundActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout = new FrameLayout(this);
        TextView textView1 = new TextView(this);
        ImageView imageView = new ImageView(this);
        imageView.setForeground(getDrawable(R.drawable.hs));
        imageView.setForegroundGravity(LEFT|TOP);
        FrameLayout.LayoutParams text1 = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,FrameLayout.LayoutParams.WRAP_CONTENT);
        text1.height = MainActivity.dp2px(200);
        text1.width = MainActivity.dp2px(200);
        textView1.setBackgroundColor(Color.BLUE);
        textView1.setLayoutParams(text1);
        frameLayout.addView(textView1);
        setContentView(frameLayout);

    }
}
