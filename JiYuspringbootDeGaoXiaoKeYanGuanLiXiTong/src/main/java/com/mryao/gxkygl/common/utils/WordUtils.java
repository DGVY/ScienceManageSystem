package com.mryao.gxkygl.common.utils;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: yaohuaiying
 * @Date: 2017/11/13 14:03
 * @Description: word 工具
 * @Version: 1.0
 */
public class WordUtils {
    private static void build(File tmpFile, Map<String, String> contentMap, String exportFile) throws Exception {
        FileInputStream tempFileInputStream = new FileInputStream(tmpFile);
        HWPFDocument document = new HWPFDocument(tempFileInputStream);
        // 读取文本内容
        Range bodyRange = document.getRange();
        // 替换内容
        for (Map.Entry<String, String> entry : contentMap.entrySet()) {
            bodyRange.replaceText("${" + entry.getKey() + "}", entry.getValue());
        }

        //导出到文件
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        document.write(byteArrayOutputStream);
        OutputStream outputStream = new FileOutputStream(exportFile);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.close();
    }

    public static void main(String[] arg) throws Exception {
        int[] code = {0x2610, 0x2611, 0x2612};
        String s1 = new String(code, 1, 1);
        String tmpFile = "C://Users//sully//Desktop/test.doc";
        String expFile = "C://Users//sully//Desktop/result.doc";
        Map<String, String> datas = new HashMap<String, String>();
        datas.put("title", s1);
        datas.put("content", "这里是内容，测试使用POI导出到Word的内容！");
        WordUtils.build(new File(tmpFile), datas, expFile);
    }
}
