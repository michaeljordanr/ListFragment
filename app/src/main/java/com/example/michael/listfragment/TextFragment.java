package com.example.michael.listfragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class TextFragment extends Fragment{

    private TextView txtMsg;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_text, container, false);

        txtMsg = (TextView) view.findViewById(R.id.txt_msg);

        return view;
    }

    public void setText(String text){
        txtMsg.setText(text);
    }
}
