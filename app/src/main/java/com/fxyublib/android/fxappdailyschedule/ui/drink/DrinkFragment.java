package com.fxyublib.android.fxappdailyschedule.ui.drink;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.fxyublib.android.fxappdailyschedule.R;
import com.wefika.calendar.CollapseCalendarView;
import com.wefika.calendar.manager.CalendarManager;

import org.joda.time.LocalDate;

public class DrinkFragment extends Fragment {

    private DrinkViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DrinkViewModel.class);
        View root = inflater.inflate(R.layout.fragment_main_drink, container, false);

        CalendarManager manager = new CalendarManager(LocalDate.now(), CalendarManager.State.MONTH, LocalDate.now(), LocalDate.now().plusYears(1));

        CollapseCalendarView calendarView = (CollapseCalendarView) root.findViewById(R.id.calendar);
        calendarView.init(manager);

        return root;
    }
}