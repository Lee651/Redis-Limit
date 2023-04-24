package top.rectorlee.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import top.rectorlee.aop.RedisLimit;

/**
 * @author Lee
 * @description
 * @date 2023-04-23  21:29:06
 */
@Slf4j
@RestController
@RequestMapping("/redis/limit")
public class RedisLimitController {
    @GetMapping("/test")
    @RedisLimit(key = "redis-limit:test", permitsPerSecond = 2, expire = 1, msg = "当前排队人数较多，请稍后再试！")
    public String test() {
        log.info("限流成功。。。");
        return "ok";
    }
}
