package yuan.sailpotato.Fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentPagerAdapter;
import android.widget.ListAdapter;

import java.util.ArrayList;
import java.util.List;

import yuan.sailpotato.Model.DemandInfo;
import yuan.sailpotato.Model.LogisticsInfo;
import yuan.sailpotato.Model.Order;
import yuan.sailpotato.adapter.LogisticsInfoAdapter;

/**
 * Created by Administrator on 2015/7/4.
 */
public class LogisticsListFragment extends CustomListFragment {
    List<LogisticsInfo> logisticsInfos=new ArrayList<>();
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        logisticsInfos.add(new LogisticsInfo());
        logisticsInfos.add(new LogisticsInfo());
        logisticsInfos.add(new LogisticsInfo());
        logisticsInfos.add(new LogisticsInfo());
        logisticsInfos.add(new LogisticsInfo());
        logisticsInfos.add(new LogisticsInfo());
    }

    @Override
    public ListAdapter getAdapter() {
        return new LogisticsInfoAdapter(getActivity(),logisticsInfos);
    }
}
