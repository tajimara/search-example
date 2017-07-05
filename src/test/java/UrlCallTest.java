
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by chojang on 15. 6. 9..
 */
public class UrlCallTest {

    @Test
    public void test() throws Exception {
        String apiUrl = "http://192.168.0.102:9600/solr/kr-00625-e1d01c04f4//replication?command=details&wt=json";
        fields(apiUrl);
    }

    private void fields(String requestUrl) throws Exception {
        String indexSize = "26.89";
        long resultSize = 0;
        if (indexSize != null) {
            if (indexSize.contains("bytes")) {
                resultSize = (long)(Double.parseDouble(indexSize.replace("bytes","").trim()) / 1024 / 1024);
            } else if(indexSize.contains("KB")) {
                resultSize = (long)(Double.parseDouble(indexSize.replace("KB","").trim()) / 1024) ;
            } else if (indexSize.contains("MB")) {
                resultSize = (long)Double.parseDouble(indexSize.replace("MB","").trim());
            } else if (indexSize.contains("GB")) {
                resultSize = (long)Double.parseDouble(indexSize.replace("GB","").trim()) * 1024;
            } else {
                resultSize = (long)(Double.parseDouble(indexSize.replace("KB","").trim()) / 1024) ;
            }

        }
        System.out.println(resultSize);
        /*
        String jsonResult=this.urlCall(requestUrl);
        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonResult);
        JSONObject resultDetails=(JSONObject)jsonObject.get("responseHeader");
        long result = (Long)resultDetails.get("status");

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonResult);
        JSONObject resultDetails=(JSONObject)jsonObject.get("details");
        String indexSize=(String)resultDetails.get("indexSize");
        System.out.println(indexSize);

        Map<String, Object> fieldList = new HashMap<String, Object>();
        if (result==0) {
            JSONArray fields = (JSONArray)jsonObject.get("fields");

        }*/


    }

    private String urlCall(String requesturl) throws Exception{
        URL url = null;
        String requestMsg = "";
        String line="";
        BufferedReader input = null;

        try {
            // Request
            url = new URL(requesturl);
            // Response
            input = new BufferedReader(new InputStreamReader(url.openStream()));
            while((line=input.readLine()) != null){
                requestMsg += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return requestMsg;
    }
}
