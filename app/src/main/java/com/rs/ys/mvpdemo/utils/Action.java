package com.rs.ys.mvpdemo.utils;

public interface Action<T> {
void onSuccess(T t);
void onError(String e);
}
