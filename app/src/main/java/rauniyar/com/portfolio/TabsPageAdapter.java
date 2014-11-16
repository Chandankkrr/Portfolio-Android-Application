package rauniyar.com.portfolio;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Rauniyar on 11/3/2014.
 */
public class TabsPageAdapter extends FragmentPagerAdapter {
    public TabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index){
            case 0:
                return new Profile();
            case 1:
                return new Portfolio();
            case 2:
                return new Skills();
            case 3:
                return new Resume();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
