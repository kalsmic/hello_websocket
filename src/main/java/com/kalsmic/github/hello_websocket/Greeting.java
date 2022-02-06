package com.kalsmic.github.hello_websocket;

public class Greeting {
    private String content;

    public Greeting(){}

    public Greeting(String content){
        setContent(content);
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
    }
    
}
