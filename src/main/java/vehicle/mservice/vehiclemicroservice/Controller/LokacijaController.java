package vehicle.mservice.vehiclemicroservice.Controller;

import Model.Lokacija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicle.mservice.vehiclemicroservice.Service.LokacijaService;

import java.util.List;

@RestController
public class LokacijaController {

    @Autowired
    private LokacijaService lokacijaService;

    @RequestMapping("/lokacije")
    public List<Lokacija> getAllLokacije(){
        return lokacijaService.getLokacije();
    }

    @RequestMapping("/lokacije/{id}")
    public Lokacija getLokaciju(@PathVariable int id){
        return lokacijaService.getLokaciju(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/lokacije")
    public void addLokaciju(@RequestBody Lokacija lokacija){
        lokacijaService.addLokaciju(lokacija);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/lokacije/{id}")
    public void updateLokaciju (@RequestBody Lokacija lokacija, @PathVariable int id){
        lokacijaService.updateLokaciju(lokacija,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/lokacije/{id}")
    public void deleteLokaciju (@PathVariable int id){
        lokacijaService.deleteLokaciju(id);
    }
}
