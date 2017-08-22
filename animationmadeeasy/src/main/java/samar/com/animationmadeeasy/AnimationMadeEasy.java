package samar.com.animationmadeeasy;

import android.content.Context;
import android.view.View;

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


    public void slideRightToLeftWithViewVisibilty(View viewGone, View viewVisble, long duration)
    {
        new BasicAnimationForView(mContext).slideToLeft(viewGone,viewVisble,duration);
    }


    public void slideLeftToRightWithViewVisibilty(View viewGone, View viewVisble, long duration)
    {
        new BasicAnimationForView(mContext).slideToRight(viewGone,viewVisble,duration);
    }

}
