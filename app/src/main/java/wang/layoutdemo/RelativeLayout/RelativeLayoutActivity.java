package wang.layoutdemo.RelativeLayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view1 = new View(this);
        View view2 = new View(this);
        View view3 = new View(this);
        view1.setBackgroundColor(Color.BLUE);
        view2.setBackgroundColor(Color.GREEN);
        view3.setBackgroundColor(Color.RED);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.addView(view1);
        relativeLayout.addView(view2);
        relativeLayout.addView(view3);
        setContentView(relativeLayout);
    }
}
