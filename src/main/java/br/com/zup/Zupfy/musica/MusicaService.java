package br.com.zup.Zupfy.musica;

import br.com.zup.Zupfy.musica.exceptions.MusicaNaoEcontradaExeception;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MusicaService {
    @Autowired
    private MusicaRepository musicaRepository;

    public Musica cadastrarMusica(Musica musica) {
        return musicaRepository.save(musica);
    }

    public void deletarMusica(int id) {
        if (musicaRepository.existsById(id)) {
            musicaRepository.deleteById(id);
        } else {
            throw new MusicaNaoEcontradaExeception("Musica não encontrada");
        }

    }

    public Musica atualizarMusica(Musica musica) {
        return musica;
    }

    public List<Musica> retornarTodasAsMusicas() {
        return null;
    }

}
