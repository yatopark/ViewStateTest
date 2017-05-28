package net.yatopark.viewstatetest.view;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import net.yatopark.viewstatetest.R;
import net.yatopark.viewstatetest.databinding.WidgetState1Binding;
import net.yatopark.viewstatetest.databinding.WidgetState3Binding;
import net.yatopark.viewstatetest.databinding.WidgetState4Binding;
import net.yatopark.viewstatetest.viewmodel.MainViewModel;
import net.yatopark.viewstatetest.viewmodel.MainViewState;
import net.yatopark.viewstatetest.viewmodel.ViewStateChangeable;

public class StateView4 extends FrameLayout implements ViewStateChangeable {
    private WidgetState4Binding binding;

    public StateView4(@NonNull Context context) {
        super(context);
        initView();
    }

    public StateView4(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public StateView4(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        binding = WidgetState4Binding.inflate(LayoutInflater.from(getContext()), this, true);
        binding.setMainViewModel(ViewModelProviders.of((FragmentActivity) getContext()).get(MainViewModel.class));
    }

    @Override
    public int changeViewState(MainViewState viewState) {
        switch (viewState) {
            case STATE4:
                return View.VISIBLE;

            default:
                return View.GONE;
        }
    }
}
