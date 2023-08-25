package com.devinsight.mvvm3.Glide;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class PlaceViewModel extends ViewModel {
    private final MutableLiveData<List<Place>> places = new MutableLiveData<>();

    public LiveData<List<Place>> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> placeList) {
        places.setValue(placeList);
    }
}