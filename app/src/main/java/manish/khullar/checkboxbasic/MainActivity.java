package manish.khullar.checkboxbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
CheckBox ch,ch2,ch3,ch4,ch5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initiate views
        ch=findViewById(R.id.android);
        ch.setOnClickListener(this);
        ch2=findViewById(R.id.java);
        ch2.setOnClickListener(this);
        ch3=findViewById(R.id.php);
        ch3.setOnClickListener(this);
        ch4=findViewById(R.id.python);
        ch4.setOnClickListener(this);
        ch5=findViewById(R.id.unity);
        ch5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.android:
                if(ch.isChecked())
                Toast.makeText(getApplicationContext(),"ANDROID",Toast.LENGTH_LONG).show();
                break;
            case R.id.java:
                if(ch2.isChecked())
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
                break;
            case R.id.php:
                if(ch3.isChecked())
                Toast.makeText(getApplicationContext(),"ANDROID",Toast.LENGTH_LONG).show();
                break;
            case R.id.python:
                if(ch4.isChecked())
                Toast.makeText(getApplicationContext(),"ANDROID",Toast.LENGTH_LONG).show();
                break;
            case R.id.unity:
                if(ch5.isChecked())
                Toast.makeText(getApplicationContext(),"ANDROID",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
