package wang.layoutdemo.GridLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import wang.layoutdemo.LinearLayout.linearLayoutDividerActivity;

public class GridLayoutActivity extends AppCompatActivity {
    String[] layout = new String[]{"GridLeastCodeActivity", "GridBaseActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        ListView listView = new ListView(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, layout));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(GridLayoutActivity.this, GridLeastCodeActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(GridLayoutActivity.this, GridBaseActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(GridLayoutActivity.this, linearLayoutDividerActivity.class);
                        startActivity(intent3);
                        break;

                }
            }
        });
        linearLayout.addView(listView);
        setContentView(linearLayout);
    }
}
