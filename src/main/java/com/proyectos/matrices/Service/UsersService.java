package com.proyectos.matrices.Service;

import com.proyectos.matrices.Dto.RequestDto;
import com.proyectos.matrices.Dto.ResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {

      ResponseDto createUser (RequestDto requestDto);

      ResponseDto updateUser (RequestDto requestDto);

      List<ResponseDto> readUser ();

      ResponseDto deleteUser (RequestDto requestDto);

      ResponseDto createCard (RequestDto requestDto);
      String randomNumber(RequestDto requestDto);
      String concatNumber(List<Integer> numbers);
}
