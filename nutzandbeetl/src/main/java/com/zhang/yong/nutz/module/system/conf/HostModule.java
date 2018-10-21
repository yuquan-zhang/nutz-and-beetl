package com.zhang.yong.nutz.module.system.conf;

import com.zhang.yong.nutz.module.system.ConfModule;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Ok;

@At(ConfModule.CONF_PREFIX + "/host")
public class HostModule extends ConfModule {
    private static final String HOST_BEETL = CONF_BEETL + "/host";
    @At
    @Ok(HOST_BEETL + "/index.html")
    public String index() {
        return "this is hosts index.";
    }
}
