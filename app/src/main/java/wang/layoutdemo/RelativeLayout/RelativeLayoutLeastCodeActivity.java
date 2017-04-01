package wang.layoutdemo.RelativeLayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;

public class RelativeLayoutLeastCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        setContentView(relativeLayout);
    }
}
