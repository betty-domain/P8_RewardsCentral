package tourguide.rewardscentral.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

/**
 * Rewards Central Service to interact with RewardsCentral external lib
 */
@Service
public class RewardsCentralService implements IRewardsCentralService {

    private final Logger logger = LoggerFactory.getLogger(RewardsCentralService.class);

    @Autowired
    private RewardCentral rewardCentral;

    /**
     * Constructor of service
     */
    public RewardsCentralService()
    {
    }

    /**
     * Get rewards Points for a user visiting an attraction
     * @param attractionId attraction id
     * @param userId user id
     * @return number of rewards points
     */
    public int getAttractionRewardPoints(UUID attractionId, UUID userId)
    {
        logger.debug("Call to rewardCentral.getAttractionRewardPoints("+ attractionId + "," + userId+ ")");
        return rewardCentral.getAttractionRewardPoints(attractionId,userId);
    }
}
