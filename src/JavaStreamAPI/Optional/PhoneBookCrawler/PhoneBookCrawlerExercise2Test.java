package JavaStreamAPI.Optional.PhoneBookCrawler;

import JavaStreamAPI.Optional.PhoneBook.PhoneBook;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PhoneBookCrawlerExercise2Test {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    public void findPhoneNumberByNameAndPunishIfNothingFound() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("No phone number found");

        phoneBookCrawler.findPhoneNumberByNameAndPunishIfNothingFound("Raf de Giraf");
    }

}