package vehicle.mservice.vehiclemicroservice.Service;

import Model.Vozilo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class VoziloService {

    List<Vozilo> voziloList = new ArrayList<Vozilo>(Arrays.asList(
            new Vozilo (1, "Renault", "Megane", "Limuzina", 2008, "Manual", "Black", true),
            new Vozilo (2, "BMW", "428i", "Limuzina", 2015, "Automatic", "White", true),
            new Vozilo (3, "Audi", "A6", "Limuzina", 2014, "Automatic", "Red", true)
    ));

    public List<Vozilo> getVozila(){
        return voziloList;
    }

    public Vozilo getVozilo (int id){
        return voziloList.stream().filter(t -> Objects.equals(t.getId(), id)).findFirst().get();
    }

    public void addVozilo(Vozilo vozilo) {
        voziloList.add(vozilo);
    }

    public void updateVozilo(Vozilo voz, int id) {
        for (int i = 0; i<voziloList.size(); i++)
        {
            Vozilo vozilo=voziloList.get(i);
            if (Objects.equals(vozilo.getId(), id)){
                voziloList.set(i,voz);
            }
        }
    }

    public void deleteVozilo(int id) {
        voziloList.removeIf(t-> Objects.equals(t.getId(), id));
    }
}
