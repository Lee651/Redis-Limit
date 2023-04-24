package top.rectorlee.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.rectorlee.utils.Result;

/**
 * @author Lee
 * @description 全局异常处理类
 * @date 2023-04-23  21:07:59
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    // Redis限流异常方法
    @ExceptionHandler(RedisLimitException.class)
    public Result handlerCustomException(RedisLimitException e) {
        e.printStackTrace();

        return Result.error(e.getMessage());
    }


    // 其他异常方法
    @ExceptionHandler(Exception.class)
    public Result handlerException(Exception e) {
        e.printStackTrace();

        return Result.error("当前系统异常");
    }
}
