package yuan.sailpotato;

import android.content.ContentValues;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

import yuan.sailpotato.Fragment.DemandListFragment;
import yuan.sailpotato.Fragment.LogisticsListFragment;
import yuan.sailpotato.Fragment.SupplyListFragment;

public class HangQingActivity extends ViewPagerActivity {



    @Override
    protected List<Fragment> getDisplayFragments() {
        List<Fragment> displayFragments= super.getDisplayFragments();
        displayFragments.add(new SupplyListFragment());
        displayFragments.add(new DemandListFragment());
        displayFragments.add(new LogisticsListFragment());
        return displayFragments;
    }

    @Override
    protected List<ContentValues> getDisplayContent() {
        List<ContentValues> contentValuesList= super.getDisplayContent();
        ContentValues supply=new ContentValues();
        supply.put("titile","供货");
        ContentValues demand=new ContentValues();
        demand.put("titile","需求");
        ContentValues logistics=new ContentValues();
        logistics.put("titile","物流");
        contentValuesList.add(supply);
        contentValuesList.add(demand);
        contentValuesList.add(logistics);
        return contentValuesList;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hang_qing, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
