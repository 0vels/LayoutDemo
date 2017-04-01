package wang.layoutdemo.TableLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class TableLayoutShrinkAndStretchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TableLayout tableLayout = new TableLayout(this);
        TableRow tableRow = new TableRow(this);
        TextView textView1 = new TextView(this);
        TextView textView2 = new TextView(this);
        TextView textView3 = new TextView(this);
        TextView textView4 = new TextView(this);



        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT);
        tableLayout.setBackgroundColor(Color.GRAY);
        tableLayout.setColumnShrinkable(0,true);
        tableLayout.setColumnStretchable(1,true);
        tableLayout.setColumnCollapsed(2, true);
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
        TableRow.LayoutParams text4= new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
        textView4.setText("444");
        textView4.setBackgroundColor(Color.GREEN);
        textView4.setLayoutParams(text4);

        tableRow.addView(textView1);
        tableRow.addView(textView2);
        tableRow.addView(textView3);
        tableRow.addView(textView4);
        tableLayout.addView(tableRow);
        setContentView(tableLayout);
    }
}
