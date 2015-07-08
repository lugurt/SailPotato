package yuan.sailpotato.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;
import android.widget.Adapter;
import android.widget.ListAdapter;

/**
 * Created by Administrator on 2015/7/4.
 */
public abstract class CustomListFragment extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setListAdapter(getAdapter());
    }
    public abstract  ListAdapter getAdapter();
}
