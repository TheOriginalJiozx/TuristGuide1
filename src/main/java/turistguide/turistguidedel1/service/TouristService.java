package turistguide.turistguidedel1.service;

import org.springframework.stereotype.Service;
import turistguide.turistguidedel1.model.TouristAttraction;
import turistguide.turistguidedel1.repository.TouristRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TouristService {
    private final TouristRepository touristRepository;

    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    public TouristAttraction addAttraction(TouristAttraction attraction) {
        touristRepository.addAttraction(attraction);
        return attraction;
    }

    public List<TouristAttraction> getAllAttractions() {
        return touristRepository.getAllAttractions();
    }

    public boolean deleteAttractionByName(String name) {
        return touristRepository.deleteAttractionByName(name);
    }

    public TouristAttraction getAttractionByName(String name) {
        return touristRepository.getAttractionByName(name);
    }

    public TouristAttraction updateAttraction(TouristAttraction updatedAttraction) {
        touristRepository.updateAttraction(updatedAttraction);
        return updatedAttraction;
    }
}
