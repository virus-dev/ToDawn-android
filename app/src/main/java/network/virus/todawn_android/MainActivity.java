package network.virus.todawn_android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.tsengvn.typekit.TypekitContextWrapper;

public class MainActivity extends Activity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(TypekitContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // For SplashActivity
        startActivity(new Intent(this, SplashActivity.class));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
