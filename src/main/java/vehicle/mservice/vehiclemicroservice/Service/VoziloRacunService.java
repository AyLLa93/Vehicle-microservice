package vehicle.mservice.vehiclemicroservice.Service;

import Model.VoziloRacun;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class VoziloRacunService {

    List<VoziloRacun> listaRacuna = new ArrayList<>(Arrays.asList(
            new VoziloRacun (1, 2, 100.0, 0.0),
            new VoziloRacun(2,1,40.0,0.0)
    ));

    public List<VoziloRacun> getRacun(){
        return listaRacuna;
    }

    public VoziloRacun getRacun (int id){
        return listaRacuna.stream().filter(t -> Objects.equals(t.getId(), id)).findFirst().get();
    }

    public void addRacun(VoziloRacun vRacun) {
        listaRacuna.add(vRacun);
    }

    public void updateRacun(VoziloRacun voz, int id) {
        for (int i = 0; i<listaRacuna.size(); i++)
        {
            VoziloRacun vozilo=listaRacuna.get(i);
            if (Objects.equals(vozilo.getId(), id)){
                listaRacuna.set(i,voz);
            }
        }
    }

    public void deleteRacun(int id) {
        listaRacuna.removeIf(t-> Objects.equals(t.getId(), id));
    }
}
