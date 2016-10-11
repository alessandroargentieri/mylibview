package mawashi.alex.mylittlelibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MyView extends LinearLayout {

    // constructor #1
    public MyView(Context context) {
        super(context);
        initialize(context);
    }

    // constructor #2
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initialize(context);
    }

    private void initialize(Context context){
        inflate(context, R.layout.my_view, this);
    }

}