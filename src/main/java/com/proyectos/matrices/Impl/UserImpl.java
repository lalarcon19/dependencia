package com.proyectos.matrices.Impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proyectos.matrices.Dto.RequestDto;
import com.proyectos.matrices.Dto.ResponseDto;
import com.proyectos.matrices.Entity.User;
import com.proyectos.matrices.Repository.UserRepository;
import com.proyectos.matrices.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserImpl implements UsersService {

    @Autowired
    ResponseDto responseDto;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ObjectMapper objectMapper;
    @Override
    public ResponseDto createUser(RequestDto requestDto) {

        return null;
    }

    @Override
    public ResponseDto updateUser( RequestDto requestDto) {
        return null;
    }

    @Override
    public List<ResponseDto> readUser() {
        List<User> listUsers = userRepository.findAll();
        return listUsers.stream()
                .map(user -> objectMapper.convertValue(user, ResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseDto deleteUser(RequestDto requestDto) {
        return null;
    }

    @Override
    public ResponseDto createCard(RequestDto requestDto) {

        if(requestDto.getCardNumber().length() < 6) {
            requestDto.setCardNumber("0");
            return responseDto;
        } else {
            String response = randomNumber(requestDto);
            requestDto.setCardNumber(response);
            return responseDto;
        }

    }

    @Override
    public String randomNumber(RequestDto requestDto) {
        int randomNumber;
        List<Integer> numbers = new ArrayList<>();
        int value = 0;

        if (requestDto.getCardNumber().length() == 6) {
            value = 9;
        } else if (requestDto.getCardNumber().length() == 7) {
            value = 8;
        }else if (requestDto.getCardNumber().length() == 8) {
            value = 7;
        }else {
            return "Error.";
        }

        for(int i = 0; i < value; i++) {
            randomNumber = (int)(Math.random()*10);
            numbers.add(randomNumber);
        }

        return requestDto.getCardNumber() + concatNumber(numbers);
    }

    @Override
    public String concatNumber(List<Integer> numbers) {
        StringBuilder result = new StringBuilder();
        for (Integer number : numbers) {
            result.append(number);
        }
        return result.toString();
    }
}
