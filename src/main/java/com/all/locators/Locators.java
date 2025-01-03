package com.all.locators;
//here we write all the locators
public class Locators {
    public static final String FIRST_PAGE_CLOSE_BTN="//span[@class='commonModal__close']"; 
    public static final String FROM= "//innput[@id='fromCity']";
    public static final String FROM_TEXTBOX="//input[@placeholder='From']";
    public static final String FROM_DROPDOWN= "(//ul[@class='react-autosuggest__suggestions-list']/li)[1]";
    public static final String TO="//label[@for='toCity']";
    public static final String TO_TEXTBOX="//input[@placeholder='To']";
    public static final String TO_DROPDOWN="(//ul[@class='react-autosuggest__suggestions-list']/li)[1]";
    public static final String DEPARTURE_BTN="//span[normalize-space()='Departure']";
    public static final String DEPARTURE_DATE="//div[@class='DayPicker-Months']//div[@class='dateInnerCell']/p[text()=number(text())]";
    public static final String RETURN_BTN="//span[normalize-space()='Return']";
    public static final String RETURN_DATE="//div[@class='DayPicker-Months']//div[@class='dateInnerCell']/p[text()=number(text())]";
    public static final String TRAVELLERS_AND_CLASS_BTN="//label[@for='travellers']";
    public static final String ADULTS="//ul[@class='guestCounter font12 darkText gbCounter']/li[contains(@data-cy,'adults')]";
    public static final String CHILDRENS="//ul[@class='guestCounter font12 darkText gbCounter']/li[contains(@data-cy,'children')]";
    public static final String INFANTS="//ul[@class='guestCounter font12 darkText gbCounter']/li[contains(@data-cy,'infants')]";
    public static final String CHOOSE_TRAVEL_CLASS="//UL[@CLASS='guestCounter classSelect font12 darkText']/LI";
    public static final String APPLY="//button[normalize-space()='APPLY']";
    public static final String SEARCH="//a[text()='Search']";
    public static final String SECOND_PAGE_CLOSE_BTN="//button[normalize-space()='OKAY, GOT IT!']";
    public static final String AIRLINES_FILTER_CHECKBOX="//p[text()='Airlines']/following-sibling::div//p[@class='checkboxTitle']";
    public static final String AIRLINES_RADIOBTN="(//div[@class='listingCard '])[1]//p";
    public static final String BOOK_NOW="//button[text()='Book Now']";
    public static final String RETRIEVE_TODAY_DATE="//div[@class='DayPicker-Day DayPicker-Day--today']";
    public static final String RETRIEVE_TOMOROW_DATE="//div[@class='DayPicker-Day DayPicker-Day--selected']";
    public static final String RETRIEVE_DATE="//div[@class='DayPicker-Day']";
    
}
