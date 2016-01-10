package superman.fashion.cn.hi.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import superman.fashion.cn.hi.R;


/**
 * Created by Administrator on 2015/12/24.
 */
public class TopTool extends RelativeLayout{

    public TopTool(Context context) {
        super(context);
    }

    public TopTool(Context context, AttributeSet attrs) {
        super(context, attrs);
        View.inflate(context, R.layout.top_tool,this);
    }
}
