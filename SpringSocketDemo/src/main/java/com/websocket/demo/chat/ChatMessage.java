package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int count ;
    public static int UpdateCount ;

    public void  setCount(int n) { count  = n ; }

    public static int UpdateCountConnect(){
        UpdateCount++ ;
        return UpdateCount ;
    }

    public static int UpdateCountDisconnect(){
        UpdateCount-- ;
        return UpdateCount ;
    }
}
