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
 * DmsView
 * 视图相关接口
 *
 * OpenAPI spec version: v1
 * Contact: 
 *
 * NOTE: This class is auto generated by the jdcloud code generator program.
 */

package com.jdcloud.sdk.service.dms.model;

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.service.dms.model.DmsSql;
import com.jdcloud.sdk.service.JdcloudResult;

/**
 * 生成删除视图sql语句
 */
public class GeneralDropViewResult extends JdcloudResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dmsSqls
     */
    private List<DmsSql> dmsSqls;


    /**
     * get dmsSqls
     *
     * @return
     */
    public List<DmsSql> getDmsSqls() {
        return dmsSqls;
    }

    /**
     * set dmsSqls
     *
     * @param dmsSqls
     */
    public void setDmsSqls(List<DmsSql> dmsSqls) {
        this.dmsSqls = dmsSqls;
    }


    /**
     * set dmsSqls
     *
     * @param dmsSqls
     */
    public GeneralDropViewResult dmsSqls(List<DmsSql> dmsSqls) {
        this.dmsSqls = dmsSqls;
        return this;
    }


    /**
     * add item to dmsSqls
     *
     * @param dmsSql
     */
    public void addDmsSql(DmsSql dmsSql) {
        if (this.dmsSqls == null) {
            this.dmsSqls = new ArrayList<>();
        }
        this.dmsSqls.add(dmsSql);
    }

}