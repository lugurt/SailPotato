package yuan.sailpotato.Model;

import com.activeandroid.Model;

import yuan.sailpotato.Common;

/**
 * Created by Administrator on 2015/6/30.
 */
public class Logistics  {
    private String title;
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public Logistics(String title, String imageUrl, String description) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
    public static final Common.MesInfoType type = Common.MesInfoType.Logistics;
}
