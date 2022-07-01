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
 * 视频剪辑过程中对素材片段的操作行为
 */
public class ClipOperation  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作类型（素材类型不同，操作类型取值不同）
- 操作类型为video时支持的操作类型有：scale（缩放），volume（音量），rotate（旋转）
- 操作类型为image时支持的操作类型有：scale（缩放），rotate（旋转）
- 操作类型为audio时支持的操作类型有：volume（音量）
如：volume

     */
    private String opType;

    /**
     * 操作参数，JSON对象。不同的操作类型对应不同的JSON对象的key，JSON对象的value即为key对应的值。
* scale对应的key取值有：width，height。
  - width：视频缩放后宽度，整型，偶数，如果只填一边，则另一边跟随源宽高比变换。
  - height：视频缩放后高度，整型，偶数，如果只填一边，则另一边跟随源宽高比变换。
* volume对应的key取值有：gain。
  - gain：音量大小，浮点型，取值[0,10]；0表示静音，1表示原音
* rotate对应的key取值有：angle
  - angle：顺时针旋转角度，整型，取值[0,360]
如：{&quot;gain&quot;:1.5}

     */
    private Object params;


    /**
     * get 操作类型（素材类型不同，操作类型取值不同）
- 操作类型为video时支持的操作类型有：scale（缩放），volume（音量），rotate（旋转）
- 操作类型为image时支持的操作类型有：scale（缩放），rotate（旋转）
- 操作类型为audio时支持的操作类型有：volume（音量）
如：volume

     *
     * @return
     */
    public String getOpType() {
        return opType;
    }

    /**
     * set 操作类型（素材类型不同，操作类型取值不同）
- 操作类型为video时支持的操作类型有：scale（缩放），volume（音量），rotate（旋转）
- 操作类型为image时支持的操作类型有：scale（缩放），rotate（旋转）
- 操作类型为audio时支持的操作类型有：volume（音量）
如：volume

     *
     * @param opType
     */
    public void setOpType(String opType) {
        this.opType = opType;
    }

    /**
     * get 操作参数，JSON对象。不同的操作类型对应不同的JSON对象的key，JSON对象的value即为key对应的值。
* scale对应的key取值有：width，height。
  - width：视频缩放后宽度，整型，偶数，如果只填一边，则另一边跟随源宽高比变换。
  - height：视频缩放后高度，整型，偶数，如果只填一边，则另一边跟随源宽高比变换。
* volume对应的key取值有：gain。
  - gain：音量大小，浮点型，取值[0,10]；0表示静音，1表示原音
* rotate对应的key取值有：angle
  - angle：顺时针旋转角度，整型，取值[0,360]
如：{&quot;gain&quot;:1.5}

     *
     * @return
     */
    public Object getParams() {
        return params;
    }

    /**
     * set 操作参数，JSON对象。不同的操作类型对应不同的JSON对象的key，JSON对象的value即为key对应的值。
* scale对应的key取值有：width，height。
  - width：视频缩放后宽度，整型，偶数，如果只填一边，则另一边跟随源宽高比变换。
  - height：视频缩放后高度，整型，偶数，如果只填一边，则另一边跟随源宽高比变换。
* volume对应的key取值有：gain。
  - gain：音量大小，浮点型，取值[0,10]；0表示静音，1表示原音
* rotate对应的key取值有：angle
  - angle：顺时针旋转角度，整型，取值[0,360]
如：{&quot;gain&quot;:1.5}

     *
     * @param params
     */
    public void setParams(Object params) {
        this.params = params;
    }


    /**
     * set 操作类型（素材类型不同，操作类型取值不同）
- 操作类型为video时支持的操作类型有：scale（缩放），volume（音量），rotate（旋转）
- 操作类型为image时支持的操作类型有：scale（缩放），rotate（旋转）
- 操作类型为audio时支持的操作类型有：volume（音量）
如：volume

     *
     * @param opType
     */
    public ClipOperation opType(String opType) {
        this.opType = opType;
        return this;
    }

    /**
     * set 操作参数，JSON对象。不同的操作类型对应不同的JSON对象的key，JSON对象的value即为key对应的值。
* scale对应的key取值有：width，height。
  - width：视频缩放后宽度，整型，偶数，如果只填一边，则另一边跟随源宽高比变换。
  - height：视频缩放后高度，整型，偶数，如果只填一边，则另一边跟随源宽高比变换。
* volume对应的key取值有：gain。
  - gain：音量大小，浮点型，取值[0,10]；0表示静音，1表示原音
* rotate对应的key取值有：angle
  - angle：顺时针旋转角度，整型，取值[0,360]
如：{&quot;gain&quot;:1.5}

     *
     * @param params
     */
    public ClipOperation params(Object params) {
        this.params = params;
        return this;
    }


}