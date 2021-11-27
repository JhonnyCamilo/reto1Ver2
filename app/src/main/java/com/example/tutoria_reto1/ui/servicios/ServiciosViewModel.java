package com.example.tutoria_reto1.ui.servicios;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ServiciosViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ServiciosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Servicios nueva");
    }

    public LiveData<String> getText() {
        return mText;
    }
}


