package tdc.edu.vn.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout control_layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        control_layout = findViewById(R.id.control_layout);
        View   view = getLayoutInflater().inflate(R.layout.control_layout,control_layout,true);
    }
}
