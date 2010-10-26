package com.xtremelabs.robolectric.shadows;

import android.app.Activity;
import android.widget.AdapterView;
import android.widget.Gallery;
import com.xtremelabs.robolectric.DogfoodRobolectricTestRunner;
import com.xtremelabs.robolectric.Robolectric;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DogfoodRobolectricTestRunner.class)
public class AbsSpinnerTest {
    private AdapterView adapterView;

    @Before
    public void setUp() throws Exception {
        Robolectric.bindDefaultShadowClasses();
        adapterView = new Gallery(new Activity());
    }

    @Test
    public void shouldHaveAdapterViewCommonBehavior() throws Exception {
        AdapterViewBehavior.shouldActAsAdapterView(adapterView);
    }
}
