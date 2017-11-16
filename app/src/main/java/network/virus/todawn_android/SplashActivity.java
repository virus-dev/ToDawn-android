package network.virus.todawn_android;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.tsengvn.typekit.TypekitContextWrapper;

public class SplashActivity extends Activity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Handler handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0, 3000);
    }
}
