package tourguide.rewardscentral.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tourguide.rewardscentral.service.IRewardsCentralService;

import java.util.UUID;

@RestController
public class RewardsCentralController {

    private static final Logger logger = LogManager.getLogger(RewardsCentralController.class);

    @Autowired
    private IRewardsCentralService rewardsCentralService;

    /**
     * Get rewards Points for a user visiting an attraction
     * @param attractionId attraction id
     * @param userId user id
     * @return number of rewards points
     */
    @GetMapping("/rewardsPoints")
    public int getAttractionRewardsPoints(@RequestParam UUID attractionId, @RequestParam UUID userId)
    {
        logger.debug("Call to RewardsCentralController.getAttractionRewardsPoints(" + userId + ", "+ attractionId+")");
        return rewardsCentralService.getAttractionRewardPoints(attractionId,userId);
    }
}
