package samar.com.animationmadeeasy.animation_view;


import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

import samar.com.animationmadeeasy.animation.Animations;

/**
 * Created by samar on 22/08/17.
 */

public class BasicAnimationForView {
     private Context context;

    public BasicAnimationForView(Context context) {
        this.context = context;
    }

    public void slideToLeft(View viewGone, View viewVisble, long duration) {

        TranslateAnimation animate = new Animations().slideToLeft(viewGone,viewVisble,duration);
        Animation slideLeftFromRight = new Animations(context).getSlideToLeftFromRight(duration);

        viewGone.startAnimation(animate);
        viewGone.setVisibility(View.GONE);

        viewVisble.setVisibility(View.VISIBLE);
        viewVisble.setAnimation(slideLeftFromRight);


    }


    public void slideToRight(View viewGone, View viewVisble, long duration) {
        TranslateAnimation animate = new Animations().slideToRight(viewGone,viewVisble,duration);
        Animation slideLeftFromRight = new Animations(context).getSlideToRightFromLeft(duration);

        viewGone.startAnimation(animate);
        viewGone.setVisibility(View.VISIBLE);

        viewVisble.setVisibility(View.GONE);
        viewVisble.setAnimation(slideLeftFromRight);

    }



}
