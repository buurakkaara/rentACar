package kodlama.io.rentACar.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.Brand;


public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
	boolean existsByName(String name);
	
}
