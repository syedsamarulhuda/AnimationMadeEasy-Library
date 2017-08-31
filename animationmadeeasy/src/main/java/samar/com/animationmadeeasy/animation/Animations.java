package samar.com.animationmadeeasy.animation;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

import samar.com.animationmadeeasy.R;
import samar.com.animationmadeeasy.utils.AnimationInterpolator;

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

    public TranslateAnimation slideToLeft(View viewGone, View viewVisible, long duration) {
        TranslateAnimation animate = new TranslateAnimation(0, -viewGone.getWidth(), 0, 0);
        animate.setDuration(duration);
        animate.setFillAfter(true);

        return animate;
    }


    public Animation getSlideToLeftFromRight(long duration) {
        Animation slideLeftFromRight = AnimationUtils.loadAnimation(context, R.anim.slide_left_right);
        slideLeftFromRight.setDuration(duration);

        return slideLeftFromRight;
    }


    public TranslateAnimation slideToRight(View viewGone, View viewVisible, long duration) {
        TranslateAnimation animate = new TranslateAnimation(-viewGone.getWidth(), 0, 0, 0);
        animate.setDuration(duration);
        animate.setFillAfter(true);

        return animate;
    }


    public Animation getSlideToRightFromLeft(long duration) {
        Animation slideLeftFromRight = AnimationUtils.loadAnimation(context, R.anim.slide_rigt_left);
        slideLeftFromRight.setDuration(duration);

        return slideLeftFromRight;
    }

    public TranslateAnimation slideToTop(View viewGone, View viewVisible, long duration) {
        TranslateAnimation animate = new TranslateAnimation(0, 0, 0, -viewGone.getWidth());
        animate.setDuration(duration);
        animate.setFillAfter(true);

        return animate;
    }


    public Animation getSlideToTop(long duration) {
        Animation slideTop = AnimationUtils.loadAnimation(context, R.anim.slide_top);
        slideTop.setDuration(duration);

        return slideTop;
    }


    public TranslateAnimation slideToBottom(View viewGone, View viewVisible, long duration) {
        TranslateAnimation animate = new TranslateAnimation(0, 0, -viewGone.getWidth(), 0);
        animate.setDuration(duration);
        animate.setFillAfter(true);

        return animate;
    }


    public Animation getSlideToBottom(long duration) {
        Animation slideTop = AnimationUtils.loadAnimation(context, R.anim.slide_bottom);
        slideTop.setDuration(duration);

        return slideTop;
    }


    public Animation fadeAnimation(float fromAlpha, float toAlpha, long duration) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(fromAlpha, toAlpha);
        alphaAnimation.setDuration(duration);
        return alphaAnimation;
    }

    public Animation blinkAnimation(int repeatCount, float fromAlpha, float toAlpha, long duration) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(fromAlpha, toAlpha);
        alphaAnimation.setDuration(duration); //You can manage the blinking time with this parameter
        alphaAnimation.setStartOffset(20);
        alphaAnimation.setRepeatMode(Animation.REVERSE);
        alphaAnimation.setRepeatCount(repeatCount);
        return alphaAnimation;
    }

    public Animation rotateAnimation(float fromDegrees, float toDegrees, float pivotX, float pivotY, long duration, int repeatMode, int repeatCount) {
        RotateAnimation rotateAnimation = new RotateAnimation(fromDegrees, toDegrees, pivotX, pivotY);
        rotateAnimation.setDuration(duration);
        rotateAnimation.setRepeatMode(repeatMode);
        rotateAnimation.setRepeatCount(repeatCount);
        return rotateAnimation;
    }


    public Animation bounceAnimation(double duration, double amplitude,double frequency ) {
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.bounce);
        animation.setDuration((long) duration);

        AnimationInterpolator interpolator = new AnimationInterpolator(amplitude,frequency);
        animation.setInterpolator(interpolator);

        return animation;
    }

}
