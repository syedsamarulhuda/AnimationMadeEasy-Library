package samar.com.animationmadeeasy.utils;


/**
 * Created by samar on 22/08/17.
 */

public class AnimationInterpolator implements android.view.animation.Interpolator {

    private double mAmplitude = 1;
    private double mFrequency = 10;

    public AnimationInterpolator(double mAmplitude, double mFrequency) {
        this.mAmplitude = mAmplitude;
        this.mFrequency = mFrequency;
    }

    @Override
    public float getInterpolation(float time) {
        double amplitude = mAmplitude;
        if (amplitude == 0) { amplitude = 0.05; }

        // The interpolation curve equation:
        //    -e^(-time / amplitude) * cos(frequency * time) + 1
        //
        // View the graph live: https://www.desmos.com/calculator/6gbvrm5i0s
        return (float) (-1 * Math.pow(Math.E, -time/ mAmplitude) * Math.cos(mFrequency * time) + 1);
    }
}
