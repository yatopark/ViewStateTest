package net.yatopark.viewstatetest;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.yatopark.viewstatetest.databinding.FragmentMainBinding;
import net.yatopark.viewstatetest.viewmodel.MainViewModel;
import net.yatopark.viewstatetest.viewmodel.MainViewState;

public class MainFragment extends Fragment {
    private MainViewModel mainViewModel;
    private FragmentMainBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.bind(view);

        mainViewModel = ViewModelProviders.of(getActivity()).get(MainViewModel.class);
        binding.setMainViewModel(mainViewModel);

        mainViewModel.setViewState(MainViewState.STATE1);
    }
}
