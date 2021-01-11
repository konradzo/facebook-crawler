package pl.kzochowski.facebookcrawler.service;

import pl.kzochowski.facebookcrawler.persistence.Fanpage;

import java.util.Optional;

public interface FanpageService {

    Optional<Fanpage> fetchFanpageToCrawl();
}
