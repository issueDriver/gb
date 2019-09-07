package com.zuojie.gd.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * zuojide
 * @param <T>
 */
@Data
@NoArgsConstructor //无参的构造函数
@AllArgsConstructor //有参的构造函数
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = 2506160905671824239L;

    private Integer code;

    private String message;

    private T data;

    public CommonResponse(Integer code,String message){
        this.code=code;
        this.message=message;
    }


}
