package id.ac.upj.tif.menghitungluas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    TextView txtHasil;
    EditText txtLuas;
    Button btnHitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        final Bundle b = getIntent().getExtras();
        TextView kyuc =  findViewById(R.id.namaValue);
        kyuc.setText(b.getCharSequence("ProfilMukaAir"));

        txtHasil = findViewById(R.id.txtHasil);
        txtLuas = findViewById(R.id.txtluasdas);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double L;
                double Q,H;

                L = Double.parseDouble(txtLuas.getText().toString());
                Q = Double.parseDouble( b.getString("ProfilMukaAir"));
                H = Double.parseDouble( b.getString("Haha"));

                double S = H/(0.9 * L);
                double Tc = 0.101947 * (Math.pow(L,0.77)/Math.pow(S,0.835) );
                double Tp = 0.6 * Tc;

                txtHasil.setText("Volume Tampung : " + Tp);

            }
        });
    }
}
