package vehicle.mservice.vehiclemicroservice.Controller;

import Model.VoziloRacun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vehicle.mservice.vehiclemicroservice.Service.VoziloRacunService;

import java.util.List;

@RestController
public class VoziloRacunController {

    @Autowired
    private VoziloRacunService voziloRacunService;

    @RequestMapping("/racuni")
    public List<VoziloRacun> getRacune(){
        return voziloRacunService.getRacun();
    }

    @RequestMapping("/racuni/{id}")
    public VoziloRacun getVoziloRacun(@PathVariable int id){
        return voziloRacunService.getRacun(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/vozila")
    public void addVoziloRacun(@RequestBody VoziloRacun vRacun){
        voziloRacunService.addRacun(vRacun);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/vozila/{id}")
    public void updateVoziloRacun (@RequestBody VoziloRacun vRacun, @PathVariable int id){
        voziloRacunService.updateRacun(vRacun,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/vozila/{id}")
    public void deleteVoziloRacun (@PathVariable int id){
        voziloRacunService.deleteRacun(id);
    }
}
