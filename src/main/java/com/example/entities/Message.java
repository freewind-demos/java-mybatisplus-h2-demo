package com.example.entities;


import com.baomidou.mybatisplus.annotation.TableName;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@TableName("messages")
public class Message {
    public Long id;

    @NotBlank(message = "Message is not provided")
    @Pattern(regexp = "^\\w+$", message = "必须为常见字符")
    public String text;
}
