package com.world.jd.sanglaap.Utils;




import org.json.JSONException;
import org.json.JSONObject;

public class SendNotification {

    public SendNotification(String message, String heading, String notificationKey){

        try {
            JSONObject notificationContent = new JSONObject(
                    "{'contents':{'en':'" + message + "'},"+
                    "'include_player_ids':['" + notificationKey + "']," +
                    "'headings':{'en': '" + heading + "'}}");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
