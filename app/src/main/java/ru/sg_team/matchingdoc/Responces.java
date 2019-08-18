package ru.sg_team.matchingdoc;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.POST;

public class Responces {



    public interface API {
        @POST("/v1/registration")
        RegistrationResponse registerUser(@Body RegistrationBody registrationBody);
    }

    public class RegistrationBody{
        public String login;
        public String password;
    }

    public class RegistrationResponse {
        public String token;
    }

}
