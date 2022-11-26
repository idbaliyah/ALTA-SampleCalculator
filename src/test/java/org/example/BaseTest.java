package org.example;

import org.example.pages.MathPage;
import org.example.pages.ListPage;
import org.example.pages.LoginPage;
import org.example.pages.NavigationMenu;

public class BaseTest {

  public LoginPage loginPage = new LoginPage();

  public NavigationMenu navigationMenu = new NavigationMenu();

  public ListPage listPage = new ListPage();

  public MathPage mathPage = new MathPage();

}