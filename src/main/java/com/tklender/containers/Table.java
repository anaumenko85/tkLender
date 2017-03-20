package com.tklender.containers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tklender.pages.Page;

public class Table extends Page {
	@FindBy(xpath = "//table")
	private WebElement table;

	public Table(WebDriver driver) {
		super(driver);
	}

	public List<WebElement> getRows() {
		return table.findElements(By.tagName("tr"));
	}

	public List<WebElement> getHeaders() {
		return table.findElements(By.tagName("th"));
	}

}
