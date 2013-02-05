package com.example.teststringapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    static final String LOG_TAG = "junit";
    Thread testRunnerThread = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button launcherButton = (Button)findViewById( R.id.launch_button );
        launcherButton.setOnClickListener( new View.OnClickListener() {
            public void onClick( View view ) {
                startTest();
            }
        } );
    }

    private synchronized void startTest() 
    {
        if( ( testRunnerThread != null ) && !testRunnerThread.isAlive() )
            testRunnerThread = null;
        if( testRunnerThread == null ) {
        	/*开始测试线程*/
            testRunnerThread = new Thread( new TestRunner( this ) );
            testRunnerThread.start();
        } else
            Toast.makeText(
                        this, 
                        "Test is still running", 
                        Toast.LENGTH_SHORT).show();
    }
}
