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

        final Bundle bave = getIntent().getExtras();
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

                hasilAveX.setText(Double.toString(totalX));
                hasilAveX1.setText(Double.toString(XiXa));

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
                        if (txtYtr.getText().toString().isEmpty()){ Ytr = 0 ; }else { Ytr = Double.parseDouble(txtYtr.getText().toString()); }
                        if (txtSn.getText().toString().isEmpty()){ Sn = 0 ; }else { Sn = Double.parseDouble(txtSn.getText().toString()); }
                        if (txtYn.getText().toString().isEmpty()){ Yn = 0 ; }else { Yn = Double.parseDouble(txtYn.getText().toString()); }

                        XiXaX1 = Math.pow((X1-totalX),2);
                        XiXaX2 = Math.pow((X2-totalX),2);
                        XiXaX3 = Math.pow((X3-totalX),2);
                        XiXaX4 = Math.pow((X4-totalX),2);
                        XiXaX5 = Math.pow((X5-totalX),2);
                        XiXaX6 = Math.pow((X6-totalX),2);
                        XiXaX7 = Math.pow((X7-totalX),2);
                        XiXaX8 = Math.pow((X8-totalX),2);
                        XiXaX9 = Math.pow((X9-totalX),2);
                        XiXaX10 = Math.pow((X10-totalX),2);

                        totalXiXaX = XiXaX1+XiXaX2+XiXaX3+XiXaX4+XiXaX5+XiXaX6+XiXaX7+XiXaX8+XiXaX9+XiXaX10;
                        Ktr = (Ytr - Yn) /Sn;
                        Sd = Math.sqrt( (totalXiXaX / 9) )  ;
                        Xtr = totalX + (Ktr * Sd);

                        hasilKtr.setText(Double.toString(Ktr));
                        hasilSd.setText(Double.toString(Sd));
                        hasilXtr.setText(Double.toString(Xtr));

                        final Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        final Intent intentb = new Intent(getApplicationContext(), Main6a_t_hasil.class);
                        Bundle c = new Bundle();
                        Bundle koin = new Bundle();
                        //c.putString("Rerata_hujan", bave.getString("Rerata_hujan"));
                        c.putString("Rerata_hujan", new Double(Xtr).toString());
                        //koin.putString("Xi", new Double(Xi).toString());
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
                        koin.putString("XiXa2", new Double(XiXa2).toString());
                        koin.putString("Ktr", new Double(Ktr).toString());
                        koin.putString("totalX", new Double(totalX).toString());
                        koin.putString("Sd", new Double(Sd).toString());
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
