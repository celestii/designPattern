package adaptor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    private final String PATH = "src/adaptor";

    @Override
    public void readFromFile(String filename) throws IOException {

        super.load(new FileInputStream(PATH + "/" + filename));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {

        super.store(new FileOutputStream(PATH + "/" + fileName), "written by File Properties");
    }

    @Override
    public void setValue(String key, String value) {

        super.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {

        return super.getProperty(key);
    }
}
