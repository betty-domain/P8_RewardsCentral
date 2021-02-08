package tourguide.rewardscentral;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rewardCentral.RewardCentral;

@Configuration
public class RewardsCentralBeanConfiguration {

    @Bean
    public RewardCentral rewardCentral()
    {
        return  new RewardCentral();
    }
}
