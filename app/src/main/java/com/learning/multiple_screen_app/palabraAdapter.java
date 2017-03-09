package com.learning.multiple_screen_app;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jose on 9/03/17.
 */

public class palabraAdapter extends ArrayAdapter {
    public palabraAdapter(Activity context , ArrayList<palabras> androidPalabras) {
        super(context, 0, androidPalabras);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null){
            listItem = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item,
                    parent,
                    false
            );
        }

        palabras currentPalabra = (palabras) getItem(position);

        TextView nameTVG = (TextView) listItem.findViewById(R.id.galician_text_view);

        nameTVG.setText(currentPalabra.getGalicianTranslation());

        TextView nameTVC = (TextView) listItem.findViewById(R.id.spanish_text_view);

        nameTVC.setText(currentPalabra.getSpanishTranslation());

        return listItem;
    }
}
