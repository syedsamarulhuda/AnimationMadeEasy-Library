package samar.com.animationmadeeasy.animation_view;


import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
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

        TranslateAnimation animate = new Animations().slideToLeft(viewGone, viewVisble, duration);
        Animation slideLeftFromRight = new Animations(context).getSlideToLeftFromRight(duration);

        viewGone.startAnimation(animate);
        viewGone.setVisibility(View.GONE);

        viewVisble.setVisibility(View.VISIBLE);
        viewVisble.setAnimation(slideLeftFromRight);


    }


    public void slideToRight(View viewGone, View viewVisble, long duration) {
        TranslateAnimation animate = new Animations().slideToRight(viewGone, viewVisble, duration);
        Animation slideLeftFromRight = new Animations(context).getSlideToRightFromLeft(duration);

        viewGone.startAnimation(animate);
        viewGone.setVisibility(View.VISIBLE);

        viewVisble.setVisibility(View.GONE);
        viewVisble.setAnimation(slideLeftFromRight);

    }

    public void slideToTop(View viewGone, View viewVisble, long duration) {
        TranslateAnimation animate = new Animations().slideToTop(viewGone, viewVisble, duration);
        Animation slideTop = new Animations(context).getSlideToTop(duration);

        viewGone.startAnimation(animate);
        viewGone.setVisibility(View.GONE);

        viewVisble.setVisibility(View.VISIBLE);
        viewVisble.setAnimation(slideTop);

    }


    public void slideToBottom(View viewGone, View viewVisble, long duration) {
        TranslateAnimation animate = new Animations().slideToBottom(viewGone, viewVisble, duration);
        Animation slideBottom = new Animations(context).getSlideToBottom(duration);

        viewGone.startAnimation(animate);
        viewGone.setVisibility(View.VISIBLE);

        viewVisble.setVisibility(View.GONE);
        viewVisble.setAnimation(slideBottom);

    }

    public void fadeAnimation(View view,int visibility,float fromAlpha, float toAlpha, long duration) {
        Animation animate = new Animations(context).fadeAnimation(fromAlpha, toAlpha, duration);
        view.startAnimation(animate);
        view.setVisibility(visibility);

    }

    public void blinkAnimation(int repeatCount,View view,long duration)
    {
        Animation animation= new Animations(context).blinkAnimation(repeatCount,0.0f,1.0f,duration);
        view.startAnimation(animation);

    }


    public void rotateAnimation(View view,long duration,int repeatMode,int repeatCount)
    {
        Animation animation= new Animations(context).rotateAnimation(0f,360f,50f,50f,duration,repeatMode,repeatCount);
        view.startAnimation(animation);

    }
}
