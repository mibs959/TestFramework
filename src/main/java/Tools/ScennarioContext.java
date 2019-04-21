package Tools;

import java.util.HashMap;

public class ScennarioContext {

    /**
     * On this HashMap will be where we store all the Data relevant so we can use it from Step to Step on the
     * Scennarios.
     *
     * It uses a String Key to store and retrieve the Data stored.
     */
    private static HashMap<String, Object> scennarioContext = new HashMap<String, Object>();

    /**
     * This is the method that we use in order to Store the Data that we want.
     *
     * @param key - The String Key needed for later recover of the Data.
     * @param elementToSave - What we want to Store on the ScennarioContext.
     */
    public static void saveData(String key, Object elementToSave){
        scennarioContext.put(key, elementToSave);
    }

    /**
     * We use this method in order to retrieve the Data previously Stored, by retrieving it
     * with the Key that we used before.
     *
     * @param key - String Key to retrieve a previously stored Data.
     * @return
     */
    public static Object getData(String key){
        return scennarioContext.get(key);
    }

}
