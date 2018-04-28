package tomato.example.com.githubsearchuser.api;

import tomato.example.com.githubsearchuser.model.ItemResponse;
import retrofit2.Call;
import retrofit2.http.GET;
/**
 * Created by SAI SUMANTH VANKA on 28-04-2018.
 */

public interface Service {
        @GET("/search/users?q=type:user+sort:score")
        Call<ItemResponse> getItems();

}
