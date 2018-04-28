package tomato.example.com.githubsearchuser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by SAI SUMANTH VANKA on 28-04-2018.
 */

public class ItemResponse {

    @SerializedName("items")
    @Expose
    private List<Item> items;

    public List<Item> getItems(){
        return items;
    }

    public void setItems(List<Item>items){
        this.items = items;
    }
    //item array from search json file will be taken
}
