package com.eujian.cpu.thread;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
@Slf4j
@Configuration
public class DeadThread {


    @PostConstruct
    public void DeadFun(){
        for (int i =0;i<20;i++){
            Thread thread = new Thread(() -> {
                int x =0;
                while (true) {
                    x++;
                    new DeadThread();
                    log.info("创建DeadThread-"+x);
                }
            });

            thread.setName("dealThread");
            thread.start();
        }

    }
}
