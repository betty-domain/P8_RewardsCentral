package tourguide.rewardscentral.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import rewardCentral.RewardCentral;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RewardsCentralServiceTest {

    @Autowired
    IRewardsCentralService rewardsCentralService;

    @MockBean
    private RewardCentral rewardCentralMock;

    @Test
    void getAttractionRewardsPointTest()
    {
        UUID userId= UUID.randomUUID();
        UUID attractionId = UUID.randomUUID();

        when(rewardCentralMock.getAttractionRewardPoints(attractionId,userId)).thenReturn(50);

        assertThat(rewardsCentralService.getAttractionRewardPoints(attractionId,userId)).isEqualTo(50);
        verify(rewardCentralMock, Mockito.times(1)).getAttractionRewardPoints(attractionId,userId);
    }
}
