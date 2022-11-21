package com.irun2u;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Author: haifei
 * @Date: 2022/11/9 9:42
 */

/**
 * 注意：运行sb-dubbo-provider微服务前
 * 必须先对sb-dubbo-interface微服务进行maven-install操作
 * 因为provider和consumer服务均依赖于interface服务（导入了依赖）
 *
 * 直接运行会报错如下
 *      错误: 找不到或无法加载主类 com.irun2u.ProviderApplication
 */
@EnableDubboConfiguration
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args){
        SpringApplication.run(ProviderApplication.class, args);
    }
}
