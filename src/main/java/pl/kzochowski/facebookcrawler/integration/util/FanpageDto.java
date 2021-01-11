package pl.kzochowski.facebookcrawler.integration.util;

import lombok.Getter;
import lombok.Setter;
import pl.kzochowski.facebookcrawler.integration.model.PostDto;
import pl.kzochowski.facebookcrawler.persistence.Fanpage;

import java.util.List;

@Getter
@Setter
public class FanpageDto {
    private Fanpage fanpage;
    private List<PostDto> posts;

    public FanpageDto(Fanpage fanpage) {
        this.fanpage = fanpage;
    }
}
