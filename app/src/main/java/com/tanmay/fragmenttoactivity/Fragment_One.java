package com.tanmay.fragmenttoactivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment_One extends Fragment {

    EditText name,email;
    Button send;


    public Fragment_One() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__one, container,false);

        name = view.findViewById(R.id.editTextPersonName);
        email = view.findViewById(R.id.editTextEmailAddress);
        send = view.findViewById(R.id.button);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = name.getText().toString();
                String userEmail = email.getText().toString();

                MainActivity mainActivity = (MainActivity) getActivity();
                assert mainActivity != null;
                mainActivity.takeData(userName, userEmail);

            }
        });
        return view;
    }
}