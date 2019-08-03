package com.mz.service;

import com.mz.vo.EasyUITree;
import com.mz.vo.EasyUiImge;
import org.springframework.web.multipart.MultipartFile;

/**
 * Author : LiZuPei
 * Created by sheting on 2019/8/3
 */
public interface FileService {
    EasyUiImge uploadPic(MultipartFile upload);
}
