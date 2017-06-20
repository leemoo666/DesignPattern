package com.ycx.mode.abstrcts.sql;

import com.ycx.mode.abstrcts.IDepartment;
import com.ycx.mode.abstrcts.IFactory;
import com.ycx.mode.abstrcts.IUser;

/**
 * Created by 李小明 on 17/6/9.
 * 邮箱:287907160@qq.com
 */

public class SQLFactory implements IFactory {

    @Override
    public IUser createUser() {
        return new SQLUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SQLDepartment();
    }
}
