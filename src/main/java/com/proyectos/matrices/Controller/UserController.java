package com.proyectos.matrices.Controller;

import com.proyectos.matrices.Dto.ResponseDto;
import com.proyectos.matrices.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UsersService users;

    @GetMapping("all")
    public ResponseEntity <Map<String, Object>> getAll (){
        Map<String, Object> res = new HashMap<>();
        List<ResponseDto> respuesta = new ArrayList<>();
        res.put("Status", HttpStatus.OK);
        res.put("data", respuesta);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity <> createUser (){
        return null;
    }

    @PutMapping("update")
    public ResponseDto updtaeUser(){
        return null;
    }

    @DeleteMapping ("delete")
    public ResponseEntity<> deleteUser(){
        return null;
    }
}
