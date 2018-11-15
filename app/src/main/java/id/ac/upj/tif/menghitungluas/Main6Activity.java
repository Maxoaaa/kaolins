package id.ac.upj.tif.menghitungluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main6Activity extends AppCompatActivity {
    TextView txtHasil , tc7, ih7;
    EditText txtCurah, txtWaktu;
    Button btnHitung, btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btnHitung = findViewById(R.id.btnHitung2);
        btnNext = findViewById(R.id.btnNext2);
        final TextView txthasil = findViewById(R.id.txthasil);

        final TextView txta1 = findViewById(R.id.txta1);
        final TextView txta2 = findViewById(R.id.txta2);
        final TextView txta3 = findViewById(R.id.txta3);
        final TextView txta4 = findViewById(R.id.txta4);
        final TextView txta5 = findViewById(R.id.txta5);
        final TextView txtr1 = findViewById(R.id.txtr1);
        final TextView txtr2 = findViewById(R.id.txtr2);
        final TextView txtr3 = findViewById(R.id.txtr3);
        final TextView txtr4 = findViewById(R.id.txtr4);
        final TextView txtr5 = findViewById(R.id.txtr5);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a1,a2,a3,a4,a5,r1,r2,r3,r4,r5;

                if (txta1.getText().toString().isEmpty()){
                    a1 = 0 ;
                }else {
                    a1 = Double.parseDouble(txta1.getText().toString());
                }

                if (txta2.getText().toString().isEmpty()){
                    a2 = 0 ;
                }else {
                    a2 = Double.parseDouble(txta2.getText().toString());
                }

                if (txta3.getText().toString().isEmpty()){
                    a3 = 0 ;
                }else {
                    a3 = Double.parseDouble(txta3.getText().toString());
                }

                if (txta4.getText().toString().isEmpty()){
                    a4 = 0 ;
                }else {
                    a4 = Double.parseDouble(txta4.getText().toString());
                }

                if (txta5.getText().toString().isEmpty()){
                    a5 = 0 ;
                }else {
                    a5 = Double.parseDouble(txta5.getText().toString());
                }

                if (txtr1.getText().toString().isEmpty()){
                    r1 = 0 ;
                }else {
                    r1 = Double.parseDouble(txtr1.getText().toString());
                }

                if (txtr2.getText().toString().isEmpty()){
                    r2 = 0 ;
                }else {
                    r2 = Double.parseDouble(txtr2.getText().toString());
                }

                if (txtr3.getText().toString().isEmpty()){
                    r3 = 0 ;
                }else {
                    r3 = Double.parseDouble(txtr3.getText().toString());
                }

                if (txtr4.getText().toString().isEmpty()){
                    r4 = 0 ;
                }else {
                    r4 = Double.parseDouble(txtr4.getText().toString());
                }

                if (txtr5.getText().toString().isEmpty()){
                    r5 = 0 ;
                }else {
                    r5 = Double.parseDouble(txtr5.getText().toString());
                }

                double R = ((a1*r1)+(a2*r2)+(a3*r3)+(a4*r4)+(a5*r5)) / (a1+a2+a3+a4+a5);
                //int l = 2;

                txthasil.setText(Double.toString(R));

                final Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                Bundle c = new Bundle();
                //untuk menyimpan data debit
                String hasil = Double.valueOf(R).toString();
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
    }
}
