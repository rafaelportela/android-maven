package br.com.rafaelportela.android;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.util.ActivityController;

import static org.junit.Assert.assertNotNull;

// specify path of AndroidManifest.xml to run the test in AndroidStudio or Intellij:
@Config(emulateSdk = 18) // manifest = "android/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {

    @Test
    public void testName() throws Exception {
        ActivityController<HelloAndroidActivity> controller = Robolectric
                .buildActivity(HelloAndroidActivity.class);

        HelloAndroidActivity helloAndroidActivity = controller.create().resume().start().get();
        assertNotNull(helloAndroidActivity);
    }
}