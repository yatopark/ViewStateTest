package net.yatopark.viewstatetest.viewmodel;

import android.support.annotation.IntDef;
import android.view.View;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface ViewStateChangeable {
    @IntDef(value = {View.VISIBLE, View.INVISIBLE, View.GONE})
    @Retention(RetentionPolicy.SOURCE)
    @interface Visibility {
    }

    @Visibility
    int changeViewState(MainViewState viewState);
}
