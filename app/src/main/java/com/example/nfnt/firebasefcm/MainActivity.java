package com.example.nfnt.firebasefcm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String titles,cont;
    public TextView title,content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyFirebaseServiceId service = new MyFirebaseServiceId();

        service.newToken();

        title = (TextView) findViewById(R.id.titles);
        content = (TextView) findViewById(R.id.content);
        if(titles!=null || cont !=null)
        {
            title.setText(titles);
            content.setText(cont);
        }



    }
}
