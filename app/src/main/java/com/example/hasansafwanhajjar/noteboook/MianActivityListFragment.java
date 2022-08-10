package com.example.hasansafwanhajjar.noteboook;


import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MianActivityListFragment extends ListFragment {


@Override
public void onActivityCreated(Bundle saveInstanceState)
{
 super.onActivityCreated(saveInstanceState);
}
    @Override
    public void onListItemClick(ListView l ,View v , int position ,long id)
    {
        super.onListItemClick(l,v,position,id);
    }


}
