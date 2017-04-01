package wang.layoutdemo.LinearLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view1 = new View(this);
        View view2 = new View(this);
        View view3 = new View(this);
        view1.setBackgroundColor(Color.BLUE);
        view2.setBackgroundColor(Color.GREEN);
        view3.setBackgroundColor(Color.RED);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.addView(view1);
        linearLayout.addView(view2);
        linearLayout.addView(view3);
        setContentView(linearLayout);
    }
}
