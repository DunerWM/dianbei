package com.dianbei.base.mysql;


import com.dianbei.base.db.GenericSQLBuilder;
import com.dianbei.base.db.ISQLBuilder;

public class MySQLBuilder extends GenericSQLBuilder implements ISQLBuilder {

    @Override
    public String getLastInsertIdSQL() {
        return "select last_insert_id()";
    }

}
