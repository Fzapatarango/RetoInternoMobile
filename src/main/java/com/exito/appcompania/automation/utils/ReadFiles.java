package com.exito.appcompania.automation.utils;

import com.exito.appcompania.automation.models.Product;
import com.exito.appcompania.automation.models.User;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class ReadFiles {

    private static final EnvironmentVariables CONF = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String CONFIG_USERS = "users.";

    private static final String CONFIG_CATEGORIES = "products.";


    public static User readUser(String user) {
        return new User(
                CONF.getProperty(CONFIG_USERS + user + ".name"),
                CONF.getProperty(CONFIG_USERS + user + ".lastname"),
                CONF.getProperty(CONFIG_USERS + user + ".id"),
                CONF.getProperty(CONFIG_USERS + user + ".year"),
                CONF.getProperty(CONFIG_USERS + user + ".month"),
                CONF.getProperty(CONFIG_USERS + user + ".day"),
                CONF.getProperty(CONFIG_USERS + user + ".cellphone"),
                CONF.getProperty(CONFIG_USERS + user + ".email"),
                CONF.getProperty(CONFIG_USERS + user + ".password")
        );
    }

    public static Product readProduct(String product) {
        return new Product(
                CONF.getProperty(CONFIG_CATEGORIES + product + ".category"),
                CONF.getProperty(CONFIG_CATEGORIES + product + ".subcategory"),
                CONF.getProperty(CONFIG_CATEGORIES + product + ".product")
        );
    }

}
