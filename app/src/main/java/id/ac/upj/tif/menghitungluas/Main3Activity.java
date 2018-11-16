package id.ac.upj.tif.menghitungluas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class Main3Activity extends AppCompatActivity {
    TextView txtHasil, txtHasil2;
    EditText txtManning, txtKemiringan,txtLebarSaluran,txtKedalamanSaluran, txtRangeElevasi, txtkemiringantalud;
    Button btnHitung,btnNext;

    EditText txtKedalamanSungai, txtso, txtKoefisienKecepatan, txtKedalamanSungaiHulu, txtTinggiJagaan, txth,txtm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Bundle b = getIntent().getExtras();
        TextView debit =  findViewById(R.id.namaValue);
        debit.setText(b.getCharSequence("Debitku"));

        txtKedalamanSungai = findViewById(R.id.txtKedalamanSungai);
        txtManning = findViewById(R.id.txtManning);
        txtLebarSaluran = findViewById(R.id.txtLebarSaluran);
        txtso = findViewById(R.id.txtso);
        txtKoefisienKecepatan = findViewById(R.id.txtKoefisienKecepatan);
        txtKedalamanSungaiHulu = findViewById(R.id.txtKedalamanSungaiHulu);
        txtTinggiJagaan = findViewById(R.id.txtTinggiJagaan);
        txth = findViewById(R.id.txth);
        txtm = findViewById(R.id.txtm);

        /*txtManning = findViewById(R.id.txtManning);
        txtKemiringan = findViewById(R.id.txtKemiringan);
        txtKedalamanSaluran = findViewById(R.id.txtKedalamanSaluran);
        txtRangeElevasi = findViewById(R.id.txtRangeElevasi);
        txtkemiringantalud = findViewById(R.id.txtkemiringantalud);
        txtHasil = findViewById(R.id.txtHasil);
        txtHasil2 = findViewById(R.id.txtHasil2);
        btnHitung = findViewById(R.id.btnHitung);
        btnNext = findViewById(R.id.btnNext);*/

        //untuk tabel
        /*final TextView ky1 = findViewById(R.id.ky1);
        final TextView kA1 = findViewById(R.id.kA1);
        final TextView kV1 = findViewById(R.id.kV1);
        final TextView kE1 = findViewById(R.id.kE1);
        final TextView kDeltaE2 = findViewById(R.id.kDeltaE2);
        final TextView kR1 = findViewById(R.id.kR1);
        final TextView kSf1 = findViewById(R.id.kSf1);
        final TextView krataSf2 = findViewById(R.id.krataSf2);
        final TextView kdl2 = findViewById(R.id.kdl2);

        final TextView ky2 = findViewById(R.id.ky2);
        final TextView kA2 = findViewById(R.id.kA2);
        final TextView kV2 = findViewById(R.id.kV2);
        final TextView kE2 = findViewById(R.id.kE2);
        final TextView kDeltaE3 = findViewById(R.id.kDeltaE3);
        final TextView kR2 = findViewById(R.id.kR2);
        final TextView kSf2 = findViewById(R.id.kSf2);
        final TextView krataSf3 = findViewById(R.id.krataSf3);
        final TextView kdl3 = findViewById(R.id.kdl3);

        final TextView ky3 = findViewById(R.id.ky3);
        final TextView kA3 = findViewById(R.id.kA3);
        final TextView kV3 = findViewById(R.id.kV3);
        final TextView kE3 = findViewById(R.id.kE3);
        final TextView kDeltaE4 = findViewById(R.id.kDeltaE4);
        final TextView kR3 = findViewById(R.id.kR3);
        final TextView kSf3 = findViewById(R.id.kSf3);
        final TextView krataSf4 = findViewById(R.id.krataSf4);
        final TextView kdl4 = findViewById(R.id.kdl4);

        final TextView ky4 = findViewById(R.id.ky4);
        final TextView kA4 = findViewById(R.id.kA4);
        final TextView kV4 = findViewById(R.id.kV4);
        final TextView kE4 = findViewById(R.id.kE4);
        final TextView kDeltaE5 = findViewById(R.id.kDeltaE5);
        final TextView kR4 = findViewById(R.id.kR4);
        final TextView kSf4 = findViewById(R.id.kSf4);
        final TextView krataSf5 = findViewById(R.id.krataSf5);
        final TextView kdl5 = findViewById(R.id.kdl5);

        final TextView ky5 = findViewById(R.id.ky5);
        final TextView kA5 = findViewById(R.id.kA5);
        final TextView kV5 = findViewById(R.id.kV5);
        final TextView kE5 = findViewById(R.id.kE5);
        final TextView kR5 = findViewById(R.id.kR5);
        final TextView kSf5 = findViewById(R.id.kSf5);
        final TextView kDeltaE6 = findViewById(R.id.kDeltaE6);
        final TextView krataSf6 = findViewById(R.id.krataSf6);
        final TextView kdl6 = findViewById(R.id.kdl6);

        final TextView ky6 = findViewById(R.id.ky6);
        final TextView kA6 = findViewById(R.id.kA6);
        final TextView kV6 = findViewById(R.id.kV6);
        final TextView kE6 = findViewById(R.id.kE6);
        final TextView kR6 = findViewById(R.id.kR6);
        final TextView kSf6 = findViewById(R.id.kSf6);
        final TextView kDeltaE7 = findViewById(R.id.kDeltaE7);
        final TextView krataSf7 = findViewById(R.id.krataSf7);
        final TextView kdl7 = findViewById(R.id.kdl7);

        final TextView ky7 = findViewById(R.id.ky7);
        final TextView kA7 = findViewById(R.id.kA7);
        final TextView kV7 = findViewById(R.id.kV7);
        final TextView kE7 = findViewById(R.id.kE7);
        final TextView kR7 = findViewById(R.id.kR7);
        final TextView kSf7 = findViewById(R.id.kSf7);
        

        final TextView ky8 = findViewById(R.id.ky8);
        final TextView kA8 = findViewById(R.id.kA8);
        final TextView kV8 = findViewById(R.id.kV8);
        final TextView kE8 = findViewById(R.id.kE8);
        final TextView kR8 = findViewById(R.id.kR8);
        final TextView kSf8 = findViewById(R.id.kSf8);
        final TextView kDeltaE8 = findViewById(R.id.kDeltaE8);
        final TextView krataSf8 = findViewById(R.id.krataSf8);
        final TextView kdl8 = findViewById(R.id.kdl8);

        final TextView ky9 = findViewById(R.id.ky9);
        final TextView kA9 = findViewById(R.id.kA9);
        final TextView kV9 = findViewById(R.id.kV9);
        final TextView kE9 = findViewById(R.id.kE9);
        final TextView kR9 = findViewById(R.id.kR9);
        final TextView kSf9 = findViewById(R.id.kSf9);
        final TextView kDeltaE9 = findViewById(R.id.kDeltaE9);
        final TextView krataSf9 = findViewById(R.id.krataSf9);
        final TextView kdl9 = findViewById(R.id.kdl9);

        final TextView ky10 = findViewById(R.id.ky10);
        final TextView kA10 = findViewById(R.id.kA10);
        final TextView kV10 = findViewById(R.id.kV10);
        final TextView kE10 = findViewById(R.id.kE10);
        final TextView kR10 = findViewById(R.id.kR10);
        final TextView kSf10 = findViewById(R.id.kSf10);
        final TextView kDeltaE10 = findViewById(R.id.kDeltaE10);
        final TextView krataSf10 = findViewById(R.id.krataSf10);
        final TextView kdl10 = findViewById(R.id.kdl10);

        final TextView kQc1 = findViewById(R.id.Qc1);
        final TextView kQc2 = findViewById(R.id.Qc2);
        final TextView kQc3 = findViewById(R.id.Qc3);
        final TextView kQc4 = findViewById(R.id.Qc4);
        final TextView kQc5 = findViewById(R.id.Qc5);
        final TextView kQc6 = findViewById(R.id.Qc6);
        final TextView kQc7 = findViewById(R.id.Qc7);
        final TextView kQc8 = findViewById(R.id.Qc8);
        final TextView kQc9 = findViewById(R.id.Qc9);
        final TextView kQc10 = findViewById(R.id.Qc10);

        final TextView kDeltaX1 = findViewById(R.id.txtDeltaX1);
        final TextView kDeltaX2 = findViewById(R.id.txtDeltaX2);
        final TextView kDeltaX3 = findViewById(R.id.txtDeltaX3);
        final TextView kDeltaX4 = findViewById(R.id.txtDeltaX4);
        final TextView kDeltaX5 = findViewById(R.id.txtDeltaX5);
        final TextView kDeltaX6 = findViewById(R.id.txtDeltaX6);
        final TextView kDeltaX7 = findViewById(R.id.txtDeltaX7);
        final TextView kDeltaX8 = findViewById(R.id.txtDeltaX8);
        final TextView kDeltaX9 = findViewById(R.id.txtDeltaX9);
        final TextView kDeltaX10 = findViewById(R.id.txtDeltaX10);

        final TextView kX1 = findViewById(R.id.txtX1);
        final TextView kX2 = findViewById(R.id.txtX2);
        final TextView kX3 = findViewById(R.id.txtX3);
        final TextView kX4 = findViewById(R.id.txtX4);
        final TextView kX5 = findViewById(R.id.txtX5);
        final TextView kX6 = findViewById(R.id.txtX6);
        final TextView kX7 = findViewById(R.id.txtX7);
        final TextView kX8 = findViewById(R.id.txtX8);
        final TextView kX9 = findViewById(R.id.txtX9);
        final TextView kX10 = findViewById(R.id.txtX10);*/



        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double g = 9.80665, range;
                double y1, y2;
                double B, A1, A2;
                double Qs, V1, V2, E1, E2;
                double deltaE2 = 0;
                double Rm1, Rm2;
                double n,Sf1, Sf2;
                double So;
                double Qc1;
                double DeltaX2, X2;

               /* y1 = Double.parseDouble(txtKedalamanSaluran.getText().toString());
                range = Double.parseDouble(txtRangeElevasi.getText().toString());
                y2 = y1 - range;
                B = Double.parseDouble(txtLebarSaluran.getText().toString());
                A1 = y1 * B;
                A2 = y2 * B;
                Qs = Double.parseDouble( b.getString("Debitku"));
                //Qs = 15;
                V1 = Qs / A1;
                V2 = Qs / A2;
                E1= y1 +  (Math.pow(V1,2) / (2* g));
                E2= y2 +  (Math.pow(V2,2) / (2* g));
                Rm1 = A1 / (2 * y1  + B );
                Rm2 = A2 / (2 * y2  + B );
                n = Double.parseDouble(txtManning.getText().toString());
                double R2per3_1 = Math.cbrt(Math.pow(Rm1,2));
                double Sf1temp = (n * Qs) / (A1 * R2per3_1);
                Sf1 = Math.pow(Sf1temp,2);
                double R2per3_2 = Math.cbrt(Math.pow(Rm2,2));
                double Sf2temp = (n * Qs) / (A2 * R2per3_2);
                Sf2 = Math.pow(Sf2temp,2);
                double rataSf2 = (Sf1 + Sf2) /2;
                double rataSf3 = (Sf2 + Sf3) /2;
                So = Double.parseDouble(txtKemiringan.getText().toString());
                Qc1 = V1 * A1;
                DeltaX2 = deltaE2 / (So - rataSf2);
                X2 = DeltaX2;*/

                Qc1 = 5.555555555555555555555555;

                txtHasil.setText("B : "+ "null");
                txtHasil2.setText("Qc : "+ Qc1);
                DecimalFormat precision = new DecimalFormat("#.#################################");


                //untuk menyimpan data di activity (bundle)
                final Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                Bundle e = new Bundle();
                //untuk menyimpan profil muka air
                String hasil = new Double(Qc1).toString();
               // String hasil2 = new Double(H).toString();
                e.putString("ProfilMukaAir", hasil);
                //e.putString("Haha", hasil2);
                intent.putExtras(e);
                //memulai Activity ketiga
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
