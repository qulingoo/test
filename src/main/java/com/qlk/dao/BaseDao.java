package com.qlk.dao;

public interface BaseDao<T> {
      int insert(T t);
      int update(T t);
      int delete(String id);
      int delete(int id);
      T findById(String id);
      T findById(int  id);

}
