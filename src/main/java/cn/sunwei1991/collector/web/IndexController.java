package cn.sunwei1991.collector.web;

import cn.sunwei1991.collector.util.InputMDC;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title IndexController
 * @Description
 * @Author SunWei
 * @Create 2020/10/30 10:11 上午
 */
@Slf4j
@RestController
public class IndexController {

    /**
     * @Description 日志示例
     * @Param []
     * @Return java.lang.String
     * [%d{yyyy-MM-dd'T'HH:mm:ss.SSSZZ}]
     * [%level{length=5}]
     * [%thread-%tid]
     * [%logger]
     * [%X{hostName}]
     * [%X{ip}]
     * [%X{applicationName}]
     * [%F,%L,%C,%M]
     * [%m] ## '%ex'%n
     * -----------------------------------------------
     * [2019-09-18T14:42:51.451+08:00]
     * [INFO]
     * [main-1]
     * [org.springframework.boot.web.embedded.tomcat.TomcatWebServer]
     * []
     * []
     * []
     * [TomcatWebServer.java,90,org.springframework.boot.web.embedded.tomcat.TomcatWebServer,initialize]
     * [Tomcat initialized with port(s): 8001 (http)] ## ''
     *
     * ["message",
     * "\[%{NOTSPACE:currentDateTime}\]
     *  \[%{NOTSPACE:level}\]
     *  \[%{NOTSPACE:thread-id}\]
     *  \[%{NOTSPACE:class}\]
     *  \[%{DATA:hostName}\]
     *  \[%{DATA:ip}\]
     *  \[%{DATA:applicationName}\]
     *  \[%{DATA:location}\]
     *  \[%{DATA:messageInfo}\]
     *  ## (\'\'|%{QUOTEDSTRING:throwable})"]
    */
    @RequestMapping(value = "/index")
    public String index(){
        InputMDC.putMDC();
        log.info("info日志");
        log.warn("warn日志");
        log.error("error日志");
        return "index";
    }
}
