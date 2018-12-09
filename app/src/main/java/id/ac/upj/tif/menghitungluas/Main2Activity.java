package id.ac.upj.tif.menghitungluas;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;

import java.text.DecimalFormat;


public class Main2Activity extends AppCompatActivity {
    TextView txtHasil;
    EditText txtLuas,txtLs,txtLt;
    Button btnHitung,btnNext;
    FloatingActionButton btn_float;
    Spinner spinner;

    public static String EXTRA_SELECTED_VALUE = "extra_selected_value";
    public static int RESULT_CODE = 110;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final DecimalFormat precision = new DecimalFormat("#.###");
        final Bundle b = getIntent().getExtras();
        TextView intensitas =  findViewById(R.id.namaValue);
        String abc =b.getString("Intensitasku");
        final Double abe = Double.valueOf(b.getString("Intensitasku"));
        String abd = precision.format(Double.parseDouble(abc));
        intensitas.setText(abd);

        final Spinner spinner =  findViewById(R.id.spinner);
        txtHasil = findViewById(R.id.txtHasil);
        txtLuas = findViewById(R.id.txtLuas);
        //txtLs = findViewById(R.id.txtLs);
        //txtLt = findViewById(R.id.txtLt);
        btnHitung = findViewById(R.id.btnHitung);
        btnNext = findViewById(R.id.btnNext);
        btn_float = findViewById(R.id.btn_float);

        //String jalur = spinner.getSelectedItem().toString();
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double A, Qs, C, Cs, tc, to, td, Lt, Ls, Vs, St;
                double intensitas;

                if (txtLuas.getText().toString().isEmpty()){
                    A = 0 ;
                }else {
                    A = Double.parseDouble(txtLuas.getText().toString());
                }

                intensitas = abe;
                C = Double.parseDouble(spinner.getSelectedItem().toString());
                //Ls = Double.parseDouble(txtLs.getText().toString());
                //Lt = Double.parseDouble(txtLt.getText().toString());
                Vs = 0.95;
                St= 0.02; // kemiringan lahan (%)
                String jalur = spinner.getSelectedItem().toString();

                Double Stkuadrat =Math.pow(St,0.5);
               // Double abc = Math.pow((Lt / Stkuadrat),0.77);
                //to = 0.0197* abc ;
                //td= Ls /(60 * Vs);
                //tc = to + td;
                //Cs = (2 * tc) / ((2 * tc )+ td);

                Qs = 0.278 * C * intensitas *  A;
                String Qskoma3 = precision.format(Qs);
                txtHasil.setText("Debit Banjir Maks: " +Qskoma3+" m³/s");

                final Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                //Intent intentv2 = new Intent(getApplicationContext(), Main2Activity.class);
                //Intent koefisi = new Intent(getApplicationContext(), Main4Activity.class);
                Bundle d = new Bundle();

                //untuk menyimpan data debit
                String hasil = new Double(Qs).toString();
                d.putString("Debitku", hasil);
                //d.putString("Intensitasku",  b.getString("Intensitasku"));
                //d.putString("koefisenku", Double.toString(C));
                intent.putExtras(d);
                //intentv2.putExtras(d);
                //memulai Activity ketiga
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
               final Dialog dialog = new Dialog(Main2Activity.this);
               dialog.setContentView(R.layout.fragment_debit_banjir);
               dialog.setTitle("Debit Banjir Maksimum");
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main5, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}