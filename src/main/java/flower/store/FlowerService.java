package flower.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlowerService {
    private final FlowerRepository flowerRepository;

    public List<Flower> getAllFlowers() {
        return flowerRepository.findAll();
    }

    public Flower getFlowerById(Long id) {
        return flowerRepository.findById(id)
                .orElseThrow(() -> new FlowerNotFoundException("Flower not found with id: " + id));
    }

    public Flower saveFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    public void deleteFlower(Long id) {
        if (!flowerRepository.existsById(id)) {
            throw new FlowerNotFoundException("Cannot delete. Flower not found with id: " + id);
        }
        flowerRepository.deleteById(id);
    }
}
