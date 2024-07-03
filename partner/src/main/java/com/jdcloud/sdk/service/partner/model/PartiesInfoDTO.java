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

package com.jdcloud.sdk.service.partner.model;


/**
 * partiesInfoDTO
 */
public class PartiesInfoDTO  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交易方编码
     */
    private String partcode;

    /**
     * 交易方名称
     */
    private String partname;

    /**
     * 交易方角色Code
     */
    private String rolecode;



    /**
     * get 交易方编码
     *
     * @return
     */
    public String getPartcode() {
        return partcode;
    }

    /**
     * set 交易方编码
     *
     * @param partcode
     */
    public void setPartcode(String partcode) {
        this.partcode = partcode;
    }


    /**
     * get 交易方名称
     *
     * @return
     */
    public String getPartname() {
        return partname;
    }

    /**
     * set 交易方名称
     *
     * @param partname
     */
    public void setPartname(String partname) {
        this.partname = partname;
    }


    /**
     * get 交易方角色Code
     *
     * @return
     */
    public String getRolecode() {
        return rolecode;
    }

    /**
     * set 交易方角色Code
     *
     * @param rolecode
     */
    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }



    /**
     * set 交易方编码
     *
     * @param partcode
     */
    public PartiesInfoDTO partcode(String partcode) {
        this.partcode = partcode;
        return this;
    }


    /**
     * set 交易方名称
     *
     * @param partname
     */
    public PartiesInfoDTO partname(String partname) {
        this.partname = partname;
        return this;
    }


    /**
     * set 交易方角色Code
     *
     * @param rolecode
     */
    public PartiesInfoDTO rolecode(String rolecode) {
        this.rolecode = rolecode;
        return this;
    }


}