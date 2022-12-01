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

package com.jdcloud.sdk.service.dms.model;


/**
 * extraTableInfo
 */
public class ExtraTableInfo  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ORIGIN:原始表, STARDB_SPLIT:stardb切分表, STARDB_ISOLATE:stardb孤立表, STARDB_BROADCAST:stardb广播表,ORIGIN_OG:og原始表, OG_SPLIT:og切分表, OG_ISOLATE:og孤立表, OG_BROADCAST:og广播表。
     */
    private String tableTypeEnum;

    /**
     * tableTypeEnum为stardb切分表时的切分信息内容。
     */
    private StardbSplitInfo stardbSplitInfo;

    /**
     * sharding opengause切分规则。
     */
    private DmsOgTableRule dmsOgTableRule;



    /**
     * get ORIGIN:原始表, STARDB_SPLIT:stardb切分表, STARDB_ISOLATE:stardb孤立表, STARDB_BROADCAST:stardb广播表,ORIGIN_OG:og原始表, OG_SPLIT:og切分表, OG_ISOLATE:og孤立表, OG_BROADCAST:og广播表。
     *
     * @return
     */
    public String getTableTypeEnum() {
        return tableTypeEnum;
    }

    /**
     * set ORIGIN:原始表, STARDB_SPLIT:stardb切分表, STARDB_ISOLATE:stardb孤立表, STARDB_BROADCAST:stardb广播表,ORIGIN_OG:og原始表, OG_SPLIT:og切分表, OG_ISOLATE:og孤立表, OG_BROADCAST:og广播表。
     *
     * @param tableTypeEnum
     */
    public void setTableTypeEnum(String tableTypeEnum) {
        this.tableTypeEnum = tableTypeEnum;
    }


    /**
     * get tableTypeEnum为stardb切分表时的切分信息内容。
     *
     * @return
     */
    public StardbSplitInfo getStardbSplitInfo() {
        return stardbSplitInfo;
    }

    /**
     * set tableTypeEnum为stardb切分表时的切分信息内容。
     *
     * @param stardbSplitInfo
     */
    public void setStardbSplitInfo(StardbSplitInfo stardbSplitInfo) {
        this.stardbSplitInfo = stardbSplitInfo;
    }


    /**
     * get sharding opengause切分规则。
     *
     * @return
     */
    public DmsOgTableRule getDmsOgTableRule() {
        return dmsOgTableRule;
    }

    /**
     * set sharding opengause切分规则。
     *
     * @param dmsOgTableRule
     */
    public void setDmsOgTableRule(DmsOgTableRule dmsOgTableRule) {
        this.dmsOgTableRule = dmsOgTableRule;
    }



    /**
     * set ORIGIN:原始表, STARDB_SPLIT:stardb切分表, STARDB_ISOLATE:stardb孤立表, STARDB_BROADCAST:stardb广播表,ORIGIN_OG:og原始表, OG_SPLIT:og切分表, OG_ISOLATE:og孤立表, OG_BROADCAST:og广播表。
     *
     * @param tableTypeEnum
     */
    public ExtraTableInfo tableTypeEnum(String tableTypeEnum) {
        this.tableTypeEnum = tableTypeEnum;
        return this;
    }


    /**
     * set tableTypeEnum为stardb切分表时的切分信息内容。
     *
     * @param stardbSplitInfo
     */
    public ExtraTableInfo stardbSplitInfo(StardbSplitInfo stardbSplitInfo) {
        this.stardbSplitInfo = stardbSplitInfo;
        return this;
    }


    /**
     * set sharding opengause切分规则。
     *
     * @param dmsOgTableRule
     */
    public ExtraTableInfo dmsOgTableRule(DmsOgTableRule dmsOgTableRule) {
        this.dmsOgTableRule = dmsOgTableRule;
        return this;
    }


}