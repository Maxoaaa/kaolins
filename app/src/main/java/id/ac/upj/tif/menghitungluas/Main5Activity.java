package id.ac.upj.tif.menghitungluas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import id.ac.upj.tif.menghitungluas.penjelasan.Debit_banjir;
import id.ac.upj.tif.menghitungluas.penjelasan.Intensitas_hujan;
import id.ac.upj.tif.menghitungluas.penjelasan.Metode_Gumbel;
import id.ac.upj.tif.menghitungluas.penjelasan.Profil_muka_air;
import id.ac.upj.tif.menghitungluas.penjelasan.Rerata_hujan;
import id.ac.upj.tif.menghitungluas.penjelasan.Volume_tampung;
import id.ac.upj.tif.menghitungluas.support.Tentang;

public class Main5Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        Penjelasan.OnFragmentInteractionListener,
        Tentang.OnFragmentInteractionListener,
        Intensitas_hujan.OnFragmentInteractionListener,
        Metode_Gumbel.OnFragmentInteractionListener,
        Debit_banjir.OnFragmentInteractionListener,
        Profil_muka_air.OnFragmentInteractionListener,
        Volume_tampung.OnFragmentInteractionListener{
    Fragment fragment = null;FragmentManager fragmentManager;
    @Override
    public void onFragmentInteraction(Uri uri) {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        if (savedInstanceState == null) {
           // fragment = new Root();
            //callFragment(new Penjelasan());
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framecontoh, new Penjelasan())
                    .commit();
        }

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
    /* untuk membuat menu titik 3 di pojok kanan atas
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main5, menu);
            return true;
        }
            @Override
            public boolean onOptionsItemSelected(MenuItem item) {
                // Handle action bar item clicks here. The action bar will
                // automatically handle clicks on the Home/Up button, so long
                // as you specify a parent activity in AndroidManifest.xml.
                int id = item.getItemId();

                //noinspection SimplifiableIfStatement
                if (id == R.id.action_settings) {
                    return true;
                }
                return super.onOptionsItemSelected(item);
            }
        */
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        Class fragmentClass = null;
        if (id == R.id.nav_hitung) {
            fragmentClass = Penjelasan.class;
            Intent intent = new Intent(Main5Activity.this, Main6aActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_intenhu) {
            fragmentClass = Intensitas_hujan.class;
        } else if (id == R.id.nav_gumbel) {
            fragmentClass = Metode_Gumbel.class;
        } else if (id == R.id.nav_banjir) {
            fragmentClass = Debit_banjir.class;
        } else if (id == R.id.nav_profil) {
            fragmentClass = Profil_muka_air.class;
        }else if (id == R.id.nav_volume) {
            fragmentClass = Volume_tampung.class;
        }else if (id == R.id.nav_share) {
            fragmentClass = Penjelasan.class;

            Intent si = new Intent(android.content.Intent.ACTION_SEND);
            si.setType("text/plain");
            si.putExtra(android.content.Intent.EXTRA_SUBJECT, "Handoyo Oficial");
            si.putExtra(android.content.Intent.EXTRA_TEXT, "Dapatkan Informasi tentang Aplikasi Lainnya. Kunjungi https://skytacco.web.id/ \n atau hubungi email REALTH99@GMAIL.COM");
            startActivity(Intent.createChooser(si, "Share via"));
        } else if (id == R.id.nav_tentang) {
            fragmentClass = Tentang.class;
        }
        try {
            assert fragmentClass != null;
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.framecontoh, fragment).commit();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
