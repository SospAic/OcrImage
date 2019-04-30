package com.ocr.OcrImage;

import com.ocr.OtherDemo.Tess4J;
import com.ocr.Utils.ImgUtils;

public class OcrCtrl {

    public static void main(String[] args){

        //原始验证码地址
        String OriginalImg = "code/code.jpg";
        //识别样本输出地址
        String ocrResult = "code/code_out.jpg";
        //去噪点
        ImgUtils.removeBackground(OriginalImg, ocrResult);
        //裁剪边角
        ImgUtils.cuttingImg(ocrResult);
        //OCR识别
        String code = Tess4J.executeTess4J(ocrResult);
        //String code = Tess4J.executeTess4J("code/code.jpg");
        //输出识别结果
        System.out.println("Ocr识别结果: \n" + code);

    }


}
