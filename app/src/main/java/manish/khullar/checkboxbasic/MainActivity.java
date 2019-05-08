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
        ch=findViewById(R.id.checkBox);
        ch.setOnClickListener(this);
        ch2=findViewById(R.id.checkBox2);
        ch2.setOnClickListener(this);
        ch3=findViewById(R.id.checkBox3);
        ch3.setOnClickListener(this);
        ch4=findViewById(R.id.checkBox4);
        ch4.setOnClickListener(this);
        ch5=findViewById(R.id.checkBox5);
        ch5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.checkBox:
                if(ch.isChecked())
                Toast.makeText(getApplicationContext(),"ANDROID",Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox2:
                if(ch2.isChecked())
                Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox3:
                if(ch3.isChecked())
                Toast.makeText(getApplicationContext(),"ANDROID",Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox4:
                if(ch4.isChecked())
                Toast.makeText(getApplicationContext(),"ANDROID",Toast.LENGTH_LONG).show();
                break;
            case R.id.checkBox5:
                if(ch5.isChecked())
                Toast.makeText(getApplicationContext(),"ANDROID",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
