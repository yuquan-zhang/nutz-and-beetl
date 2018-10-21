package com.zhang.yong.nutz.module;

import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

public class BaseModule {
    public static final String PREFIX = "/jsp";
    public static final String BEETL = "beetl:";


    @At
    @Ok(BEETL + "hello.html")
    public String hello() {
        return "hello method";
    }
}
