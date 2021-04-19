import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ApiTest {
private Api api = new Api();


@Test
public void TestGetMethodWhenHTTPSTATUSisACCEPTED()throws IOException {
    int actual = api.getMethodStatus("https://api.chucknorris.io/jokes/categories");
    int expected = 200;
    assertEquals(actual,expected);

}
@Test
public void TestGetMethodWhenHTTPSTATUSisNOT_FOUND()throws IOException {
        int actual = api.getMethodStatus("https://api.chucknorris.io/jokes/JAKISENDPOINTxxsxxssssxxxxxx");
        int expected = 404;
        assertEquals(actual,expected);


}
@Test
public void TestGetMethodRequestJson()throws IOException{
    String actual = api.getMethodText("https://covid-api.mmediagroup.fr/v1/cases?country=Poland");
    assertNotNull(actual);
}
@Test void TestCountryIsNotIncludedInText()throws IOException{
    String actual = api.getMethodText("https://covid-api.mmediagroup.fr/v1/cases?country=Poland");
    assertFalse(actual.matches("(.*)\"France\"(.*)"));

}
@Test void TestCountryIsIncludedInText()throws IOException{
        String actual = api.getMethodText("https://covid-api.mmediagroup.fr/v1/cases?country=Poland");
        assertTrue(actual.startsWith("Poland",82));

}




}
