package online.buysellmarket.app.demotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import online.buysellmarket.app.mydemolibrary.AddNumber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddNumber.Add(1,2);
    }
}
