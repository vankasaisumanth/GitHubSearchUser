package tomato.example.com.githubsearchuser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by SAI SUMANTH VANKA on 28-04-2018.
 */

// This Class is for Retrofit
// Key-Value pairs
// (using only getters and setters here)

public class Item {

    @SerializedName("login")
    @Expose
    private String login;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;

    public Item(String login, String avatarUrl, String htmlUrl){
        this.login = login;
        this.avatarUrl = avatarUrl;
        this.htmlUrl = htmlUrl;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getavatarUrl(){
        return avatarUrl;
    }

    public void setavatarUrl(String avatarUrl){
        this.avatarUrl = avatarUrl;
    }

    public String gethtmlUrl(){
        return htmlUrl;
    }

    public void sethtmlUrl(String htmlUrl){
        this.htmlUrl = htmlUrl;
    }
}
