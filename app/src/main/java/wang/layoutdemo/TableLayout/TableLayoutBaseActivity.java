package wang.layoutdemo.TableLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class TableLayoutBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout tableLayout = new TableLayout(this);
        TableRow tableRow =new TableRow(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);

        LinearLayout.LayoutParams text1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        textView1.setText("111");
        textView1.setBackgroundColor(Color.BLUE);
        textView1.setLayoutParams(text1);
        LinearLayout.LayoutParams text2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        textView2.setText("222");
        textView2.setBackgroundColor(Color.RED);
        textView2.setLayoutParams(text2);
        LinearLayout.LayoutParams text3 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        textView3.setText("333");
        textView3.setBackgroundColor(Color.GREEN);
        textView3.setLayoutParams(text3);

        tableRow.addView(textView1);
        tableRow.addView(textView2);
        tableRow.addView(textView3);
        tableLayout.addView(tableRow);
        setContentView(tableLayout);
    }
}
