package CMSAIML.example.CMSAIML.Service;

import CMSAIML.example.CMSAIML.Entity.FacultyFdp;
import CMSAIML.example.CMSAIML.repository.FacultyFdpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyFdpService {

    @Autowired
    private FacultyFdpRepository facultyFdpRepository;

    public List<FacultyFdp> getAllFdps() {
        return facultyFdpRepository.findAll();
    }

    public FacultyFdp getFdpById(Long id) {
        return facultyFdpRepository.findById(id).orElse(null);
    }

    public FacultyFdp saveFdp(FacultyFdp fdp) {
        return facultyFdpRepository.save(fdp);
    }

    public void deleteFdp(Long id) {
        facultyFdpRepository.deleteById(id);
    }
}
