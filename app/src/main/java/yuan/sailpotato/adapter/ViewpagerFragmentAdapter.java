package yuan.sailpotato.adapter;

import android.content.ContentValues;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2015/7/4.
 */
public class ViewpagerFragmentAdapter extends FragmentPagerAdapter {
    List<Fragment> displayFragments;
    List<ContentValues> displayContent;
    public ViewpagerFragmentAdapter(FragmentManager fm, List<Fragment> displayFragments, List<ContentValues> displayContent) {
        super(fm);
        this.displayFragments=displayFragments;
        this.displayContent=displayContent;
    }

    @Override
    public Fragment getItem(int position) {
        return displayFragments.get(position);
    }

    @Override
    public int getCount() {
        return displayFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return displayContent.get(position).getAsString("titile");
    }
}
