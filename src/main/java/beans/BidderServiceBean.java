package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import services.BidderService;

@Component
public class BidderServiceBean {

    @Bean
    public BidderService getBidderService() {
        return new BidderService();
    }
}