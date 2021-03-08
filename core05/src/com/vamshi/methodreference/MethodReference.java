package com.vamshi.methodreference;
interface Messageable{  
    Msg getMessage(String msg);  
}  
class Msg{  
    Msg(String msg){  
        System.out.print(msg);  
    }  
}  
public class MethodReference {  
    public static void main(String[] args) {  
        Messageable hello = Msg::new;  
        hello.getMessage("Hello");  
    }  
}  



