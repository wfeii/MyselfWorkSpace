package de.greenrobot.daogenerator.Schema;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "FOODS_EPISODE".
 */
public class FoodsEpisode {

    private Integer foodId;
    private Integer episodeId;

    public FoodsEpisode() {
    }

    public FoodsEpisode(Integer foodId, Integer episodeId) {
        this.foodId = foodId;
        this.episodeId = episodeId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public Integer getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(Integer episodeId) {
        this.episodeId = episodeId;
    }

}
