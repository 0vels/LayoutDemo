package wang.layoutdemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import wang.layoutdemo.FrameLayout.FrameLayoutActivity;
import wang.layoutdemo.FrameLayout.FrameLayoutBaseActivity;
import wang.layoutdemo.GridLayout.GridLayoutActivity;
import wang.layoutdemo.LinearLayout.LinearLayoutActivity;
import wang.layoutdemo.RelativeLayout.RelativeLayoutActivity;

public class MainActivity extends AppCompatActivity {

    public static Context context;
    String[] layout = new String[] {"LinearLayout","RelativeLayout","FrameLayout","FrameLayoutBaseActivity"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        ListView listView = new ListView(this);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));
        listView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,layout));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, LinearLayoutActivity.class);
                        startActivity(intent1);
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                        startActivity(intent2);
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, FrameLayoutActivity.class);
                        startActivity(intent3);
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, FrameLayoutBaseActivity.class);
                        startActivity(intent4);
                    case 5:
                        Intent intent5 = new Intent(MainActivity.this, GridLayoutActivity.class);
                        startActivity(intent5);
                }
            }
        });
        linearLayout.addView(listView);
        setContentView(linearLayout);

    }

    @Override
    protected void onResume() {
        super.onResume();
        context = this;
    }


    final static float scale() {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int dp2px(float dp) {
        return (int) (dp * scale() + 0.5f);
    }

    public static int px2dp(float px) {
        return (int) (px / scale() + 0.5f);
    }
    /*
     * public static int dp2sp(float dp) { return (int)
	 * (TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
	 * context.getResources().getDisplayMetrics())); }
	 */

    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    public static int px2sp(Context context, float pxValue) {
        float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);

    }



}
