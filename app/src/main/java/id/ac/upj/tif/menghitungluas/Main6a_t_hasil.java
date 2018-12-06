package id.ac.upj.tif.menghitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main6a_t_hasil extends AppCompatActivity {
    TextView txtXi1,txtXi2,txtXi3,txtXi4,txtXi5,txtXi6,txtXi7,txtXi8,txtXi9,txtXi10;
    TextView txtXiXaX1,txtXiXaX2,txtXiXaX3,txtXiXaX4,txtXiXaX5,txtXiXaX6,txtXiXaX7,txtXiXaX8,txtXiXaX9,txtXiXaX10;
    TextView txtxiXa1,txtxiXa2,txtxiXa3,txtxiXa4,txtxiXa5,txtxiXa6,txtxiXa7,txtxiXa8,txtxiXa9,txtxiXa10;
    TextView txtKtr2,txtKtr5,txtKtr10,txtKtr25,txtKtr50,txtKtr100,txtKtr200,txtKtr1000;
    TextView txtXtr2,txtXtr5,txtXtr10,txtXtr25,txtXtr50,txtXtr100,txtXtr200,txtXtr1000;
    TextView txtxbar, txtSd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6a_t_hasil);

        final Bundle bave = getIntent().getExtras();
        txtXi1 =  findViewById(R.id.Xi1);
        txtXi2 =  findViewById(R.id.Xi2);
        txtXi3 =  findViewById(R.id.Xi3);
        txtXi4 =  findViewById(R.id.Xi4);
        txtXi5 =  findViewById(R.id.Xi5);
        txtXi6 =  findViewById(R.id.Xi6);
        txtXi7 =  findViewById(R.id.Xi7);
        txtXi8 =  findViewById(R.id.Xi8);
        txtXi9 =  findViewById(R.id.Xi9);
        txtXi10 =  findViewById(R.id.Xi10);
        txtxiXa1 =  findViewById(R.id.xiXa1);
        txtxiXa2 =  findViewById(R.id.xiXa2);
        txtxiXa3 =  findViewById(R.id.xiXa3);
        txtxiXa4 =  findViewById(R.id.xiXa4);
        txtxiXa5 =  findViewById(R.id.xiXa5);
        txtxiXa6 =  findViewById(R.id.xiXa6);
        txtxiXa7 =  findViewById(R.id.xiXa7);
        txtxiXa8 =  findViewById(R.id.xiXa8);
        txtxiXa9 =  findViewById(R.id.xiXa9);
        txtxiXa10 =  findViewById(R.id.xiXa10);
        txtXiXaX1 =  findViewById(R.id.XiXaX1);
        txtXiXaX2 =  findViewById(R.id.XiXaX2);
        txtXiXaX3 =  findViewById(R.id.XiXaX3);
        txtXiXaX4 =  findViewById(R.id.XiXaX4);
        txtXiXaX5 =  findViewById(R.id.XiXaX5);
        txtXiXaX6 =  findViewById(R.id.XiXaX6);
        txtXiXaX7 =  findViewById(R.id.XiXaX7);
        txtXiXaX8 =  findViewById(R.id.XiXaX8);
        txtXiXaX9 =  findViewById(R.id.XiXaX9);
        txtXiXaX10 =  findViewById(R.id.XiXaX10);

        txtKtr2 = findViewById(R.id.Ktr2);
        txtKtr5 = findViewById(R.id.Ktr5);
        txtKtr10 = findViewById(R.id.Ktr10);
        txtKtr25 = findViewById(R.id.Ktr25);
        txtKtr50 = findViewById(R.id.Ktr50);
        txtKtr100 = findViewById(R.id.Ktr100);
        txtKtr200 = findViewById(R.id.Ktr200);
        txtKtr1000 = findViewById(R.id.Ktr1000);
        txtXtr2 = findViewById(R.id.Xtr2);
        txtXtr5 = findViewById(R.id.Xtr5);
        txtXtr10 = findViewById(R.id.Xtr10);
        txtXtr25 = findViewById(R.id.Xtr25);
        txtXtr50 = findViewById(R.id.Xtr50);
        txtXtr100 = findViewById(R.id.Xtr100);
        txtXtr200 = findViewById(R.id.Xtr200);
        txtXtr1000 = findViewById(R.id.Xtr1000);
        txtxbar = findViewById(R.id.xbar);
        txtSd = findViewById(R.id.Sd);

        txtXi1.setText( bave.getString("X1"));
        txtXi2.setText( bave.getString("X2"));
        txtXi3.setText( bave.getString("X3"));
        txtXi4.setText( bave.getString("X4"));
        txtXi5.setText( bave.getString("X5"));
        txtXi6.setText( bave.getString("X6"));
        txtXi7.setText( bave.getString("X7"));
        txtXi8.setText( bave.getString("X8"));
        txtXi9.setText( bave.getString("X9"));
        txtXi10.setText( bave.getString("X10"));

        txtxiXa1.setText( bave.getString("XiXaa1"));
        txtxiXa2.setText( bave.getString("XiXaa2"));
        txtxiXa3.setText( bave.getString("XiXaa3"));
        txtxiXa4.setText( bave.getString("XiXaa4"));
        txtxiXa5.setText( bave.getString("XiXaa5"));
        txtxiXa6.setText( bave.getString("XiXaa6"));
        txtxiXa7.setText( bave.getString("XiXaa7"));
        txtxiXa8.setText( bave.getString("XiXaa8"));
        txtxiXa9.setText( bave.getString("XiXaa9"));
        txtxiXa10.setText( bave.getString("XiXaa10"));

        txtXiXaX1.setText( bave.getString("XiXaX1"));
        txtXiXaX2.setText( bave.getString("XiXaX2"));
        txtXiXaX3.setText( bave.getString("XiXaX3"));
        txtXiXaX4.setText( bave.getString("XiXaX4"));
        txtXiXaX5.setText( bave.getString("XiXaX5"));
        txtXiXaX6.setText( bave.getString("XiXaX6"));
        txtXiXaX7.setText( bave.getString("XiXaX7"));
        txtXiXaX8.setText( bave.getString("XiXaX8"));
        txtXiXaX9.setText( bave.getString("XiXaX9"));
        txtXiXaX10.setText( bave.getString("XiXaX10"));

        txtKtr2.setText( bave.getString("Ktr2"));
        txtKtr5.setText( bave.getString("Ktr5"));
        txtKtr10.setText( bave.getString("Ktr10"));
        txtKtr25.setText( bave.getString("Ktr25"));
        txtKtr50.setText( bave.getString("Ktr50"));
        txtKtr100.setText( bave.getString("Ktr100"));
        txtKtr200.setText( bave.getString("Ktr200"));
        txtKtr1000.setText( bave.getString("Ktr1000"));
        txtXtr2.setText( bave.getString("Xtr2"));
        txtXtr5.setText( bave.getString("Xtr5"));
        txtXtr10.setText( bave.getString("Xtr10"));
        txtXtr25.setText( bave.getString("Xtr25"));
        txtXtr50.setText( bave.getString("Xtr50"));
        txtXtr100.setText( bave.getString("Xtr100"));
        txtXtr200.setText( bave.getString("Xtr200"));
        txtXtr1000.setText( bave.getString("Xtr1000"));
        txtxbar.setText( bave.getString("totalX"));
        txtSd.setText( bave.getString("Sd"));

    }
}
