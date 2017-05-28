package net.yatopark.viewstatetest.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import net.yatopark.viewstatetest.BR;

public class MainViewStateObservable extends BaseObservable {
    private MainViewState viewState;

    @Bindable
    public MainViewState getViewState() {
        return viewState;
    }

    public void setViewState(MainViewState viewState) {
        this.viewState = viewState;
        notifyPropertyChanged(BR.viewState);
    }
}
