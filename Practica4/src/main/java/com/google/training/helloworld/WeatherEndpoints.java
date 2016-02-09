package com.google.training.helloworld;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

/**
 * Created by yaroslav on 2/3/16.
 */

@Api(name = "helloworldendpoints", version = "v1",
        scopes = {Constants.EMAIL_SCOPE },
        clientIds = {Constants.WEB_CLIENT_ID, Constants.API_EXPLORER_CLIENT_ID },
        description = "API for hello world endpoints.")


public class WeatherEndpoints {


        // Declare this method as a method available externally through Endpoints
        @ApiMethod(name = "weather", path = "weather",
                httpMethod = ApiMethod.HttpMethod.GET)

        public Weather getWeather(@Named("name") String city) {
                return new Weather(city);
        }


}
