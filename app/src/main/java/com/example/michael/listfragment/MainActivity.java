package com.example.michael.listfragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.text.NumberFormat;
import java.util.Locale;


public class MainActivity extends Activity implements AlimentosFragment.OnItemClick {

    private TextFragment textFrag;
    private static final NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textFrag = (TextFragment) getFragmentManager().findFragmentById(R.id.frag_text);
    }

    @Override
    public void onClick(Alimento alimento) {
        textFrag.setText(String.format("O pre\u00e7o do %s \u00e9 %s", alimento.getNome(), nf.format(alimento.getPreco())));
    }


}
