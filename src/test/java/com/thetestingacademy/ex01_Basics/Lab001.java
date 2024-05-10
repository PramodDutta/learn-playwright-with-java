package com.thetestingacademy.ex01_Basics;

import com.microsoft.playwright.*;
import org.testng.annotations.Test;

import java.nio.file.Paths;

import static org.testng.Assert.assertEquals;

public class Lab001 {
    @Test
    public void testSDETLiveTitle(){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://sdet.live");
        System.out.println(page.title());
        assertEquals(page.title(), "Learn Software Testing & Test Automation");
        browser.close();
    }
}
