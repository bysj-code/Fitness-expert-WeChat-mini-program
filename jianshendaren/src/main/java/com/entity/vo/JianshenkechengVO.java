package com.entity.vo;

import com.entity.JianshenkechengEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 健身课程
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jianshenkecheng")
public class JianshenkechengVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 健身课程标题
     */

    @TableField(value = "jianshenkecheng_name")
    private String jianshenkechengName;


    /**
     * 课程类型
     */

    @TableField(value = "jianshenkecheng_types")
    private Integer jianshenkechengTypes;


    /**
     * 课程封面
     */

    @TableField(value = "jianshenkecheng_photo")
    private String jianshenkechengPhoto;


    /**
     * 视频
     */

    @TableField(value = "jianshenkecheng_video")
    private String jianshenkechengVideo;


    /**
     * 发布用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 管理员
     */

    @TableField(value = "users_id")
    private Integer usersId;


    /**
     * 播放量
     */

    @TableField(value = "jianshenkecheng_click_number")
    private Integer jianshenkechengClickNumber;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 课程详情
     */

    @TableField(value = "jianshenkecheng_content")
    private String jianshenkechengContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：健身课程标题
	 */
    public String getJianshenkechengName() {
        return jianshenkechengName;
    }


    /**
	 * 获取：健身课程标题
	 */

    public void setJianshenkechengName(String jianshenkechengName) {
        this.jianshenkechengName = jianshenkechengName;
    }
    /**
	 * 设置：课程类型
	 */
    public Integer getJianshenkechengTypes() {
        return jianshenkechengTypes;
    }


    /**
	 * 获取：课程类型
	 */

    public void setJianshenkechengTypes(Integer jianshenkechengTypes) {
        this.jianshenkechengTypes = jianshenkechengTypes;
    }
    /**
	 * 设置：课程封面
	 */
    public String getJianshenkechengPhoto() {
        return jianshenkechengPhoto;
    }


    /**
	 * 获取：课程封面
	 */

    public void setJianshenkechengPhoto(String jianshenkechengPhoto) {
        this.jianshenkechengPhoto = jianshenkechengPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getJianshenkechengVideo() {
        return jianshenkechengVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setJianshenkechengVideo(String jianshenkechengVideo) {
        this.jianshenkechengVideo = jianshenkechengVideo;
    }
    /**
	 * 设置：发布用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：发布用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：管理员
	 */
    public Integer getUsersId() {
        return usersId;
    }


    /**
	 * 获取：管理员
	 */

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }
    /**
	 * 设置：播放量
	 */
    public Integer getJianshenkechengClickNumber() {
        return jianshenkechengClickNumber;
    }


    /**
	 * 获取：播放量
	 */

    public void setJianshenkechengClickNumber(Integer jianshenkechengClickNumber) {
        this.jianshenkechengClickNumber = jianshenkechengClickNumber;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：课程详情
	 */
    public String getJianshenkechengContent() {
        return jianshenkechengContent;
    }


    /**
	 * 获取：课程详情
	 */

    public void setJianshenkechengContent(String jianshenkechengContent) {
        this.jianshenkechengContent = jianshenkechengContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
