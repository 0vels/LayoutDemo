package wang.layoutdemo.TableLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class TableLayoutBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout tableLayout = new TableLayout(this);
        TableRow tableRow = new TableRow(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);
//        TableRow tableRow1 = new TableRow(this);
//        for (int row = 0; row < 10; row++) {
//
//            for (int col = 0; col < 8; col++) {                     //tv用于显示
//                TextView tv = new TextView(this);
//                tv.setText("(" + col + "," + row + ")");
//                tableRow1.addView(tv);
//            }
//        }


        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT);
        tableLayout.setBackgroundColor(Color.GRAY);
        tableLayout.setLayoutParams(layoutParams);

        TableLayout.LayoutParams tableRowParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT);
        tableRow.setBackgroundColor(Color.BLUE);
        tableRow.setLayoutParams(tableRowParams);

        TableRow.LayoutParams text1 = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        textView1.setText("111");
        textView1.setBackgroundColor(Color.BLUE);
        textView1.setLayoutParams(text1);
        TableRow.LayoutParams text2 = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        textView2.setText("222");
        textView2.setBackgroundColor(Color.RED);
        textView2.setLayoutParams(text2);
        TableRow.LayoutParams text3 = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
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
