package DesignPattern.Creational.Singleton.SingleThreaded.Scaler;

import java.io.PrintWriter;

public class FileBasedConfigurationManagerImpl extends FileBasedConfigurationManager {

    private static FileBasedConfigurationManager manager = null;

    private FileBasedConfigurationManagerImpl(){

    }

    @Override
    public String getConfiguration(String key) {
        // TODO Auto-generated method stub

     return  this.properties.getProperty(key);

    }

    @Override
    public <T> T getConfiguration(String key, Class<T> type) {
        // TODO Auto-generated method stu
        String val = this.properties.getProperty(key);
        return this.convert(key, type);
    }

    @Override
    public void setConfiguration(String key, String value) {
        // TODO Auto-generated method stub
        this.properties.setProperty(key,value);
    }

    @Override
    public <T> void setConfiguration(String key, T value) {
        // TODO Auto-generated method stub
        this.properties.setProperty(key, (String) value);
    }

    @Override
    public void removeConfiguration(String key) {
        // TODO Auto-generated method stub
        this.properties.remove(key);
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        this.properties.clear();
    }

    public static FileBasedConfigurationManager getInstance() {

        // TODO Auto-generated method stub
        if(manager == null){
            synchronized (FileBasedConfigurationManagerImpl.class) {
                if (manager == null) {
                    manager = new FileBasedConfigurationManagerImpl();
                }
            }

        }
        return manager;
    }

    public static void resetInstance() {
        // TODO Auto-generated method stub
        manager = null;
    }



}