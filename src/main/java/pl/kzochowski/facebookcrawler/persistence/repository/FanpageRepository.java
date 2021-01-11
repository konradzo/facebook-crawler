package pl.kzochowski.facebookcrawler.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kzochowski.facebookcrawler.persistence.Fanpage;

public interface FanpageRepository extends JpaRepository<Fanpage, Long> {
}
