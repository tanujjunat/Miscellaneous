
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;

import java.io.UnsupportedEncodingException;
import java.util.Date;

public class TravelsifyApiTokenTest {

    private static final String HOST = "https://mockapi.travelsify.com";
    private static final String BASE = "/v1/clients/marriott-dst/";
    private static final String USER_NAME = "Marriott-DST";
    private static final String ISS = "Travelsify";
    private static final String SECRET = "UmICDiY93kOYVL5VTOl9jS7SUu5ZIQU7g8qw3Uul94PlvF6Z5ZNJFHrXBKUJCuXx";

    public static String genApiToken(String uri) {
        System.out.println("Generating Token for: " + uri);

        Date issuedAt = new Date(); // Better to rely on a timestamp from a NTP server if the server is not time-synched!

        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            String token = JWT.create()
                    .withIssuer(ISS)
                    .withIssuedAt(issuedAt)
                    .withClaim("resource", uri)
                    .withClaim("username", USER_NAME)
                    .sign(algorithm);
            return token;
        } catch (JWTCreationException | UnsupportedEncodingException e) {
            System.err.println("Invalid Signing configuration / Couldn't convert Claims.");
            System.err.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        String resource = BASE + "/users/manual-monitoring/destinations/aggregations/products-and-tags";
        String samplePayload = "?tag-ids=culture";
        String token = genApiToken(resource);
        System.out.println("Please try this on a terminal session with an installed curl");
        System.out.println(
                String.format("curl -H \"Authorization: Token %s\" \"%s%s%s\"", token, HOST, resource, samplePayload));
    }
}

