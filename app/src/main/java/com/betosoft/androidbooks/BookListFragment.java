package com.betosoft.androidbooks;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/**
 * Created by Roberto Salazar on 29/02/2016.
 *
 * @version 1.0
 */
public class BookListFragment extends Fragment implements RadioGroup.OnCheckedChangeListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewJerarquía = inflater.inflate(R.layout.fragment_book_list, container, false);
        RadioGroup group = (RadioGroup) viewJerarquía.findViewById(R.id.rdgButtons);
        group.setOnCheckedChangeListener(this);
        return viewJerarquía;
    }

    int translateToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.rdbAndroid6: index = 0; break;
            case R.id.rdbHeads: index = 1; break;
            case R.id.rdbEsential: index = 2; break;
            case R.id.rdbLearn: index = 3;
        }
        return index;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        int bookIndex = translateToIndex(checkedId);
        OnSelectBookChangeListener listener = (OnSelectBookChangeListener) getActivity();
        listener.OnSelectBookChanged(bookIndex);
    }
}
