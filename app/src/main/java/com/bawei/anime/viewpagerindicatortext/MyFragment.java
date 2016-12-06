package com.bawei.anime.viewpagerindicatortext;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/12/5 0005.
 */

public class MyFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_layout,null);
        TextView tv = (TextView) v.findViewById(R.id.tv);
        Bundle bundle = getArguments();
        String num = bundle.getString("title");
        tv.setText(num);
        return v;
    }
}
