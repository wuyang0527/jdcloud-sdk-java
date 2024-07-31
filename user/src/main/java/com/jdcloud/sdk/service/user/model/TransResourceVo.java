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

package com.jdcloud.sdk.service.user.model;


/**
 * transResourceVo
 */
public class TransResourceVo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 接入系统名称标识
     */
    private String systemName;

    /**
     * 交接项id
     */
    private String itemId;

    /**
     * 交接项名称，如果交接项ID为空则交接项名称必须确保唯⼀
     */
    private String itemName;

    /**
     * 冗余字段、接⼊系统自定义⽤用途
     */
    private String remark;

    /**
     * 交接项附加说明信息、支持html
     */
    private String addition;



    /**
     * get 接入系统名称标识
     *
     * @return
     */
    public String getSystemName() {
        return systemName;
    }

    /**
     * set 接入系统名称标识
     *
     * @param systemName
     */
    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }


    /**
     * get 交接项id
     *
     * @return
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * set 交接项id
     *
     * @param itemId
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }


    /**
     * get 交接项名称，如果交接项ID为空则交接项名称必须确保唯⼀
     *
     * @return
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * set 交接项名称，如果交接项ID为空则交接项名称必须确保唯⼀
     *
     * @param itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    /**
     * get 冗余字段、接⼊系统自定义⽤用途
     *
     * @return
     */
    public String getRemark() {
        return remark;
    }

    /**
     * set 冗余字段、接⼊系统自定义⽤用途
     *
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }


    /**
     * get 交接项附加说明信息、支持html
     *
     * @return
     */
    public String getAddition() {
        return addition;
    }

    /**
     * set 交接项附加说明信息、支持html
     *
     * @param addition
     */
    public void setAddition(String addition) {
        this.addition = addition;
    }



    /**
     * set 接入系统名称标识
     *
     * @param systemName
     */
    public TransResourceVo systemName(String systemName) {
        this.systemName = systemName;
        return this;
    }


    /**
     * set 交接项id
     *
     * @param itemId
     */
    public TransResourceVo itemId(String itemId) {
        this.itemId = itemId;
        return this;
    }


    /**
     * set 交接项名称，如果交接项ID为空则交接项名称必须确保唯⼀
     *
     * @param itemName
     */
    public TransResourceVo itemName(String itemName) {
        this.itemName = itemName;
        return this;
    }


    /**
     * set 冗余字段、接⼊系统自定义⽤用途
     *
     * @param remark
     */
    public TransResourceVo remark(String remark) {
        this.remark = remark;
        return this;
    }


    /**
     * set 交接项附加说明信息、支持html
     *
     * @param addition
     */
    public TransResourceVo addition(String addition) {
        this.addition = addition;
        return this;
    }


}