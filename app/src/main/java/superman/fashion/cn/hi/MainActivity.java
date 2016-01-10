package superman.fashion.cn.hi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import superman.fashion.cn.hi.ui.BottomTool;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomTool bottomTool = (BottomTool) findViewById(R.id.bottom_tool);
        bottomTool.setItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 2) {
                    Toast.makeText(MainActivity.this, "the third part is click", Toast.LENGTH_LONG).show();
                    TextView tv = (TextView) MainActivity.this.findViewById(R.id.testText);
                    tv.setText("hello my listener");
                }
            }
        });
    }
}
