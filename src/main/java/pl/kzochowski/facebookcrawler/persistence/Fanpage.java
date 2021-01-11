package pl.kzochowski.facebookcrawler.persistence;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import java.time.ZonedDateTime;

@Getter
@Setter
public class Fanpage {
    @Id
    private String id;
    private String name;
    private String url;
    private ZonedDateTime lastExecution;
}
