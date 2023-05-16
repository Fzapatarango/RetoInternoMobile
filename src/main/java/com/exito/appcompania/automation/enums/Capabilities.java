package com.exito.appcompania.automation.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Capabilities {

    DEVICE_NAME("appium:deviceName", "R58T41ZQTAB"),
    APP_PACKAGE("appium:appPackage", "com.exito.appcompania"),
    APP_ACTIVITY("appium:appActivity", "com.exito.appcompania.views.initialaccess.activities.SplashActivity"),
    AUTO_GRANT_PERMISSIONS("appium:autoGrantPermissions", true),
    RESET_KEY_BOARD("appium:resetKeyboard", true),
    PLATFORM_NAME("platformName", "Android"),
    PLATFORM_VERSION("appium:platformVersion", "13"),
    AUTOMATION_NAME("appium:automationName", "UiAutomator2"),
    LENGUAGE("appium:language", "es"),
    LOCALE("appium:locale", "ES"),
    NO_RESET("appium:noReset", false),
    TIME_OUT("appium:uiautomator2ServerInstallTimeout", "60000");

    private final String key;
    private final Object value;
}
