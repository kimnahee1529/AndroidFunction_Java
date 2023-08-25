package com.devinsight.mvvm3.Glide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.devinsight.mvvm3.R;

import java.util.ArrayList;
import java.util.List;

public class PlaceFragment extends Fragment {
    private PlaceViewModel viewModel;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_place, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        PlaceAdapter adapter = new PlaceAdapter();
        recyclerView.setAdapter(adapter);

        viewModel = new ViewModelProvider(this).get(PlaceViewModel.class);
        viewModel.getPlaces().observe(getViewLifecycleOwner(), places -> adapter.setPlaceList(places));

        // Example data
        List<Place> dummyData = new ArrayList<>();
        dummyData.add(new Place("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRiKNtzgoGZ-ryGcpHsRT5-OBpzFAk83IillQ&usqp=CAU", "Place 1", "Address 1"));
        dummyData.add(new Place("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZOmqIGz8WzxHFPlgazl4Qvn9uKGjkS3f57y5ZI3fRd5sdDjfLFHChIE6Ro8G1fRn-FIw&usqp=CAU", "Place 2", "Address 2"));
        dummyData.add(new Place("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNckm4SIT4iCshugeCgDipvV9vAAbZsB3kU4YP2Hsh4ZGRCmPvHnzIwGr5qOcCteTByhA&usqp=CAU", "Place 3", "Address 3"));

        viewModel.setPlaces(dummyData);
        // API 호출을 시작합니다.
//        viewModel.fetchPlacesFromAPI();
    }
}
