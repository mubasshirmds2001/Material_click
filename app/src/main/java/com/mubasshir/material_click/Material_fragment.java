package com.mubasshir.material_click;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Material_fragment extends Fragment {
    Button addMaterial;
//    RecyclerView recyclerView;
//    DatabaseReference databaseReference;
//    MyAdapter adapter;
//    MyAdapter madapter;
//    ArrayList<material_info> list;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public Material_fragment() {
        // Required empty public constructor
    }


    public static Material_fragment newInstance(String param1, String param2) {
        Material_fragment fragment = new Material_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_material_fragment, container, false);

        addMaterial=(Button)view.findViewById(R.id.btn_add_material);
//        recyclerView=view.findViewById(R.id.recyclerview);
//        databaseReference = FirebaseDatabase.getInstance().getReference("Projects").child("Material Info");
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//
//        list=new ArrayList<>();
//        madapter=new MyAdapter(list, getActivity());
//        recyclerView.setAdapter(madapter);

        addMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Add_material.class);
                startActivity(intent);
            }
        });

        return view;
    }
}