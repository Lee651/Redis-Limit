package top.rectorlee.utils;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Lee
 * @description 返回结果
 * @date 2023-04-23  21:05:23
 */
@Getter
@Setter
public class Result {
    private String message;
    private String code;
    private Object data;


    public Result(String message, String code, Object data) {
        this.message = message;
        this.code = code;
        this.data = data;
    }

    public static Result error(String message) {
        return new Result(message,"502",null);
    }
}
