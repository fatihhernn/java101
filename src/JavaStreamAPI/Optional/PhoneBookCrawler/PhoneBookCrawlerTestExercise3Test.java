package JavaStreamAPI.Optional.PhoneBookCrawler;

import JavaStreamAPI.Optional.PhoneBook.PhoneBook;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PhoneBookCrawlerTestExercise3Test {

    private PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    public void findPhoneNumberByNameAndReturnEntirePhoneBookIfNothingFound() {
        String phoneBook = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Raf de Giraf");

        assertThat(phoneBook,is(equalTo("PhoneBook{phoneBookEntries={An de Toekan=016/161617, Jos de Vos=016/161616, Kris de Vis=016/161618}}")));
    }

}
