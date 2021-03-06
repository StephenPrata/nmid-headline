package cn.edu.cqupt.nmid.headline.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

import com.getbase.floatingactionbutton.FloatingActionsMenu;

/**
 * Created by leon on 1/1/15.
 */
public class FloatingActionsMenuHidable extends FloatingActionsMenu {

    private boolean isShown = true;
    private int ANIM_DURATION = 200;
    private boolean mVisible = false;



    public FloatingActionsMenuHidable(Context context) {
        super(context);

    }

    public FloatingActionsMenuHidable(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    public FloatingActionsMenuHidable(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }


    public void show(boolean isVisible) {
        mVisible = isVisible;
        int translationX = isVisible ? 0 : 120 + getMarginButton();
        this.animate().translationY(translationX).setDuration(ANIM_DURATION).start();
    }

    public boolean isShown() {
        return isShown;
    }

    private int getMarginButton() {
        int marginBottom = 0;
        final ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginBottom = ((MarginLayoutParams) layoutParams).bottomMargin;
        }
        return marginBottom;
    }

    public boolean getVisible(){
        return mVisible;
    }

}
