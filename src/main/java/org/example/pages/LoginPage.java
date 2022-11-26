package org.example.pages;

import org.example.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class LoginPage extends BasePageObject {

  public void inputUsername(String username) {
    type(MobileBy.id("username"), username);
  }

  public void inputPassword(String password) {
    type(MobileBy.id("password"), password);
  }

  public void clickLoginBtn() {
    click(MobileBy.id("login"));
  }
}
