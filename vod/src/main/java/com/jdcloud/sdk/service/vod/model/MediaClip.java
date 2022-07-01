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

import java.util.List;
import java.util.ArrayList;
import com.jdcloud.sdk.annotation.Required;

/**
 * 视频剪辑素材片段信息。
 */
public class MediaClip  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 素材ID（素材类型为video或audio时适用）必须为视频点播媒资的视频ID。
一个Timeline中的所有MediaClip中，若有2个或以上的不同MediaId，即素材片段来源于2个或以上不同视频，则在提交剪辑作业时，必须在UserData中指明合并后的视频画面的宽高。
如 {\&quot;extendData\&quot;: {\&quot;width\&quot;: 720, \&quot;height\&quot;: 500}}，其中width和height必须为[16, 4096]之间的偶数
* 素材类型为视频，音频时必填；文字和图片时必空。

     */
    private String mediaId;

    /**
     * 素材类型，必填。不同类型的轨类型，素材类型取值不同
* 视频轨目前支持的素材类型有：video，image
- video：视频
- image：图片
* 音频轨目前支持的素材类型有：audio
- audio：音频
* 文字轨目前支持的素材类型有：text
- text：文字

     * Required:true
     */
    @Required
    private String mediaType;

    /**
     * 素材url（素材类型为image时适用）必填。京东对象存储的内网地址，图片资源公有读地址。

     */
    private String mediaUrl;

    /**
     * 素材片段在媒资中的入点（素材类型为video或audio时适用）单位：ms。默认为0。
     */
    private Integer mediaIn;

    /**
     * 素材片段在媒资中的出点（素材类型为video或audio时适用）单位：ms。
     */
    private Integer mediaOut;

    /**
     * 素材片段在合成时间线中的入点（素材类型为video、audio和text时适用）单位：ms。
* 如果为空，则会按照素材片段顺序相接的方式自动计算timelineIn。

     */
    private Integer timelineIn;

    /**
     * 素材片段在合成时间线中的出点（素材类型为video、audio和text时适用）单位：ms。
* 如果为空，则会按照素材片段顺序相接的方式自动计算timelineOut &#x3D; timelineIn + mediaDuration。
* 如果非空，有可能会导致timelineOut-timelineIn 与 mediaOut-mediaIn不符，最终会以timelineOut为准。

     */
    private Integer timelineOut;

    /**
     * 素材片段持续时长（素材类型为image时适用），单位:ms。
     */
    private Integer duration;

    /**
     * X坐标（素材类型为video、audio和text时适用）：表示素材的左上角距离输出视频左上角的横向距离，单位：像素。
     */
    private Integer posX;

    /**
     * Y坐标（素材类型为video、audio和text时适用）：表示素材的左上角距离输出视频左上角的纵向距离，单位：像素。
     */
    private Integer posY;

    /**
     * 文字内容（素材类型为text时适用）必填。
支持\n文字换行，比如：&quot;小明\n你好&quot;。

     */
    private String content;

    /**
     * 字体名称（素材类型为text时适用）
目前支持的字体有：FZHanZhen，FZShangKu，HYChaoJiZhanJia，HYLeMiao，HYNuoMi，HYYaKu，HYZhongXiu，JDLangZheng，SourceHanSans。默认为JDLangZheng:&quot;京东朗正体&quot;。
- JDLangZheng：京东朗正
- FZHanZhen：方正汉真
- FZShangKu：方正尚酷
- HYChaoJiZhanJia：汉仪机甲
- HYLeMiao：汉仪乐喵
- HYNuoMi：汉仪糯米
- HYYaKu：汉仪雅酷
- HYZhongXiu：汉仪中秀
- SourceHanSans：思源黑体

     */
    private String font;

    /**
     * 文字的字号（素材类型为text时适用）
     */
    private Integer fontSize;

    /**
     * 字体颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     */
    private String fontColor;

    /**
     * 文字透明度（素材类型为text时适用）。当字幕类型为横幅文字时，表示文字的透明度，取值[0,1]，默认1。1为不透明，0为完全透明。
     */
    private Double fontColorOpacity;

    /**
     * 文字间距（素材类型为text时适用）。表示横幅文字字间距。单位：像素，默认为0。
     */
    private Integer spacing;

    /**
     * 文字逆时针旋转角度（素材类型为text时适用）。表示横幅文字逆时针旋转角度。单位：度，默认为0。
     */
    private Integer angle;

    /**
     * 文字边框和阴影格式（素材类型为text时适用）。取值1或3，1&#x3D;边框+阴影，3&#x3D;不透明底框。默认为1。
     */
    private Integer borderStyle;

    /**
     * 描边宽度（素材类型为text时适用）。表示横幅文字描边宽度。单位：像素值，默认为0。
     */
    private Integer outline;

    /**
     * 描边颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     */
    private String outlineColor;

    /**
     * 文字投下阴影的深度（素材类型为text时适用）。表示横幅文字投下阴影的深度，单位：像素值，默认为0。
     */
    private Integer shadow;

    /**
     * 阴影颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     */
    private String backColor;

    /**
     * 字体样式（素材类型为text时适用）
     */
    private FontFace fontFace;

    /**
     * operations
     */
    private List<ClipOperation> operations;


    /**
     * get 素材ID（素材类型为video或audio时适用）必须为视频点播媒资的视频ID。
一个Timeline中的所有MediaClip中，若有2个或以上的不同MediaId，即素材片段来源于2个或以上不同视频，则在提交剪辑作业时，必须在UserData中指明合并后的视频画面的宽高。
如 {\&quot;extendData\&quot;: {\&quot;width\&quot;: 720, \&quot;height\&quot;: 500}}，其中width和height必须为[16, 4096]之间的偶数
* 素材类型为视频，音频时必填；文字和图片时必空。

     *
     * @return
     */
    public String getMediaId() {
        return mediaId;
    }

    /**
     * set 素材ID（素材类型为video或audio时适用）必须为视频点播媒资的视频ID。
一个Timeline中的所有MediaClip中，若有2个或以上的不同MediaId，即素材片段来源于2个或以上不同视频，则在提交剪辑作业时，必须在UserData中指明合并后的视频画面的宽高。
如 {\&quot;extendData\&quot;: {\&quot;width\&quot;: 720, \&quot;height\&quot;: 500}}，其中width和height必须为[16, 4096]之间的偶数
* 素材类型为视频，音频时必填；文字和图片时必空。

     *
     * @param mediaId
     */
    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * get 素材类型，必填。不同类型的轨类型，素材类型取值不同
* 视频轨目前支持的素材类型有：video，image
- video：视频
- image：图片
* 音频轨目前支持的素材类型有：audio
- audio：音频
* 文字轨目前支持的素材类型有：text
- text：文字

     *
     * @return
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * set 素材类型，必填。不同类型的轨类型，素材类型取值不同
* 视频轨目前支持的素材类型有：video，image
- video：视频
- image：图片
* 音频轨目前支持的素材类型有：audio
- audio：音频
* 文字轨目前支持的素材类型有：text
- text：文字

     *
     * @param mediaType
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * get 素材url（素材类型为image时适用）必填。京东对象存储的内网地址，图片资源公有读地址。

     *
     * @return
     */
    public String getMediaUrl() {
        return mediaUrl;
    }

    /**
     * set 素材url（素材类型为image时适用）必填。京东对象存储的内网地址，图片资源公有读地址。

     *
     * @param mediaUrl
     */
    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    /**
     * get 素材片段在媒资中的入点（素材类型为video或audio时适用）单位：ms。默认为0。
     *
     * @return
     */
    public Integer getMediaIn() {
        return mediaIn;
    }

    /**
     * set 素材片段在媒资中的入点（素材类型为video或audio时适用）单位：ms。默认为0。
     *
     * @param mediaIn
     */
    public void setMediaIn(Integer mediaIn) {
        this.mediaIn = mediaIn;
    }

    /**
     * get 素材片段在媒资中的出点（素材类型为video或audio时适用）单位：ms。
     *
     * @return
     */
    public Integer getMediaOut() {
        return mediaOut;
    }

    /**
     * set 素材片段在媒资中的出点（素材类型为video或audio时适用）单位：ms。
     *
     * @param mediaOut
     */
    public void setMediaOut(Integer mediaOut) {
        this.mediaOut = mediaOut;
    }

    /**
     * get 素材片段在合成时间线中的入点（素材类型为video、audio和text时适用）单位：ms。
* 如果为空，则会按照素材片段顺序相接的方式自动计算timelineIn。

     *
     * @return
     */
    public Integer getTimelineIn() {
        return timelineIn;
    }

    /**
     * set 素材片段在合成时间线中的入点（素材类型为video、audio和text时适用）单位：ms。
* 如果为空，则会按照素材片段顺序相接的方式自动计算timelineIn。

     *
     * @param timelineIn
     */
    public void setTimelineIn(Integer timelineIn) {
        this.timelineIn = timelineIn;
    }

    /**
     * get 素材片段在合成时间线中的出点（素材类型为video、audio和text时适用）单位：ms。
* 如果为空，则会按照素材片段顺序相接的方式自动计算timelineOut &#x3D; timelineIn + mediaDuration。
* 如果非空，有可能会导致timelineOut-timelineIn 与 mediaOut-mediaIn不符，最终会以timelineOut为准。

     *
     * @return
     */
    public Integer getTimelineOut() {
        return timelineOut;
    }

    /**
     * set 素材片段在合成时间线中的出点（素材类型为video、audio和text时适用）单位：ms。
* 如果为空，则会按照素材片段顺序相接的方式自动计算timelineOut &#x3D; timelineIn + mediaDuration。
* 如果非空，有可能会导致timelineOut-timelineIn 与 mediaOut-mediaIn不符，最终会以timelineOut为准。

     *
     * @param timelineOut
     */
    public void setTimelineOut(Integer timelineOut) {
        this.timelineOut = timelineOut;
    }

    /**
     * get 素材片段持续时长（素材类型为image时适用），单位:ms。
     *
     * @return
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * set 素材片段持续时长（素材类型为image时适用），单位:ms。
     *
     * @param duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * get X坐标（素材类型为video、audio和text时适用）：表示素材的左上角距离输出视频左上角的横向距离，单位：像素。
     *
     * @return
     */
    public Integer getPosX() {
        return posX;
    }

    /**
     * set X坐标（素材类型为video、audio和text时适用）：表示素材的左上角距离输出视频左上角的横向距离，单位：像素。
     *
     * @param posX
     */
    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    /**
     * get Y坐标（素材类型为video、audio和text时适用）：表示素材的左上角距离输出视频左上角的纵向距离，单位：像素。
     *
     * @return
     */
    public Integer getPosY() {
        return posY;
    }

    /**
     * set Y坐标（素材类型为video、audio和text时适用）：表示素材的左上角距离输出视频左上角的纵向距离，单位：像素。
     *
     * @param posY
     */
    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    /**
     * get 文字内容（素材类型为text时适用）必填。
支持\n文字换行，比如：&quot;小明\n你好&quot;。

     *
     * @return
     */
    public String getContent() {
        return content;
    }

    /**
     * set 文字内容（素材类型为text时适用）必填。
支持\n文字换行，比如：&quot;小明\n你好&quot;。

     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * get 字体名称（素材类型为text时适用）
目前支持的字体有：FZHanZhen，FZShangKu，HYChaoJiZhanJia，HYLeMiao，HYNuoMi，HYYaKu，HYZhongXiu，JDLangZheng，SourceHanSans。默认为JDLangZheng:&quot;京东朗正体&quot;。
- JDLangZheng：京东朗正
- FZHanZhen：方正汉真
- FZShangKu：方正尚酷
- HYChaoJiZhanJia：汉仪机甲
- HYLeMiao：汉仪乐喵
- HYNuoMi：汉仪糯米
- HYYaKu：汉仪雅酷
- HYZhongXiu：汉仪中秀
- SourceHanSans：思源黑体

     *
     * @return
     */
    public String getFont() {
        return font;
    }

    /**
     * set 字体名称（素材类型为text时适用）
目前支持的字体有：FZHanZhen，FZShangKu，HYChaoJiZhanJia，HYLeMiao，HYNuoMi，HYYaKu，HYZhongXiu，JDLangZheng，SourceHanSans。默认为JDLangZheng:&quot;京东朗正体&quot;。
- JDLangZheng：京东朗正
- FZHanZhen：方正汉真
- FZShangKu：方正尚酷
- HYChaoJiZhanJia：汉仪机甲
- HYLeMiao：汉仪乐喵
- HYNuoMi：汉仪糯米
- HYYaKu：汉仪雅酷
- HYZhongXiu：汉仪中秀
- SourceHanSans：思源黑体

     *
     * @param font
     */
    public void setFont(String font) {
        this.font = font;
    }

    /**
     * get 文字的字号（素材类型为text时适用）
     *
     * @return
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * set 文字的字号（素材类型为text时适用）
     *
     * @param fontSize
     */
    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * get 字体颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @return
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * set 字体颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @param fontColor
     */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * get 文字透明度（素材类型为text时适用）。当字幕类型为横幅文字时，表示文字的透明度，取值[0,1]，默认1。1为不透明，0为完全透明。
     *
     * @return
     */
    public Double getFontColorOpacity() {
        return fontColorOpacity;
    }

    /**
     * set 文字透明度（素材类型为text时适用）。当字幕类型为横幅文字时，表示文字的透明度，取值[0,1]，默认1。1为不透明，0为完全透明。
     *
     * @param fontColorOpacity
     */
    public void setFontColorOpacity(Double fontColorOpacity) {
        this.fontColorOpacity = fontColorOpacity;
    }

    /**
     * get 文字间距（素材类型为text时适用）。表示横幅文字字间距。单位：像素，默认为0。
     *
     * @return
     */
    public Integer getSpacing() {
        return spacing;
    }

    /**
     * set 文字间距（素材类型为text时适用）。表示横幅文字字间距。单位：像素，默认为0。
     *
     * @param spacing
     */
    public void setSpacing(Integer spacing) {
        this.spacing = spacing;
    }

    /**
     * get 文字逆时针旋转角度（素材类型为text时适用）。表示横幅文字逆时针旋转角度。单位：度，默认为0。
     *
     * @return
     */
    public Integer getAngle() {
        return angle;
    }

    /**
     * set 文字逆时针旋转角度（素材类型为text时适用）。表示横幅文字逆时针旋转角度。单位：度，默认为0。
     *
     * @param angle
     */
    public void setAngle(Integer angle) {
        this.angle = angle;
    }

    /**
     * get 文字边框和阴影格式（素材类型为text时适用）。取值1或3，1&#x3D;边框+阴影，3&#x3D;不透明底框。默认为1。
     *
     * @return
     */
    public Integer getBorderStyle() {
        return borderStyle;
    }

    /**
     * set 文字边框和阴影格式（素材类型为text时适用）。取值1或3，1&#x3D;边框+阴影，3&#x3D;不透明底框。默认为1。
     *
     * @param borderStyle
     */
    public void setBorderStyle(Integer borderStyle) {
        this.borderStyle = borderStyle;
    }

    /**
     * get 描边宽度（素材类型为text时适用）。表示横幅文字描边宽度。单位：像素值，默认为0。
     *
     * @return
     */
    public Integer getOutline() {
        return outline;
    }

    /**
     * set 描边宽度（素材类型为text时适用）。表示横幅文字描边宽度。单位：像素值，默认为0。
     *
     * @param outline
     */
    public void setOutline(Integer outline) {
        this.outline = outline;
    }

    /**
     * get 描边颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @return
     */
    public String getOutlineColor() {
        return outlineColor;
    }

    /**
     * set 描边颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @param outlineColor
     */
    public void setOutlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
    }

    /**
     * get 文字投下阴影的深度（素材类型为text时适用）。表示横幅文字投下阴影的深度，单位：像素值，默认为0。
     *
     * @return
     */
    public Integer getShadow() {
        return shadow;
    }

    /**
     * set 文字投下阴影的深度（素材类型为text时适用）。表示横幅文字投下阴影的深度，单位：像素值，默认为0。
     *
     * @param shadow
     */
    public void setShadow(Integer shadow) {
        this.shadow = shadow;
    }

    /**
     * get 阴影颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @return
     */
    public String getBackColor() {
        return backColor;
    }

    /**
     * set 阴影颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @param backColor
     */
    public void setBackColor(String backColor) {
        this.backColor = backColor;
    }

    /**
     * get 字体样式（素材类型为text时适用）
     *
     * @return
     */
    public FontFace getFontFace() {
        return fontFace;
    }

    /**
     * set 字体样式（素材类型为text时适用）
     *
     * @param fontFace
     */
    public void setFontFace(FontFace fontFace) {
        this.fontFace = fontFace;
    }

    /**
     * get operations
     *
     * @return
     */
    public List<ClipOperation> getOperations() {
        return operations;
    }

    /**
     * set operations
     *
     * @param operations
     */
    public void setOperations(List<ClipOperation> operations) {
        this.operations = operations;
    }


    /**
     * set 素材ID（素材类型为video或audio时适用）必须为视频点播媒资的视频ID。
一个Timeline中的所有MediaClip中，若有2个或以上的不同MediaId，即素材片段来源于2个或以上不同视频，则在提交剪辑作业时，必须在UserData中指明合并后的视频画面的宽高。
如 {\&quot;extendData\&quot;: {\&quot;width\&quot;: 720, \&quot;height\&quot;: 500}}，其中width和height必须为[16, 4096]之间的偶数
* 素材类型为视频，音频时必填；文字和图片时必空。

     *
     * @param mediaId
     */
    public MediaClip mediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }

    /**
     * set 素材类型，必填。不同类型的轨类型，素材类型取值不同
* 视频轨目前支持的素材类型有：video，image
- video：视频
- image：图片
* 音频轨目前支持的素材类型有：audio
- audio：音频
* 文字轨目前支持的素材类型有：text
- text：文字

     *
     * @param mediaType
     */
    public MediaClip mediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * set 素材url（素材类型为image时适用）必填。京东对象存储的内网地址，图片资源公有读地址。

     *
     * @param mediaUrl
     */
    public MediaClip mediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl;
        return this;
    }

    /**
     * set 素材片段在媒资中的入点（素材类型为video或audio时适用）单位：ms。默认为0。
     *
     * @param mediaIn
     */
    public MediaClip mediaIn(Integer mediaIn) {
        this.mediaIn = mediaIn;
        return this;
    }

    /**
     * set 素材片段在媒资中的出点（素材类型为video或audio时适用）单位：ms。
     *
     * @param mediaOut
     */
    public MediaClip mediaOut(Integer mediaOut) {
        this.mediaOut = mediaOut;
        return this;
    }

    /**
     * set 素材片段在合成时间线中的入点（素材类型为video、audio和text时适用）单位：ms。
* 如果为空，则会按照素材片段顺序相接的方式自动计算timelineIn。

     *
     * @param timelineIn
     */
    public MediaClip timelineIn(Integer timelineIn) {
        this.timelineIn = timelineIn;
        return this;
    }

    /**
     * set 素材片段在合成时间线中的出点（素材类型为video、audio和text时适用）单位：ms。
* 如果为空，则会按照素材片段顺序相接的方式自动计算timelineOut &#x3D; timelineIn + mediaDuration。
* 如果非空，有可能会导致timelineOut-timelineIn 与 mediaOut-mediaIn不符，最终会以timelineOut为准。

     *
     * @param timelineOut
     */
    public MediaClip timelineOut(Integer timelineOut) {
        this.timelineOut = timelineOut;
        return this;
    }

    /**
     * set 素材片段持续时长（素材类型为image时适用），单位:ms。
     *
     * @param duration
     */
    public MediaClip duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * set X坐标（素材类型为video、audio和text时适用）：表示素材的左上角距离输出视频左上角的横向距离，单位：像素。
     *
     * @param posX
     */
    public MediaClip posX(Integer posX) {
        this.posX = posX;
        return this;
    }

    /**
     * set Y坐标（素材类型为video、audio和text时适用）：表示素材的左上角距离输出视频左上角的纵向距离，单位：像素。
     *
     * @param posY
     */
    public MediaClip posY(Integer posY) {
        this.posY = posY;
        return this;
    }

    /**
     * set 文字内容（素材类型为text时适用）必填。
支持\n文字换行，比如：&quot;小明\n你好&quot;。

     *
     * @param content
     */
    public MediaClip content(String content) {
        this.content = content;
        return this;
    }

    /**
     * set 字体名称（素材类型为text时适用）
目前支持的字体有：FZHanZhen，FZShangKu，HYChaoJiZhanJia，HYLeMiao，HYNuoMi，HYYaKu，HYZhongXiu，JDLangZheng，SourceHanSans。默认为JDLangZheng:&quot;京东朗正体&quot;。
- JDLangZheng：京东朗正
- FZHanZhen：方正汉真
- FZShangKu：方正尚酷
- HYChaoJiZhanJia：汉仪机甲
- HYLeMiao：汉仪乐喵
- HYNuoMi：汉仪糯米
- HYYaKu：汉仪雅酷
- HYZhongXiu：汉仪中秀
- SourceHanSans：思源黑体

     *
     * @param font
     */
    public MediaClip font(String font) {
        this.font = font;
        return this;
    }

    /**
     * set 文字的字号（素材类型为text时适用）
     *
     * @param fontSize
     */
    public MediaClip fontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * set 字体颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @param fontColor
     */
    public MediaClip fontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    /**
     * set 文字透明度（素材类型为text时适用）。当字幕类型为横幅文字时，表示文字的透明度，取值[0,1]，默认1。1为不透明，0为完全透明。
     *
     * @param fontColorOpacity
     */
    public MediaClip fontColorOpacity(Double fontColorOpacity) {
        this.fontColorOpacity = fontColorOpacity;
        return this;
    }

    /**
     * set 文字间距（素材类型为text时适用）。表示横幅文字字间距。单位：像素，默认为0。
     *
     * @param spacing
     */
    public MediaClip spacing(Integer spacing) {
        this.spacing = spacing;
        return this;
    }

    /**
     * set 文字逆时针旋转角度（素材类型为text时适用）。表示横幅文字逆时针旋转角度。单位：度，默认为0。
     *
     * @param angle
     */
    public MediaClip angle(Integer angle) {
        this.angle = angle;
        return this;
    }

    /**
     * set 文字边框和阴影格式（素材类型为text时适用）。取值1或3，1&#x3D;边框+阴影，3&#x3D;不透明底框。默认为1。
     *
     * @param borderStyle
     */
    public MediaClip borderStyle(Integer borderStyle) {
        this.borderStyle = borderStyle;
        return this;
    }

    /**
     * set 描边宽度（素材类型为text时适用）。表示横幅文字描边宽度。单位：像素值，默认为0。
     *
     * @param outline
     */
    public MediaClip outline(Integer outline) {
        this.outline = outline;
        return this;
    }

    /**
     * set 描边颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @param outlineColor
     */
    public MediaClip outlineColor(String outlineColor) {
        this.outlineColor = outlineColor;
        return this;
    }

    /**
     * set 文字投下阴影的深度（素材类型为text时适用）。表示横幅文字投下阴影的深度，单位：像素值，默认为0。
     *
     * @param shadow
     */
    public MediaClip shadow(Integer shadow) {
        this.shadow = shadow;
        return this;
    }

    /**
     * set 阴影颜色（素材类型为text时适用）。格式为#后跟16进制值。例如：#ffffff(RRGGBB)。
     *
     * @param backColor
     */
    public MediaClip backColor(String backColor) {
        this.backColor = backColor;
        return this;
    }

    /**
     * set 字体样式（素材类型为text时适用）
     *
     * @param fontFace
     */
    public MediaClip fontFace(FontFace fontFace) {
        this.fontFace = fontFace;
        return this;
    }

    /**
     * set operations
     *
     * @param operations
     */
    public MediaClip operations(List<ClipOperation> operations) {
        this.operations = operations;
        return this;
    }


    /**
     * add item to operations
     *
     * @param operation
     */
    public void addOperation(ClipOperation operation) {
        if (this.operations == null) {
            this.operations = new ArrayList<>();
        }
        this.operations.add(operation);
    }

}