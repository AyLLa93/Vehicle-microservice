package vehicle.mservice.vehiclemicroservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vehicle.mservice.vehiclemicroservice.Entity.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long>{
}
