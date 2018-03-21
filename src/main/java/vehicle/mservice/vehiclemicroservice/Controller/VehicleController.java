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
        vehicle.setBrand(AddVehicleRequest.getBrand());
        vehicle.setName(AddVehicleRequest.getName());
        vehicle.setColor(AddVehicleRequest.getColor());
        vehicle.setProductionYear(AddVehicleRequest.getProductionYear());
        vehicle.setTransmission(AddVehicleRequest.getTransmission());
        vehicle.setType(AddVehicleRequest.getType());
        vehicle.setAvailable(AddVehicleRequest.isAvailable());
        vehicle.setLocationID(AddVehicleRequest.getLocationID());
        vehicleRepository.save(vehicle);
    }
}
