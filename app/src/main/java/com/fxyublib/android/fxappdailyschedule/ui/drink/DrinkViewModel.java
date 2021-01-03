package com.fxyublib.android.fxappdailyschedule.ui.drink;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DrinkViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DrinkViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}