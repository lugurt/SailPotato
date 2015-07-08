package yuan.sailpotato;


import android.content.ContentValues;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import yuan.sailpotato.adapter.ViewpagerFragmentAdapter;

/**
 * Created by Administrator on 2015/7/4.
 */
public class ViewPagerActivity extends AppCompatActivity {
    PagerTabStrip pagerTabStrip;
    ViewPager viewPager;
    LinearLayout linearLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);
        viewPager = (ViewPager) findViewById(R.id.content_viewpager);
        linearLayout= (LinearLayout) findViewById(R.id.viewpager_tab);
        viewPager.setAdapter(new ViewpagerFragmentAdapter(getSupportFragmentManager(),getDisplayFragments(),getDisplayContent()));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
             if (linearLayout.getChildCount()>position){
                 for (int i=0;i<linearLayout.getChildCount();i++)
                 linearLayout.getChildAt(position).setSelected(i==position);
             }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        for (int i = 0; i <getDisplayContent().size() ; i++) {
            linearLayout.setWeightSum(getDisplayContent().size());
            TextView textView= new TextView(getApplicationContext());
            textView.setText(getDisplayContent().get(i).getAsString("titile"));
            final int pos=i;
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    viewPager.setCurrentItem(pos);
                }
            });
            LinearLayout.LayoutParams layoutParams= new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT);
            layoutParams.weight=1;
            linearLayout.addView(textView,layoutParams);
        }

    }



    protected List<Fragment> getDisplayFragments() {
        return new ArrayList<>();
    }

    protected List<ContentValues> getDisplayContent() {
        return new ArrayList<>();
    }
}
