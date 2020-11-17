package com.ZEROBANK.utilities;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelExercise {
    public static void main(String[] args) throws IOException {



        String path = "./src/test/resources/test-data/Vytrack_testusers.xlsx";
        String userSheet = "QA3-short";

        ExcelUtil userData = new ExcelUtil(path, userSheet);
        List<Map<String, String>> userList = userData.getDataList();

        userList.get(0).get("username");
        userList.get(0).get("password");




    }

}
