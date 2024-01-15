package app.msfaithlj

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.core.content.ContextCompat

class HeartAnimationHelper(private val context: Context) {

    fun addHeartAnimation(rootView: ViewGroup, startX: Float, startY: Float) {
        val heartImageView = ImageView(context)
        heartImageView.setImageResource(R.drawable.heart_icon)

        val layoutParams = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_START, RelativeLayout.TRUE)
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_TOP, RelativeLayout.TRUE)

        heartImageView.layoutParams = layoutParams
        heartImageView.x = startX
        heartImageView.y = startY

        rootView.addView(heartImageView)

        val animatorSet = AnimatorSet()

        val alphaAnimator = ObjectAnimator.ofFloat(heartImageView, View.ALPHA, 1f, 0f)
        alphaAnimator.duration = ANIMATION_DURATION

        val translationYAnimator = ObjectAnimator.ofFloat(heartImageView, View.TRANSLATION_Y, 0f, FALL_DISTANCE)
        translationYAnimator.duration = ANIMATION_DURATION

        val scaleXAnimator = ObjectAnimator.ofFloat(heartImageView, View.SCALE_X, 1f, 1.5f)
        scaleXAnimator.duration = ANIMATION_DURATION

        val scaleYAnimator = ObjectAnimator.ofFloat(heartImageView, View.SCALE_Y, 1f, 1.5f)
        scaleYAnimator.duration = ANIMATION_DURATION

        animatorSet.playTogether(alphaAnimator, translationYAnimator, scaleXAnimator, scaleYAnimator)
        animatorSet.addListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator) {}

            override fun onAnimationEnd(animation: Animator) {
                rootView.removeView(heartImageView)
            }

            override fun onAnimationCancel(animation: Animator) {}

            override fun onAnimationRepeat(animation: Animator) {}
        })

        animatorSet.start()
    }

    companion object {
        private const val ANIMATION_DURATION = 1000L // in milliseconds
        private const val FALL_DISTANCE = 500f // Adjust the falling distance as needed
    }
}
