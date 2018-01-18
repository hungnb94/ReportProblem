package example.com.hb.reportproblem;

import android.app.Application;
import android.os.StrictMode;

/**
 * Created by HP ProBook on 1/18/2018.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        builder.detectFileUriExposure();
    }
}
