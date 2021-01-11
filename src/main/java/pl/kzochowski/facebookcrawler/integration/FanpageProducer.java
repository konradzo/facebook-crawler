package pl.kzochowski.facebookcrawler.integration;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.integration.context.IntegrationObjectSupport;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import pl.kzochowski.facebookcrawler.integration.util.FanpageDto;
import pl.kzochowski.facebookcrawler.service.FanpageService;

@Slf4j
@Component
@RequiredArgsConstructor
public class FanpageProducer extends IntegrationObjectSupport implements MessageSource<FanpageDto> {

    private final FanpageService fanpageService;

    @Override
    public Message<FanpageDto> receive() {
        final var fanpage = fanpageService.fetchFanpageToCrawl();
        if (fanpage.isPresent()) {
            final var fanpageDto = new FanpageDto(fanpage.get());
            log.info("Crawling fanpage: {}", fanpage.get().getName());
            return MessageBuilder.withPayload(fanpageDto).build();
        } else {
            log.info("No fanpage to crawl");
            return null;
        }

    }
}
