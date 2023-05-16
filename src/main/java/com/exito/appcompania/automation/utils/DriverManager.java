package com.exito.appcompania.automation.utils;

import com.exito.appcompania.automation.enums.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverManager {

    private static WebDriver driver = null;
    private static AppiumDriverLocalService service = null;
    private static final Logger LOGGER = LoggerFactory.getLogger(DriverManager.class);

    public static WebDriver startExitoapp(){

        service= new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingAnyFreePort().build();
        service.start();

        UiAutomator2Options capabilities = new UiAutomator2Options();

        capabilities.setCapability(Capabilities.DEVICE_NAME.getKey(), Capabilities.DEVICE_NAME.getValue());
        capabilities.setCapability(Capabilities.APP_PACKAGE.getKey(), Capabilities.APP_PACKAGE.getValue());
        capabilities.setCapability(Capabilities.APP_ACTIVITY.getKey(), Capabilities.APP_ACTIVITY.getValue());
        capabilities.setCapability(Capabilities.AUTO_GRANT_PERMISSIONS.getKey(), Capabilities.AUTO_GRANT_PERMISSIONS.getValue());
        capabilities.setCapability(Capabilities.PLATFORM_NAME.getKey(), Capabilities.PLATFORM_NAME.getValue());
        capabilities.setCapability(Capabilities.PLATFORM_VERSION.getKey(), Capabilities.PLATFORM_VERSION.getValue());
        capabilities.setCapability(Capabilities.RESET_KEY_BOARD.getKey(), Capabilities.RESET_KEY_BOARD.getValue());
        capabilities.setCapability(Capabilities.AUTOMATION_NAME.getKey(), Capabilities.AUTOMATION_NAME.getValue());
        capabilities.setCapability(Capabilities.LENGUAGE.getKey(), Capabilities.LENGUAGE.getValue());
        capabilities.setCapability(Capabilities.LOCALE.getKey(), Capabilities.LOCALE.getValue());
        capabilities.setCapability(Capabilities.NO_RESET.getKey(), Capabilities.NO_RESET.getValue());
        capabilities.setCapability(Capabilities.TIME_OUT.getKey(), Capabilities.TIME_OUT.getValue());

        driver = new AndroidDriver(service.getUrl(),capabilities);

        LOGGER.info("Se inicializó el driver correctamente");

        return driver;
    }

    public static AndroidDriver getDriver(){
        return (AndroidDriver) driver;
    }
}
