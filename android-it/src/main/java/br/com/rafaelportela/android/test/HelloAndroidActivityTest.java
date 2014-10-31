package br.com.rafaelportela.android.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import br.com.rafaelportela.android.HelloAndroidActivity;

import static br.com.rafaelportela.android.R.id.hello_world_tv;


public class HelloAndroidActivityTest extends ActivityInstrumentationTestCase2<HelloAndroidActivity> {

    public HelloAndroidActivityTest() {
        super(HelloAndroidActivity.class); 
    }

    public void testActivity() throws InterruptedException {
        HelloAndroidActivity activity = getActivity();
        Thread.sleep(2000);

        TextView text = (TextView) activity.findViewById(hello_world_tv);

        assertEquals("Hello world!", text.getText().toString());
    }
}

