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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Bundle b = getIntent().getExtras();
        TextView debit =  findViewById(R.id.namaValue);
        debit.setText(b.getCharSequence("Debitku"));

        txtManning = findViewById(R.id.txtManning);
        txtKemiringan = findViewById(R.id.txtKemiringan);
        txtLebarSaluran = findViewById(R.id.txtLebarSaluran);
        txtKedalamanSaluran = findViewById(R.id.txtKedalamanSaluran);
        txtRangeElevasi = findViewById(R.id.txtRangeElevasi);
        txtkemiringantalud = findViewById(R.id.txtkemiringantalud);
        txtHasil = findViewById(R.id.txtHasil);
        txtHasil2 = findViewById(R.id.txtHasil2);
        btnHitung = findViewById(R.id.btnHitung);
        btnNext = findViewById(R.id.btnNext);

        //untuk tabel
        final TextView ky1 = findViewById(R.id.ky1);
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
        final TextView kX10 = findViewById(R.id.txtX10);



        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double g = 9.81, range;
                double y1, y2, y3, y4, y5, y6, y7, y8, y9, y10;
                double B, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10;
                double Qs, V1, V2, V3, V4, V5, V6, V7,V8,V9,V10;
                double E1, E2, E3, E4, E5, E6,E7,E8,E9,E10;
                double deltaE2, deltaE3, deltaE4, deltaE5, deltaE6,deltaE7,deltaE8,deltaE9,deltaE10;
                double Rm1, Rm2, Rm3, Rm4, Rm5, Rm6,Rm7,Rm8,Rm9,Rm10;
                double n,Sf1, Sf2, Sf3, Sf4, Sf5, Sf6,Sf7,Sf8,Sf9,Sf10;
                double So, dl2, dl3, dl4, dl5 , dl6,dl7,dl8,dl9,dl10;
                double Qc1,Qc2,Qc3,Qc4,Qc5,Qc6,Qc7,Qc8,Qc9,Qc10;
                double DeltaX2,DeltaX3,DeltaX4,DeltaX5,DeltaX6,DeltaX7,DeltaX8,DeltaX9,DeltaX10;
                double X2,X3,X4,X5,X6,X7,X8,X9,X10;


                y1 = Double.parseDouble(txtKedalamanSaluran.getText().toString());
                range = Double.parseDouble(txtRangeElevasi.getText().toString());
                y2 = y1 - range;
                y3 = y2 - range;
                y4 = y3 - range;
                y5 = y4 - range;
                y6 = y5 - range;
                y7 = y6 - range;
                y8 = y7 - range;
                y9 = y8 - range;
                y10 = y9 - range;
                B = Double.parseDouble(txtLebarSaluran.getText().toString());
                A1 = y1 * B;
                A2 = y2 * B;
                A3 = y3 * B;
                A4 = y4 * B;
                A5 = y5 * B;
                A6 = y6 * B;
                A7 = y7 * B;
                A8 = y8 * B;
                A9 = y9 * B;
                A10 = y10 * B;
                Qs = Double.parseDouble( b.getString("Debitku"));
                //Qs = 15;
                V1 = Qs / A1;
                V2 = Qs / A2;
                V3 = Qs / A3;
                V4 = Qs / A4;
                V5 = Qs / A5;
                V6 = Qs / A6;
                V7 = Qs / A7;
                V8 = Qs / A8;
                V9 = Qs / A9;
                V10 = Qs / A10;
                E1= y1 +  (Math.pow(V1,2) / (2* g));
                E2= y2 +  (Math.pow(V2,2) / (2* g));
                E3= y3 +  (Math.pow(V3,2) / (2* g));
                E4= y4 +  (Math.pow(V4,2) / (2* g));
                E5= y5 +  (Math.pow(V5,2) / (2* g));
                E6= y6 +  (Math.pow(V6,2) / (2* g));
                E7= y7 +  (Math.pow(V7,2) / (2* g));
                E8= y8 +  (Math.pow(V8,2) / (2* g));
                E9= y9 +  (Math.pow(V9,2) / (2* g));
                E10= y10 +  (Math.pow(V10,2) / (2* g));
                deltaE2 = E1 - E2;
                deltaE3 = E2 - E3;
                deltaE4 = E3 - E4;
                deltaE5 = E4 - E5;
                deltaE6 = E5 - E6;
                deltaE7 = E6 - E7;
                deltaE8 = E7 - E8;
                deltaE9 = E8 - E9;
                deltaE10 = E9 - E10;

                Rm1 = A1 / (2 * y1  + B );
                Rm2 = A2 / (2 * y2  + B );
                Rm3 = A3 / (2 * y3  + B );
                Rm4 = A4 / (2 * y4  + B );
                Rm5 = A5 / (2 * y5  + B );
                Rm6 = A6 / (2 * y6  + B );
                Rm7 = A7 / (2 * y7  + B );
                Rm8 = A8 / (2 * y8  + B );
                Rm9 = A9 / (2 * y9  + B );
                Rm10 = A10 / (2 * y10  + B );
                n = Double.parseDouble(txtManning.getText().toString());

                double R2per3_1 = Math.cbrt(Math.pow(Rm1,2));
                double Sf1temp = (n * Qs) / (A1 * R2per3_1);
                Sf1 = Math.pow(Sf1temp,2);

                double R2per3_2 = Math.cbrt(Math.pow(Rm2,2));
                double Sf2temp = (n * Qs) / (A2 * R2per3_2);
                Sf2 = Math.pow(Sf2temp,2);

                double R2per3_3 = Math.cbrt(Math.pow(Rm3,2));
                double Sf3temp = (n * Qs) / (A3 * R2per3_3);
                Sf3 = Math.pow(Sf3temp,2);

                double R2per3_4 = Math.cbrt(Math.pow(Rm4,2));
                double Sf4temp = (n * Qs) / (A4 * R2per3_4);
                Sf4 = Math.pow(Sf4temp,2);

                double R2per3_5 = Math.cbrt(Math.pow(Rm5,2));
                double Sf5temp = (n * Qs) / (A5 * R2per3_5);
                Sf5 = Math.pow(Sf5temp,2);

                double R2per3_6 = Math.cbrt(Math.pow(Rm6,2));
                double Sf6temp = (n * Qs) / (A6 * R2per3_6);
                Sf6 = Math.pow(Sf6temp,2);

                double R2per3_7 = Math.cbrt(Math.pow(Rm7,2));
                double Sf7temp = (n * Qs) / (A7 * R2per3_7);
                Sf7 = Math.pow(Sf7temp,2);


                double R2per3_8 = Math.cbrt(Math.pow(Rm8,2));
                double Sf8temp = (n * Qs) / (A8 * R2per3_8);
                Sf8 = Math.pow(Sf8temp,2);

                double R2per3_9 = Math.cbrt(Math.pow(Rm9,2));
                double Sf9temp = (n * Qs) / (A9 * R2per3_9);
                Sf9 = Math.pow(Sf9temp,2);

                double R2per3_10 = Math.cbrt(Math.pow(Rm10,2));
                double Sf10temp = (n * Qs) / (A10 * R2per3_10);
                Sf10 = Math.pow(Sf10temp,2);

                double rataSf2 = (Sf1 + Sf2) /2;
                double rataSf3 = (Sf2 + Sf3) /2;
                double rataSf4 = (Sf3 + Sf4) /2;
                double rataSf5 = (Sf4 + Sf5) /2;
                double rataSf6 = (Sf5 + Sf6) /2;
                double rataSf7 = (Sf6 + Sf7) /2;
                double rataSf8 = (Sf7 + Sf8) /2;
                double rataSf9 = (Sf8 + Sf9) /2;
                double rataSf10 = (Sf9 + Sf10) /2;

                So = Double.parseDouble(txtKemiringan.getText().toString());
                dl2 = deltaE2 / (So - rataSf2);
                dl3 = deltaE3 / (So - rataSf3);
                dl4 = deltaE4 / (So - rataSf4);
                dl5 = deltaE5 / (So - rataSf5);
                dl6 = deltaE6 / (So - rataSf6);
                dl7 = deltaE7 / (So - rataSf7);
                dl8 = deltaE8 / (So - rataSf8);
                dl9 = deltaE9 / (So - rataSf9);
                dl10 = deltaE10 / (So - rataSf10);

                Qc1 = V1 * A1;
                Qc2 = V2 * A2;
                Qc3 = V3 * A3;
                Qc4 = V4 * A4;
                Qc5 = V5 * A5;
                Qc6 = V6 * A6;
                Qc7 = V7 * A7;
                Qc8 = V8 * A8;
                Qc9 = V9 * A9;
                Qc10 = V10 * A10;

                DeltaX2 = deltaE2 / (So - rataSf2);
                DeltaX3 = deltaE3 / (So - rataSf3);
                DeltaX4 = deltaE4 / (So - rataSf4);
                DeltaX5 = deltaE5 / (So - rataSf5);
                DeltaX6 = deltaE6 / (So - rataSf6);
                DeltaX7 = deltaE7 / (So - rataSf7);
                DeltaX8 = deltaE8 / (So - rataSf8);
                DeltaX9 = deltaE9 / (So - rataSf9);
                DeltaX10 = deltaE10 / (So - rataSf10);

                X2 = DeltaX2;
                X3 = DeltaX2 + DeltaX3;
                X4 = DeltaX3 + DeltaX4;
                X5 = DeltaX4 + DeltaX5;
                X6 = DeltaX5 + DeltaX6;
                X7 = DeltaX6 + DeltaX7;
                X8 = DeltaX7 + DeltaX8;
                X9 = DeltaX8 + DeltaX9;
                X10 = DeltaX9 + DeltaX10;

                double H = DeltaX10-DeltaX2;

                double Totaldl = (dl2 + dl3 + dl4 + dl5 + dl6 + dl7+ dl8+ dl9+ dl10) / 9;

                txtHasil.setText("NDL Elevation : "+ Totaldl);
                txtHasil2.setText("Qc : "+ Qc1);
                DecimalFormat precision = new DecimalFormat("#.#################################");

                ky1.setText(precision.format(y1));
                ky2.setText(precision.format(y2));
                ky3.setText(precision.format(y3));
                ky4.setText(precision.format(y4));
                ky5.setText(precision.format(y5));
                ky6.setText(precision.format(y6));
                ky7.setText(precision.format(y7));
                ky8.setText(precision.format(y8));
                ky9.setText(precision.format(y9));
                ky10.setText(precision.format(y10));

                kA1.setText(precision.format(A1));
                kA2.setText(precision.format(A2));
                kA3.setText(precision.format(A3));
                kA4.setText(precision.format(A4));
                kA5.setText(precision.format(A5));
                kA6.setText(precision.format(A6));
                kA7.setText(precision.format(A7));
                kA8.setText(precision.format(A8));
                kA9.setText(precision.format(A9));
                kA10.setText(precision.format(A10));

                kV1.setText(precision.format(V1));
                kV2.setText(precision.format(V2));
                kV3.setText(precision.format(V3));
                kV4.setText(precision.format(V4));
                kV5.setText(precision.format(V5));
                kV6.setText(precision.format(V6));
                kV7.setText(precision.format(V7));
                kV8.setText(precision.format(V8));
                kV9.setText(precision.format(V9));
                kV10.setText(precision.format(V10));

                kE1.setText(precision.format(E1));
                kE2.setText(precision.format(E2));
                kE3.setText(precision.format(E3));
                kE4.setText(precision.format(E4));
                kE5.setText(precision.format(E5));
                kE6.setText(precision.format(E6));
                kE7.setText(precision.format(E7));
                kE8.setText(precision.format(E8));
                kE9.setText(precision.format(E9));
                kE10.setText(precision.format(E10));

                kR1.setText(precision.format(Rm1));
                kR2.setText(precision.format(Rm2));
                kR3.setText(precision.format(Rm3));
                kR4.setText(precision.format(Rm4));
                kR5.setText(precision.format(Rm5));
                kR6.setText(precision.format(Rm6));
                kR7.setText(precision.format(Rm7));
                kR8.setText(precision.format(Rm8));
                kR9.setText(precision.format(Rm9));
                kR10.setText(precision.format(Rm10));

                kSf1.setText(precision.format(Sf1));
                kSf2.setText(precision.format(Sf2));
                kSf3.setText(precision.format(Sf3));
                kSf4.setText(precision.format(Sf4));
                kSf5.setText(precision.format(Sf5));
                kSf6.setText(precision.format(Sf6));
                kSf7.setText(precision.format(Sf7));
                kSf8.setText(precision.format(Sf8));
                kSf9.setText(precision.format(Sf9));
                kSf10.setText(precision.format(Sf10));

                kDeltaE2.setText(precision.format(deltaE2));
                kDeltaE3.setText(precision.format(deltaE3));
                kDeltaE4.setText(precision.format(deltaE4));
                kDeltaE5.setText(precision.format(deltaE5));
                kDeltaE6.setText(precision.format(deltaE6));
                kDeltaE7.setText(precision.format(deltaE7));
                kDeltaE8.setText(precision.format(deltaE8));
                kDeltaE9.setText(precision.format(deltaE9));
                kDeltaE10.setText(precision.format(deltaE10));

                krataSf2.setText(precision.format(rataSf2));
                krataSf3.setText(precision.format(rataSf3));
                krataSf4.setText(precision.format(rataSf4));
                krataSf5.setText(precision.format(rataSf5));
                krataSf6.setText(precision.format(rataSf6));
                krataSf7.setText(precision.format(rataSf7));
                krataSf8.setText(precision.format(rataSf8));
                krataSf9.setText(precision.format(rataSf9));
                krataSf10.setText(precision.format(rataSf10));

                kdl2.setText(precision.format(dl2));
                kdl3.setText(precision.format(dl3));
                kdl4.setText(precision.format(dl4));
                kdl5.setText(precision.format(dl5));
                kdl6.setText(precision.format(dl6));
                kdl7.setText(precision.format(dl7));
                kdl8.setText(precision.format(dl8));
                kdl9.setText(precision.format(dl8));
                kdl10.setText(precision.format(dl10));

                kQc1.setText(precision.format(Qc1));
                kQc2.setText(precision.format(Qc2));
                kQc3.setText(precision.format(Qc3));
                kQc4.setText(precision.format(Qc4));
                kQc5.setText(precision.format(Qc5));
                kQc6.setText(precision.format(Qc6));
                kQc7.setText(precision.format(Qc7));
                kQc8.setText(precision.format(Qc8));
                kQc9.setText(precision.format(Qc9));
                kQc10.setText(precision.format(Qc10));

                kDeltaX2.setText(precision.format(DeltaX2));
                kDeltaX3.setText(precision.format(DeltaX3));
                kDeltaX4.setText(precision.format(DeltaX4));
                kDeltaX5.setText(precision.format(DeltaX5));
                kDeltaX6.setText(precision.format(DeltaX6));
                kDeltaX7.setText(precision.format(DeltaX7));
                kDeltaX8.setText(precision.format(DeltaX8));
                kDeltaX9.setText(precision.format(DeltaX9));
                kDeltaX10.setText(precision.format(DeltaX10));

                kX2.setText(precision.format(X2));
                kX3.setText(precision.format(X3));
                kX4.setText(precision.format(X4));
                kX5.setText(precision.format(X5));
                kX6.setText(precision.format(X6));
                kX7.setText(precision.format(X7));
                kX8.setText(precision.format(X8));
                kX9.setText(precision.format(X9));
                kX10.setText(precision.format(X10));


                //untuk menyimpan data di activity (bundle)
                final Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                Bundle e = new Bundle();
                //untuk menyimpan profil muka air
                String hasil = new Double(Qc1).toString();
                String hasil2 = new Double(H).toString();
                e.putString("ProfilMukaAir", hasil);
                e.putString("Haha", hasil2);
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
