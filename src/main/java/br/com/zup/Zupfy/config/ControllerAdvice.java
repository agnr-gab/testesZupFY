package br.com.zup.Zupfy.config;

import br.com.zup.Zupfy.musica.exceptions.MusicaNaoEcontradaExeception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(MusicaNaoEcontradaExeception.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public MensagemDeErro musicaNaoEncontradaException(MusicaNaoEcontradaExeception exeception) {
        return new MensagemDeErro(exeception.getLocalizedMessage());
    }

}
