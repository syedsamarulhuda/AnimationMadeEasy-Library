package samar.com.easyanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import samar.com.animationmadeeasy.AnimationMadeEasy;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1,tv2;
    Button btnSlideToLeft,btnSlideToRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.tvText1);
        tv2=(TextView)findViewById(R.id.tvText2);
        btnSlideToLeft =(Button)findViewById(R.id.btnSlideToLeft);
        btnSlideToLeft.setOnClickListener(this);
        btnSlideToRight =(Button)findViewById(R.id.btnSlideToRight);
        btnSlideToRight.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnSlideToLeft:
                AnimationMadeEasy.getInstance(MainActivity.this).slideRightToLeftWithViewVisibilty(tv1,tv2,900);
                break;

            case R.id.btnSlideToRight:
                AnimationMadeEasy.getInstance(MainActivity.this).slideLeftToRightWithViewVisibilty(tv1,tv2,900);
                break;
        }

    }
}
