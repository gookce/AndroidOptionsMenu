package com.example.gokcedemir.mobilequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.view.*;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private static final int ID_DUZENLE = 0;
    private static final int ID_SIL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView durumText = (TextView) findViewById(R.id.durum);
        ListView liste = (ListView) findViewById(R.id.list);
        String[] names = getResources().getStringArray(R.array.names);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, names);
        liste.setAdapter(adapter);
        registerForContextMenu(liste);
    }

     public void onCreateOptionsMenu (ContextMenu menu){

            super.onCreateOptionsMenu(menu);
            MenuInflater inflater = getMenuInflater();
            //inflater.inflate(R.menu.context_menu, menu);
        }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View vi, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu,vi,menuInfo);

        menu.add(Menu.NONE,ID_SIL,0,"Sil");
        menu.add(Menu.NONE,ID_DUZENLE,1,"Düzenle");
    }

    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case ID_SIL:
                Toast.makeText(SecondActivity.this,"Sil Seçildi",Toast.LENGTH_SHORT).show();
                return true;

            case ID_DUZENLE:
                Toast.makeText(SecondActivity.this,"Düzenle Seçildi",Toast.LENGTH_SHORT).show();
                return true;
        }

        return false;
    }
}
