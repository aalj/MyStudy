package com.bestsnail.upload;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.IOException;

/**
 * Created by stone on 16-12-1.
 */
public class UploadAction extends ActionSupport{
    private File file2;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private String file2FileName;
    private String file2ContentTYpe;

    public void setFile2(File file2) {
        this.file2 = file2;
    }

    public void setFile2FileName(String file2FileName) {
        this.file2FileName = file2FileName;
    }

    public void setFile2ContentTYpe(String file2ContentTYpe) {
        this.file2ContentTYpe = file2ContentTYpe;
    }

    public String execute(){
        System.out.println(name);
        String path  = ServletActionContext.getServletContext().getRealPath("/upload");
        System.out.println(path);
        File file = new File(path,file2FileName);
        try {
            FileUtils.copyFile(file2,file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "uploadResult";
    }
}
