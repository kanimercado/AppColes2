package net.jakare.appcoles.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;

import net.jakare.appcoles.R;
import net.jakare.appcoles.view.fragment.NoticiasPadreFragment;
import net.jakare.appcoles.view.fragment.NoticiasProfesorAllFragment;
import net.jakare.appcoles.view.fragment.NoticiasProfesorMineFragment;

public class MainActivity extends FragmentActivity {
    private FragmentTabHost mTabHost;
    int tipoCLiente = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (tipoCLiente == 1) {

            setContentView(R.layout.activity_main);
            mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
            mTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);

            mTabHost.addTab(
                    mTabHost.newTabSpec("tab1").setIndicator("Tab 1", null),
                    NoticiasProfesorAllFragment.class, null);
            mTabHost.addTab(
                    mTabHost.newTabSpec("tab2").setIndicator("Tab 2", null),
                    NoticiasProfesorMineFragment.class, null);


        }
        else {
            setContentView(R.layout.activity_container);
            NoticiasPadreFragment noticiasPadreFragment = new NoticiasPadreFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.container, noticiasPadreFragment)
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .addToBackStack(null).commit();

        }




    }
}