package com.example.AI.controller;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface Greeting {


    @UserMessage("please wish him on birth day with {{name}} and give some tips regarding success")
    public String message(String name);

}
