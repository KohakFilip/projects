package springboot.quickstart.apicourse;


import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

import java.util.List;

@RestController
public class ListData {

@Autowired
 NetConnection netConnection;



    @RequestMapping("/Topics")
    public List<Data> fetch(String searchFilter)throws Exception{



        List<Data> allData = new ArrayList<Data>();

        String rawJson = netConnection.request("https://bitbucket.org/ondracek99/stazdata/raw/40898b10509e0ae85fbbb400c6ae4c5420f6fb3a/MCP_20180131.json");

        JSONObject root = new JSONObject(rawJson);

        JSONArray dataArray = root.getJSONArray("rows");

        for (int i = 0; i < dataArray.length(); i++) {
         JSONObject obj = dataArray.getJSONObject(i);

         Data mobileCom = new Data();

            Object typeMess = obj.get("message_type");

            Object timestamp = obj.get("timestamp");

            //Integer value = Integer.valueOf(timestamp.toString());

            Object origin = obj.get("origin");
            Object destination = obj.get("destination");
            mobileCom.setTimestamp(timestamp);
            mobileCom.setOrigin(origin);
            mobileCom.setDestination(destination);
            mobileCom.setTypeMess(typeMess);



            if (MessType.CALL.getName() == "CALL") {
                Object duration = obj.get("duration");
                String statCode = obj.getString("status_code");
                String statDescription = obj.getString("status_description");
                mobileCom.setDuration(duration);
                mobileCom.setStatCode(statCode);
                mobileCom.setStatDescription(statDescription);
            }
            if (MessType.MSG.getName() == typeMess){

                String messContent = obj.getString("message_content");
                String messStatus = obj.getString("message_status");
                mobileCom.setMessContent(messContent);
                mobileCom.setMessStatus(messStatus);

            }
            allData.add(mobileCom);

        }




        return allData;
    }

}



