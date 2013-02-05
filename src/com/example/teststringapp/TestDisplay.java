package com.example.teststringapp;

import android.widget.TextView;

public class TestDisplay implements Runnable {
	
    public enum displayEvent{START_TEST,END_TEST,ERROR,FAILURE,} 
    displayEvent ev;
    
    String testName;
    int testCounter;
    int errorCounter;
    int failureCounter;
    String faleText;
    
    TextView statusText;
    TextView testCounterText;
    TextView errorCounterText;
    TextView failureCounterText;

    public TestDisplay( displayEvent ev,
                    String testName, 
                    int testCounter,
                    int errorCounter,
                    int failureCounter,
                    String faleText,
                    TextView statusText,
                    TextView testCounterText,
                    TextView errorCounterText,
                    TextView failureCounterText ) {
    	
        this.ev = ev;
        this.testName = testName;
        this.testCounter = testCounter;
        this.errorCounter = errorCounter;
        this.failureCounter = failureCounter;
        this.faleText = faleText;
        this.statusText = statusText;
        this.testCounterText = testCounterText;
        this.errorCounterText = errorCounterText;
        this.failureCounterText = failureCounterText;
    }

    public void run() {
        StringBuffer status = new StringBuffer();
        switch( ev ) {
            case START_TEST:
                status.append( "Starting" );
                break;

            case END_TEST:
                status.append( "Ending" );
                break;

            case ERROR:
                status.append( "Error: " );
                break;

            case FAILURE:
                status.append( "Failure: " );
                break;
            
        }
        status.append( ": " );
        status.append( testName );
        statusText.setText( new String( status ) );
        testCounterText.setText( "Tests: "+testCounter );
        errorCounterText.setText( "Errors: "+errorCounter );
        
        failureCounterText.setText( "Failure: "+faleText );
    }
}
