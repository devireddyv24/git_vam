package com.enhopestest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Scerenshot {
	public static String getscreenshot(WebDriver d) {
		TakesScreenshot sh=(TakesScreenshot)d;
		File srs=sh.getScreenshotAs(OutputType.FILE);
		File drs=new File("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Screenshots\\Enh1.png");
        try {
			Files.copy(srs, drs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return "C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Screenshots\\Enh1.png";
	}

}
