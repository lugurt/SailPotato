package yuan.sailpotato.Fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

import yuan.sailpotato.Model.Order;
import yuan.sailpotato.Model.SupplyInfo;
import yuan.sailpotato.adapter.SupplyInfoAdapter;

/**
 * Created by Administrator on 2015/7/4.
 */
public class SupplyListFragment extends CustomListFragment {
    List<SupplyInfo> supplyInfos= new ArrayList<>();
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        supplyInfos.add(new SupplyInfo());
    }

    @Override
    public ListAdapter getAdapter() {
        return new SupplyInfoAdapter(getActivity(),supplyInfos);
    }
}
