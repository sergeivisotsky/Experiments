package org.sergei.ftp;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class FileUploader {
    private static final Logger LOGGER = Logger.getLogger(FileUploader.class);

    private static final String SERVER = "127.0.0.1";
    private static final int PORT = 21;
    private static final String USERNAME = "demouser";
    private static final String PASSWORD = "demopswd";

    private FTPClient ftpClient = new FTPClient();

    void processUpload() {
        try {
            ftpClient.connect(SERVER, PORT);
            ftpClient.login(USERNAME, PASSWORD);
            ftpClient.enterLocalPassiveMode();

            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            File localFile = new File("D:/Users/Sergei/Desktop/demo_doc.docx");
            String remoteFile = "demo_doc.docx";

            InputStream inputStream = new FileInputStream(localFile);
            boolean done = ftpClient.storeFile(remoteFile, inputStream);
            if (done) {
                LOGGER.info("Uploaded");
            } else {
                LOGGER.error("Not uploaded");
            }
            inputStream.close();
        } catch (IOException e) {
            LOGGER.error(e);
        } finally {
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
            } catch (IOException e) {
                LOGGER.error(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new FileUploader().processUpload();
    }
}
