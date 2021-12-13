package br.com.zup.Zupfy.musica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/musicas")
public class MusicaController {

    @Autowired
    private MusicaService musicaService;

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarMusica (@PathVariable int id) {
        musicaService.deletarMusica(id);
    }
}
