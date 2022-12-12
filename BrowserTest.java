package org.csci.labs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author : Adiesha
 * @created : 7/21/2022, Thursday
 **/
public class BrowserTest {

    Browser browser;

    @Before
    public void setUp() throws Exception {
        browser = new Browser();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void back() {
        assertNull(browser.back());
        browser.visit("www.google.com");
        assertNull(browser.back());
        browser.visit("www.facebook.com");
        browser.visit("www.youtube.com");
        browser.visit("www.hackerank.com");
        assertEquals("www.youtube.com", browser.back());
        assertEquals("www.facebook.com", browser.back());
        assertEquals("www.google.com", browser.back());
        assertNull(browser.back());
        assertNull(browser.back());
    }

    @Test
    public void forward() {
        assertNull(browser.forward());
        browser.visit("www.google.com");
        assertNull(browser.forward());
        browser.visit("www.facebook.com");
        browser.visit("www.youtube.com");
        browser.visit("www.hackerank.com");
        assertEquals("www.youtube.com", browser.back());
        assertEquals("www.facebook.com", browser.back());
        assertEquals("www.google.com", browser.back());
        assertNull(browser.back());
        assertNull(browser.back());
        assertEquals("www.facebook.com", browser.forward());
        assertEquals("www.youtube.com", browser.forward());
        assertEquals("www.hackerank.com", browser.forward());
    }

    @Test
    public void visit() {
        assertNull(browser.currentPage);
        browser.visit("www.google.com");
        assertEquals("www.google.com", browser.currentPage);
        assertEquals("www.youtube.com", browser.visit("www.youtube.com"));
        assertEquals("www.hackerank.com", browser.visit("www.hackerank.com"));

        browser.back();
        assertEquals("www.youtube.com", browser.currentPage);
        browser.forward();
        assertEquals("www.hackerank.com", browser.currentPage);
    }

    @Test
    public void checkPreviousWebPage() {

        browser.visit("www.google.com");
        browser.visit("www.youtube.com");
        browser.visit("www.hackerank.com");

        assertEquals("www.youtube.com", browser.checkPreviousWebPage());
        browser.back();
        assertEquals("www.google.com", browser.checkPreviousWebPage());

    }

    @Test
    public void checkNextWebPage() {
        browser.visit("www.google.com");
        browser.visit("www.youtube.com");
        browser.visit("www.hackerank.com");

        browser.back();
        assertEquals("www.hackerank.com", browser.checkNextWebPage());
        browser.back();
        assertEquals("www.youtube.com", browser.checkNextWebPage());
    }
}