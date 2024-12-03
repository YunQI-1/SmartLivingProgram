package com.jsu.utils;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.UUID;

@Component
public class OssUtil {

    @Value("${aliyun.oss.endpoint}")
    private String endpoint;

    @Value("${aliyun.oss.accessKeyId}")
    private String accessKeyId;

    @Value("${aliyun.oss.accessKeySecret}")
    private String accessKeySecret;

    @Value("${aliyun.oss.bucketName}")
    private String bucketName;

    /**
     * 上传文件到 OSS 并返回文件 URL
     *
     * @param inputStream 文件输入流
     * @param originalFileName 原始文件名
     * @return 文件的 OSS URL
     */
    public String upload(InputStream inputStream, String originalFileName) {
        // 生成唯一的文件名
        String fileName = "uploads/" + UUID.randomUUID().toString() + "-" + originalFileName;

        // 创建 OSS 客户端实例
        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        try {
            // 上传文件到 OSS
            ossClient.putObject(bucketName, fileName, inputStream);

            // 拼接文件 URL
            return "https://" + bucketName + "." + endpoint.replace("https://", "") + "/" + fileName;
        } finally {
            // 关闭 OSS 客户端
            ossClient.shutdown();
        }
    }
}
