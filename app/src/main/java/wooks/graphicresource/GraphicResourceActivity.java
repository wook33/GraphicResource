package wooks.graphicresource;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class GraphicResourceActivity extends ActionBarActivity {
    LinearLayout mLinearLayout;

    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);

        mLinearLayout = new LinearLayout(this);

        ImageView i = new ImageView(this);
        i.setImageDrawable(getResources().getDrawable(R.drawable.oval));
        i.setMinimumHeight(100);
        i.setMinimumWidth(100);

        mLinearLayout.addView(i);
        setContentView(mLinearLayout);
    }

}
