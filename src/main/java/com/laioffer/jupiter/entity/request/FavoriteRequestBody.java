package com.laioffer.jupiter.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.laioffer.jupiter.entity.database.Item;

public class FavoriteRequestBody {

    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
