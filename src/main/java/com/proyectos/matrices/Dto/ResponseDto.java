package com.proyectos.matrices.Dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.stereotype.Component;

@Component
public class ResponseDto extends RequestDto {

    private String password;

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }
    @JsonSetter
    public void setPassword(String password) {
        this.password = password;
    }
}
