package superman.fashion.cn.hi.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import superman.fashion.cn.hi.R;

/**
 * Created by Administrator on 2015/12/23.
 */
public class BottomTool extends LinearLayout implements View.OnClickListener {
    private ImageButton btn1;
    private ImageButton btn2;

    public void setItemClickListener(AdapterView.OnItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    private ImageButton btn3;
    private ImageButton btn4;
    private int idBtn1;
    private int idBtn2;
    private int idBtn3;
    private int idBtn4;
    private AdapterView.OnItemClickListener itemClickListener;

    public BottomTool(Context context) {
        super(context);
    }

    public BottomTool(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context, R.layout.bottom_tool, this);
        initView();
        setImageBottomClickListener();
    }

    private void initView() {
        btn1 = (ImageButton) this.findViewById(R.id.bottom_tool_btn1);
        btn2 = (ImageButton) this.findViewById(R.id.bottom_tool_btn2);
        btn3 = (ImageButton) this.findViewById(R.id.bottom_tool_btn3);
        btn4 = (ImageButton) this.findViewById(R.id.bottom_tool_btn4);
        idBtn1 = btn1.getId();
        idBtn2 = btn2.getId();
        idBtn3 = btn3.getId();
        idBtn4 = btn4.getId();
    }

    private void setImageBottomClickListener() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        ImageButton ib = (ImageButton)v;
        resetBackImage();
        if (this.itemClickListener != null) {
            if (id == idBtn1) {
                ib.setBackgroundResource(R.mipmap.tab_hi_pressed);
                this.itemClickListener.onItemClick(null, v, 0, 0);
            }else if(id == idBtn2){
                ib.setBackgroundResource(R.mipmap.tab_music_pressed);
                this.itemClickListener.onItemClick(null, v, 1, 0);
            }else if(id == idBtn3){
                ib.setBackgroundResource(R.mipmap.tab_alarm_pressed);
                this.itemClickListener.onItemClick(null, v, 2, 0);
            }else{
                ib.setBackgroundResource(R.mipmap.tab_settings_pressed);
                this.itemClickListener.onItemClick(null, v, 3, 0);
            }
        }
    }

    private void resetBackImage() {
        btn1.setBackgroundResource(R.mipmap.tab_hi_normal);
        btn2.setBackgroundResource(R.mipmap.tab_music_normal);
        btn3.setBackgroundResource(R.mipmap.tab_alarm_normal);
        btn4.setBackgroundResource(R.mipmap.tab_settings_normal);
    }
}
