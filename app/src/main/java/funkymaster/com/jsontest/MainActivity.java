package funkymaster.com.jsontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //JSON test
    //Firebase test
    //GIT Hub Test

    /*This is a teting application
    User will login using firebase
    user will be able to make new account and save in firebase
    and after login user will be able to click button and
    JSON data will be displayed
     */


    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniVariables();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }

    void iniVariables(){
        button = (Button) findViewById(R.id.Button);
        textView = (TextView) findViewById(R.id.textView);
    }
}
