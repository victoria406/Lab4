package org.csci.labs;

/**
 * @author : Adiesha
 * @created : 7/21/2022, Thursday
 **/
public class BrowserDemo {
    public static void main(String[] args) {
        Browser browser = new Browser("www.google.com");
        System.out.println(browser.visit("www.facebook.com"));
        System.out.println(browser.visit("www.youtube.com"));
        System.out.println(browser.checkPreviousWebPage());
        System.out.println(browser.checkNextWebPage());
        System.out.println(browser.back());
        System.out.println(browser.back());
        System.out.println(browser.forward());
        System.out.println(browser.forward());
        System.out.println(browser.forward());
    }
}
