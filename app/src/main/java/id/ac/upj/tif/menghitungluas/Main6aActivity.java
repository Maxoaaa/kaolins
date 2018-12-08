package id.ac.upj.tif.menghitungluas;

import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main6aActivity extends AppCompatActivity {
    Button btnHitung,btnHitung3, btnNext, btnHasil;
    EditText txtX1,txtX2,txtX3,txtX4,txtX5,txtX6,txtX7,txtX8,txtX9,txtX10,txtXi;
    EditText txtYtr,txtSn, txtYn;
    TextView hasilAveX,hasilAveX1, hasilKtr,hasilSd,hasilXtr;
    FloatingActionButton btn_float,btn_float5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6a);

        btnNext = findViewById(R.id.btnNext);
        btnHitung3 = findViewById(R.id.btnHitung3);
        btnHasil = findViewById(R.id.btnHasil);
        btnHitung = findViewById(R.id.btnHitung);
        btn_float = findViewById(R.id.btn_float);
        btn_float5 = findViewById(R.id.btn_float5);

        //final Bundle bave = getIntent().getExtras();
        txtX1 =  findViewById(R.id.txtX1);
        txtX2 =  findViewById(R.id.txtX2);
        txtX3 =  findViewById(R.id.txtX3);
        txtX4 =  findViewById(R.id.txtX4);
        txtX5 =  findViewById(R.id.txtX5);
        txtX6 =  findViewById(R.id.txtX6);
        txtX7 =  findViewById(R.id.txtX7);
        txtX8 =  findViewById(R.id.txtX8);
        txtX9 =  findViewById(R.id.txtX9);
        txtX10 =  findViewById(R.id.txtX10);
        txtXi =  findViewById(R.id.txtXi);
        hasilAveX =  findViewById(R.id.hasilAveX);
        hasilAveX1 =  findViewById(R.id.hasilAveX1);


        btnHitung3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final double X1,X2,X3,X4,X5,X6,X7,X8,X9,X10,totalX,Xi ,XiXa,XiXa2;


                //double Rerata_hujan;

                if (txtX1.getText().toString().isEmpty()){ X1 = 0 ; }else { X1 = Double.parseDouble(txtX1.getText().toString()); }
                if (txtX2.getText().toString().isEmpty()){ X2 = 0 ; }else { X2 = Double.parseDouble(txtX2.getText().toString()); }
                if (txtX3.getText().toString().isEmpty()){ X3 = 0 ; }else { X3 = Double.parseDouble(txtX3.getText().toString()); }
                if (txtX4.getText().toString().isEmpty()){ X4 = 0 ; }else { X4 = Double.parseDouble(txtX4.getText().toString()); }
                if (txtX5.getText().toString().isEmpty()){ X5 = 0 ; }else { X5 = Double.parseDouble(txtX5.getText().toString()); }
                if (txtX6.getText().toString().isEmpty()){ X6 = 0 ; }else { X6 = Double.parseDouble(txtX6.getText().toString()); }
                if (txtX7.getText().toString().isEmpty()){ X7 = 0 ; }else { X7 = Double.parseDouble(txtX7.getText().toString()); }
                if (txtX8.getText().toString().isEmpty()){ X8 = 0 ; }else { X8 = Double.parseDouble(txtX8.getText().toString()); }
                if (txtX9.getText().toString().isEmpty()){ X9 = 0 ; }else { X9 = Double.parseDouble(txtX9.getText().toString()); }
                if (txtX10.getText().toString().isEmpty()){ X10 = 0 ; }else { X10 = Double.parseDouble(txtX10.getText().toString()); }
                if (txtXi.getText().toString().isEmpty()){ Xi = 0 ; }else { Xi = Double.parseDouble(txtXi.getText().toString()); }
                //Rerata_hujan = Double.parseDouble( bave.getString("Rerata_hujan"));

                totalX = (X1 + X2 +X3 + X4 +X5 +X6 + X7 +X8 +X9 +X10 ) /10;
                XiXa = Xi - totalX;
                XiXa2 = Math.pow((Xi - totalX),2) ;

                final DecimalFormat precision = new DecimalFormat("#.###");

                hasilAveX.setText(precision.format(totalX) );
                hasilAveX1.setText(precision.format(XiXa));

                txtYtr =  findViewById(R.id.txtYtr);
                txtSn =  findViewById(R.id.txtSn);
                txtYn =  findViewById(R.id.txtYn);
                hasilKtr =  findViewById(R.id.hasilKtr);
                hasilSd =  findViewById(R.id.hasilSd);
                hasilXtr =  findViewById(R.id.hasilXtr);

                btnHitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double  Ytr, Sn, Yn,Ktr, Sd, Xtr;
                        final double XiXaX1,XiXaX2,XiXaX3,XiXaX4,XiXaX5,XiXaX6,XiXaX7,XiXaX8,XiXaX9,XiXaX10,totalXiXaX;
                        final double XiXaa1,XiXaa2,XiXaa3,XiXaa4,XiXaa5,XiXaa6,XiXaa7,XiXaa8,XiXaa9,XiXaa10;
                        final double Ktr2, Ktr5, Ktr10, Ktr25, Ktr50, Ktr100, Ktr200, Ktr1000;
                        final double Xtr2, Xtr5, Xtr10, Xtr25, Xtr50, Xtr100, Xtr200, Xtr1000;
                        if (txtYtr.getText().toString().isEmpty()){ Ytr = 0 ; }else { Ytr = Double.parseDouble(txtYtr.getText().toString()); }
                        if (txtSn.getText().toString().isEmpty()){ Sn = 0 ; }else { Sn = Double.parseDouble(txtSn.getText().toString()); }
                        if (txtYn.getText().toString().isEmpty()){ Yn = 0 ; }else { Yn = Double.parseDouble(txtYn.getText().toString()); }

                        XiXaa1 = X1 - totalX;
                        XiXaa2 = X2 - totalX;
                        XiXaa3 = X3 - totalX;
                        XiXaa4 = X4 - totalX;
                        XiXaa5 = X5 - totalX;
                        XiXaa6 = X6 - totalX;
                        XiXaa7 = X7 - totalX;
                        XiXaa8 = X8 - totalX;
                        XiXaa9 = X9 - totalX;
                        XiXaa10 = X10 - totalX;
                        XiXaX1 = Math.pow(XiXaa1,2);
                        XiXaX2 = Math.pow(XiXaa2,2);
                        XiXaX3 = Math.pow(XiXaa3,2);
                        XiXaX4 = Math.pow(XiXaa4,2);
                        XiXaX5 = Math.pow(XiXaa5,2);
                        XiXaX6 = Math.pow(XiXaa6,2);
                        XiXaX7 = Math.pow(XiXaa7,2);
                        XiXaX8 = Math.pow(XiXaa8,2);
                        XiXaX9 = Math.pow(XiXaa9,2);
                        XiXaX10 = Math.pow(XiXaa10,2);

                        Ktr2 = (0.3665 -  Yn) / Sn;
                        Ktr5 = (1.4999 -  Yn) / Sn;
                        Ktr10 = (2.2502 -  Yn) / Sn;
                        Ktr25 = (3.1985 -  Yn) / Sn;
                        Ktr50 = (3.9019 -  Yn) / Sn;
                        Ktr100 = (4.6001 -  Yn) / Sn;
                        Ktr200 = (5.2960 -  Yn) / Sn;
                        Ktr1000 = (6.9190 -  Yn) / Sn;

                        totalXiXaX = XiXaX1+XiXaX2+XiXaX3+XiXaX4+XiXaX5+XiXaX6+XiXaX7+XiXaX8+XiXaX9+XiXaX10;
                        Ktr = (Ytr - Yn) /Sn;
                        Sd = Math.sqrt( (totalXiXaX / 9) )  ;
                        Xtr = totalX + (Ktr * Sd);

                        Xtr2 = totalX+ (Ktr2* Sd);
                        Xtr5 = totalX+ (Ktr5* Sd);
                        Xtr10 = totalX+ (Ktr10* Sd);
                        Xtr25 = totalX+ (Ktr25* Sd);
                        Xtr50 = totalX+ (Ktr50* Sd);
                        Xtr100 = totalX+ (Ktr100* Sd);
                        Xtr200 = totalX+ (Ktr200* Sd);
                        Xtr1000 = totalX+ (Ktr1000* Sd);

                        hasilKtr.setText(precision.format(Ktr));
                        hasilSd.setText(precision.format(Sd));
                        hasilXtr.setText(precision.format(Xtr));

                        final Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        final Intent intentb = new Intent(getApplicationContext(), Main6a_t_hasil.class);
                        Bundle c = new Bundle();
                        Bundle koin = new Bundle();
                        //c.putString("Rerata_hujan", bave.getString("Rerata_hujan"));
                        c.putString("Rerata_hujan", new Double(Xtr).toString());
                        //koin.putString("Xi", new Double(Xi).toString());
                        koin.putString("totalX", new Double(totalX).toString());
                        koin.putString("X1", new Double(X1).toString());
                        koin.putString("X2", new Double(X2).toString());
                        koin.putString("X3", new Double(X3).toString());
                        koin.putString("X4", new Double(X4).toString());
                        koin.putString("X5", new Double(X5).toString());
                        koin.putString("X6", new Double(X6).toString());
                        koin.putString("X7", new Double(X7).toString());
                        koin.putString("X8", new Double(X8).toString());
                        koin.putString("X9", new Double(X9).toString());
                        koin.putString("X10", new Double(X10).toString());
                        koin.putString("XiXa", new Double(XiXa).toString());
                        koin.putString("XiXaa1", precision.format(XiXaa1));
                        koin.putString("XiXaa2", precision.format(XiXaa2));
                        koin.putString("XiXaa3", precision.format(XiXaa3));
                        koin.putString("XiXaa4", precision.format(XiXaa4));
                        koin.putString("XiXaa5", precision.format(XiXaa5));
                        koin.putString("XiXaa6", precision.format(XiXaa6));
                        koin.putString("XiXaa7", precision.format(XiXaa7));
                        koin.putString("XiXaa8", precision.format(XiXaa8));
                        koin.putString("XiXaa9", precision.format(XiXaa9));
                        koin.putString("XiXaa10", precision.format(XiXaa10));
                        koin.putString("XiXaX1", precision.format(XiXaX1) );
                        koin.putString("XiXaX2", precision.format(XiXaX2) );
                        koin.putString("XiXaX3", precision.format(XiXaX3) );
                        koin.putString("XiXaX4", precision.format(XiXaX4) );
                        koin.putString("XiXaX5", precision.format(XiXaX5) );
                        koin.putString("XiXaX6",precision.format( XiXaX6) );
                        koin.putString("XiXaX7", precision.format(XiXaX7) );
                        koin.putString("XiXaX8", precision.format(XiXaX8) );
                        koin.putString("XiXaX9", precision.format(XiXaX9) );
                        koin.putString("XiXaX10", precision.format(XiXaX10) );
                        koin.putString("Ktr2", precision.format(Ktr2) );
                        koin.putString("Ktr5", precision.format(Ktr5) );
                        koin.putString("Ktr10", precision.format(Ktr10) );
                        koin.putString("Ktr25", precision.format(Ktr25) );
                        koin.putString("Ktr50", precision.format(Ktr50) );
                        koin.putString("Ktr100", precision.format(Ktr100) );
                        koin.putString("Ktr200", precision.format(Ktr200) );
                        koin.putString("Ktr1000", precision.format(Ktr1000) );
                        koin.putString("Xtr2", precision.format(Xtr2) );
                        koin.putString("Xtr5", precision.format(Xtr5) );
                        koin.putString("Xtr10", precision.format(Xtr10) );
                        koin.putString("Xtr25", precision.format(Xtr25) );
                        koin.putString("Xtr50", precision.format(Xtr50) );
                        koin.putString("Xtr100", precision.format(Xtr100) );
                        koin.putString("Xtr200", precision.format(Xtr200) );
                        koin.putString("Xtr1000", precision.format(Xtr1000) );
                        koin.putString("XiXa2", new Double(XiXa2).toString());
                        koin.putString("Ktr", new Double(Ktr).toString());
                        koin.putString("totalX", precision.format(totalX) );
                        koin.putString("Sd", precision.format(Sd) );
                        koin.putString("Xtr", new Double(Xtr).toString());
                        intent.putExtras(c);
                        intentb.putExtras(koin);
                        btnHasil.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(intentb);
                            }
                        });
                        btnNext.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                startActivity(intent);
                            }
                        });
                    }
                });
            }
        });
        btn_float.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Main6aActivity.this);
                dialog.setContentView(R.layout.fragment_gumbel_dialog);
                dialog.setTitle("Distribusi Gumbel");
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
        btn_float5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Main6aActivity.this);
                dialog.setContentView(R.layout.fragment_gumbel);
                dialog.setTitle("Tabel");
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
}
