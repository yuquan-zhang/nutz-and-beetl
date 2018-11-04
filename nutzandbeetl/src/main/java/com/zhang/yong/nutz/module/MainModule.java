package com.zhang.yong.nutz.module;

import org.beetl.ext.nutz.BeetlViewMaker;
import org.nutz.mvc.annotation.*;

@SetupBy(MainSetup.class)
@IocBy(args={"*js", "ioc/", "*anno", "com.zhang.yong.nutz", "*async", "*tx"})
@Modules
@Views(BeetlViewMaker.class)
@ChainBy(args = "mvc/chain.js")
@Ok("json:full")
@Fail("jsp:jsp.500")
@Localization(value="msg/", defaultLocalizationKey="zh-CN")
public class MainModule {

}
