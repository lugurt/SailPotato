package yuan.sailpotato.Fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

import yuan.sailpotato.Model.DemandInfo;
import yuan.sailpotato.Model.Order;
import yuan.sailpotato.adapter.DemandInfoAdapter;

/**
 * Created by Administrator on 2015/7/4.
 */
public class DemandListFragment extends CustomListFragment {
    List<DemandInfo> demandInfos= new ArrayList<>();
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        demandInfos.add(new DemandInfo());
        demandInfos.add(new DemandInfo());
        demandInfos.add(new DemandInfo());
        demandInfos.add(new DemandInfo());
        demandInfos.add(new DemandInfo());
        demandInfos.add(new DemandInfo());
    }

    @Override
    public ListAdapter getAdapter() {
        return new DemandInfoAdapter(getActivity(), (ArrayList<DemandInfo>) demandInfos);
    }
}
