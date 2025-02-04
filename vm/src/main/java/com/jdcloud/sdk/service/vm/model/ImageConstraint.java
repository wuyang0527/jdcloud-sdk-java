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
 * 
 * 
 *
 * 
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.vm.model;


/**
 * 镜像对实例规格的约束信息。
 */
public class ImageConstraint  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像ID。
     */
    private String imageId;

    /**
     * 镜像对实例规格的约束信息。
     */
    private ImageInstanceTypeConstraint imageInstanceTypeConstraint;


    /**
     * get 镜像ID。
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID。
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 镜像对实例规格的约束信息。
     *
     * @return
     */
    public ImageInstanceTypeConstraint getImageInstanceTypeConstraint() {
        return imageInstanceTypeConstraint;
    }

    /**
     * set 镜像对实例规格的约束信息。
     *
     * @param imageInstanceTypeConstraint
     */
    public void setImageInstanceTypeConstraint(ImageInstanceTypeConstraint imageInstanceTypeConstraint) {
        this.imageInstanceTypeConstraint = imageInstanceTypeConstraint;
    }


    /**
     * set 镜像ID。
     *
     * @param imageId
     */
    public ImageConstraint imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 镜像对实例规格的约束信息。
     *
     * @param imageInstanceTypeConstraint
     */
    public ImageConstraint imageInstanceTypeConstraint(ImageInstanceTypeConstraint imageInstanceTypeConstraint) {
        this.imageInstanceTypeConstraint = imageInstanceTypeConstraint;
        return this;
    }


}