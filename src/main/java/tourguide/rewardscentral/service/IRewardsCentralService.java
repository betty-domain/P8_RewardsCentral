package tourguide.rewardscentral.service;

import java.util.UUID;

/**
 * Interface of RewardsCentralService
 */
public interface IRewardsCentralService {
    /**
     * Get rewards Points for a user visiting an attraction
     * @param attractionId attraction id
     * @param userId user id
     * @return number of rewards points
     */
    int getAttractionRewardPoints(UUID attractionId, UUID userId);
}
