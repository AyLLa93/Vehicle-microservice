package vehicle.mservice.vehiclemicroservice.Controller;

import Model.Vozilo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicle.mservice.vehiclemicroservice.Service.VoziloService;

import java.util.List;

@RestController
public class VoziloController {

    @Autowired
    private VoziloService voziloService;

    @RequestMapping("/vozila")
    public List<Vozilo> getAllVozila(){
        return voziloService.getVozila();
    }

    @RequestMapping("/vozila/{id}")
    public Vozilo getVozilo(@PathVariable int id){
        return voziloService.getVozilo(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/vozila")
    public void addVozilo(@RequestBody Vozilo vozilo){
        voziloService.addVozilo(vozilo);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/vozila/{id}")
    public void updateVozilo (@RequestBody Vozilo vozilo, @PathVariable int id){
        voziloService.updateVozilo(vozilo,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/vozila/{id}")
    public void deleteVozilo (@PathVariable int id){
        voziloService.deleteVozilo(id);
    }
}
