package tdc.edu.vn.test.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import tdc.edu.vn.test.R;

public class Player extends LinearLayout {
    private ImageView btn_next, btn_stop, btn_pause, btn_play, btn_preious;
    private ViewGroup playerLayout;
    public Player(Context context) {
        super(context);
        initialization();
    }

    public Player(Context context,  AttributeSet attrs) {
        super(context, attrs);
        initialization();
    }

    public Player(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialization();
    }
    // Initialization
    private void initialization(){
        inflate(getContext(), R.layout.control_layout,this);
//        playerLayout = (ViewGroup) getChildAt(0);
//        btn_preious = playerLayout.findViewById(R.id.imgView_previous_btn);
//        btn_play = playerLayout.findViewById(R.id.imgView_play_btn);
//        btn_pause = playerLayout.findViewById(R.id.imgView_pause_btn);
//        btn_stop = playerLayout.findViewById(R.id.imgView_stop_btn);
//        btn_next = playerLayout.findViewById(R.id.imgView_next_btn);
    }
}
