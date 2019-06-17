package com.tjlou.mybatis.auto.mysql.sps.entity;

            import com.baomidou.mybatisplus.enums.IdType;
        import com.baomidou.mybatisplus.annotations.TableId;
        import com.baomidou.mybatisplus.annotations.TableField;
        import com.baomidou.mybatisplus.annotations.TableId;
        import com.baomidou.mybatisplus.enums.IdType;
        import com.baomidou.mybatisplus.annotations.TableName;
        import java.io.Serializable;
    
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;

/**
 * <p>
 * 平台信息表
 * </p>
 *
 * @author Gaby
 * @since 2019-06-17
 */
@TableName("platform_info")
public class PlatformInfo implements Serializable,IEntity{


                @TableId(value = "id", type = IdType.AUTO)
        private Long id;
            /**
     * 平台名称
     */
            private String name;
            /**
     * 认证标识
     */
                @TableField("app_key")
    private String appKey;
            /**
     * 状态
     */
            private String status;

        
public Long getId(){
        return id;
        }

        public PlatformInfo setId(Long id){
                this.id = id;
                return this;
            }
        
public String getName(){
        return name;
        }

        public PlatformInfo setName(String name){
                    if(name != null)
        name = name.trim();
            this.name = name;
                return this;
            }
        
public String getAppKey(){
        return appKey;
        }

        public PlatformInfo setAppKey(String appKey){
                    if(appKey != null)
        appKey = appKey.trim();
            this.appKey = appKey;
                return this;
            }
        
public String getStatus(){
        return status;
        }

        public PlatformInfo setStatus(String status){
                    if(status != null)
        status = status.trim();
            this.status = status;
                return this;
            }

/**
 * 表名
 */
public static final String TABLE_NAME="platform_info" ;
                public static final String ID ="id" ;

                    /**
         * 平台名称
         */
            public static final String NAME ="name" ;

                    /**
         * 认证标识
         */
            public static final String APP_KEY ="app_key" ;

                    /**
         * 状态
         */
            public static final String STATUS ="status" ;

    
@Override
public PlatformInfo pkVal(Serializable val){
                this.id = Long.valueOf(val.toString());
            return this;
        }
        }

