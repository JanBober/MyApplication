package com.example.admin.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment1 extends Fragment {

    public Fragment1(){}
    TextView odbierz;
    Button wyślij;
    Communicator comm;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_fragment1, container, false);
        setHasOptionsMenu(true);
        wyślij = (Button) v.findViewById(R.id.wyslij);
        wyślij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comm.respond(1);
            }
        });
        odbierz = (TextView) v.findViewById(R.id.odbierz);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm = (Communicator) getActivity();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.pierwszy:
                odbierz.setText("1");
                return true;
            case R.id.drugi:
                odbierz.setText("2");
                return true;
            case R.id.trzeci:
                odbierz.setText("3");
                return true;
            case R.id.czwarty:
                odbierz.setText("4");
                return true;
        }
        return false;
    }

    public void send(double liczba) {
        odbierz.setText(""+liczba);
    }
}