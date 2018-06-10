package com.example.harsh.imdsensors;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ParamModel {
    @SerializedName("channel")
    JsonChannel channel;
    @SerializedName("feeds") ArrayList<Feeds> feeds;

    public JsonChannel getChannel() {
        return channel;
    }

    public ArrayList<Feeds> getFeeds() {
        return feeds;
    }
}

class JsonChannel {
    @SerializedName("id") String id;
    @SerializedName("name") String name;
    @SerializedName("latitude") String latitude;
    @SerializedName("longitude") String longitude;
    @SerializedName("field1") String field1;
    @SerializedName("field2") String field2;
    @SerializedName("field3") String field3;
    @SerializedName("created_at") String created_at;
    @SerializedName("updated_at") String updated_at;
    @SerializedName("last_entry_id") String last_entry_id;

    public String getparamId() {
        return id;
    }

    public String getparamName() {
        return name;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getField3() {
        return field3;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public String getLast_entry_id() {
        return last_entry_id;
    }
}

class Feeds {
    @SerializedName("created_at") String created_at;
    @SerializedName("entry_id") String id;
    @SerializedName("field1") String field1;

    public String getCreated_at() {
        return created_at;
    }

    public String getuniqueId() {
        return id;
    }

    public String getField1() {
        return field1;
    }
}
