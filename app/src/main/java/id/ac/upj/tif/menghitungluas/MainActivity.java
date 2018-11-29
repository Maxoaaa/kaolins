package id.ac.upj.tif.menghitungluas;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    TextView txtHasil , tc7, ih7;
    EditText txtCurah, txtWaktu;
    Button btnHitung, btnNext;
    FloatingActionButton btn_float;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Bundle b = getIntent().getExtras();
        //TextView intensitas =  findViewById(R.id.namaValue);
        //intensitas.setText(b.getCharSequence("Rerata_hujan"));
        btn_float = findViewById(R.id.btn_float);
        txtHasil = findViewById(R.id.txtHasil);
        txtCurah = findViewById(R.id.txtCurah);
        txtWaktu = findViewById(R.id.txtWaktu);
        btnHitung = findViewById(R.id.btnHitung);
        btnNext = findViewById(R.id.btnNext);

        //untuk tabel
        final TextView tc1 = findViewById(R.id.tc1);
        final TextView tc2 = findViewById(R.id.tc2);
        final TextView tc3 = findViewById(R.id.tc3);
        final TextView tc4 = findViewById(R.id.tc4);
        final TextView tc5 = findViewById(R.id.tc5);
        final TextView tc6 = findViewById(R.id.tc6);
        final TextView tc7 = findViewById(R.id.tc7);
        final TextView tc8 = findViewById(R.id.tc8);
        final TextView tc9 = findViewById(R.id.tc9);
        final TextView tc10 = findViewById(R.id.tc10);
        final TextView tc11= findViewById(R.id.tc11);
        final TextView tc12 = findViewById(R.id.tc12);
        final TextView tc13 = findViewById(R.id.tc13);
        final TextView tc14 = findViewById(R.id.tc14);
        final TextView tc15 = findViewById(R.id.tc15);
        final TextView tc16 = findViewById(R.id.tc16);
        final TextView tc17 = findViewById(R.id.tc17);
        final TextView tc18 = findViewById(R.id.tc18);
        final TextView tc19 = findViewById(R.id.tc19);
        final TextView tc20 = findViewById(R.id.tc20);

        final TextView ih1 = findViewById(R.id.ih1);
        final TextView ih2 = findViewById(R.id.ih2);
        final TextView ih3 = findViewById(R.id.ih3);
        final TextView ih4 = findViewById(R.id.ih4);
        final TextView ih5 = findViewById(R.id.ih5);
        final TextView ih6 = findViewById(R.id.ih6);
        final TextView ih7 = findViewById(R.id.ih7);
        final TextView ih8 = findViewById(R.id.ih8);
        final TextView ih9 = findViewById(R.id.ih9);
        final TextView ih10 = findViewById(R.id.ih10);
        final TextView ih11 = findViewById(R.id.ih11);
        final TextView ih12 = findViewById(R.id.ih12);
        final TextView ih13= findViewById(R.id.ih13);
        final TextView ih14 = findViewById(R.id.ih14);
        final TextView ih15 = findViewById(R.id.ih15);
        final TextView ih16 = findViewById(R.id.ih16);
        final TextView ih17 = findViewById(R.id.ih17);
        final TextView ih18 = findViewById(R.id.ih18);
        final TextView ih19 = findViewById(R.id.ih19);
        final TextView ih20 = findViewById(R.id.ih20);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               double a,b,h,R,tc;

                if (txtCurah.getText().toString().isEmpty()){
                    R = 0 ;
                }else {
                    R = Double.parseDouble(txtCurah.getText().toString());
                }
                if (txtWaktu.getText().toString().isEmpty()){
                    tc = 0 ;
                }else {
                    tc = Double.parseDouble(txtWaktu.getText().toString());
                }

                a = (R/24);
                b = (24/(tc/60));
                h = Math.pow(b,2);
                double y = Math.cbrt(h);
                double x = a*y;

                txtHasil.setText("Intensitas Hujan : " + x);

                    tc1.setText(Integer.toString(5));
                    tc2.setText(Integer.toString(10));
                    tc3.setText(Integer.toString(15));
                    tc4.setText(Integer.toString(20));
                    tc5.setText(Integer.toString(25));
                    tc6.setText(Integer.toString(30));
                    tc7.setText(Integer.toString(35));
                    tc8.setText(Integer.toString(40));
                    tc9.setText(Integer.toString(45));
                    tc10.setText(Integer.toString(50));
                    tc11.setText(Integer.toString(55));
                    tc12.setText(Integer.toString(60));
                    tc13.setText(Integer.toString(65));
                    tc14.setText(Integer.toString(70));
                    tc15.setText(Integer.toString(75));
                    tc16.setText(Integer.toString(80));
                    tc17.setText(Integer.toString(85));
                    tc18.setText(Integer.toString(90));
                    tc19.setText(Integer.toString(95));
                    tc20.setText(Integer.toString(100));
                Double[] hhh = new Double[21];
                Double[] xax = new Double[21];
                //hhh[1] = Double.parseDouble(txtWaktu.getText().toString());
                int j=0;
                for (int i= 0 ; i <=20 ; i++){
                    hhh[i]= Double.valueOf(j+=5);
                    xax[i] = (R/24) * Math.cbrt(Math.pow((24/(hhh[i]/60)),2));
                }
                DecimalFormat precision = new DecimalFormat("#.#####");
               // ih1.setText(precision.format(xax[1]));
                ih1.setText(precision.format(xax[0]));
                ih2.setText(precision.format(xax[1]));
                ih3.setText(precision.format(xax[2]));
                ih4.setText(precision.format(xax[3]));
                ih5.setText(precision.format(xax[4]));
                ih6.setText(precision.format(xax[5]));
                ih7.setText(precision.format(xax[6]));
                ih8.setText(precision.format(xax[7]));
                ih9.setText(precision.format(xax[8]));
                ih10.setText(precision.format(xax[9]));
                ih11.setText(precision.format(xax[10]));
                ih12.setText(precision.format(xax[11]));
                ih13.setText(precision.format(xax[12]));
                ih14.setText(precision.format(xax[13]));
                ih15.setText(precision.format(xax[14]));
                ih16.setText(precision.format(xax[15]));
                ih17.setText(precision.format(xax[16]));
                ih18.setText(precision.format(xax[17]));
                ih19.setText(precision.format(xax[18]));
                ih20.setText(precision.format(xax[19]));
                final Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                Bundle c = new Bundle();
                //untuk menyimpan data debit
                String hasil = Double.valueOf(x).toString();
                c.putString("Intensitasku", hasil);
                intent.putExtras(c);
                //memulai Activity kedua
                //startActivity(intent);
                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(intent);
                    }
                });
            }
        });
        btn_float.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.fragment_intensitas_hujan);
                dialog.setTitle("Intensitas Hujan");
                Button tutup = dialog.findViewById(R.id.btn_close);
                tutup.setVisibility(View.VISIBLE);
                tutup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }

/*
    @SuppressLint("ResourceType")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        TableLayout tablelayoutid = this.findViewById(R.id.tablelayoutid);

        for(int i=5;i<30;i+=5){
            TableRow row = (TableRow)getLayoutInflater().inflate(R.layout.layout_row, null);
            TextView TextView   = row.findViewById(R.id.tc7);
            TextView idnamaperusahaantabel   = row.findViewById(R.id.ih7);

            TextView.setText(Integer.toString(i));
            idnamaperusahaantabel.setText(Double.toString(x));
            tablelayoutid.addView(row);
        }
        return true;
    }*/
}
