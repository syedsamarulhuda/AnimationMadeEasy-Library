package samar.com.animationmadeeasy;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;

import samar.com.animationmadeeasy.animation_view.BasicAnimationForView;

/**
 * Created by samar on 22/08/17.
 */

public class AnimationMadeEasy {

    private static Context mContext;
    private static AnimationMadeEasy animationMadeEasy;


    private AnimationMadeEasy() {

    }

    public synchronized static AnimationMadeEasy getInstance(Context context) {

        mContext = context;
        if (animationMadeEasy == null)
            animationMadeEasy = new AnimationMadeEasy();

        return animationMadeEasy;
    }


    public void moveRightToLeftWithViewVisibility(View viewGone, View viewVisble, long duration) {
        new BasicAnimationForView(mContext).slideToLeft(viewGone, viewVisble, duration);
    }


    public void moveLeftToRightWithViewVisibility(View viewGone, View viewVisble, long duration) {
        new BasicAnimationForView(mContext).slideToRight(viewGone, viewVisble, duration);
    }


    public void moveToTopWithViewVisibility(View viewGone, View viewVisble, long duration) {
        new BasicAnimationForView(mContext).slideToTop(viewGone, viewVisble, duration);
    }


    public void moveToBottomWithViewVisibility(View viewGone, View viewVisble, long duration) {
        new BasicAnimationForView(mContext).slideToBottom(viewGone, viewVisble, duration);
    }

    public void fadeView(View view, int visibility, float fromAlpha, float toAlpha, long duration) {
        new BasicAnimationForView(mContext).fadeAnimation(view, visibility, fromAlpha, toAlpha, duration);
    }


    public void blinkView(View view, long duration) {
        new BasicAnimationForView(mContext).blinkAnimation(Animation.ABSOLUTE, view, duration);
    }

    public void rotateView(View view, long duration) {
        new BasicAnimationForView(mContext).rotateAnimation(view, duration, Animation.RESTART, Animation.ABSOLUTE);
    }


    public void bounceView(View view, double duration, double amplitude, double frequency) {
        Log.d("##BOUNCE",frequency+"--"+amplitude);
        new BasicAnimationForView(mContext).bounceAnimation(view, duration, amplitude, frequency);
    }
}
