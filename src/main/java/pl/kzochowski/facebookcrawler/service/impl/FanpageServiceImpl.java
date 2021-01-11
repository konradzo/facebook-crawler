package pl.kzochowski.facebookcrawler.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.kzochowski.facebookcrawler.persistence.Fanpage;
import pl.kzochowski.facebookcrawler.service.FanpageService;

import java.util.Optional;

@Slf4j
@Service
public class FanpageServiceImpl implements FanpageService {

    @Override
    public Optional<Fanpage> fetchFanpageToCrawl() {
        return Optional.empty();
    }
}
