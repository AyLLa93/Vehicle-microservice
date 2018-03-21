package vehicle.mservice.vehiclemicroservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vehicle.mservice.vehiclemicroservice.Entity.Request.AddVehicleRequest;
import vehicle.mservice.vehiclemicroservice.Entity.Vehicle;
import vehicle.mservice.vehiclemicroservice.Repository.VehicleRepository;

import java.util.List;

@RestController
public class VehicleController {

    private VehicleRepository vehicleRepository;

    @Autowired
    public VehicleController(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Vehicle> findAllVehicles(){
        return vehicleRepository.findAll();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addVehicle(@RequestBody AddVehicleRequest addVehicleRequest){
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand(addVehicleRequest.getBrand());
        vehicle.setName(addVehicleRequest.getName());
        vehicle.setColor(addVehicleRequest.getColor());
        vehicle.setProductionYear(addVehicleRequest.getProductionYear());
        vehicle.setTransmission(addVehicleRequest.getTransmission());
        vehicle.setType(addVehicleRequest.getType());
        vehicle.setAvailable(addVehicleRequest.isAvailable());
        vehicle.setLocationID(addVehicleRequest.getLocationID());
        vehicleRepository.save(vehicle);
    }
}
