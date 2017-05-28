package net.yatopark.viewstatetest.viewmodel;

public class MainViewModel extends BaseViewModel {
    public MainViewStateObservable viewStateObservable = new MainViewStateObservable();

    public void setViewState(MainViewState viewState) {
        this.viewStateObservable.setViewState(viewState);
    }
}
