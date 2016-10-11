package mawashi.alex.mylibpublished;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import mawashi.alex.mylittlelibrary.MyView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //let's use our custom library as View
        View v = new MyView(this);
        setContentView(v);

    }
}
