/*
 * Copyright 2018 JDCLOUD.COM
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http:#www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * 镜像
 * 关于主机镜像操作的相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;

import com.jdcloud.sdk.service.vm.model.Image;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 
查询镜像详情。

详细操作说明请参考帮助文档：[镜像概述](https://docs.jdcloud.com/cn/virtual-machines/image-overview)

## 接口说明
- 该接口与查询镜像信息列表返回的信息一致。
- 只需要查询单个镜像信息的时候可以调用该接口。

 */
public class DescribeImageResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像信息。
     */
    private Image image;


    /**
     * get 镜像信息。
     *
     * @return
     */
    public Image getImage() {
        return image;
    }

    /**
     * set 镜像信息。
     *
     * @param image
     */
    public void setImage(Image image) {
        this.image = image;
    }


    /**
     * set 镜像信息。
     *
     * @param image
     */
    public DescribeImageResult image(Image image) {
        this.image = image;
        return this;
    }


}