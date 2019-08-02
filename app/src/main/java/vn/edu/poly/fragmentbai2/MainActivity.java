package vn.edu.poly.fragmentbai2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentLeft fragmentLeft=new FragmentLeft();
        FragmentRight fragmentRight=new FragmentRight();
        fragmentManager.beginTransaction().add(R.id.frameB,fragmentRight).commit();
        fragmentManager.beginTransaction().add(R.id.frameA,fragmentLeft).commit();
    }
}
