package example.com.hb.reportproblem.connection;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public interface APIService {

    @POST("/posts")
    @FormUrlEncoded
    Call<Objects> savePost(@Field("title") String title,
                           @Field("body") String body,
                           @Field("userId") long userId);
}