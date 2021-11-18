package com.android.cofeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment{
    RecyclerView recyclerView;
    private KopiCardAdapter kopiCardAdapter;
    List<KopiModel> kopiArrayList = new ArrayList<>();;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //RecyclerView
         recyclerView = view.findViewById(R.id.recyclerView);
        kopiCardAdapter = new KopiCardAdapter(kopiArrayList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);


        //add data
        recyclerView.setAdapter(new KopiCardAdapter(getKopi(),getContext()));
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton cartButton = view.findViewById(R.id.cartButton);
        cartButton.setOnClickListener(v -> {
            Intent intent = new Intent(view.getContext(), CartActivity.class);
            startActivity(intent);
        });
    }

    private List<KopiModel> getKopi(){
        kopiArrayList = new ArrayList<>();
        kopiArrayList.add(new KopiModel("Americano","4.7","blbl",18000,R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Cappucino","4.6","blbl",17000,R.drawable.kopi3));
        kopiArrayList.add(new KopiModel("Latte","4.7","blbl",18000,R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Espresso","4.6","blbl",17000,R.drawable.kopi3));
        kopiArrayList.add(new KopiModel("v60","4.7","blbl",18000,R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Affogatto","4.6","blbl",17000,R.drawable.kopi3));
        kopiArrayList.add(new KopiModel("Gelato","4.7","blbl",18000,R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Lemon Tea","4.6","blbl",17000,R.drawable.kopi3));
        return kopiArrayList;
    }
}