package org.nat.dog.tests.footerPage;

import org.nat.dog.pages.HomePage;
import org.nat.dog.tests.TestBase;
import org.testng.annotations.Test;
public class FooterPageTests extends TestBase {
    @Test
    public void isFacebookComponentPresentTest() {
        new HomePage(driver).isFacebookComponentClickable();
    }
    @Test
    public void isInstagramComponentPresentTest() {
        new HomePage(driver).isInstagramComponentClickable();
    }
    @Test
    public void isYoutubeComponentPresentTest() {
        new HomePage(driver).isYoutubeComponentClickable();
    }
    @Test
    public void isMainAddressPresentTest() {
        new HomePage(driver).verifyMainAddress("Germany, Berlin");
    }
    @Test
    public void isPhonePresentTest() {
        new HomePage(driver).verifyPhone("+49 175 9587225");
    }
    @Test
    public void isEmailPresentTest() {
        new HomePage(driver).verifyEmail("Petscare@gmail.com");
    }
    @Test
    public void isVerkaufVonHundeLinkPresentTest() {
        new HomePage(driver).verifyVerkaufVonHunde("Verkauf von Hunde");
    }
    @Test
    public void isVerkaufVonHundeLinkClickableTest() {
        new HomePage(driver).isVerkaufVonHundeLinkClickable();
    }
    @Test
    public void isHotelFürHundeLinkPresentTest() {
        new HomePage(driver).verifyHotelFürHunde("Hotel für Hunde");
    }
    @Test
    public void isHotelFürHundeLinkClickableTest() {
        new HomePage(driver).isHotelFürHundeLinkClickable();
    }
    @Test
    public void isHundeverpaarrungLinkPresentTest() {
        new HomePage(driver).verifyHundeverpaarrung("Hundeverpaarrung");
    }
    @Test
    public void isHundeverpaarrungLinkClickableTest() {
        new HomePage(driver).isHundeverpaarrungLinkClickable();
    }
    @Test
    public void isHundesitterLinkPresentTest() {
        new HomePage(driver).verifyHundesitter("Hundesitter");
    }
    @Test
    public void isHundesitterLinkClickableTest() {
        new HomePage(driver).isHundesitterLinkClickable();
    }
    @Test
    public void isDatenschutzbestimmungenLinkPresentTest() {
        new HomePage(driver).verifyDatenschutzbestimmungen("Datenschutzbestimmungen");
    }
    @Test
    public void isDatenschutzbestimmungenLinkClickableTest() {
        new HomePage(driver).isDatenschutzbestimmungenLinkClickable();
    }
    @Test
    public void isNutzungsvertragLinkPresentTest() {
        new HomePage(driver).verifyNutzungsvertrag("Nutzungsvertrag");
    }
    @Test
    public void isNutzungsvertragLinkClickableTest() {
        new HomePage(driver).isNutzungsvertragLinkClickable();
    }
    @Test
    public void isZahlungLinkPresentTest() {
        new HomePage(driver).verifyZahlung("Zahlung");
    }
    @Test
    public void isZahlungLinkClickableTest() {
        new HomePage(driver).isZahlungLinkClickable();
    }
    @Test
    public void isRegistrirenLinkPresentTest() {
        new HomePage(driver).verifyRegistriren("Registriren");
    }
    @Test
    public void isRegistrirenLinkClickableTest() {
        new HomePage(driver).isRegistrirenLinkClickable();
    }
    @Test
    public void isEineFragenStelenLinkPresentTest() {
        new HomePage(driver).verifyEineFragenStelen("Eine fragen stelen");
    }
    @Test
    public void isEineFragenStelenLinkClickableTest() {
        new HomePage(driver).isEineFragenStelenLinkClickable();
    }
}
