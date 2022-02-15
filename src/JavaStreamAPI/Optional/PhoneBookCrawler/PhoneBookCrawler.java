package JavaStreamAPI.Optional.PhoneBookCrawler;

import JavaStreamAPI.Optional.PhoneBook.PhoneBook;

public class PhoneBookCrawler {
    private PhoneBook phoneBook;

    public PhoneBookCrawler(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public String findPhoneNumberByNameAndPunishIfNothingFound(String name){
        return phoneBook.findPhoneNumberByName(name).orElseThrow(()->new IllegalArgumentException("No phone number found"));
    }

    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String name){
        StringBuilder result=new StringBuilder();
        phoneBook.findPhoneNumberByName(name)
                .ifPresentOrElse(phoneNumber -> result.append(phoneNumber),
                        ()-> System.out.println(phoneBook.getPhoneBookEntries()));

        return result.toString()==null ? result.toString():phoneBook.toString();
    }

    public String findPhoneNumberByNameOrNameByPhoneNumber(String name, String phoneNumber){
        return null;
    }

    public PhoneBook getPhoneBook(){
        return phoneBook;
    }
}
