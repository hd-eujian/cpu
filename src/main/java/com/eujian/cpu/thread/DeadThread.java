package com.eujian.cpu.thread;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
@Slf4j
@Configuration
public class DeadThread {


    @PostConstruct
    public void DeadFun(){
        Thread thread = new Thread(() -> {
            while (true) {
                new DeadThread();
                log.info("创建DeadThread,");
            }
        });

        thread.setName("dealThread");
        thread.start();
    }
}
