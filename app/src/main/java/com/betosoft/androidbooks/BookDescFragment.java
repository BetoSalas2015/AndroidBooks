package com.betosoft.androidbooks;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Roberto Salazar on 29/02/2016.
 *
 * @version 1.0
 */
public class BookDescFragment extends Fragment {

    String[] mBookDescirptions;
    TextView mBookDescriptionTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View viewJerarquia = inflater.inflate(R.layout.fragment_book_desc,container,false);
        mBookDescirptions = new String[4];
        mBookDescirptions[0] = getResources().getString(R.string.android6Desc);
        mBookDescirptions[1] = getResources().getString(R.string.headsDEscrip);
        mBookDescirptions[2] = getResources().getString(R.string.introDesc);
        mBookDescirptions[3] = getResources().getString(R.string.learnDesc);

        mBookDescriptionTextView = (TextView) viewJerarquia.findViewById(R.id.txtDescrip);

        return viewJerarquia;

    }

    public void setBook(int bookIndex) {
        String bookDescription = mBookDescirptions[bookIndex];
        mBookDescriptionTextView.setText(bookDescription);
    }
}
