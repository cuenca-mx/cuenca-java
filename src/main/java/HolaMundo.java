import com.cuenca.java.CuencaClient;

/*
 * Para correr el ejemplo es necesario agregar las apiKeys correspondientes, agregar endPoints válidos y utilizar
 * endPoints que sean del tipo "application/json"
 * */
public class HolaMundo {
    public static void main(String[] args) throws Exception {
        String API_KEY = "";
        String API_SECRET = "";
        String endPointPost = "https://stage.cuenca.com/user_logins";
        String jsonBodyPost = "{\"password\": \"111111\", \"user_id\": \"me\"}";
        CuencaClient client = new CuencaClient(API_KEY, API_SECRET);
        String response = client.post(endPointPost, jsonBodyPost).body();
        System.out.println("POST :" + response);
    }
}