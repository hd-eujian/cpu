package com.eujian.cpu.thread;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@Slf4j
@RestController
public class DeadThreadController {


    @GetMapping("dead")
    public void DeadFun(){
        while (true){
            int i=0;
            i++;
        }

    }
}
