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

package com.jdcloud.sdk.service.vod.model;


/**
 * 透明化操作参数
 */
public class TransparentParams  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 透明度
     */
    private Integer alpha;


    /**
     * get 透明度
     *
     * @return
     */
    public Integer getAlpha() {
        return alpha;
    }

    /**
     * set 透明度
     *
     * @param alpha
     */
    public void setAlpha(Integer alpha) {
        this.alpha = alpha;
    }


    /**
     * set 透明度
     *
     * @param alpha
     */
    public TransparentParams alpha(Integer alpha) {
        this.alpha = alpha;
        return this;
    }


}