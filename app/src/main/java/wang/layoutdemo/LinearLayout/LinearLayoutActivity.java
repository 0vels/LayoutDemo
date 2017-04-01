package wang.layoutdemo.LinearLayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class LinearLayoutActivity extends AppCompatActivity {
    String[] layout = new String[]{"LinearLayoutBaseActivity", "LinearLayoutLeastCodeActivity", "LinearLayoutDividerActivity", "LinearLayoutGravityActivity","LinearLayoutWeightActivity","LinearLayoutMarginAndPaddingActivity"};

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
                        Intent intent1 = new Intent(LinearLayoutActivity.this, linearLayoutBaseActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(LinearLayoutActivity.this, LinearLayoutLeastCodeActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(LinearLayoutActivity.this, linearLayoutDividerActivity.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(LinearLayoutActivity.this, LinearLayoutGravityActivity.class);
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(LinearLayoutActivity.this, linearLayoutWeightActivity.class);
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 = new Intent(LinearLayoutActivity.this, linearLayoutMarginAndPaddingActivity.class);
                        startActivity(intent6);
                        break;
                }
            }
        });
        linearLayout.addView(listView);
        setContentView(linearLayout);
    }
}
