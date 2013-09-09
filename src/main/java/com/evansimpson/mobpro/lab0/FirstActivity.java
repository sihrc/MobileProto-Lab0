package com.evansimpson.mobpro.lab0;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button b = (Button) findViewById(R.id.button1); // creates a button b and attaching it to the UI element called button1 on the view
        b.setOnClickListener(new View.OnClickListener() { // creates and sets an onClickListener for the button b
            @Override
            public void onClick(View view) { // creates the onClick method for the listener, which controls what is done when the button is clicked
                Intent i = new Intent(getApplicationContext(), SecondActivity.class); // creates a new intent i, which is how Android passes information between activities, and defines this intent as a way to navigate to the SecondActivity
                startActivity(i); // tells Android to make the intent active
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
