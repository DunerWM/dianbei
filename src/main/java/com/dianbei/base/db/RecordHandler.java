package com.dianbei.base.db;

public interface RecordHandler<T> {

    void process(T record);

}
