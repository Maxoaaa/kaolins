package id.ac.upj.tif.menghitungluas;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Main4Activity extends AppCompatActivity {
    TextView txtHasil,namaValue;
    EditText txtLuas;
    Button btnHitung;
    FloatingActionButton btn_float;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //TextView kyuc =  findViewById(R.id.namaValue);
        EditText Mercu =  findViewById(R.id.txtMercu);
        EditText PanjangSungai =  findViewById(R.id.txtPanjangSungai);
        EditText jarakTampang =  findViewById(R.id.txtjarakTampang);

        final Bundle b = getIntent().getExtras();
        final DecimalFormat precision = new DecimalFormat("#.###");
        String abc =b.getString("ProfilMukaAirD");
        String abc2 =b.getString("ProfilMukaAirDX");
        String abc3 =b.getString("ProfilMukaAirB");
        final Double abe = Double.valueOf(b.getString("ProfilMukaAirD"));
        final Double abe2 = Double.valueOf(b.getString("ProfilMukaAirDX"));
        final Double abe3 = Double.valueOf(b.getString("ProfilMukaAirB"));
        String abd = precision.format(Double.parseDouble(abc));
        String abd2 = precision.format(Double.parseDouble(abc2));
        String abd3 = precision.format(Double.parseDouble(abc3));

        //kyuc.setText(b.getCharSequence("ProfilMukaAirD"));
        Mercu.setText(abd);
        PanjangSungai.setText(abd3);
        jarakTampang.setText(abd2);

        txtHasil = findViewById(R.id.txtHasil);
        namaValue = findViewById(R.id.namaValue);
        btnHitung = findViewById(R.id.btnHitung);
        btn_float = findViewById(R.id.btn_float);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double L;
                double Q,H;
                double volume, D, B, DX;

                /*L = Double.parseDouble(txtLuas.getText().toString());
                Q = Double.parseDouble( b.getString("ProfilMukaAir"));
                H = Double.parseDouble( b.getString("Haha"));*/
                D = Double.parseDouble( b.getString("ProfilMukaAirD"));
                B = Double.parseDouble( b.getString("ProfilMukaAirB"));
                DX = Double.parseDouble( b.getString("ProfilMukaAirDX"));

                //double S = H/(0.9 * L);
                //double Tc = 0.101947 * (Math.pow(L,0.77)/Math.pow(S,0.835) );
                //double Tp = 0.6 * Tc;
                volume = D*B* DX;
                //txtHasil.setText("Volume Tampung : " + volume);
                String volumekoma3 = precision.format(volume);
                namaValue.setText(""+volumekoma3);
               // Bundle d = new Bundle();
                /*d.putString("ProfilMukaAirD", String.valueOf(D));
                d.putString("ProfilMukaAirDX", String.valueOf(DX));
                d.putString("ProfilMukaAirB", String.valueOf(B));*/
                //d.putString("koefisenku", Double.toString(C));
                //intent.putExtras(d);
            }
        });
        btn_float.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Main4Activity.this);
                dialog.setContentView(R.layout.fragment_volume_tampung);
                dialog.setTitle("Volume Long Storage");
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
