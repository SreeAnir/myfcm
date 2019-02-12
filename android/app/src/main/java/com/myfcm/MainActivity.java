package com.myfcm;
import android.content.Intent;
import com.facebook.react.ReactActivity;
import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "myfcm";
    }
    @Override
    public void onNewIntent(Intent intent) {
              super.onNewIntent(intent);
                setIntent(intent);
    }

}
