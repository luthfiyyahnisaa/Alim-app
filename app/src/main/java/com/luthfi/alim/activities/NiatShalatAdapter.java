package com.luthfi.alim.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.luthfi.alim.R;

public class NiatShalatAdapter extends BaseAdapter {
    Context context;
    String niat [];
    String arab [];
    String latin [];
    String terjemah [];
    LayoutInflater inflater;

    public NiatShalatAdapter(Context applicationContext, String[] niat, String[] arab, String[] latin, String[] terjemah){
        this.context = applicationContext;
        this.niat = niat;
        this.arab = arab;
        this.latin = latin;
        this.terjemah = terjemah;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return niat.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_niat_shalat, null);
        TextView stringNiat = (TextView) view.findViewById(R.id.txtNiat);
        TextView stringArab = (TextView) view.findViewById(R.id.txtArab);
        TextView stringLatin = (TextView) view.findViewById(R.id.latin);
        TextView stringTerjemahan = (TextView) view.findViewById(R.id.terjemahan);

        stringNiat.setText(niat[i]);
        stringArab.setText(arab[i]);
        stringLatin.setText(latin[i]);
        stringTerjemahan.setText(terjemah[i]);

        return view;
    }
}
