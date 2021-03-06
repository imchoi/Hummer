package com.didi.hummer.adapter.storage;

/**
 * 存储适配器适配器
 *
 * Created by XiaoFeng on 2019-12-24.
 */
public interface IStorageAdapter {

    void set(String key, Object value);

    Object get(String key);

    void remove(String key);

    boolean exist(String key);
}
