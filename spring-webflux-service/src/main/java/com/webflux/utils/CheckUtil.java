package com.webflux.utils;

import com.webflux.exception.CheckException;

import java.util.Arrays;

/**
 * @description: 校验工具类
 * @author: 星际一哥
 * @create: 2019-12-16 19:00
 */
public class CheckUtil {

    public static final String[] INVALIDE_NAMES = {"admin", "guanliyuan"};

    public static void checkUser(String name) {
        Arrays.stream(INVALIDE_NAMES).filter(value -> value.equalsIgnoreCase(name)).findAny().ifPresent(val -> {
            throw new CheckException("name", val);
        });

    }
}
