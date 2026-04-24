import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tes.praktik.Praktik.Programmer.model.Pasien;

@Repository
public interface PasienRepository extends JpaRepository<Pasien, Integer>{

}