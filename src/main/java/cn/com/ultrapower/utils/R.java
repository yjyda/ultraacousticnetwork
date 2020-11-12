package cn.com.ultrapower.utils;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R<T> {

    private Integer code;

    private String msg;

    private T data;

    private R() {
    }

    public static R ok() {
        R r = new R();
        r.setCode(ResultCode.SUCCESS);
        r.setMsg("success");
        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(ResultCode.ERROR);
        r.setMsg("fail");
        return r;
    }

    public R success(Boolean success) {
        return this;
    }

    public R message(String message) {
        this.setMsg(message);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R data(String key, Object value) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(key, value);
        //this.data(key, value);
        //this.setData((T) map);
        // return this;
        return data((T) map);
    }

    public R data(T data) {
        this.setData(data);
        return this;
    }
}
