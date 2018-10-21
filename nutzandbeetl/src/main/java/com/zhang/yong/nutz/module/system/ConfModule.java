package com.zhang.yong.nutz.module.system;

import com.zhang.yong.nutz.module.BaseModule;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

@At(ConfModule.CONF_PREFIX)
public class ConfModule extends BaseModule {
    public static final String CONF_PREFIX = PREFIX + "/conf";
    public static final String CONF_BEETL = BEETL + "/system";

    @At
    @Ok(CONF_BEETL + "/index.html")
    public String index() {
        return "this is conf index.";
    }
}
