package com.green.basicboot.domain;

//디자인 패턴 -> 팩토리 패턴 * 유용하기 때문에 공부할 것
//ToDo의 객체(instance)를 찍어내는 공장

public class ToDoBuilder {
    private static ToDoBuilder instance = new ToDoBuilder();
    private String id=null;
    private String description = "";
    private ToDoBuilder(){};
    public static ToDoBuilder create(){ return instance;} //객체를 생성하는 메소드
    public ToDoBuilder withDescription(String description){
        this.description = description;
        return instance;
    }
    public ToDoBuilder withId(String id){
        this.id = id;
        return instance;
    }
    public ToDo build(){
        ToDo result = new ToDo(this.description);
        if(id!=null)
            result.setId(id);
            return result;

    }
}
