package APIRestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import org.hamcrest.Matchers;

import java.util.List;

public class RestAssuredExample {

    public static void main(String[] args) {

        Response response = RestAssured
                .given()
                    .header("Content-Type", "application/json")
                    .header("User-Agent",
                            "Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                            "AppleWebKit/537.36 (KHTML, like Gecko) " +
                            "Chrome/120.0.0.0 Safari/537.36")
                .when()
                    .get("https://fakestoreapi.com/users");

        response.then().statusCode(200);
        response.then()
                .header("Content-Type",
                        Matchers.containsString("application/json"));

        // ✅ ID, Lat, Long
        List<Integer> ids =
                response.jsonPath().getList("id");

        List<String> latitudes =
                response.jsonPath().getList("address.geolocation.lat");

        List<String> longitudes =
                response.jsonPath().getList("address.geolocation.long");

        // ✅ First name, Last name, City
        List<String> firstNames =
                response.jsonPath().getList("name.firstname");
        List<String> lastNames =
                response.jsonPath().getList("name.lastname");
        List<String> cities =
                response.jsonPath().getList("address.city");

        // ✅ Print everything together
        for (int i = 0; i < ids.size(); i++) {
            System.out.println(
                    "ID: " + ids.get(i)
                    + ", First Name: " + firstNames.get(i)
                    + ", Last Name: " + lastNames.get(i)
                    + ", City: " + cities.get(i)
                    + ", Lat: " + latitudes.get(i)
                    + ", Long: " + longitudes.get(i)
            );
        }

        // ✅ Headers
        Headers headers = response.headers();
        for (Header h : headers) {
            System.out.println("Header " + h.getName() + " : " + h.getValue());
        }
    }
}
