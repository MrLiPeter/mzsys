package com.mz.service;

import com.mz.vo.EasyUiImge;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/8/3
 */
@Service
@PropertySource("classpath:/properties/imgeDir.properties")
public class FileServiceImpl implements FileService{

    @Value("${image.localFileDir}")
    private String localFileDir;

    @Override
    public EasyUiImge uploadPic(MultipartFile uploadFile) {
        EasyUiImge easyUiImge = new EasyUiImge();
        //获取图片名称
        String fileName = uploadFile.getOriginalFilename();
        fileName = fileName.toLowerCase();
        //2、利用正则表达试校验图片格式
        if(!fileName.matches("^.+\\.(png|jpg|gif)$")){
            easyUiImge.setError(1);
            return easyUiImge;
        }
        //3、获取图片的宽高属性
        try {
            BufferedImage bufferedImage = ImageIO.read(uploadFile.getInputStream());
            int width = bufferedImage.getWidth();
            int height = bufferedImage.getHeight();
            if(width == 0 || height == 0){
                easyUiImge.setError(1);
                return easyUiImge;
            }
            easyUiImge.setWidth(width).setHeight(height);
            //4.以时间格式进行数据存储 yyyy/MM/dd
            String dateDir = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
            //准备文件上传路径D:/1-JT/jt-image/yyyy/MM/dd
            String pathStr = localFileDir + dateDir;
            File path = new File(pathStr);
            if(!path.exists()){
                path.mkdirs();
            }
            /**
             * 5.重新生成图片名称
             * 5.1 生成UUID xxxx-xxx
             * 5.2将-替换""空串
             * 5.3获取真实图片的后缀  .jpg
             * 5.4生成真实的图片名称  uuid.jpg
             */
            String fileType = fileName.substring(fileName.lastIndexOf("."));
            String uuuidStr = UUID.randomUUID().toString().replace("-","");
            String realFileName = uuuidStr + fileType;

            /**
             * 6.实现文件上传
             * 6.1准备文件全路径
             * 		D:\1-JT\jt-image\2019\08\02\ uuid.jpg
             * 6.2 实现文件上传
             */
            //D:/1-JT/jt-image/yyyy/MM/dd/uuid.jpg
            String realFilePath = pathStr +"/"+ realFileName;
            File realFile = new File(realFilePath);
            uploadFile.transferTo(realFile);
            System.out.println("文件上传成功");
            String url = "https://ss0.baidu.com/73x1bjeh1BF3odCf/it/u=1754672959,1762799070&fm=85&s=073C4B2240A7B2A728D9A5940300D0E3";
            easyUiImge.setUrl(url);
        } catch (IOException e) {
            e.printStackTrace();
            easyUiImge.setError(1);
        }
        return easyUiImge;
    }
}
