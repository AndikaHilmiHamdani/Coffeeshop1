package com.android.cofeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    EditText jumlah;
    ImageButton tambah,kurang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        jumlah = (EditText) findViewById(R.id.jumlah);
        kurang = (ImageButton) findViewById(R.id.kurang);
        tambah = (ImageButton) findViewById(R.id.tambah);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int qty = Integer.parseInt(jumlah.getText().toString()) ;
                jumlah.setText(String.valueOf(++qty));
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int qty =0;
                if (qty == 0){
                    Toast.makeText(DetailActivity.this,"jumlah pesanan anda salah" ,Toast.LENGTH_SHORT).show();
                } else {
                    qty = Integer.parseInt(jumlah.getText().toString()) ;
                    jumlah.setText(String.valueOf(--qty));
                }

            }
        });
    }

}