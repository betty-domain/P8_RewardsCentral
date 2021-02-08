package tourguide.rewardscentral.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import tourguide.rewardscentral.service.IRewardsCentralService;

import java.util.UUID;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = RewardsCentralController.class)
public class RewardsCentralControllerTests {

        @Autowired
        private MockMvc mockMvc;

        @MockBean
        private IRewardsCentralService rewardsCentralServiceMock;

        @Test
        public void getAttractionRewardsPoints() throws Exception
        {
            UUID userID = UUID.randomUUID();
            UUID attractionID = UUID.randomUUID();


            when(rewardsCentralServiceMock.getAttractionRewardPoints(attractionID,userID)).thenReturn(25);

            MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/rewardsPoints").
                    contentType(MediaType.APPLICATION_JSON).param("userId",userID.toString()).param("attractionId",attractionID.toString());

            mockMvc.perform(builder).
                    andExpect(status().isOk()).
                    andExpect(jsonPath("$").value("25"));
        }

    }


