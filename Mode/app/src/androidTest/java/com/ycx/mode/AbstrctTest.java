package com.ycx.mode;

import android.support.test.runner.AndroidJUnit4;

import com.ycx.mode.abstrcts.IDepartment;
import com.ycx.mode.abstrcts.IFactory;
import com.ycx.mode.abstrcts.IUser;
import com.ycx.mode.abstrcts.sql.SQLFactory;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AbstrctTest {

    /**
     * 简单工厂方法
     */
    @Test
    public void testSimple() throws Exception {

        IFactory oracle = new SQLFactory();
        IUser oracleUser = oracle.createUser();
        IDepartment oracleDepartment = oracle.createDepartment();


    }



}
