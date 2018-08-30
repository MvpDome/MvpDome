package com.rs.ys.mvpdemo.basics;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by 谢岳峰 on 2018/8/27.
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface BasicsScope {
}
