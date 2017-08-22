package samar.com.animationmadeeasy.animation;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

import samar.com.animationmadeeasy.R;

/**
 * Created by samar on 22/08/17.
 */

public class Animations {

 private Context context;
    public Animations() {
    }

    public Animations(Context context) {
        this.context = context;
    }

    public TranslateAnimation slideToLeft(View viewGone, View viewVisible, long duration)
    {
        TranslateAnimation animate = new TranslateAnimation(0, -viewGone.getWidth(), 0, 0);
        animate.setDuration(duration);
        animate.setFillAfter(true);

        return animate;
    }


    public Animation getSlideToLeftFromRight(long duration)
    {
        Animation slideLeftFromRight = AnimationUtils.loadAnimation(context, R.anim.slide_left_right);
        slideLeftFromRight.setDuration(duration);

        return slideLeftFromRight;
    }



    public TranslateAnimation slideToRight(View viewGone, View viewVisible, long duration)
    {
        TranslateAnimation animate = new TranslateAnimation(-viewGone.getWidth(), 0, 0, 0);
        animate.setDuration(duration);
        animate.setFillAfter(true);

        return animate;
    }


    public Animation getSlideToRightFromLeft(long duration)
    {
        Animation slideLeftFromRight = AnimationUtils.loadAnimation(context, R.anim.slide_rigt_left);
        slideLeftFromRight.setDuration(duration);

        return slideLeftFromRight;
    }
}
