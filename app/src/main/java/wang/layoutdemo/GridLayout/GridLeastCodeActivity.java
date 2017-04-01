package wang.layoutdemo.GridLayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridLayout;

public class GridLeastCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridLayout gridLayout = new GridLayout(this);
        setContentView(gridLayout);
    }
}
