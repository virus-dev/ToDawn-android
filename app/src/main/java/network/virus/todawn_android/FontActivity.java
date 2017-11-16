package network.virus.todawn_android;

import android.app.Application;

import com.tsengvn.typekit.Typekit;

/**
 * Created by jgravity-mac on 2017. 11. 17..
 */

public class FontActivity extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Typekit.getInstance()
                .addNormal(Typekit.createFromAsset(this, "fonts/NotoSansCJKkr-Light.otf"));

    }
}
