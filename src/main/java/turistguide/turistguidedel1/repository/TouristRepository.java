package turistguide.turistguidedel1.repository;

import org.springframework.stereotype.Repository;
import turistguide.turistguidedel1.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class TouristRepository {
    private final List<TouristAttraction> attractions = new ArrayList<>();

    public TouristRepository() {
        attractions.add(new TouristAttraction("Eiffel Tower", "Tower in Paris, France"));
        attractions.add(new TouristAttraction("Colosseum", "The beauty of Rome, Italy"));
        attractions.add(new TouristAttraction("Taj Mahal", "Great monument on the right bank of the river Yamuna in Agra, Uttar Pradesh, India"));
    }

    public void addAttraction(TouristAttraction attraction) {
        attractions.add(attraction);
    }

    public List<TouristAttraction> getAllAttractions() {
        return new ArrayList<>(attractions);
    }

    public boolean deleteAttractionByName(String name) {
        return attractions.removeIf(attraction -> attraction.getName().equals(name));
    }

    public TouristAttraction getAttractionByName(String name) {
        return attractions.stream()
                .filter(attraction -> attraction.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void updateAttraction(TouristAttraction updatedAttraction) {
        TouristAttraction attraction = getAttractionByName(updatedAttraction.getName());
        if (attraction != null) {
            attraction.setName(updatedAttraction.getName());
            attraction.setDescription(updatedAttraction.getDescription());
        }
    }
}
