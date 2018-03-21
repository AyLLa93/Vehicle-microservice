package vehicle.mservice.vehiclemicroservice.Service;

import Model.Lokacija;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class LokacijaService {

    List<Lokacija> listaLokacija = new ArrayList<Lokacija>(Arrays.asList(
            new Lokacija (1,"Sarajevo", "Zmaja od Bosne bb")
    ));

    public List<Lokacija> getLokacije(){
        return listaLokacija;
    }

    public Lokacija getLokaciju(int id){
        return listaLokacija.stream().filter(t -> Objects.equals(t.getId(), id)).findFirst().get();
    }

    public void addLokaciju(Lokacija lokacija){
        listaLokacija.add(lokacija);
    }

    public void updateLokaciju(Lokacija lok, int id) {
        for (int i = 0; i<listaLokacija.size(); i++)
        {
            Lokacija lokacija=listaLokacija.get(i);
            if (Objects.equals(lokacija.getId(), id)){
                listaLokacija.set(i,lok);
            }
        }
    }

    public void deleteLokaciju(int id) {
        listaLokacija.removeIf(t-> Objects.equals(t.getId(), id));
    }

}
