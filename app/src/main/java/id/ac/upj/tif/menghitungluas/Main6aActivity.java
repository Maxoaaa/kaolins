package id.ac.upj.tif.menghitungluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main6aActivity extends AppCompatActivity {
    Button btnHitung,btnHitung3, btnNext;
    EditText txtX1,txtX2,txtX3,txtX4,txtX5,txtX6,txtX7,txtX8,txtX9,txtX10,txtXi;
    EditText txtYtr,txtSn, txtYn;
    TextView hasilAveX,hasilAveX1, hasilKtr,hasilSd,hasilXtr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6a);

        btnNext = findViewById(R.id.btnNext);
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
        txtYtr =  findViewById(R.id.txtYtr);
        txtSn =  findViewById(R.id.txtSn);
        txtYn =  findViewById(R.id.txtYn);
        hasilKtr =  findViewById(R.id.hasilKtr);
        hasilSd =  findViewById(R.id.hasilSd);
        hasilXtr =  findViewById(R.id.hasilXtr);

        btnHitung3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double X1,X2,X3,X4,X5,X6,X7,X8,X9,X10,totalX,Xi ,XiXa;
                //double Rerata_hujan;

                /*if (txtLuas.getText().toString().isEmpty()){
                    A = 0 ;
                }else {
                    A = Double.parseDouble(txtLuas.getText().toString());
                }*/
                //Rerata_hujan = Double.parseDouble( bave.getString("Rerata_hujan"));
                X1 = Double.parseDouble(txtX1.getText().toString());
                X2= Double.parseDouble(txtX2.getText().toString());
                X3= Double.parseDouble(txtX3.getText().toString());
                X4= Double.parseDouble(txtX4.getText().toString());
                X5= Double.parseDouble(txtX5.getText().toString());
                X6= Double.parseDouble(txtX6.getText().toString());
                X7= Double.parseDouble(txtX7.getText().toString());
                X8= Double.parseDouble(txtX8.getText().toString());
                X9= Double.parseDouble(txtX9.getText().toString());
                X10= Double.parseDouble(txtX10.getText().toString());
                Xi= Double.parseDouble(txtXi.getText().toString());

                totalX = (X1 + X2 +X3 + X4 +X5 +X6 + X7 +X8 +X9 +X10 ) /10;
                XiXa = Xi - totalX;

                hasilAveX1.setText(Double.toString(XiXa));



                btnHitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        double  Ytr, Sn, Yn,Ktr;
                        Ytr = Double.parseDouble(txtYtr.getText().toString());
                        Sn = Double.parseDouble(txtSn.getText().toString());
                        Yn = Double.parseDouble(txtYn.getText().toString());

                        Ktr = (Ytr - Yn) /Sn;
                        hasilKtr.setText(Double.toString(Ktr));

                        final Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        Bundle c = new Bundle();

                        c.putString("Rerata_hujan", String.valueOf(bave));
                        intent.putExtras(c);
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




    }
}
