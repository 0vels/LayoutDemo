package wang.layoutdemo.GridLayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridLayout;
import android.widget.TextView;

import wang.layoutdemo.MainActivity;

public class GridBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridLayout gridLayout = new GridLayout(this);
        gridLayout.setColumnCount(3);
        gridLayout.setRowCount(5);

        for (int i = 0; i < 15; i++) {
            TextView textView = new TextView(this);
            GridLayout.LayoutParams textParam = new GridLayout.LayoutParams();
            textParam.width = MainActivity.dp2px(20);
            textParam.height = MainActivity.dp2px(20);
            textView.setLayoutParams(textParam);
            textView.setText(i + "");
            gridLayout.addView(textView);
        }

//        TextView textView = new TextView(this);
//        GridLayout.Spec row1 = GridLayout.spec(2);
//        GridLayout.Spec col1 = GridLayout.spec(3);
//        GridLayout.LayoutParams textParam = new GridLayout.LayoutParams(row1,col1);
//        textParam.width = MainActivity.dp2px(20);
//        textParam.height = MainActivity.dp2px(20);
//
//        textView.setLayoutParams(textParam);
//        textView.setText("a");
//
//        gridLayout.addView(textView);

        setContentView(gridLayout);
    }
}
