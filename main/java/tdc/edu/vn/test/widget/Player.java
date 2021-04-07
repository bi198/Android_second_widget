package tdc.edu.vn.test.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.io.Console;

import tdc.edu.vn.test.R;

public class Player extends LinearLayout {
    private ImageView btn_next, btn_stop, btn_pause, btn_play, btn_preious;
    private ViewGroup playerLayout;
    public Player(Context context) {
        super(context);
        initialization();
    }

    public Player(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialization();
    }

    public Player(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialization();
    }
    private OnClickListener onClickListener_Btn = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.isSelected())
            {
                v.setSelected(false);
            }
            else{
                v.setSelected(true);
                Log.d("test" ,v.isSelected() +"");
                int count = playerLayout.getChildCount();
                for (int i = 0 ; i < count ; ++i)
                {
                    if (playerLayout.getChildAt(i).getId() != v.getId()){
                        playerLayout.getChildAt(i).setSelected(false);
                    }

                }
            }
        }
    };
    // Initialization
    private void initialization(){
        inflate(getContext(), R.layout.control_layout,this);
        playerLayout = (ViewGroup) getChildAt(0);
        btn_preious = playerLayout.findViewById(R.id.imgView_previous_btn);
        btn_play = playerLayout.findViewById(R.id.imgView_play_btn);
        btn_pause = playerLayout.findViewById(R.id.imgView_pause_btn);
        btn_stop = playerLayout.findViewById(R.id.imgView_stop_btn);
        btn_next = playerLayout.findViewById(R.id.imgView_next_btn);
        // Set isSelected for btn
        btn_preious.setOnClickListener(onClickListener_Btn);
        btn_play.setOnClickListener(onClickListener_Btn);
        btn_pause.setOnClickListener(onClickListener_Btn);
        btn_stop.setOnClickListener(onClickListener_Btn);
        btn_next.setOnClickListener(onClickListener_Btn);

    }

}
