package id.ac.upj.tif.menghitungluas;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableRow;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    TextView txtHasil , tc7, ih7;
    EditText txtCurah, txtWaktu;
    Button btnHitung, btnNext;
    FloatingActionButton btn_float;
    Spinner mspinner;

    private TableRow ra1, rr1, ra2,rr2, ra3,rr3, ra4,rr4, ra5,rr5;
    private static final int SPINNER_OPTION_FIRST = 1;
    private static final int SPINNER_OPTION_SECOND = 2;
    private static final int SPINNER_OPTION_THIRD = 3;
    private static final int SPINNER_OPTION_FOURTH = 4;
    private static final int SPINNER_OPTION_FIFTH = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        btnHitung = findViewById(R.id.btnHitung2);
        btnNext = findViewById(R.id.btnNext2);
        mspinner = findViewById(R.id.spinner2);
        btn_float = findViewById(R.id.btn_float);
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

        ra1 = findViewById(R.id.ra1);
        rr1 = findViewById(R.id.rr1);
        ra2 = findViewById(R.id.ra2);
        rr2 = findViewById(R.id.rr2);
        ra3 = findViewById(R.id.ra3);
        rr3 = findViewById(R.id.rr3);
        ra4 = findViewById(R.id.ra4);
        rr4 = findViewById(R.id.rr4);
        ra5 = findViewById(R.id.ra5);
        rr5 = findViewById(R.id.rr5);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a1,a2,a3,a4,a5,r1,r2,r3,r4,r5;
                double R= 0;

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

                //ketika memilih ulang stasiun maka akan manjadi 0
                if (ra5.getVisibility() == View.GONE && rr5.getVisibility() == View.GONE ){
                    a5 = 0;
                    r5 = 0;
                }
                if ((ra5.getVisibility() == View.GONE && rr5.getVisibility() == View.GONE )
                        && (ra4.getVisibility() == View.GONE && rr4.getVisibility() == View.GONE )){
                    a5 = 0;
                    r5 = 0;
                    a4 = 0;
                    r4 = 0;
                }
                if ((ra5.getVisibility() == View.GONE && rr5.getVisibility() == View.GONE )
                        && (ra4.getVisibility() == View.GONE && rr4.getVisibility() == View.GONE )
                        && (ra3.getVisibility() == View.GONE && rr3.getVisibility() == View.GONE )){
                    a5 = 0;
                    r5 = 0;
                    a4 = 0;
                    r4 = 0;
                    a3 = 0;
                    r3 = 0;
                }
                if ((ra5.getVisibility() == View.GONE && rr5.getVisibility() == View.GONE )
                        && (ra4.getVisibility() == View.GONE && rr4.getVisibility() == View.GONE )
                        && (ra3.getVisibility() == View.GONE && rr3.getVisibility() == View.GONE )
                        && (ra2.getVisibility() == View.GONE && rr2.getVisibility() == View.GONE )){
                    a5 = 0;
                    r5 = 0;
                    a4 = 0;
                    r4 = 0;
                    a3 = 0;
                    r3 = 0;
                    a2 = 0;
                    r2 = 0;
                }


                if ((a1 != 0 && r1 != 0) && (a2 == 0 && r2 == 0) && (a3 == 0 && r3 == 0) && (a4 == 0 && r4 == 0) && (a5 == 0 && r5 == 0)){
                    R = ((a1*r1)) / (a1);
                }
                else if ((a1 != 0 && r1 != 0) && (a2 != 0 && r2 != 0) && (a3 == 0 && r3 == 0) && (a4 == 0 && r4 == 0) && (a5 == 0 && r5 == 0)){
                    R = ((a1*r1)+(a2*r2)) / (a1+a2);
                }
                else if ((a1 != 0 && r1 != 0) && (a2 != 0 && r2 != 0) && (a3 != 0 && r3 != 0) && (a4 == 0 && r4 == 0) && (a5 == 0 && r5 == 0)){
                    R = ((a1*r1)+(a2*r2)+(a3*r3)) / (a1+a2+a3);
                }
                else if ((a1 != 0 && r1 != 0) && (a2 != 0 && r2 != 0) && (a3 != 0 && r3 != 0) && (a4 != 0 && r4 != 0) && (a5 == 0 && r5 == 0)){
                    R = ((a1*r1)+(a2*r2)+(a3*r3)+(a4*r4)) / (a1+a2+a3+a4);
                }
                else if ((a1 != 0 && r1 != 0) && (a2 != 0 && r2 == 0) && (a3 != 0 && r3 != 0) && (a4 != 0 && r4 != 0) && (a5 != 0 && r5 != 0)){
                    R = ((a1*r1)+(a2*r2)+(a3*r3)+(a4*r4)+(a5*r5)) / (a1+a2+a3+a4+a5);
                }
                //double R = ((a1*r1)+(a2*r2)+(a3*r3)+(a4*r4)+(a5*r5)) / (a1+a2+a3+a4+a5);

                txthasil.setText(Double.toString(R));

                final Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                Bundle c = new Bundle();
                //untuk menyimpan data debit
                String hasil = Double.valueOf(R).toString();
                c.putString("Rerata_hujan", hasil);
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
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(
                this, R.array.dropdown_stasiun_hujan, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mspinner.setAdapter(adapter1);
        mspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                position = position+1;
                switch(position) {
                    case SPINNER_OPTION_FIRST:
                        ra1.setVisibility(View.VISIBLE);
                        rr1.setVisibility(View.VISIBLE);
                        ra2.setVisibility(View.GONE);
                        rr2.setVisibility(View.GONE);
                        ra3.setVisibility(View.GONE);
                        rr3.setVisibility(View.GONE);
                        ra4.setVisibility(View.GONE);
                        rr4.setVisibility(View.GONE);
                        ra5.setVisibility(View.GONE);
                        rr5.setVisibility(View.GONE);
                        break;
                    case SPINNER_OPTION_SECOND:
                        ra1.setVisibility(View.VISIBLE);
                        rr1.setVisibility(View.VISIBLE);
                        ra2.setVisibility(View.VISIBLE);
                        rr2.setVisibility(View.VISIBLE);
                        ra3.setVisibility(View.GONE);
                        rr3.setVisibility(View.GONE);
                        ra4.setVisibility(View.GONE);
                        rr4.setVisibility(View.GONE);
                        ra5.setVisibility(View.GONE);
                        rr5.setVisibility(View.GONE);
                        break;
                    case SPINNER_OPTION_THIRD:
                        ra1.setVisibility(View.VISIBLE);
                        rr1.setVisibility(View.VISIBLE);
                        ra2.setVisibility(View.VISIBLE);
                        rr2.setVisibility(View.VISIBLE);
                        ra3.setVisibility(View.VISIBLE);
                        rr3.setVisibility(View.VISIBLE);
                        ra4.setVisibility(View.GONE);
                        rr4.setVisibility(View.GONE);
                        ra5.setVisibility(View.GONE);
                        rr5.setVisibility(View.GONE);
                        break;
                    case SPINNER_OPTION_FOURTH:
                        ra1.setVisibility(View.VISIBLE);
                        rr1.setVisibility(View.VISIBLE);
                        ra2.setVisibility(View.VISIBLE);
                        rr2.setVisibility(View.VISIBLE);
                        ra3.setVisibility(View.VISIBLE);
                        rr3.setVisibility(View.VISIBLE);
                        ra4.setVisibility(View.VISIBLE);
                        rr4.setVisibility(View.VISIBLE);
                        ra5.setVisibility(View.GONE);
                        rr5.setVisibility(View.GONE);
                        break;
                    case SPINNER_OPTION_FIFTH:
                        ra1.setVisibility(View.VISIBLE);
                        rr1.setVisibility(View.VISIBLE);
                        ra2.setVisibility(View.VISIBLE);
                        rr2.setVisibility(View.VISIBLE);
                        ra3.setVisibility(View.VISIBLE);
                        rr3.setVisibility(View.VISIBLE);
                        ra4.setVisibility(View.VISIBLE);
                        rr4.setVisibility(View.VISIBLE);
                        ra5.setVisibility(View.VISIBLE);
                        rr5.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing
            }
        });
        btn_float.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(Main6Activity.this);
                dialog.setContentView(R.layout.fragment_rerata_hujan);
                dialog.setTitle("Rata-rata Curah Hujan");
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
