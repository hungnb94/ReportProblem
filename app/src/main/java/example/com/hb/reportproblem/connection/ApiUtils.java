package example.com.hb.reportproblem.connection;

/**
 * Created by HP ProBook on 1/10/2018.
 */

public class ApiUtils {

    public static final String BASE_URL = //"http://reportproblem.epizy.com/";
            "http://192.168.0.103/";

    public static APIService getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}